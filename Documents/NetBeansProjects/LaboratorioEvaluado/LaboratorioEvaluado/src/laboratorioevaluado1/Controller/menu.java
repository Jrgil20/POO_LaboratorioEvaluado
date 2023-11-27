/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorioevaluado1.Controller;
package laboratorioevaluado1.Controller;

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
    
    //Crear una de tipo contador (cont) 
    //para toda parte del menú que requiera el mismo
    public static int cont;

    public static void systemPause()
    {   // Metodo que pausa el sistema hasta que el usuario presione enter
        System.out.println("Presione enter para continuar...");
        scn.nextLine();
    }
    
    public static boolean sinRefrigerados()
    {
        if(listaRefrigerado.isEmpty())
        {
            System.out.println("Error, esta operación no se puede ejecutar"
                    + " debido a que no hay "
                    + "medicamentos refrigerados disponibles");
            return true;
        }
        return false;
    }
    
    public static boolean sinTempAmbiente()
    {
        if(listaRefrigerado.isEmpty())
        {
            System.out.println("Error, esta operación no se puede ejecutar"
                    + " debido a que no hay "
                    + "medicamentos temperatura ambiente disponibles");
            return true;
        }
        return false;
    }

    public static void reestablecerContEnCero()
    {
        //Reestablece la variable cont a 0 para ser re utilizada a conveniencia
        cont = 0;
    }
    
    public static void seleccionarTipoMedicamento(String msg)
    {
        //Solicita que el usuario seleccione el tipo de medicamento con el que 
        //desea operar
        System.out.println("\nIndique el tipo "
                + "de medicamento "
                + "que desea "+msg+":"
                + "\n1. Medicamento de tipo refrigerado "
                + "(temperatura entre 2 y 8 grados)"
                + "\n2. Medicamento de tipo temperatura "
                + "ambiente"
                + " (temperatura entre 15 y 25 grados)");
        System.out.print("Opción: ");
        opcion = validarOpcion(1,2);
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
        //Metodo para validar la existencia de un medicamento refrigerado
        //en el carrito de
        //la compra
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
        //Metodo para validar la existencia de un 
        //medicamento temperatura ambiente
        //en el carrito de
        //la compra
        for(int i = 0; i < carrito.size(); i++)
        {
            if(carrito.get(i) == med)
                return true;
        }
        return false;
    }
    
/////////////////////////////FIN VALIDACIONES///////////////////////////////////
    
////////////////////////////SOLICITUDES DE LOTES////////////////////////////////  
    
    public static void solicitarNumeroLote()
    {
        //Metodo que solicita el numero de lote de cualquier tipo de medicamento
        System.out.print("Ingrese el numero de lote del "
                                + "o de los medicamentos\n"
                                + "con los que desea operar: ");
        lote = validarLote();
    }

    public static void solicitarNumeroLoteRefrigerado()
    {
        //Metodo que solicita el numero de lote de medicamentos refrigerado
        System.out.println("Por favor indique "
                + "con cual de los siguientes lotes\n"
                + "de medicamentos refrigerados "
                + " desea operar");                                    
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
    }
    
    public static void solicitarNumeroLoteTempAmbiente()
    {
        //Metodo que solicita el numero de lote de medicamentos 
        //temperatura ambiente
        System.out.println("Por favor indique "
                + "con cual de los siguientes lotes\n"
                + "de medicamentos de temperatura "
                + "ambiente desea operar");
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
    }
  
//////////////////////////FIN SOLICITUDES DE LOTES//////////////////////////////  
    
/////////////////////////////BUSQUEDAS///////////////////////////////////////    
    
    public static ArrayList<Refrigerado> buscarRefriPorLote(int nLote)
    { 
        //Metodo para buscar un medicamento refrigerado por su lote
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
        //Metodo para buscar un medicamento de temperatura ambiente por su lote
        ArrayList<TempAmbiente> lista = new ArrayList<>();
        
        for(int i = 0; i < listaTempAmbiente.size(); i++)
        {
            if(listaTempAmbiente.get(i)
                    .getNumeroLoteMedicamento() == nLote)
                lista.add(listaTempAmbiente.get(i));
        }
        return lista;
    }               

/////////////////////////////FIN BUSQUEDAS//////////////////////////////////////
    
