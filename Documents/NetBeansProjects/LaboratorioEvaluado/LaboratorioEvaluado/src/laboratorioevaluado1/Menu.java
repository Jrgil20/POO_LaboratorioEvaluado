package laboratorioevaluado1;
// Clases importadas
import java.util.ArrayList;
import java.util.Scanner;

public class Menu 
{
    // Clase Menu
    
////////////////////////////ATRIBUTOS DE LA CLASE///////////////////////////////
    
    //Crear instancias únicas de colecciones para Medicamentos Refrigerados
    // y para Medicamentos TempAmbiente
    private static final ArrayList<Refrigerado> listaRefrigerado = 
            new ArrayList<>();
    private static final ArrayList<TempAmbiente> listaTempAmbiente = 
            new ArrayList<>();
    
    //Crear instancias únicas que permitan llevar colecciones 
    //de los lotes en los que estén registrados los Medicamentos
    private static final ArrayList<Integer> lotesRegistradosRefri = new ArrayList<>();
    private static final ArrayList<Integer> lotesRegistradosTempAmbiente 
            = new ArrayList<>();
    
    //Crear una única instancia tanto para un objeto auxiliar 
    //de tipo Refrigerado como para uno de TempAmbiente
    private static Refrigerado auxRefrigerado = new Refrigerado();
    private static TempAmbiente auxTempAmbiente = new TempAmbiente();
    
    // Crear una única instancia de Scanner como variable estática
    public static Scanner scn = new Scanner(System.in);
    
    //Crear una variable opcion para todo el menu
    public static int opcion;
    
    //Crear una variable lote para toda parte del menú que requiera el mismo
    public static int lote;

    public static void systemPause()
    {   // Metodo que pausa el sistema hasta que el usuario presione enter
        System.out.println("Presione enter para continuar...");
        scn.nextLine();
    }    
    
//////////////////////////FIN ATRIBUTOS DE LA CLASE/////////////////////////////
    
/////////////////////////////VALIDACIONES///////////////////////////////////////
    
    public static boolean existeLoteMedicamento(int nLote, boolean esRefri, 
            boolean esTempAmbiente){
        //Metodo para validar la existencia de ciertos medicamentos según el 
        //lote
        if(esRefri == true && esTempAmbiente == false)
        {
            for(int i = 0; i < lotesRegistradosRefri.size(); i++)
            {
                if(lotesRegistradosRefri.get(i) == nLote)
                    return true;
            }
        }
        else if(esTempAmbiente == true && esRefri == false)
        {
            for(int i = 0; i < lotesRegistradosTempAmbiente.size(); i++)
            {
                if(lotesRegistradosTempAmbiente.get(i) == nLote)
                    return true;
            }
        }
        return false;
    }
    
    public static boolean existeNombreMedicamento(String nombre){
        //Metodo para validar la existencia de ciertos medicamentos según el 
        //lote
        for(int i = 0; i < listaRefrigerado.size(); i++){
            if(listaRefrigerado.get(i)
                    .getNombreMedicamento()
                    .equals(nombre))
                return true;
        }
        for(int i = 0; i < listaTempAmbiente.size(); i++){
            if(listaTempAmbiente
                    .get(i)
                    .getNombreMedicamento()
                    .equals(nombre))
                return true;
        }
        return false;
    }
    
    public static int validarOpcion(int a, int b)
    {   // Metodo que valida si una opcion esta dentro de un rango 
        //entre los valores enteros a y b

            opcion = scn.nextInt();
            scn.nextLine();
            if(opcion < a || opcion > b)
            {
                System.out.println("Error, esa no es una opcion valida, "
                    + "por favor intente de nuevo");
                opcion = scn.nextInt();
                scn.nextLine();
            }
            return opcion;
    }
    
    public static int validarLote()
    {   // Metodo que valida si una opcion esta dentro de un rango 
        //entre los valores enteros a y b
        lote = scn.nextInt();
        while(
                (!existeLoteMedicamento(
                        lote,
                        true,
                        false))
                &&(!existeLoteMedicamento(
                        lote,
                        false,
                        true)))
        {
            System.out.println("Error, no se han encontrado"
                    + " medicamentos de ningun tipo con\n"
                    + "ese número de lote\nIngrese "
                    + "otro lote: ");
            lote = scn.nextInt();
        }
            
            return lote;
    }
    
    public static boolean validarMedicamentoEnCarrito(
            ArrayList<Refrigerado> carrito, Refrigerado med)
    {
        for(int i = 0; i < carrito.size(); i++)
        {
            if(carrito.get(i) == med)
                return true;
        }
        return false;
    }
    
