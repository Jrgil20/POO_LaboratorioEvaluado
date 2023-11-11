package laboratorioevaluado1;
// Clases importadas
import java.util.ArrayList;
import java.util.Scanner;

public class Menu 
{// Clase Menu
    private static ArrayList<Refrigerado> listaRefrigerado = new ArrayList<>();
    private static ArrayList<TempAmbiente> listaTempAmbiente = new ArrayList<>();
    
    // Crear una única instancia de Scanner como variable estática
    public static Scanner scn = new Scanner(System.in);
    
    //Crear una variable opcion para todo el menu
    public static int opcion;    

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
                mediCompradas = mediTempAmbiente.devolverCompra(mediCompradas);
            }
        }
        return mediCompradas;
    }
    
    public static void menuDeCompra(Refrigerado mediRefri)
    {   // Metodo que permite comprar medicamentos
        opcion = -1;
        int mediRefriCompradas = 0;
        int mediTempAmbienteCompradas = 0;
        double totalFactura = 0;
        while(opcion != 4)
        {   // Mientras el usuario no seleccione la opcion de finalizar compra
            System.out.println("\nSu carrito ahora mismo consta de:\n"
                    + "Medicinas refrigeradas: "+mediRefriCompradas
                    +"\nMedicinas a temperatura ambiente: "
                    +mediTempAmbienteCompradas
                    +"\nTotal de compra: "+totalFactura+"trumps");
            System.out.println("\nSeleccione una opción:"
                    + "\n1. Comprar medicamentos termolábiles/refrigerados"
                    + "\n2. Comprar medicamentos de temperatura ambiente"
                    + "\n3. Devolver medicamentos añadidos al carrito"
                    + "\n4. Finalizar compra");
            System.out.print("Opción: ");
            opcion = validarOpcion(1,4);
            switch(opcion)
            {
                case 1:
                {
                    mediRefriCompradas += mediRefri.comprarMedicamentos();
                    totalFactura = mediRefriCompradas*
                            mediRefri.getPrecioVentaPublica();
                    systemPause();
                    break;
                }
                case 2:
                {
                    System.out.println("Esta opción no está disponible.");
                    systemPause();
                    break;
                }
                case 3:
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
                            mediRefriCompradas = menuDeDevolucion(mediRefri,
                                    null,
                                    mediRefriCompradas);
                            totalFactura = mediRefriCompradas*
                                    mediRefri.getPrecioVentaPublica();
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
                case 4:
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
                    menuDeCompra(mediRefri);
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
         // Crear objetos de la clase Medicamento
        Refrigerado mediRefri = new Refrigerado();
        TempAmbiente mediTempAmbiente = new TempAmbiente();
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
                            mediRefri.determinarVencido(); 
                            systemPause();
                            break;
                        }
                    case 2:
                        {
                            
                            mediRefri.mostrarInformacion();
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
                        mediRefri.colocarOferta(numeroLoteMedicamento); 
                        systemPause();
                        break;
                    }
                    case 5:
                    {
                        System.out.print("Ingrese el numero de lote del "
                                + "medicamento que desea retirar del mercado: ");
                        int numeroLoteMedicamento = scn.nextInt();
                        scn.nextLine();
                        mediRefri.retirarLote(numeroLoteMedicamento);
                        systemPause();
                        break;
                    }                       
                    case 6:
                    {
                        opcion = mediRefri.alertaReponerInventario();                        
                        if(opcion == 1)
                            mediRefri.reponerInventario();
                        systemPause();
                        break;
                    }
                    case 7:
                    {
                        mediRefri.mostrarCostoYPrecio();
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