/////////////////////////////PANTALLAS DE ENCONTRADOS///////////////////////////
    
    public static int elegirDelLoteRefri(ArrayList<Refrigerado> lista, int lote)
    {
        //Metodo para un elegir un medicamento refrigerado de su lote
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
        //Metodo para un elegir un medicamento temperatura ambiente de su lote
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

//////////////////////////OBTENCION DE UN MEDICAMENTO///////////////////////////
    
    public static void obtenerRefrigerado()
    {
        ArrayList<Refrigerado> auxListaRefrigerado = new ArrayList<>();
        auxListaRefrigerado = buscarRefriPorLote(lote);
        auxRefrigerado = auxListaRefrigerado
                .get(
                elegirDelLoteRefri(
            auxListaRefrigerado,lote));  
    }
    
    public static void obtenerTempAmbiente()
    {
        ArrayList<TempAmbiente> auxListaTempAmbiente = new ArrayList<>();
        auxListaTempAmbiente = buscarTempAmbientePorLote(lote);
        auxTempAmbiente = auxListaTempAmbiente
                .get(
                elegirDelLoteTempAmbiente(
            auxListaTempAmbiente,lote));   
    }    
    
////////////////////////FIN OBTENCION DE UN MEDICAMENTO/////////////////////////          
        
///////////////////////////CONSULTAS DE MEDICAMENTOS////////////////////////////
            
    public static void consultarRefrigerado()
    {
        //Metodo para un consultar un medicamento refrigerado de un lote               
        solicitarNumeroLoteRefrigerado();
        obtenerRefrigerado();
        auxRefrigerado.mostrarInformacion();
    }
    
    public static void consultarTempAmbiente()
    {
        //Metodo para un consultar un medicamento temperatura ambiente 
        //de un lote        
        solicitarNumeroLoteTempAmbiente();
        obtenerTempAmbiente();
        auxTempAmbiente.mostrarInformacion(); 
    }
    
/////////////////////////FIN CONSULTAS DE MEDICAMENTOS//////////////////////////       
    
////////////////////////METODOS DE COMPRA DE MEDICAMENTOS///////////////////////
    /*
    public static String seleccionarMedicamento(
            ArrayList<Refrigerado> carritoRefri,
            ArrayList<TempAmbiente> carritoTempAmbiente, 
            ArrayList<Integer> nRefri, 
            ArrayList<Integer> nTempAmbiente)
    {
        String nom;
       if(!nRefri.isEmpty() && !nTempAmbiente.isEmpty())
        {
            System.out.println("\n\tMedicamentos de tipo refrigerado");
            for(int i = 0; i < carritoRefri.size(); i++)
            {
                System.out.println("\t"+carritoRefri
                        .get(i).getNombreMedicamento());
            }
            System.out.println("\n\tMedicamentos de tipo "
                    + "temperatura ambiente");
            for(int i = 0; i < carritoTempAmbiente.size(); i++)
            {
                System.out.println("\t"+carritoTempAmbiente
                        .get(i).getNombreMedicamento());
            }
            System.out.print("\nIngrese el nombre del medicamento que "
                    + "desea retirar de su carrito: ");
            nom = scn.nextLine();
            while(!buscarTempAmbientePorNombre
        (nom,carritoTempAmbiente)
                    ||!buscarRefriPorNombre(nom, 
                            carritoRefri))
            {
                System.out.print("\nError, el nombre ingresado no existe "
                        + "en el carrito\nIngrese "
                        + "otro nombre: ");
                nom = scn.nextLine();
            }            
        }
        else if(!nRefri.isEmpty() && nTempAmbiente.isEmpty())
        {
            System.out.println("\n\tMedicamentos de tipo refrigerado");
            for(int i = 0; i < carritoRefri.size(); i++)
            {
                System.out.println("\t"+carritoRefri
                        .get(i).getNombreMedicamento());
            }
            System.out.print("\nIngrese el nombre del medicamento que "
                    + "desea retirar de su carrito: ");
            nom = scn.nextLine();
            while(!buscarRefriPorNombre(nom, 
                            carritoRefri))
            {
                System.out.print("\nError, el nombre ingresado no existe "
                        + "en el carrito\nIngrese "
                        + "otro nombre: ");
                nom = scn.nextLine();
            }  
        }
        else
        {
            System.out.println("\n\tMedicamentos de tipo "
                    + "temperatura ambiente\n");
            for(int i = 0; i < carritoTempAmbiente.size(); i++)
            {
                System.out.println("\t"+carritoTempAmbiente
                        .get(i).getNombreMedicamento());
            }
            System.out.print("\nIngrese el nombre del medicamento que "
                    + "desea retirar de su carrito: ");
            nom = scn.nextLine();
            while(!buscarTempAmbientePorNombre(nom, 
                    carritoTempAmbiente))
            {
                System.out.print("\nError, el nombre ingresado no existe "
                        + "en el carrito\nIngrese "
                        + "otro nombre: ");
                nom = scn.nextLine();
            }
        } 
       return nom;
    }
    
    public static void menuDeDevolucion(ArrayList<Refrigerado> carritoRefri,
                    ArrayList<TempAmbiente> carritoTempAmbiente,
                    ArrayList<Integer> nRefri, ArrayList<Integer> nTempAmbiente)
    {  
        // Metodo que permite devolver medicamentos
        String nom;
        if(nRefri.isEmpty() && nTempAmbiente.isEmpty())
        {   // Si no hay medicamentos en el carrito
            System.out.println("¡No has añadido medicinas "
                    + " de ningún tipo a tu carrito todavía!\n"
                    + "Regresarás al menu de compra");
            systemPause();
        }
        else 
        {        
            System.out.println("Acutalmente su carrito cuenta con los\n"
                    + "siguientes medicamentos:");
            if(!nRefri.isEmpty() && !nTempAmbiente.isEmpty())
            {
               nom = seleccionarMedicamento(carritoRefri,carritoTempAmbiente, 
                                        nRefri, nTempAmbiente);
               for(int i = 0; i < carritoRefri.size(); i++)
               {
                   if(carritoRefri.get(i).equals(nom))
                   {
                       nRefri.set(i, 
                               carritoRefri.get(i)
                                       .devolverCompra(opcion));
                   }
               }
               for(int i = 0; i < carritoTempAmbiente.size(); i++)
               {
                   if(carritoTempAmbiente.get(i).equals(nom))
                   {
                       nTempAmbiente.set(i, carritoTempAmbiente
                               .get(i).devolverCompra(opcion));
                   }
               }
            }
            else if(!nRefri.isEmpty() && nTempAmbiente.isEmpty())
            {
                nom = seleccionarMedicamento(carritoRefri,carritoTempAmbiente, 
                                        nRefri, nTempAmbiente);
                for(int i = 0; i < carritoRefri.size(); i++)
               {
                   if(carritoRefri.get(i).equals(nom))
                   {
                       nRefri.set(i, 
                               carritoRefri.get(i)
                                       .devolverCompra(opcion));
                   }
               }
            }
            else
            {
                nom = seleccionarMedicamento(carritoRefri,carritoTempAmbiente, 
                                        nRefri, nTempAmbiente);
                for(int i = 0; i < carritoTempAmbiente.size(); i++)
               {
                   if(carritoTempAmbiente.get(i).equals(nom))
                   {
                       nTempAmbiente.set(i, carritoTempAmbiente
                               .get(i).devolverCompra(opcion));
                   }
               }
            }            
            
        }
    }
    */
    
    public static void generarComprobante(ArrayList<Refrigerado> carritoRefri,
            ArrayList<TempAmbiente> carritoTempAmbiente,
            ArrayList<Integer> nRefri,
            ArrayList<Integer> nTempAmbiente,
            double totalFactura)
    {
        //Metodo que genera el comprobante del estado de una compra
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
                reestablecerContEnCero();
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
        //Metodo que actualiza los medicamentos refrigerados 
        //comprados hasta el momento
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
        //Metodo que actualiza los medicamentos temperatura ambiente
        //comprados hasta el momento
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
        //Metodo que actualiza el total de una compra de 
        //medicamentos refrigerados
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
        //Metodo que actualiza el total de una compra de 
        //medicamentos temperatura ambiente
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
            new ArrayList<>();
        ArrayList<TempAmbiente> carritoTempAmbiente = 
            new ArrayList<>();
        
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
                    solicitarNumeroLoteRefrigerado();
                    obtenerRefrigerado();
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
                    solicitarNumeroLoteTempAmbiente();                   
                    obtenerTempAmbiente();
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
                    /*menuDeDevolucion(carritoRefri,
                    carritoTempAmbiente,
                    nRefri, nTempAmbiente);*/
                    systemPause();
                    break;
                }
                case 5:
                {
                    generarComprobante(carritoRefri,carritoTempAmbiente,
                            nRefri,nTempAmbiente, 
                            totalFactura);
                    System.out.println("¡Gracias por su compra!"
                            + "\nAhora regresará al menú principal");                    
                    break;
                }                
            }            
            reestablecerContEnCero();
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
        obtenerRefrigerado();
        opcion = auxRefrigerado.alertaReponerInventario();
        if(opcion == 1)
            auxRefrigerado.reponerInventario();
    }
    
    public static void reponerInventarioTempAmbiente()
    {
        obtenerTempAmbiente();
        opcion = auxTempAmbiente.alertaReponerInventario();
        if(opcion == 1)
            auxTempAmbiente.reponerInventario();
    }
    
    public static void mostrarCostoYPrecioRefri()
    {
        obtenerRefrigerado();
        auxRefrigerado.mostrarCostoYPrecio();
    }
    
    public static void mostrarCostoYPrecioTempAmbiente()
    {
        obtenerTempAmbiente();
        auxTempAmbiente.mostrarCostoYPrecio();
    }
    
    public static void imprimirDatosModificables()
    {
        System.out.print("Ingrese el dato que desea modificar "
                + "del medicamento seleccionado"
                +"\n1. Nombre"
                + "\n2. Codigo del medicamento"
                + "\n3. Costo del medicamento"
                + "\n4. Porcentaje adicional de venta"
                + "\n5. Precio venta pública"
                + "\n6. Unidades existentes"
                + "\n7. Unidades vendidas"
                + "\n8. Vigencia en el mercado"
                + "\n9. Numero de lote del medicamento"
                + "\n10. Fecha de caducidad");
    }
    
    public static void modificarRefrigerado(){
        obtenerRefrigerado();
        imprimirDatosModificables();
        System.out.print("\n11. Temperatura mínima"
                + "\n12. Temperatura máxima"
                + "\n13. Dias que se puede mantener refrigerado una\n"
                + "vez abierto"
                + "\nOpcion: ");
        opcion = validarOpcion(1,13);
        auxRefrigerado.modificarDatos(opcion);
    }
    
    public static void modificarTempAmbiente(){
        obtenerTempAmbiente();
        imprimirDatosModificables();
        System.out.print("\n11. Lugares donde no se debe colocar"
                + "\nOpcion: ");
        opcion = validarOpcion(1,11);
        auxTempAmbiente.modificarDatos(opcion);
    }
    
    public static void eliminarRefrigerado()
    {
        //Metodo que permite eliminar un medicamento refrigerado
        boolean endOfEliminate = true;
        while(endOfEliminate && !sinRefrigerados())
        {
            reestablecerContEnCero();
            solicitarNumeroLoteRefrigerado();
            obtenerRefrigerado();
            System.out.println("¿Está seguro de que desea eliminar "
                    + "este medicamento?"
                    + "\n1. Si"
                    + "\n2. No"
                    + "\nOpcion: ");
            opcion = validarOpcion(1,2);
            if(opcion == 1)
            {
                for(int i = 0; i < listaRefrigerado.size(); i++)
                {
                    if(listaRefrigerado.get(i)
                            .getNumeroLoteMedicamento() == lote)
                        cont++;
                }
                if(cont == 1)
                {
                    lotesRegistradosRefri.remove
                    (lotesRegistradosRefri.indexOf(lote));
                }
                listaRefrigerado.remove(auxRefrigerado);
                System.out.println("Se ha eliminado el medicamento "
                        + "seleccionado");
            }
            else
            {
                System.out.println("No se ha eliminado el medicamento "
                        + "seleccionado");
            }
            System.out.println("¿Desea eliminar otro medicamento "
                    + "refrigerado?"
                    + "\n1. Si"
                    + "\n2. No"
                    + "\nOpcion: ");
            opcion = validarOpcion(1,2);
            if(opcion == 2)
                endOfEliminate = false;
        }
    }
    
    public static void eliminarTempAmbiente()
    {
        //Metodo que permite eliminar un medicamento temperatura ambiente
        boolean endOfEliminate = true;
        while(endOfEliminate && !sinTempAmbiente())
        {
            reestablecerContEnCero();
            solicitarNumeroLoteTempAmbiente();
            obtenerTempAmbiente();
            System.out.println("¿Está seguro de que desea eliminar "
                    + "este medicamento?"
                    + "\n1. Si"
                    + "\n2. No"
                    + "\nOpcion: ");
            opcion = validarOpcion(1,2);
            if(opcion == 1)
            {
                for(int i = 0; i < listaTempAmbiente.size(); i++)
                {
                    if(listaTempAmbiente.get(i)
                            .getNumeroLoteMedicamento() == lote)
                        cont++;
                }
                if(cont == 1)
                {
                    lotesRegistradosTempAmbiente.remove
                    (lotesRegistradosTempAmbiente.indexOf(lote));
                }
                listaTempAmbiente.remove(auxTempAmbiente);
                System.out.println("Se ha eliminado el medicamento "
                        + "seleccionado");
            }
            else
            {
                System.out.println("No se ha eliminado el medicamento "
                        + "seleccionado");
            }
            System.out.println("¿Desea eliminar otro medicamento "
                    + "temperatura ambiente?"
                    + "\n1. Si"
                    + "\n2. No"
                    + "\nOpcion: ");
            opcion = validarOpcion(1,2);
            if(opcion == 2)
                endOfEliminate = false;
        }
    }
    
    public static void vencidoRefrigerado()
    {
        //Metodo que permite saber si un medicamento refrigerado
        //esta vencido
        solicitarNumeroLoteRefrigerado();
        obtenerRefrigerado();
        auxRefrigerado.determinarVencido();
    }
    
    public static void vencidoTempAmbiente()
    {        
        //Metodo que permite saber si un medicamento temperatura ambiente
        //esta vencido
        solicitarNumeroLoteTempAmbiente();
        obtenerTempAmbiente();
        auxTempAmbiente.determinarVencido();
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
            reestablecerContEnCero();
        }
        
    }
    
    public static void menuAdministrador()
    {   //Metodo de menu para la interaccion del administrador de la farmacia
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
                        + "\n8. Modificar datos de un medicamento"
                        + "\n9. Eliminar un medicamento"
                        + "\n10. Regresar"
                        + "\nOpcion: ");
                opcion = validarOpcion(1,10);
                switch (opcion) 
                {
                    case 1:
                        {   
                            seleccionarTipoMedicamento("saber si "
                                    + "está venciado");
                            if(opcion == 1 && !sinRefrigerados())
                                vencidoRefrigerado();
                            else if(opcion == 2 && !sinTempAmbiente())
                                vencidoTempAmbiente();
                            systemPause();
                            break;
                        }
                    case 2:
                        {
                            seleccionarTipoMedicamento("consultar");
                            if(opcion == 1 && !sinRefrigerados())
                                consultarRefrigerado();
                            else if(opcion == 2 && !sinTempAmbiente())
                                consultarTempAmbiente();
                            systemPause();
                            break;
                        }                        
                    case 3:
                        {       
                            seleccionarTipoMedicamento("agregar");
                            if(opcion == 1 && !sinRefrigerados())
                            {
                                listaRefrigerado.add(menuAgregarMedicamento
                                        (new Refrigerado()
                                        ));
                            }
                            else if(opcion == 2 && !sinTempAmbiente())
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
                        solicitarNumeroLote();
                        colocarOferta(lote);                       
                        systemPause();
                        break;
                    }
                    case 5:
                    {
                        solicitarNumeroLote();
                        retirarOferta(lote);
                        systemPause();
                        break;
                    }                       
                    case 6:
                    {
                        seleccionarTipoMedicamento("verificarInventario");
                        if(opcion == 1 && !sinRefrigerados())
                            reponerInventarioRefri();
                        else if(opcion == 2 && !sinTempAmbiente())
                            reponerInventarioTempAmbiente();
                        systemPause();
                        break;
                    }
                    case 7:
                    {
                        seleccionarTipoMedicamento("mostrar su costo y"
                                + " precio");
                        if(opcion == 1 && !sinRefrigerados())
                            mostrarCostoYPrecioRefri();
                        else if(opcion == 2 && !sinTempAmbiente())
                            mostrarCostoYPrecioTempAmbiente();
                        systemPause();
                        break;
                    }
                    case 8:
                    {
                        seleccionarTipoMedicamento("modificar");
                        if(opcion == 1 && !sinRefrigerados())
                        {
                            modificarRefrigerado();
                        }
                        else if(opcion == 2 && !sinTempAmbiente())
                        {
                            modificarTempAmbiente();
                        }
                        systemPause();
                        break;
                    }
                    case 9:
                    {                        
                        seleccionarTipoMedicamento("eliminar");
                         if(opcion == 1 && !sinRefrigerados())
                        {
                            eliminarRefrigerado();
                        }
                        else if(opcion == 2 && !sinTempAmbiente())
                        {
                            eliminarTempAmbiente();
                        }
                        systemPause();
                        break;
                    }
                    case 10:
                    {
                        System.out.println("\nRegresando al menú principal\n");
                        endOfAdminMenu = false;
                        break;
                    }                    
                }
                reestablecerContEnCero();
            }       
    }
    
    public static void menuPrincipal()
    {
        //Menú principal del programa
        
        //instancia de tipo booleano para saber cuando acaba el programa
        boolean endOfProgram = true;
        
        //Se añade un elemento genérico de cada tipo a cada lista 
        //respectivamente para poder operar con un al menos un elemento desde
        //el inicio
        listaRefrigerado.add(new Refrigerado());
        listaTempAmbiente.add(new TempAmbiente());
        
        //Se agregan los lotes generados de los medicamentos que se añadieron
        //a las listas de los medicamentos
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