    public static boolean validarMedicamentoEnCarrito(
            ArrayList<TempAmbiente> carrito, TempAmbiente med)
    {
        for(int i = 0; i < carrito.size(); i++)
        {
            if(carrito.get(i) == med)
                return true;
        }
        return false;
    }
    
/////////////////////////////FIN VALIDACIONES///////////////////////////////////
    
/////////////////////////////BUSQUEDAS///////////////////////////////////////    
    
    public static ArrayList<Refrigerado> buscarRefriPorLote(int nLote)
    { 
        ArrayList<Refrigerado> lista = new ArrayList<>();
        
        for(int i = 0; i < listaRefrigerado.size(); i++)
        {
            if(listaRefrigerado.get(i)
                    .getNumeroLoteMedicamento() == nLote)
                lista.add(listaRefrigerado.get(i));
        }
        return lista;
    }
    
    public static ArrayList<TempAmbiente> buscarTempAmbientePorLote(int nLote)
    {
        ArrayList<TempAmbiente> lista = new ArrayList<>();
        
        for(int i = 0; i < listaTempAmbiente.size(); i++)
        {
            if(listaTempAmbiente.get(i)
                    .getNumeroLoteMedicamento() == nLote)
                lista.add(listaTempAmbiente.get(i));
        }
        return lista;
    }
    
    public static Refrigerado buscarRefriPorNombre(String nombre)
    {        
        for(int i = 0; i < listaRefrigerado.size(); i++)
        {
            if(listaRefrigerado.get(i)
                    .getNombreMedicamento()
                    .equals(nombre))
                return listaRefrigerado.get(i);
        }
        return null;
    }
    
    public static TempAmbiente buscarTempAmbientePorNombre(String nombre)
    {        
        for(int i = 0; i < listaTempAmbiente.size(); i++)
        {
            if(listaTempAmbiente.get(i)
                    .getNombreMedicamento()
                    .equals(nombre))
                return listaTempAmbiente.get(i);
        }
        return null;
    }
    

/////////////////////////////FIN BUSQUEDAS//////////////////////////////////////
    
/////////////////////////////PANTALLAS DE ENCONTRADOS///////////////////////////
    public static int elegirDelLoteRefri(ArrayList<Refrigerado> lista, int lote)
    {
        int res = 0;
        System.out.println("Estos fueron los medicamentos refrigerados "
                + "encontrados para "
                + "el lote número "+lote);
        for(int i = 0; i < lista.size(); i++)
        {
            System.out.println((i+1)+" "+lista.get(i)
                    .getNombreMedicamento());
            
        }
        do
        {
            System.out.print("Por favor elija "
                    + "un medicamento (1,"+lista.size()+"): ");
            res = scn.nextInt();
            if(res < 1 || res > lista.size())
                System.out.println("Error, el medicamento indicado "
                        + "no existe en la lista");
        }while(res < 1 || res > lista.size());
        return res-1;
    }
    
        public static int elegirDelLoteTempAmbiente
        (ArrayList<TempAmbiente> lista, int lote)
    {
        int res = 0;
        System.out.println("Estos fueron los medicamentos refrigerados "
                + "encontrados para "
                + "el lote número "+lote);
        for(int i = 0; i < lista.size(); i++)
        {
            System.out.println((i+1)+" "+lista.get(i)
                    .getNombreMedicamento());
            
        }
        do
        {
            System.out.print("Por favor elija un medicamento "
                    + "(1,"+lista.size()+"): ");
            res = scn.nextInt();
            if(res < 1 || res > lista.size())
                System.out.println("Error, el medicamento indicado "
                        + "no existe en la lista");
        }while(res < 1 || res > lista.size());
        return res-1;
    }
/////////////////////////////FIN PANTALLAS DE ENCONTRADOS///////////////////////
        
///////////////////////////CONSULTAS DE MEDICAMENTOS////////////////////////////
            
    public static void consultarRefrigerado()
    {
        ArrayList<Refrigerado> auxListaRefri = new ArrayList<>();                
        int cont = 0;
        System.out.println("Por favor indique "
                + "cual de los siguientes lotes\n"
                + "de medicamentos refrigerados"
                + " desea revisar");                                    
        for(int i = 0; i < lotesRegistradosRefri
                .size();
                i++)
        {
            System.out.println(i+1+". "+
                    lotesRegistradosRefri
                            .get(i));
            cont++;
        }
        System.out.print("Opcion: ");
        opcion = validarOpcion(1,cont)-1;
        lote = lotesRegistradosRefri
                    .get(opcion);
        auxListaRefri = 
                buscarRefriPorLote(
                lote);  
        auxRefrigerado = auxListaRefri
                .get(
                elegirDelLoteRefri(
            auxListaRefri,lote));
        auxRefrigerado.mostrarInformacion();
        systemPause();
    }
    
