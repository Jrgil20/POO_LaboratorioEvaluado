/**
 * Clase que hereda de la clase Medicamento e implementa la interfaz Validaciones.
 * Representa un medicamento que requiere refrigeración para su conservación.
 * Contiene atributos como la temperatura mínima y máxima de conservación, y los días que se puede mantener refrigerado una vez abierto.
 * Además, implementa métodos para validar valores numéricos y fechas, y para calcular el precio de venta al público.
 */
package laboratorioevaluado1;


//Librerias importadas
import java.text.ParseException;
import java.util.Random;
import java.text.SimpleDateFormat;

public class Refrigerado extends Medicamento 
{   //Clase que hereda de la clase Medicamento e implementa la interfaz Validaciones
    private double tempMinima;
    private double tempMaxima;
    private int diasRefrigerado;
    
    public Refrigerado()
    {
        Random rnd = new Random();
        double ver = rnd.nextDouble();
        while((ver < 0) && (ver > 999))
        {
            ver = rnd.nextDouble();
        }
        nombreMedicamento = "MedRefrigerado "+ver;
        codigoMedicamento = rnd.nextInt();
        while((codigoMedicamento < 10000000) || (codigoMedicamento > 99999999))
        {
            codigoMedicamento = rnd.nextInt();
        }
        costoMedicamento = 5;
        precioVentaPublica = costoMedicamento+(20*costoMedicamento/100)
                +((25*costoMedicamento)/100);
        fechaCaducidad = "1/2024";
        unidadesExistentes = 100;
        unidadesVendidas = 0;
        vigenciaMercado = 1;
        numeroLoteMedicamento = rnd.nextInt();
        while((numeroLoteMedicamento < 10000000)    || (numeroLoteMedicamento > 99999999))
        {
            numeroLoteMedicamento = rnd.nextInt();
        }      
        tempMinima = 2;
        tempMaxima = 8;
        diasRefrigerado = 14;
    }
    
    public Refrigerado(boolean param)
    { //Constructor para pruebas
        nombreMedicamento = "";
        codigoMedicamento = 0;
        costoMedicamento = 0;
        precioVentaPublica = 0;
        fechaCaducidad = "1/9999";
        unidadesExistentes = 0;
        unidadesVendidas = 0;
        vigenciaMercado = 0;
        numeroLoteMedicamento = 0;
        tempMinima = 0;
        tempMaxima = 0;
        diasRefrigerado = 0;
    }

    public double getTempMinima() 
    {   //Getter para obtener la temperatura mínima de conservación
        return tempMinima;
    }

    public void setTempMinima(double tempMinima) 
    {   //Setter para establecer la temperatura mínima de conservación
        this.tempMinima = tempMinima;
    }

    public double getTempMaxima() 
    {   //Getter para obtener la temperatura máxima de conservación
        return tempMaxima;
    }

    public int getDiasRefrigerado() 
    {   //Getter para obtener los dias que se puede mantener refrigerado una vez abierto
        return diasRefrigerado;
    }

    public void setDiasRefrigerado(int diasRefrigerado) 
    {   //Setter para establecer los dias que se puede mantener refrigerado una vez abierto
        this.diasRefrigerado = diasRefrigerado;
    }        
    
    //////////// sobreescritura de metodos de la interfaz Validaciones/////////////

    @Override
    public int validarValorNumerico(String nombreAtributo, int start, int end) 
    {   //Valida si un numero entero esta dentro de un rango
        String sNum;
        int n;
        System.out.print("\nPor favor ingrese el "+nombreAtributo
                + " del medicamento refrigerado "+nombreMedicamento+"\n"
                        + "Este valor no puede ser inferior a "+start+
                " ni superior a "+end+": ");
        sNum = scn.nextLine();        
        while(!validarCadenaNumericaYRango(sNum, start, end))
        {   //Si el valor ingresado no es un numero entero o no esta dentro del rango, se pide de nuevo
            System.out.print("\nPor favor ingrese el "+nombreAtributo
                + " del medicamento refrigerado "+nombreMedicamento+"\n"
                        + "Este valor no puede ser inferior a "+start+
                " ni superior a "+end+": ");
            sNum = scn.nextLine();  
        }                
        n = Integer.parseInt(sNum);        
        return n;
    }
    
    public boolean validarRangoNumerico(double start, double end, double n)
    {   //Valida si un numero double esta dentro de un rango
        if((n < start)||(n > end))
            return false;
        else
            return true;
    }
    
