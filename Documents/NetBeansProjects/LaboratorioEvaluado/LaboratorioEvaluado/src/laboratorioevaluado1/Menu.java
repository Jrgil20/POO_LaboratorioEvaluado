package laboratorioevaluado1;
// Clases importadas
import java.util.ArrayList;
import java.util.Scanner;

public class Menu 
{
    // Clase Menu
    private static ArrayList<Refrigerado> listaRefrigerado = 
            new ArrayList<>();
    private static ArrayList<TempAmbiente> listaTempAmbiente = 
            new ArrayList<>();
    private static ArrayList<Integer> lotesRegistradosRefri = new ArrayList<>();
    private static ArrayList<Integer> lotesRegistradosTempAmbiente 
            = new ArrayList<>();
    
    // Crear una única instancia de Scanner como variable estática
    public static Scanner scn = new Scanner(System.in);
    
    //Crear una variable opcion para todo el menu
    public static int opcion;  
    
    
/////////////////////////////VALIDACIONES///////////////////////////////////////
    
    public static boolean existeLoteMedicamento(int nLote, boolean esRefri, 
            boolean esTempAmbiente){
        //Metodo para validar la existencia de ciertos medicamentos según el 
        //lote
        if(esRefri == true && esTempAmbiente == false)
        {
            for(int i = 0; i < listaRefrigerado.size(); i++)
            {
                if(listaRefrigerado.get(i)
                        .getNumeroLoteMedicamento() == nLote)
                    return true;
            }
        }
        else if(esTempAmbiente == true && esRefri == false)
        {
            for(int i = 0; i < listaTempAmbiente.size(); i++)
            {
                if(listaTempAmbiente.get(i)
                        .getNumeroLoteMedicamento() == nLote)
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
                    .getNombreMedicamento()
                    +" "
                    + "Trumps: "+lista.get(i).getPrecioVentaPublica());
            
        }
        do
        {
            System.out.print("Por favor indique el medicamento que desea "
                    + "agregar al carrito (1,"+lista.size()+"): ");
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
                    .getNombreMedicamento()
                    +" "
                    + "Trumps: "+lista.get(i).getPrecioVentaPublica());
            
        }
        do
        {
            System.out.print("Por favor indique el medicamento que desea "
                    + "agregar al carrito (1,"+lista.size()+"): ");
            res = scn.nextInt();
            if(res < 1 || res > lista.size())
                System.out.println("Error, el medicamento indicado "
                        + "no existe en la lista");
        }while(res < 1 || res > lista.size());
        return res-1;
    }