    public static void consultarTempAmbiente()
    {
        ArrayList<TempAmbiente> auxListaTempAmbiente = new ArrayList<>();
        int cont = 0;
        System.out.println("Por favor indique "
                + "cual de los siguientes lotes\n"
                + "de medicamentos de temperatura "
                + "ambiente"
                + " desea revisar");                                    
        for(int i = 0; i 
                < lotesRegistradosTempAmbiente
                .size();
                i++)
        {
            System.out.println(i+1+". "+
                    lotesRegistradosTempAmbiente
                            .get(i));
            cont++;
        }
        System.out.print("Opcion: ");
        opcion = validarOpcion(1,cont)-1;
        lote = lotesRegistradosTempAmbiente
                    .get(opcion);
        auxListaTempAmbiente = 
                buscarTempAmbientePorLote(
                lote);  
        auxTempAmbiente = auxListaTempAmbiente
                .get(
                elegirDelLoteTempAmbiente(
            auxListaTempAmbiente,lote));
        auxTempAmbiente.mostrarInformacion();
        systemPause();  
    }
    
/////////////////////////FIN CONSULTAS DE MEDICAMENTOS//////////////////////////       

////////////////////////METODOS DE COMPRA DE MEDICAMENTOS///////////////////////
    public static int menuDeDevolucion(Refrigerado mediRefri, 
            TempAmbiente mediTempAmbiente ,int mediCompradas)
    {   // Metodo que permite devolver medicamentos
        if(mediCompradas == 0)
        {   // Si no hay medicamentos en el carrito
            System.out.println("¡No has añadido medicinas "
                    + " de este tipo a tu carrito todavía!\n"
                    + "Regresarás al menu de compra");
            systemPause();
        }
        else
        {   // Si hay medicamentos en el carrito
            if(mediTempAmbiente == null)
            {   // Si el medicamento es refrigerado
                mediCompradas = mediRefri.devolverCompra(mediCompradas);
            }
            else
            {   // Si el medicamento es a temperatura ambiente
                mediCompradas = mediTempAmbiente
                        .devolverCompra(mediCompradas);
            }
        }
        return mediCompradas;
    }
    
    public static void generarComprobante(ArrayList<Refrigerado> carritoRefri,
            ArrayList<TempAmbiente> carritoTempAmbiente,
            ArrayList<Integer> nRefri,
            ArrayList<Integer> nTempAmbiente,
            double totalFactura)
    {
        int cont = 0;
        double costoMedicinas = 0;
        if(carritoRefri.isEmpty() && carritoTempAmbiente.isEmpty())
            System.out.println("Aún no se han añadido medicamentos de ningún "
                    + "tipo al carrito");
        else
        {
            System.out.print("\nSu carrito ahora mismo consta de:");
            if(!carritoRefri.isEmpty())
            {
                for(int i = 0; i < carritoRefri.size(); i++)
                {
                    costoMedicinas += carritoRefri.get(i).getPrecioVentaPublica()
                            *nRefri.get(i);
                    cont += nRefri.get(i);
                }   
                System.out.print("\nMedicinas de tipo refrigerado en total: "+cont
                            +"\tTrumps "+costoMedicinas);
                costoMedicinas = 0;
                cont = 0;
            }
            if(!carritoTempAmbiente.isEmpty())
            {
                for(int i = 0; i < carritoTempAmbiente.size(); i++)
                {
                 costoMedicinas += carritoTempAmbiente.get(i).getPrecioVentaPublica()
                                *nTempAmbiente.get(i);
                        cont += nTempAmbiente.get(i);   
                }           
                System.out.print("\nMedicinas de tipo temperatura "
                        + "ambiente en total: "+cont+"\tTrumps "+costoMedicinas);            
            }
            System.out.print("\nTotal de compra: "+totalFactura+"Trumps\n");
        }
    }  
    
    public static ArrayList<Integer> actualizarRComprados(
            ArrayList<Refrigerado> 
            carrito, ArrayList<Integer> nRefrigerado)
    {
        if(nRefrigerado.isEmpty())
            nRefrigerado.add(carrito.get(0).comprarMedicamentos()); 
        else
        {
            for(int i = 0; i < carrito.size(); i++)
            {
                if(carrito.get(i) == auxRefrigerado)
                    {
                    System.out.print(nRefrigerado.get(i));
                    systemPause();
                    if(nRefrigerado.get(i) != null){
                        nRefrigerado.set(i,
                                nRefrigerado.get(i) + carrito.get(i)
                                                .comprarMedicamentos());
                    }
                    else
                    {
                       nRefrigerado.add(carrito
                                                .get(i)
                                                .comprarMedicamentos()); 
                    }
                }
            }
        }
        return nRefrigerado;
    }
    
