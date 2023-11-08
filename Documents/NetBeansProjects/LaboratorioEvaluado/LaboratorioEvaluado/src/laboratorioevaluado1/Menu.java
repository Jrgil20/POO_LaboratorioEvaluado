package laboratorioevaluado1;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    
    private static ArrayList<Refrigerado> listaRefrigerado = new ArrayList<>();
    private static ArrayList<TempAmbiente> listaTempAmbiente = new ArrayList<>();
    
    public static int validarOpcion(int a, int b)
    {
        Scanner scn = new Scanner(System.in);
        int opcion = scn.nextInt();
        if(opcion < a || opcion > b)
        {
            System.out.println("Error, esa no es una opcion valida, "
                + "por favor intente de nuevo");
            opcion = scn.nextInt();
        }
        return opcion;
    }
    
    public static void systemPause()
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Presione enter para continuar...");
        scn.nextLine();
    }
    
    public static int menuDeDevolucion(Refrigerado mediRefri, 
            TempAmbiente mediTempAmbiente ,int mediCompradas)
    {
        if(mediCompradas == 0)
        {
            System.out.println("¡No has añadido medicinas "
                    + " de este tipo a tu carrito todavía!\n"
                    + "Regresarás al menu de compra");
            systemPause();
        }
        else
        {
            if(mediTempAmbiente == null)
            {
                mediCompradas = mediRefri.devolverCompra(mediCompradas);
            }
            else
            {
                        
            }
        }
        return mediCompradas;
    }
    
    public static void menuDeCompra(Refrigerado mediRefri)
    {
        int opcion = -1;
        int mediRefriCompradas = 0;
        int mediTempAmbienteCompradas = 0;
        double totalFactura = 0;
        while(opcion != 3){
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
            opcion = validarOpcion(1,3);
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
                           /* mediRefriCompradas = menuDeDevolucion(null,
                                    mediTempAmbiente,
                                    mediRefriCompradas);
                            totalFactura = mediRefriCompradas*
                            mediRefri.getPrecioVentaPublica();
                            */
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
    {
        int opcion;        
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
    {
        int opcion;        
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
    
    public static void menuPrincipal()
    {
         // Crear un objetos de la clase Medicamento
        Refrigerado mediRefri = new Refrigerado();
        TempAmbiente mediTempAmbiente = new TempAmbiente();

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        OUTER:
        while (true) {
            int opcion;
            System.out.println("Seleccione una opción:");
            System.out.println("1. Verificar si un medicamento está vencido");
            System.out.println("2. Consultar datos de un medicamento");
            System.out.println("3. Agregar un medicamento");
            System.out.println("4. Colocar oferta de medicamento");
            System.out.println("5. Retirar lote de medicamento");
            System.out.println("6. Verificar el inventario de un medicamento");
            System.out.println("7. Ver costo y precio de un medicamento");
            System.out.println("8. Comprar medicamentos");
            System.out.println("9. Salir");
            System.out.print("Opción: ");
            opcion = validarOpcion(1,9);
            switch (opcion) 
            {
                case 1:
                    {                             
                        mediRefri.determinarVencido(); 
                        break;
                    }
                case 2:
                    {
                        
                        mediRefri.mostrarInformacion();
                        break;
                    }
                case 3:
                    {       
                        System.out.println("\nIndique el tipo de medicamento "
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
                            //mediRefri = menuAgregarMedicamento(new Refrigerado());
                            listaRefrigerado.add(menuAgregarMedicamento
                                    (new Refrigerado()
                                    ));
                        }
                        else
                        {
                            //mediTempAmbiente = menuAgregarMedicamento(new TempAmbiente());
                            listaTempAmbiente.add(
                                    menuAgregarMedicamento(new TempAmbiente()
                                    ));
                        }
                        break;
                    }
                case 4:
                {
                    System.out.print("Ingrese el numero de lote del "
                            + "medicamento que desea coloar en oferta: ");
                    int numeroLoteMedicamento = scanner.nextInt();
                    mediRefri.colocarOferta(numeroLoteMedicamento);                    
                    break;
                }
                case 5:
                {
                    System.out.print("Ingrese el numero de lote del "
                            + "medicamento que desea retirar del mercado: ");
                    int numeroLoteMedicamento = scanner.nextInt();
                    mediRefri.retirarLote(numeroLoteMedicamento);
                    break;
                }                       
                case 6:
                {
                    opcion = mediRefri.alertaReponerInventario();                        
                    if(opcion == 1)
                        mediRefri.reponerInventario();
                    break;
                }
                case 7:
                {
                    mediRefri.mostrarCostoYPrecio();
                    break;
                }
                case 8:
                {
                    menuDeCompra(mediRefri);
                    break;
                }
                case 9:
                {
                    break OUTER;
                }
            }
            systemPause();
        }
    }
}