/////////////////////////////FIN PANTALLAS DE ENCONTRADOS///////////////////////
    
    public static void systemPause()
    {   // Metodo que pausa el sistema hasta que el usuario presione enter
        System.out.println("Presione enter para continuar...");
        scn.nextLine();
    }

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
    
    public static void menuDeCompra()
    {   // Metodo que permite comprar medicamentos
        
        opcion = -1;
        int mediRefriCompradas = 0, mediTempAmbienteCompradas = 0, lote;
        double totalFactura = 0;
        Refrigerado medRefri;
        TempAmbiente medTempAmbiente;
        ArrayList<Refrigerado> carritoDeCompraRefri = 
            new ArrayList<>(), auxListaRefri = new ArrayList<>();
        ArrayList<TempAmbiente> carritoDeCompraTempAmbiente = 
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
                    lote = scn.nextInt();
                    while(existeLoteMedicamento(lote, 
                            true, false) != true)
                    {
                        System.out.print("Error, el lote ingresado no existe "
                                + "para medicamentos de tipo refrigerado\n"
                                + "Por favor ingrese el número de lote"
                            + " del o\nde los medicamentos que desea agregar"
                            + " a sucarrito: ");
                        lote = scn.nextInt();    
                    }
                    auxListaRefri = buscarRefriPorLote(lote);
                    medRefri = listaRefrigerado.get(elegirDelLoteRefri
                                (auxListaRefri, lote));
                    carritoDeCompraRefri.add(medRefri);
                    
                    for(int i = 0; i < carritoDeCompraRefri.size(); i++)
                    {
                        if(carritoDeCompraRefri
                                        .get(i) == medRefri)
                        {
                        mediRefriCompradas +=
                                carritoDeCompraRefri
                                        .get(i)
                                        .comprarMedicamentos();
                        totalFactura += mediRefriCompradas*
                                carritoDeCompraRefri
                                        .get(i)
                                        .getPrecioVentaPublica();
                        }
                    }
                    systemPause();
                    break;
                }
                case 2:
                {
                    System.out.print("Por favor ingrese el número de lote"
                            + " del o\nde los medicamentos que desea agregar"
                            + " a su carrito: ");
                    lote = scn.nextInt();
                    while(existeLoteMedicamento(lote, 
                            false, true) != true)
                    {
                        System.out.print("Error, el lote ingresado no existe "
                                + "para medicamentos de "
                                + "tipo temperatura ambiente\n"
                                + "Por favor ingrese el número de lote"
                            + " del o\nde los medicamentos que desea agregar"
                            + " a sucarrito: ");
                        lote = scn.nextInt();    
                    }
                    auxListaTempAmbiente = buscarTempAmbientePorLote(lote);
                    medTempAmbiente = listaTempAmbiente
                            .get(elegirDelLoteTempAmbiente
                                (auxListaTempAmbiente, lote));
                    carritoDeCompraTempAmbiente.add(medTempAmbiente);
                    systemPause();
                    break;
                }
                case 3:
                {
                    System.out.println("\nSu carrito ahora mismo consta de:\n"
                    + "Medicinas refrigeradas: "+mediRefriCompradas
                    +"\nMedicinas a temperatura ambiente: "
                    +mediTempAmbienteCompradas
                    +"\nTotal de compra: "+totalFactura+"trumps\n");
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
    
    public static void menuCliente()
    {   //Metodo de menu para la interaccion del cliente de la famracia
        //con el programa de gestion de la misma
        
        //Creacion de instacias de ambos tipos de medicamento para su compra
        //por el cliente
        Refrigerado mediRefri = new Refrigerado();
        TempAmbiente mediTempAmbiente = new TempAmbiente();
        
        
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
        int lote = 0;     
            while (endOfAdminMenu) {
                int cont = 0;
                ArrayList<Refrigerado> auxListaRefri = new ArrayList<>();
                ArrayList<TempAmbiente> auxListaTempAmbiente = new ArrayList<>();
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
                            switch(opcion)
                            {
                                case 1: 
                                {                                   
                                    System.out.println("Por favor indique "
                                            + "cual de los siguientes lotes\n"
                                            + "de medicamentos refrigerados"
                                            + " desea revisar");                                    
                                    for(int i = 0; i < lotesRegistradosRefri
                                            .size();
                                            i++)
                                    {
                                        System.out.println(i+". "+
                                                lotesRegistradosRefri
                                                        .get(i));
                                        cont++;
                                    }
                                    System.out.print("Opcion: ");
                                    opcion = validarOpcion(0,cont);
                                    lote = lotesRegistradosRefri
                                            .get(opcion);
                                    for(int i = 0; i < listaRefrigerado.size();
                                            i++)
                                    {
                                        if(listaRefrigerado.get(i)
                                            .getNumeroLoteMedicamento() == lote)
                                            auxListaRefri.add(
                                                    listaRefrigerado
                                                            .get(i));
                                    }
                                    System.out.println("Por favor indique "
                                            + "cual de los siguientes"
                                            + " medicamentos refrigerados\n"
                                            + "del lote indicado "
                                            + "desea consultar");
                                    cont = 0;
                                    for(int i = 0; i < auxListaRefri.size();
                                            i++)
                                    {
                                        System.out.println(i+". "+
                                                auxListaRefri.get(i)
                                                .getNombreMedicamento());
                                        cont++;
                                    }
                                    System.out.print("Opcion: ");
                                    opcion = validarOpcion(0,cont);
                                    for(int i = 0; i < auxListaRefri.size();
                                            i++)
                                    {
                                        if(i == opcion)
                                            auxListaRefri.get(i)
                                            .mostrarInformacion();   
                                    }                                    
                                    break;
                                }
                                case 2: 
                                {
                                    System.out.println("Por favor indique "
                                            + "cual de los siguientes lotes\n"
                                            + "de medicamentos de temperatura "
                                            + "ambiente"
                                            + " desea revisar");                                    
                                    for(int i = 0; i < 
                                            lotesRegistradosTempAmbiente
                                            .size();
                                            i++)
                                    {
                                        System.out.println(i+". "+
                                                lotesRegistradosTempAmbiente
                                                        .get(i));
                                        cont++;
                                    }
                                    System.out.print("Opcion: ");
                                    opcion = validarOpcion(0,cont);
                                    lote = lotesRegistradosTempAmbiente
                                            .get(opcion);
                                    for(int i = 0; i < listaTempAmbiente.size();
                                            i++)
                                    {
                                        if(listaTempAmbiente.get(i)
                                            .getNumeroLoteMedicamento() == lote)
                                            auxListaTempAmbiente.add(
                                                    listaTempAmbiente
                                                            .get(i));
                                    }
                                    System.out.println("Por favor indique "
                                            + "cual de los siguientes"
                                            + " medicamentos de temperatura "
                                            + "ambiente\n"
                                            + "del lote indicado "
                                            + "desea consultar");
                                    cont = 0;
                                    for(int i = 0; i < auxListaTempAmbiente
                                            .size();
                                            i++)
                                    {
                                        System.out.println(i+". "+
                                                auxListaTempAmbiente.get(i)
                                                .getNombreMedicamento());
                                        cont++;
                                    }
                                    System.out.print("Opcion: ");
                                    opcion = validarOpcion(0,cont);                                    
                                    for(int i = 0; i < auxListaTempAmbiente.size();
                                            i++)
                                    {
                                        if(i == opcion)
                                            auxListaTempAmbiente.get(i)
                                            .mostrarInformacion();   
                                    }                                    
                                    break;
                                }
                            }
                            systemPause();
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
                                + "medicamento que desea coloar en oferta: ");
                        int numeroLoteMedicamento = scn.nextInt();
                        scn.nextLine();
                        listaRefrigerado.get(0)
                                .colocarOferta(numeroLoteMedicamento); 
                        systemPause();
                        break;
                    }
                    case 5:
                    {
                        System.out.print("Ingrese el numero de lote del "
                                + "medicamento que desea retirar del mercado: ");
                        int numeroLoteMedicamento = scn.nextInt();
                        scn.nextLine();
                        listaRefrigerado.get(0)
                                .retirarLote(numeroLoteMedicamento);
                        systemPause();
                        break;
                    }                       
                    case 6:
                    {
                        opcion = listaRefrigerado.get(0)
                                .alertaReponerInventario();                        
                        if(opcion == 1)
                            listaRefrigerado.get(0)
                                    .reponerInventario();
                        systemPause();
                        break;
                    }
                    case 7:
                    {
                        listaRefrigerado.get(0)
                                .mostrarCostoYPrecio();
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