    public static ArrayList<Integer> actualizarTAComprados(
            ArrayList<TempAmbiente> 
            carrito, ArrayList<Integer> nTempAmbiente)
    {
        if(nTempAmbiente.isEmpty())
            nTempAmbiente.add(carrito.get(0).comprarMedicamentos()); 
        else
        {
            for(int i = 0; i < carrito.size(); i++)
            {
                if(carrito.get(i) == auxTempAmbiente)
                    {
                    System.out.print(nTempAmbiente.get(i));
                    systemPause();
                    if(nTempAmbiente.get(i) != null){
                        nTempAmbiente.set(i,
                                nTempAmbiente.get(i) + carrito.get(i)
                                                .comprarMedicamentos());
                    }
                    else
                    {
                       nTempAmbiente.add(carrito
                                                .get(i)
                                                .comprarMedicamentos()); 
                    }
                }
            }
        }
        return nTempAmbiente;
    }
    
    public static double actualizarTotalR(ArrayList<Refrigerado> 
            carrito, ArrayList<Integer> nRefrigerado)
    {
        double totalFactura = 0;
        for(int i = 0; i < carrito.size(); i++)
        {
            if(carrito.get(i) == auxRefrigerado)
            {            
            totalFactura += nRefrigerado.get(i)*carrito
                            .get(i)
                            .getPrecioVentaPublica();
            }
        }
        return totalFactura;
    }
    
    public static double actualizarTotalTA(ArrayList<TempAmbiente> 
            carrito, ArrayList<Integer> nTempAmbiente)
    {
        double totalFactura = 0;
        for(int i = 0; i < carrito.size(); i++)
        {
            if(carrito.get(i) == auxTempAmbiente)
            {            
            totalFactura += nTempAmbiente.get(i)*carrito
                            .get(i)
                            .getPrecioVentaPublica();
            }
        }
        return totalFactura;
    }
    
    public static void menuDeCompra()
    {   // Metodo que permite comprar medicamentos
        
        opcion = -1;
        ArrayList<Integer> nRefri = new ArrayList<>();
        ArrayList<Integer> nTempAmbiente = new ArrayList<>();
        double totalFactura = 0;
        ArrayList<Refrigerado> carritoRefri = 
            new ArrayList<>(), auxListaRefri = new ArrayList<>();
        ArrayList<TempAmbiente> carritoTempAmbiente = 
            new ArrayList<>(), auxListaTempAmbiente = new ArrayList<>();
        
        while(opcion != 5)
        {   // Mientras el usuario no seleccione la opcion de finalizar compra            
            System.out.println("\nSeleccione una opción:"
                    + "\n1. Comprar medicamentos termolábiles/refrigerados"
                    + "\n2. Comprar medicamentos de temperatura ambiente"
                    + "\n3. Ver estado actual del carrito de compras"
                    + "\n4. Devolver medicamentos añadidos al carrito"
                    + "\n5. Finalizar compra");
            System.out.print("Opción: ");
            opcion = validarOpcion(1,5);
            switch(opcion)
            {
                case 1:
                {
                    System.out.print("Por favor ingrese el número de lote"
                            + " del o\nde los medicamentos que desea agregar"
                            + " a su carrito: ");
                    lote = validarLote();                    
                    auxListaRefri = buscarRefriPorLote(lote);
                    auxRefrigerado = listaRefrigerado
                            .get(elegirDelLoteRefri
                                (auxListaRefri, lote));
                    if(validarMedicamentoEnCarrito(
                            carritoRefri,auxRefrigerado) == false)
                        carritoRefri.add(auxRefrigerado); 
                    nRefri = 
                            actualizarRComprados(carritoRefri, 
                            nRefri);
                    totalFactura += 
                            actualizarTotalR(carritoRefri,
                                    nRefri);
                    systemPause();
                    break;
                }
                case 2:
                {
                    System.out.print("Por favor ingrese el número de lote"
                            + " del o\nde los medicamentos que desea agregar"
                            + " a su carrito: ");
                    lote = validarLote();                    
                    auxListaTempAmbiente = buscarTempAmbientePorLote(lote);
                    auxTempAmbiente = listaTempAmbiente
                            .get(elegirDelLoteTempAmbiente
                                (auxListaTempAmbiente, lote));
                    if(validarMedicamentoEnCarrito(
                            carritoTempAmbiente,auxTempAmbiente) 
                            == false)
                    carritoTempAmbiente.add(auxTempAmbiente);
                    nTempAmbiente = 
                            actualizarTAComprados(carritoTempAmbiente, 
                            nTempAmbiente);
                    totalFactura += 
                            actualizarTotalTA(carritoTempAmbiente,
                                    nTempAmbiente);
                    systemPause();
                    break;
                }
                case 3:
                {
                    generarComprobante(carritoRefri,carritoTempAmbiente,
                            nRefri,nTempAmbiente, 
                            totalFactura);
                    systemPause();
                    break;
                }
                case 4:
                {
                    System.out.println("Indique el tipo de medicamentos"
                            + "que desea devolver:"
                            + "\n1. Medicamentos termolábiles/refrigerados"
                            + "\n2. Medicamentos de temperatura ambiente"
                            + "\n3. Cancelar devolución");
                    System.out.print("Opcion: ");
                    opcion = validarOpcion(1,3);
                    switch(opcion)
                    {
                        case 1:
                        {
                           // mediRefriCompradas = menuDeDevolucion(mediRefri,
                            //        null,
                            //        mediRefriCompradas);
                            //totalFactura = mediRefriCompradas*
                                    //mediRefri.getPrecioVentaPublica();
                            break;
                        }
                        case 2:
                        {
                           /*  mediRefriCompradas = menuDeDevolucion(null,
                                    mediTempAmbiente,
                                    mediRefriCompradas);
                            totalFactura = mediRefriCompradas*
                            mediRefri.getPrecioVentaPublica();*/
                            break;
                        }
                        case 3:
                        {
                           System.out.println("Ahora regresará al menu de "
                                   + "compra");
                           break; 
                        }
                    }
                    break;
                }
                case 5:
                {
                    System.out.println("Ahora regresará al menú principal");                    
                    break;
                }
            }            
        }
    }
    
