package laboratorioevaluado1;

/**
 * Clase TempAmbiente que hereda de la clase Medicamento y que implementa la interfaz Validaciones.
 * Esta clase representa un medicamento que debe ser almacenado a temperatura ambiente y que tiene una serie de restricciones en cuanto a los lugares donde puede ser almacenado.
 * Contiene un ArrayList de lugares donde no se debe almacenar el medicamento.
 * Tiene dos constructores, uno por defecto y otro que se ejecuta cuando se crea un objeto de tipo TempAmbiente.
 * Implementa los métodos de la interfaz Validaciones para validar valores numéricos y fechas.
 * También sobrescribe los métodos de la clase Medicamento para calcular el precio final de venta y leer los datos del medicamento.
 * Finalmente, tiene un método para mostrar la información del medicamento.
 */

// clases importadas
import java.util.Random;
import java.util.ArrayList;

public class TempAmbiente extends Medicamento 
{   // Clase que hereda de la clase Medicamento y que implementa la interfaz

    private ArrayList<String> lugaresNoAlmacenar;
    // Atributo de tipo ArrayList que almacena los lugares donde no se debe almacenar el medicamento

    ///////////////////// CONSTRUCTORES DE LA CLASE /////////////////////////////////

    public TempAmbiente()
    {   // Constructor por defecto
        Random rnd = new Random();
        double ver = rnd.nextDouble();
        while((ver < 0) && (ver > 999))
        {   // Ciclo que se ejecuta mientras el numero aleatorio generado no este entre 0 y 999
            ver = rnd.nextDouble();
        }
        // Asignacion de valores a los atributos de la clase
        nombreMedicamento = "MedTempAmbiente "+ver;
        codigoMedicamento = rnd.nextInt();
        while((codigoMedicamento < 10000000) || (codigoMedicamento > 99999999))
        {   // Ciclo que se ejecuta mientras el numero aleatorio generado no este entre 10000000 y 99999999 
            codigoMedicamento = rnd.nextInt();
        }
        // costo 
        costoMedicamento = 5;
        // Se le aplica un descuento del 25% al precio de venta publica
        precioVentaPublica = costoMedicamento+(20*costoMedicamento/100)
                +((25*costoMedicamento)/100);
        // la fecha de caducidad se establece en 1/2024
        fechaCaducidad = "1/2024";
        // Se establece un numero aleatorio de 100 como unidades existentes
        unidadesExistentes = 100;
        // Se establece un numero 0 como unidades vendidas
        unidadesVendidas = 0;
        // Se establece un numero de 1como vigencia en el mercado
        vigenciaMercado = 1;
        //
        numeroLoteMedicamento = rnd.nextInt();
        while((numeroLoteMedicamento < 10000000) || (numeroLoteMedicamento > 99999999))
        {   // Ciclo que se ejecuta mientras el numero aleatorio generado no este entre 10000000 y 99999999
            numeroLoteMedicamento = rnd.nextInt();
        }
        // Se crea un ArrayList de tipo String donde se guarda los lugares donde no almacenar el medicamento      
        lugaresNoAlmacenar = new ArrayList<>();
        lugaresNoAlmacenar.add("HORNO");
        lugaresNoAlmacenar.add("FREGADERO");
        lugaresNoAlmacenar.add("MICROONDAS");
    }
    
    public TempAmbiente(boolean param)
    {// Constructor que se ejecuta cuando se crea un objeto de tipo TempAmbiente
        nombreMedicamento = "";
        codigoMedicamento = 0;
        costoMedicamento = 0;
        precioVentaPublica = 0;
        fechaCaducidad = "1/9999";
        unidadesExistentes = 0;
        unidadesVendidas = 0;
        vigenciaMercado = 0;
        numeroLoteMedicamento = 0;
        lugaresNoAlmacenar = null;
    }

    ////////////////// METODOS GETTERS Y SETTERS DE LA CLASE ////////////////////////

    public ArrayList<String> getLugaresNoAlmacenar() 
    {// getter del ArrayList de tipo String
        return lugaresNoAlmacenar;
    }

    public void setLugaresNoAlmacenar(ArrayList<String> lugaresNoAlmacenar) 
    {// setter del ArrayList de tipo String
        this.lugaresNoAlmacenar = lugaresNoAlmacenar;
    }

    //////////// sobreescritura de metodos de la interfaz Validaciones/////////////
    
    @Override
    public int validarValorNumerico(String nombreAtributo, int start, int end) 
    {// Metodo que valida si un numero esta dentro de un rango
        String sNum;
        int n;
        System.out.print("\nPor favor ingrese el "+nombreAtributo
                + " del medicamento "+nombreMedicamento+"\n"
                        + "Este valor no puede ser inferior a "+start+
                " ni superior a "+end+": ");
        sNum = scn.nextLine();        
        while(!validarCadenaNumericaYRango(sNum, start, end))
        {
            System.out.print("\nPor favor ingrese el "+nombreAtributo
                + " del medicamento "+nombreMedicamento+"\n"
                        + "Este valor no puede ser inferior a "+start+
                " ni superior a "+end+": ");
            sNum = scn.nextLine();  
        }                
        n = Integer.parseInt(sNum);        
        return n;
    }
    