    public boolean validarCadenaNumericaYRango(String cad, double start, double end)
    {   //Valida si una cadena es un numero double y si esta dentro de un rango
        if(!validarCadenaEsDouble(cad))
        {   //Si la cadena no es un numero double, se muestra un mensaje de error
            System.out.print("\nError, el valor ingresado no es un numero "
                    + "entero");
            return false;
        }
        else 
            if(validarCadenaEsDouble(cad) && 
                !(validarRangoNumerico(start,end,Double.parseDouble(cad))))
            { //Si la cadena no esta dentro del rango, se muestra un mensaje de error
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
    {   //Valida si un numero double esta dentro de un rango

        String sNum;
        double n;
        System.out.print("\nPor favor ingrese el "+nombreAtributo
                + " del medicamento refrigerado "+nombreMedicamento+"\n"
                        + "Este valor no puede ser inferior a "+start+
                " ni superior a "+end+": ");        
        sNum = scn.nextLine(); 
        while(!validarCadenaNumericaYRango(sNum, start, end))
        {   //Si el valor ingresado no es un numero double o no esta dentro del rango, se pide de nuevo
            System.out.print("\nPor favor ingrese el "+nombreAtributo
                + " del medicamento refrigerado "+nombreMedicamento+"\n"
                        + "Este valor no puede ser inferior a "+start+
                " ni superior a "+end+": ");
            sNum = scn.next();
            scn.nextLine();  
        }                
        n = Double.parseDouble(sNum);        
        return n;
    }
    

    /////////////sobreescritura de metodos de la clase Medicamento///////////////

    @Override
    public boolean validarFecha(String fecha) 
    {   //Valida si una cadena es una fecha con el formato MM/yyyy
        try 
        {   //Si la cadena es una fecha con el formato MM/yyyy, se retorna true
            SimpleDateFormat formatoFecha = new SimpleDateFormat("MM/yyyy");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
            return true;
        } 
        catch (ParseException e) 
        {   //Si la cadena no es una fecha con el formato MM/yyyy, se retorna false
            return false;
        }
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
                + " refrigerado\n"+nombreMedicamento+" es: "+precioVentaPublica
        +"trumps\nEsto se debe a que al medicamento se le aplica un "+i+"% "
                + "adicional para su venta publica\ny que, al ser un "
                + "medicamento refrigerado, se le aplica otro 25% adicional\n"
                + "al costo");
    }

    @Override
    protected double calcularPrecioFinal(int porcentajeAdicional)
    {   //Calcula el precio de venta al publico de un medicamento refrigerado        
        System.out.println("Al ser un medicamento refrigerado su precio "
                + "de venta al publico se le incrementa un 25%\n"
                + "aunado al porcentaje de venta adicional estipulado "
                + "de su costo");
        //Se incrementa el precio de venta al publico
        double precioFinal = costoMedicamento+
                ((porcentajeAdicional*costoMedicamento)/100)+
                ((25*costoMedicamento)/100);
        return precioFinal;
    }        

    @Override
    protected void leerDatos() 
    {   //Lee los datos de un medicamento refrigerado
        String cad;
        int numInt;
        System.out.print("Por favor ingrese el nombre del medicamento "
                + "refrigerado\n"
                + "Recuerde que el nombre no puede exceder de los "
                + "8 caacteres: "); 
        //  limpiar el buffer 
        cad = scn.nextLine();
        while(!validarLongitudMaximaCadena(cad, 8))
        {   //Si el nombre excede los 8 caracteres, se pide de nuevo
            cad = scn.nextLine();
        }
        //  asignar el nombre del medicamento
        nombreMedicamento = cad;
        //  asignar el codigo del medicamento
        codigoMedicamento = validarValorNumerico("codigo",10000000,99999999);
        //  asignar el costo del medicamento
        costoMedicamento = validarValorNumerico("costo", 1.0,3500000.99);
        // asignar el precio de venta al publico del medicamento
        numInt = validarValorNumerico("porcentaje adicional de " + "venta al publico", 20, 100);
        //  calcular el precio de venta al publico
        precioVentaPublica = calcularPrecioFinal(numInt);
        //  asignar las unidades existentes del medicamento
        unidadesExistentes = validarValorNumerico("unidades existentes", 1, 9999999);
        //  asignar las unidades vendidas del medicamento
        unidadesVendidas = validarValorNumerico("unidades vendidas",1,unidadesExistentes);
        //  asignar la vigencia en el mercado del medicamento
        vigenciaMercado = validarValorNumerico("vigencia en mercado",0,2);
        //  asignar el numero de lote del medicamento
        numeroLoteMedicamento = validarValorNumerico("numero de lote",10000000,99999999);
        //  asignar la fecha de caducidad del medicamento
        System.out.print("\nIngrese la fecha de caducidad del medicamento "
                +"refrigerado\ncon formato (mes/año): ");
        cad = scn.nextLine();
        while (!validarFecha(cad)) 
        {   //Si la fecha no tiene el formato correcto, se pide de nuevo
            System.out.print("\nERROR, la fecha ingresada no tiene el formato "
                    + "correcto (mes/año). Por favor, ingrese la fecha "
                    + "nuevamente: ");
            cad= scn.nextLine();
        }
        fechaCaducidad = cad;
        //  asignar la temperatura minima de conservacion del medicamento
        tempMinima = validarValorNumerico("temperatura mínima",0.0,2.0);
        //  asignar la temperatura maxima de conservacion del medicamento
        tempMaxima = validarValorNumerico("temperatura máxima",tempMinima+2.1,8.0);
        //  asignar los dias que se puede mantener refrigerado una vez abierto
        diasRefrigerado = validarValorNumerico("numero de dias que se "
                + "puede mantener refrigerado una "
                + "vez abierto",1,28);
    }    
    
    @Override
    public void mostrarInformacion()
    {   //Muestra la informacion de un medicamento refrigerado
        System.out.println("El medicamento refrigerado con el codigo "
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
        switch (vigenciaMercado) 
        {//Se muestra el estado de la vigencia en el mercado
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
        System.out.println("Temperatura mínima de conservación: "+tempMinima);
        System.out.println("Temperatura máxima de conservación: "+tempMaxima);
        System.out.println("Dias que se puede mantener refrigerado\n"
                + "el medicamento una vez abierto: "+diasRefrigerado);

    }    
      
}