    /////////////////////FIN METODOS DE COMPRA DE MEDICAMENTOS//////////////////
    
    public static Refrigerado menuAgregarMedicamento(Refrigerado medi)
    {   // Metodo que permite agregar medicamentos de tipo refrigerado
        System.out.println("Indique como desea crear el "
                + "medicamento (1-3): ");
        System.out.println("1. Crear con valores "
                + "predeterminados");
        System.out.println("2. Crear con valores "
                + "preestablecidos (sin inicializar)");
        System.out.println("3. Crear con valores definidos "
                + "manualmente");
        System.out.print("Opción: ");
        opcion = validarOpcion(1,3);
        switch(opcion)
        {
            case 1:
                medi = new Refrigerado();
                break;
            case 2:
                medi = new Refrigerado(false);
                break;
            case 3:
                medi.leerDatos();
                break;
        }
        if(lotesRegistradosRefri.indexOf(medi.getNumeroLoteMedicamento())
                        == -1)
                    lotesRegistradosRefri.add(medi.getNumeroLoteMedicamento());
        return medi;
    }
    
    public static TempAmbiente menuAgregarMedicamento(TempAmbiente medi)
    {   // Metodo que permite agregar medicamentos de tipo temperatura ambiente
        System.out.println("Indique como desea crear el "
                + "medicamento (1-3): ");
        System.out.println("1. Crear con valores "
                + "predeterminados");
        System.out.println("2. Crear con valores "
                + "preestablecidos (sin inicializar)");
        System.out.println("3. Crear con valores definidos "
                + "manualmente");
        System.out.print("Opción: ");
        opcion = validarOpcion(1,3);
        switch(opcion)
        {
            case 1:
                medi = new TempAmbiente();
                break;
            case 2:
                medi = new TempAmbiente(false);
                break;
            case 3:
                medi.leerDatos();
                break;
        }
        if(lotesRegistradosTempAmbiente
                .indexOf(medi.getNumeroLoteMedicamento())
                        == -1)
                    lotesRegistradosTempAmbiente
                            .add(medi.getNumeroLoteMedicamento());
        return medi;
    }
    