    public boolean validarRangoNumerico(double start, double end, double n)
    {   // Metodo que valida si un numero esta dentro de un rango
        if((n < start)||(n > end))
            return false;
        else
            return true;
    }
    
    public boolean validarCadenaNumericaYRango(String cad, double start, double end)
    {   // Metodo que valida si una cadena es un numero double y si esta dentro de un rango
        if(!validarCadenaEsDouble(cad))
        {   // si la cadena no es un numero double imprime error
            System.out.print("\nError, el valor ingresado no es un numero "
                    + "entero");
            return false;
        }
        else 
            if(validarCadenaEsDouble(cad) && 
                !(validarRangoNumerico(start,end,Double.parseDouble(cad))))
            {   // si la cadena es un numero double y no esta dentro del rango imprime error
                System.out.print("\nError, el numero ingresado "
                    + "no esta "
                    + "comprendido entre los valores "+start+" y "+end);
                return false;
            }
            else
                return true;
    }    
          
    @Override
    public double validarValorNumerico(String nombreAtributo, double start, double end) 
    {
        String sNum;
        double n;
        System.out.print("\nPor favor ingrese el "+nombreAtributo
                + " del medicamento "+nombreMedicamento+"\n"
                        + "Este valor no puede ser inferior a "+start+
                " ni superior a "+end+": ");        
        sNum = scn.nextLine(); 
        while(!validarCadenaNumericaYRango(sNum, start, end))
        {
            System.out.print("\nPor favor ingrese el "+nombreAtributo
                + " del medicamento "+nombreMedicamento+"\n"
                        + "Este valor no puede ser inferior a "+start+
                " ni superior a "+end+": ");
            sNum = scn.next();  
        }                
        n = Double.parseDouble(sNum);        
        return n;
    }
    
    /////////////sobreescritura de metodos de la clase Medicamento///////////////

    @Override
    protected double calcularPrecioFinal(int porcentajeAdicional)
    {// Metodo que calcula el precio final de un medicamento        
        double precioFinal = costoMedicamento+
                ((porcentajeAdicional*costoMedicamento)/100);
        return precioFinal;
    }      
    
    @Override
    protected void mostrarCostoYPrecio()
    {//Muestra el costo y el precio de venta al publico de un medicamento refrigerado
        System.out.println("El costo del medicamento "
                + "refrigerado "+nombreMedicamento+" es: "+costoMedicamento
                +  "trumps");
        int i = 20;
        while(((precioVentaPublica-((i*costoMedicamento)/100)-
                ((25*costoMedicamento)/100)) != costoMedicamento)&&
                (i <= 100))
        {   //Se calcula el porcentaje adicional de venta al publico del medicamento
            i++;
        }
        System.out.println("\nEl precio de venta publica del medicamento"
                + "\n"+nombreMedicamento+" es: "+precioVentaPublica
        +"trumps");
    }


    public boolean verificarExistenciaLugarNoAlmacenar(String cad)
    {   // Metodo que verifica si un lugar ya existe en el ArrayList de lugares donde no almacenar
        ArrayList<String> aux = lugaresNoAlmacenar;
        return aux.contains(cad);
    }

    @Override
    protected void leerDatos() 
    {// Metodo que lee los datos de un medicamento
        String cad;
        int numInt;
        // Se le pide al usuario que ingrese los datos del medicamento
        nombreMedicamento = solicitarNombreMedicamento();
        codigoMedicamento = validarValorNumerico("codigo",10000000,99999999);
        costoMedicamento = validarValorNumerico("costo", 1.0,3500000.99);
        numInt = validarValorNumerico("porcentaje adicional de venta al publico", 20, 100);
        precioVentaPublica = calcularPrecioFinal(numInt);
        unidadesExistentes = validarValorNumerico("unidades existentes",1, 9999999);
        unidadesVendidas = validarValorNumerico("unidades vendidas",1,unidadesExistentes);
        vigenciaMercado = validarValorNumerico("vigencia en mercado",0,2);
        numeroLoteMedicamento = validarValorNumerico("numero de lote",10000000,99999999);
        fechaCaducidad = solicitarFechaCaducidad();
        for(int i = 0; i < 3; i++)
        {
            System.out.print("Por favor ingrese un lugar donde no se debe\n"
                + "almacenar el medicamento\nRecuerde que dicho nombre no "
                + "debe ser inferior a 5 caracteres\nni tener solo espacios "
                    + "en blanco, tampoco puede ser un lugar ya agregadoo: ");  
            cad = scn.nextLine();
            while((!validarLongitudMaximaCadena(cad, 8)) || cad.isBlank()
                    || verificarExistenciaLugarNoAlmacenar(cad))
            {
                System.out.print("Por favor ingrese un lugar donde no se debe\n"
                + "almacenar el medicamento\nRecuerde que dicho lugar no "
                + "debe exceder a 8 caracteres\nni tener solo espacios "
                    + "en blanco, tampoco puede ser un lugar ya agregadoo: ");
                cad = scn.nextLine();
            }
            lugaresNoAlmacenar.add(cad);
        }

    }    
    
