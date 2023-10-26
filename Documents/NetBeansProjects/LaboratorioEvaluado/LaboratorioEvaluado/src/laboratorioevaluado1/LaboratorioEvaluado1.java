package laboratorioevaluado1;
import java.util.Scanner;

public class LaboratorioEvaluado1 {
    public static void main(String[] args) {
         // Crear un objetos de la clase Medicamento
        Medicamento medi = new Medicamento();       

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        OUTER:
        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Verificar si un medicamento está vencido");
            System.out.println("2. Ver datos de un medicamento");
            System.out.println("3. Crear datos de un medicamento");
            System.out.println("4. Colocar oferta de medicamento");
            System.out.println("5. Retirar lote de medicamento");
            System.out.println("6. Verificar el inventario de un medicamento");
            System.out.println("7. Salir");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();
            while(opcion < 1 || opcion > 7)
            {
                System.out.println("Error, esa no es una opcion valida, "
                        + "por favor intente de nuevo");
                opcion = scanner.nextInt();
            }           
            
            switch (opcion) {
                case 1:
                    {                        
                        medi.determinarVencido();                                                 
                        break;
                    }
                case 2:
                    {
                        
                        medi.mostrarInformacion();
                        break;
                    }
                case 3:
                    {
                        System.out.println("Indique como desea crear el "
                                + "medicamento (1-3): ");
                        System.out.println("1. Crear con valores "
                                + "predeterminados");
                        System.out.println("2. Crear con valores "
                                + "preestablecidos (sin inicializar)");
                        System.out.println("3. Crear con valores definidos "
                                + "manualmente");
                        System.out.print("Opción: ");
                        opcion = scanner.nextInt();
                        switch(opcion){
                            case 1:
                                medi = new Medicamento();
                                break;
                            case 2:
                                medi = new Medicamento(0);
                                break;
                            case 3:
                                medi.leerDatos();
                                break;
                            default:
                                System.out.println("Opción inválida.");
                                break;
                        }
                        break;
                    }
                case 4:
                {
                    System.out.print("Ingrese el numero de lote del "
                            + "medicamento que desea coloar en oferta: ");
                    int numeroLoteMedicamento = scanner.nextInt();
                    medi.colocarOferta(numeroLoteMedicamento);
                    break;
                }
                case 5:
                {
                    System.out.print("Ingrese el numero de lote del "
                            + "medicamento que desea retirar del mercado: ");
                    int numeroLoteMedicamento = scanner.nextInt();
                    medi.colocarOferta(numeroLoteMedicamento);
                    break;
                }                       
                case 6:
                {
                    medi.reponerInventario();
                    break;
                }
                case 7:
                {
                    break OUTER;
                }
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }
        scanner.close();
    }
    
}