    public static void colocarOferta(int lote)
    {
        ArrayList<Refrigerado> auxRefri;
        ArrayList<TempAmbiente> auxTempAmbiente;
        if((existeLoteMedicamento(lote,true,false) 
                == true)&&(existeLoteMedicamento(lote,false,
        true) == true))
        {
            auxRefri = buscarRefriPorLote(lote);
            auxTempAmbiente = buscarTempAmbientePorLote(lote);
            System.out.print("Se han encontrado medicamentos de ambos"
                    + "tipos con el "
                    + "mismo número de lote\n"
                    + "¿Cómo desea procedar?"
                    + "\n1. Colocar ambos tipos en oferta"
                    + "\n2. Colocar solo los tipo Refrigerado en oferta"
                    + "\n3. Colocar solo los tipo Temperatura "
                    + "Ambiente en oferta"
                    + "\nOpcion: ");
            opcion = validarOpcion(1,3);
            if(opcion == 1)
            {
                for(int i = 0; i < auxRefri.size(); i++){
                    auxRefri.get(i)
                            .colocarOferta(lote);
                }
                for(int i = 0; i < auxTempAmbiente.size(); i++){
                    auxTempAmbiente.get(i)
                            .colocarOferta(lote);
                }
            }
            else if(opcion == 2)
            {
                for(int i = 0; i < auxRefri.size(); i++){
                    auxRefri.get(i)
                            .colocarOferta(lote);
                }
            }
            else
            {
              for(int i = 0; i < auxTempAmbiente.size(); i++){
                    auxTempAmbiente.get(i)
                            .colocarOferta(lote);
                }  
            }
        }
        else if(existeLoteMedicamento
        (lote,true,false) 
                == true)
        {
            auxRefri = buscarRefriPorLote(lote);
            for(int i = 0; i < auxRefri.size(); i++){
                    auxRefri.get(i)
                            .colocarOferta(lote);
                }
        }
        else
        {
            auxTempAmbiente = buscarTempAmbientePorLote(lote);
            for(int i = 0; i < auxTempAmbiente.size(); i++){
                    auxTempAmbiente.get(i)
                            .colocarOferta(lote);
                }   
        }
        System.out.println("\n\nSe han colocado en oferta los medicamentos "
                + "con el lote indicado que fueron encontrados");
    }
    
    public static void retirarOferta(int lote)
    {
        ArrayList<Refrigerado> listaRefri;
        ArrayList<TempAmbiente> listaTempAmbiente;
        if((existeLoteMedicamento(lote,true,false) 
                == true)&&(existeLoteMedicamento(lote,false,
        true) == true))
        {
            listaRefri = buscarRefriPorLote(lote);
            listaTempAmbiente = buscarTempAmbientePorLote(lote);
            System.out.print("Se han encontrado medicamentos de ambos"
                    + "tipos con el "
                    + "mismo número de lote\n"
                    + "¿Cómo desea procedar?"
                    + "\n1. Retirar ambos tipos del mercado"
                    + "\n2. Retirar solo los tipo Refrigerado del mercado"
                    + "\n3. Retirar solo los tipo Temperatura "
                    + "Ambiente del mercado"
                    + "\nOpcion: ");
            opcion = validarOpcion(1,3);
            if(opcion == 1)
            {
                for(int i = 0; i < listaRefri.size(); i++){
                    listaRefri.get(i)
                            .retirarLote(lote);
                }
                for(int i = 0; i < listaTempAmbiente.size(); i++){
                    listaTempAmbiente.get(i)
                            .retirarLote(lote);
                }
            }
            else if(opcion == 2)
            {
                for(int i = 0; i < listaRefri.size(); i++){
                    listaRefri.get(i)
                            .retirarLote(lote);
                }
            }
            else
            {
              for(int i = 0; i < listaTempAmbiente.size(); i++){
                    listaTempAmbiente.get(i)
                            .retirarLote(lote);
                }  
            }
        }
        else if(existeLoteMedicamento
        (lote,true,false) 
                == true)
        {
            listaRefri = buscarRefriPorLote(lote);
            for(int i = 0; i < listaRefri.size(); i++){
                    listaRefri.get(i)
                            .retirarLote(lote);
                }
        }
        else
        {
            listaTempAmbiente = buscarTempAmbientePorLote(lote);
            for(int i = 0; i < listaTempAmbiente.size(); i++){
                    listaTempAmbiente.get(i)
                            .retirarLote(lote);
                }   
        }
        System.out.println("\n\nSe han retirado del mercado los medicamentos "
                + "con el lote indicado que fueron encontrados");
    }
    
    public static void reponerInventarioRefri()
    {
        ArrayList<Refrigerado> auxListaRefri = new ArrayList<>();
        int lote = 0, cont = 0;
        System.out.println("Por favor indique "
                + "cual de los siguientes lotes\n"
                + "de medicamentos refrigerados "
                + " desea revisar");                                    
        for(int i = 0; i 
                < lotesRegistradosRefri
                .size();
                i++)
        {
            System.out.println(i+1+". "+
                    lotesRegistradosRefri
                            .get(i));
            cont++;
        }
        System.out.print("Opcion: ");
        opcion = validarOpcion(1,cont)-1;
        lote = lotesRegistradosRefri
                    .get(opcion);
        auxListaRefri = buscarRefriPorLote(lote);
        auxRefrigerado = auxListaRefri
                .get(
                elegirDelLoteRefri(
            auxListaRefri,lote));
        opcion = auxRefrigerado.alertaReponerInventario();
        if(opcion == 1)
            auxRefrigerado.reponerInventario();
    }
    