    @Override
    public void mostrarInformacion()
    {
        System.out.println("El medicamento con el codigo "
                +codigoMedicamento+" posee los siguientes datos: ");
        System.out.println("Nombre: "+nombreMedicamento);
        System.out.println("Costo: "+costoMedicamento+"trumps");
        System.out.println("Precio de venta al público: "
                +precioVentaPublica+"trumps");
        System.out.println("Unidades existentes: "
                +unidadesExistentes);
        System.out.println("Unidades vendidas: "
                +unidadesVendidas);
        System.out.println("Numero de lote: "
                +numeroLoteMedicamento);
        System.out.println("Fecha de caducidad: "
                +fechaCaducidad);
        System.out.print("Vigencia en el mercado: ");
        switch (vigenciaMercado) {
            case 0:
                System.out.println("no está vigente");
                break;
            case 1:
                System.out.println("está vigente");
                break;
            default:
                System.out.println("retirado del mercado");
                break;
        }
        System.out.println("Lugares donde no se debe almacenar el "
                + "medicamento");
        int i = 1;
        for (String lugaresNoAlmacenar1 : lugaresNoAlmacenar) {            
            System.out.println(i+".-"+lugaresNoAlmacenar1);
            i++;
        }
    }

    @Override
    protected void modificarDatos(int opcion)
    {
        //Metodo para modificar los datos de un medicamento
        int numInt = 0;
        switch(opcion){   
            case 1:
            {
                //  asignar el nombre del medicamento
                nombreMedicamento = solicitarNombreMedicamento();
                break;
            }
            case 2:
            {
                //  asignar el codigo del medicamento
                codigoMedicamento = validarValorNumerico("codigo",10000000,99999999);
                break;
            }
            case 3:
            {
                //  asignar el costo del medicamento
                costoMedicamento = validarValorNumerico("costo", 1.0,3500000.99);
                break;
            }
            case 4:
            {
                // asignar el precio de venta al publico del medicamento
                numInt = validarValorNumerico("porcentaje adicional de " + "venta al publico", 20, 100);
                break;
            }
            case 5:
            {
                //  calcular el precio de venta al publico
                precioVentaPublica = calcularPrecioFinal(numInt);
                break;
            }
            case 6:
            {
                //  asignar las unidades existentes del medicamento
                unidadesExistentes = validarValorNumerico("unidades existentes", 1, 9999999);
                break;
            }
            case 7:
            {
                //  asignar las unidades vendidas del medicamento
                unidadesVendidas = validarValorNumerico("unidades vendidas",1,unidadesExistentes);
                break;
            }
            case 8:
            {
                //  asignar la vigencia en el mercado del medicamento
                vigenciaMercado = validarValorNumerico("vigencia en mercado",0,2);
                break;
            }
            case 9:
            {
                //  asignar el numero de lote del medicamento
                numeroLoteMedicamento = validarValorNumerico("numero de lote",10000000,99999999);
                break;
            }
            case 10:
            {
                //  asignar la fecha de caducidad del medicamento
                fechaCaducidad = solicitarFechaCaducidad();
                break;
            }
            case 11:
            {
                String cad;
               for(int i = 0; i < 3; i++)
                {
                    System.out.print("Por favor ingrese un lugar donde no se debe\n"
                        + "almacenar el medicamento\nRecuerde que dicho nombre no "
                        + "debe ser inferior a 5 caracteres\nni tener solo espacios "
                        + "en blanco, tampoco puede ser un lugar ya agregadoo: ");  
                    cad = scn.nextLine();
                while((!validarLongitudMaximaCadena(cad, 8)) || cad.isBlank()
                    || verificarExistenciaLugarNoAlmacenar(cad))
                {
                    System.out.print("Por favor ingrese un lugar donde no se debe\n"
                        + "almacenar el medicamento\nRecuerde que dicho lugar no "
                        + "debe exceder a 8 caracteres\nni tener solo espacios "
                        + "en blanco, tampoco puede ser un lugar ya agregadoo: ");
                    cad = scn.nextLine();
                }
                lugaresNoAlmacenar.add(cad);
                }
                break;
            }           
        }
    } 
    
}