    public static void reponerInventarioTempAmbiente()
    {
        ArrayList<TempAmbiente> auxListaTempAmbiente = new ArrayList<>();
        int lote = 0, cont = 0;
        System.out.println("Por favor indique "
                + "cual de los siguientes lotes\n"
                + "de medicamentos de temperatura "
                + "ambiente"
                + " desea revisar");                                    
        for(int i = 0; i 
                < lotesRegistradosTempAmbiente
                .size();
                i++)
        {
            System.out.println(i+1+". "+
                    lotesRegistradosTempAmbiente
                            .get(i));
            cont++;
        }
        System.out.print("Opcion: ");
        opcion = validarOpcion(1,cont)-1;
        lote = lotesRegistradosTempAmbiente
                    .get(opcion);
        auxListaTempAmbiente = buscarTempAmbientePorLote(lote);
        auxTempAmbiente = auxListaTempAmbiente
                .get(
                elegirDelLoteTempAmbiente(
            auxListaTempAmbiente,lote));
        opcion = auxTempAmbiente.alertaReponerInventario();
        if(opcion == 1)
            auxTempAmbiente.reponerInventario();
    }
    
    public static void mostrarCostoYPrecioRefri()
    {
        ArrayList<Refrigerado> auxListaRefri = new ArrayList<>();
        int lote = 0, cont = 0;
        System.out.println("Por favor indique "
                + "cual de los siguientes lotes\n"
                + "de medicamentos refrigerados "
                + " desea revisar");                                    
        for(int i = 0; i 
                < lotesRegistradosRefri
                .size();
                i++)
        {
            System.out.println(i+1+". "+
                    lotesRegistradosRefri
                            .get(i));
            cont++;
        }
        System.out.print("Opcion: ");
        opcion = validarOpcion(1,cont)-1;
        lote = lotesRegistradosRefri
                    .get(opcion);
        auxListaRefri = buscarRefriPorLote(lote);
        auxRefrigerado = auxListaRefri
                .get(
                elegirDelLoteRefri(
            auxListaRefri,lote));
        auxRefrigerado.mostrarCostoYPrecio();
    }
    
    public static void mostrarCostoYPrecioTempAmbiente()
    {
        ArrayList<TempAmbiente> auxListaTempAmbiente = new ArrayList<>();
        int lote = 0, cont = 0;
        System.out.println("Por favor indique "
                + "cual de los siguientes lotes\n"
                + "de medicamentos de temperatura "
                + "ambiente"
                + " desea revisar");                                    
        for(int i = 0; i 
                < lotesRegistradosTempAmbiente
                .size();
                i++)
        {
            System.out.println(i+1+". "+
                    lotesRegistradosTempAmbiente
                            .get(i));
            cont++;
        }
        System.out.print("Opcion: ");
        opcion = validarOpcion(1,cont)-1;
        lote = lotesRegistradosTempAmbiente
                    .get(opcion);
        auxListaTempAmbiente = buscarTempAmbientePorLote(lote);
        auxTempAmbiente = auxListaTempAmbiente
                .get(
                elegirDelLoteTempAmbiente(
            auxListaTempAmbiente,lote));
        auxTempAmbiente.mostrarCostoYPrecio();
    }
    
    public static void menuCliente()
    {   //Método de menu para la interaccion del cliente de la famracia
        //con el programa de gestion de la misma        
        
        boolean endOfClientMenu = true;
        
        while(endOfClientMenu)
        {
            System.out.print("\nMENU DEL CLIENTE"
                    + "\nSeleccione una opcion:"
                    + "\n1. Comprar medicamentos"
                    + "\n2. Salir"
                    + "\nOpcion: ");
            opcion = validarOpcion(1,2);
            switch(opcion)
            {
                case 1:
                {
                    menuDeCompra();
                    systemPause();
                    break;
                }
                case 2:
                {
                    System.out.println("\nRegresando al menú principal\n");
                    endOfClientMenu = false;
                    break;
                }
            }
        }
        
    }
    
    public static void menuAdministrador()
    {   //Metodo de menu para la interaccion del administrador de la famracia
        //con el programa de gestion de la misma
        boolean endOfAdminMenu = true;     
            while (endOfAdminMenu) {
                System.out.print("\nMENU DEL ADMINISTRADOR"
                        + "\nSeleccione una opción:"
                        +"\n1. Verificar si un medicamento está vencido"
                        + "\n2. Consultar datos de un medicamento"
                        + "\n3. Agregar un medicamento"
                        + "\n4. Colocar oferta de medicamento"
                        + "\n5. Retirar lote de medicamento"
                        + "\n6. Verificar el inventario de un medicamento"
                        + "\n7. Ver costo y precio de un medicamento"
                        +"\n8. Regresar"
                        + "\nOpcion: ");
                opcion = validarOpcion(1,9);
                switch (opcion) 
                {
                    case 1:
                        {   
                            listaRefrigerado.get(0).determinarVencido(); 
                            systemPause();
                            break;
                        }
                    case 2:
                        {
                            System.out.print("\n\nPor favor indique cual de "
                                    + "los dos tipos de medicamentos desea "
                                    + "consultar su información"
                                    + "\n1. Tipo Refrigerado"
                                    + "\n2. Tipo Temperatura Ambiente"
                                    + "\nOpción: ");
                            opcion = validarOpcion(1,2);
                            if(opcion == 1)                           
                                consultarRefrigerado();
                            else
                                consultarTempAmbiente();
                            break;
                        }                        
                    case 3:
                        {       
                            System.out.println("\nIndique el tipo "
                                    + "de medicamento "
                                    + "que desea agregar:"
                                    + "\n1. Medicamento de tipo refrigerado "
                                    + "(temperatura entre 2 y 8 grados)"
                                    + "\n2. Medicamento de tipo temperatura "
                                    + "ambiente"
                                    + " (temperatura entre 15 y 25 grados)");
                            System.out.print("Opción: ");
                            opcion = validarOpcion(1,2);
                            if(opcion == 1)
                            {
                                listaRefrigerado.add(menuAgregarMedicamento
                                        (new Refrigerado()
                                        ));
                            }
                            else
                            {
                                listaTempAmbiente.add(
                                        menuAgregarMedicamento(new TempAmbiente()
                                        ));
                            }
                            systemPause();
                            break;
                        }
                    case 4:
                    {
                        System.out.print("Ingrese el numero de lote del "
                                + "o de los medicamentos\n"
                                + "que desea coloar en oferta: ");
                        lote = validarLote();
                        colocarOferta(lote);                       
                        systemPause();
                        break;
                    }
                    case 5:
                    {
                        System.out.print("Ingrese el numero de lote del "
                                + "o de los medicamentos\n"
                                + "que desea retirar del mercado: ");
                        lote = validarLote();
                        retirarOferta(lote);
                        systemPause();
                        break;
                    }                       
                    case 6:
                    {
                        System.out.print("\n\nPor favor indique cual de "
                                    + "los dos tipos de medicamentos desea "
                                    + "verificar su inventario"
                                    + "\n1. Tipo Refrigerado"
                                    + "\n2. Tipo Temperatura Ambiente"
                                    + "\nOpción: ");
                        opcion = validarOpcion(1,2);
                        if(opcion == 1)
                            reponerInventarioRefri();
                        else
                            reponerInventarioTempAmbiente();
                        systemPause();
                        break;
                    }
                    case 7:
                    {
                        System.out.print("\n\nPor favor indique cual de "
                                    + "los dos tipos de medicamentos desea "
                                    + "mostrar su costo y precio"
                                    + "\n1. Tipo Refrigerado"
                                    + "\n2. Tipo Temperatura Ambiente"
                                    + "\nOpción: ");
                        opcion = validarOpcion(1,2);
                        if(opcion == 1)
                            mostrarCostoYPrecioRefri();
                        else
                            mostrarCostoYPrecioTempAmbiente();
                        systemPause();
                        break;
                    }
                    case 8:
                    {                        
                        System.out.println("\nRegresando al menú principal\n");
                        endOfAdminMenu = false;
                        break;
                    }
                }
            }       
    }
    
    public static void menuPrincipal()
    {
        boolean endOfProgram = true; 
        listaRefrigerado.add(new Refrigerado());
        listaTempAmbiente.add(new TempAmbiente());
        lotesRegistradosRefri.add(listaRefrigerado.get(0)
                .getNumeroLoteMedicamento());
        lotesRegistradosTempAmbiente.add(listaTempAmbiente.get(0)
                .getNumeroLoteMedicamento());
        
        while(endOfProgram)
        {
            System.out.println("¡Bienvenido a la FARMACIA GENÉRICA 2024!");
            System.out.print("Seleccione una opcion: "
                    + "\n1. Acceder como administrador"
                    + "\n2. Acceder como cliente"
                    + "\n3. Salir"
                    + "\nOpcion: ");
            opcion = validarOpcion(1,3);
            switch(opcion)
            {
                case 1:
                {
                    menuAdministrador();
                    break;
                }
                case 2:
                {
                    menuCliente();
                    break;
                }
                case 3:
                {
                    System.out.println("Gracias por usar el programa de "
                            + "la FARMACIA GENÉRICA 2024\nVuelva pronto ;)");
                    endOfProgram = false;
                    break;
                }
            }
            systemPause(); 
        }
    }    
}
