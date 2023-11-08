package laboratorioevaluado1;
//Librerias importadas
import java.text.ParseException;
import java.util.Scanner;
import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Refrigerado extends Medicamento implements Validaciones
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

    public void setTempMaxima(double tempMaxima) 
    {   //Setter para establecer la temperatura máxima de conservación
        this.tempMaxima = tempMaxima;
    }

    public String getNombreMedicamento() 
    {   //Getter para obtener el nombre del medicamento refrigerado
        return nombreMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) 
    {   //Setter para establecer el nombre del medicamento refrigerado
        this.nombreMedicamento = nombreMedicamento;
    }

    public int getCodigoMedicamento() 
    {   //Getter para obtener el código del medicamento refrigerado
        return codigoMedicamento;
    }

    public void setCodigoMedicamento(int codigoMedicamento) 
    {   //Setter para establecer el código del medicamento refrigerado
        this.codigoMedicamento = codigoMedicamento;
    }

    public double getCostoMedicamento() 
    {   //Getter para obtener el costo del medicamento refrigerado
        return costoMedicamento;
    }

    public void setCostoMedicamento(double costoMedicamento) 
    {   //Setter para establecer el costo del medicamento refrigerado
        this.costoMedicamento = costoMedicamento;
    }

    public double getPrecioVentaPublica() 
    {   //Getter para obtener el precio de venta al público del medicamento refrigerado
        return precioVentaPublica;
    }

    public void setPrecioVentaPublica(double precioVentaPublica) 
    {   //Setter para establecer el precio de venta al público del medicamento refrigerado
        this.precioVentaPublica = precioVentaPublica;
    }

    public int getUnidadesVendidas() 
    {   //Getter para obtener las unidades vendidas del medicamento refrigerado
        return unidadesVendidas;
    }

    public void setUnidadesVendidas(int unidadesVendidas) 
    {   //Setter para establecer las unidades vendidas del medicamento refrigerado
        this.unidadesVendidas = unidadesVendidas;
    }

    public int getUnidadesExistentes() 
    {   //Getter para obtener las unidades existentes del medicamento refrigerado
        return unidadesExistentes;
    }

    public void setUnidadesExistentes(int unidadesExistentes) 
    {   //Setter para establecer las unidades existentes del medicamento refrigerado
        this.unidadesExistentes = unidadesExistentes;
    }

    public String getFechaCaducidad() 
    {   //Getter para obtener la fecha de caducidad del medicamento refrigerado
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) 
    {   //Setter para establecer la fecha de caducidad del medicamento refrigerado
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getVigenciaMercado() 
    {   //Getter para obtener la vigencia en el mercado del medicamento refrigerado
        return vigenciaMercado;
    }

    public void setVigenciaMercado(int vigenciaMercado) 
    {   //Setter para establecer la vigencia en el mercado del medicamento refrigerado
        this.vigenciaMercado = vigenciaMercado;
    }

    public int getNumeroLoteMedicamento() 
    {   //Getter para obtener el numero de lote del medicamento refrigerado
        return numeroLoteMedicamento;
    }

    public void setNumeroLoteMedicamento(int numeroLoteMedicamento) 
    {   //Setter para establecer el numero de lote del medicamento refrigerado
        this.numeroLoteMedicamento = numeroLoteMedicamento;
    }

    public int getDiasRefrigerado() 
    {   //Getter para obtener los dias que se puede mantener refrigerado una vez abierto
        return diasRefrigerado;
    }

    public void setDiasRefrigerado(int diasRefrigerado) 
    {   //Setter para establecer los dias que se puede mantener refrigerado una vez abierto
        this.diasRefrigerado = diasRefrigerado;
    }        
    
    // sobreescritura de metodos de la interfaz Validaciones
    @Override
    public boolean validarCadenaEsEntero(String cad)
    {   //Valida si una cadena es un numero entero
        int n;
        //try-catch para evitar que el programa se caiga si se ingresa un valor
        try 
        {
            //Si el valor ingresado es un numero entero, se parsea a entero
            n = Integer.parseInt(cad);
            return true;
        } 
        catch (NumberFormatException ex) 
        {   //Si el valor ingresado no es un numero entero, se muestra un mensaje de error
            System.out.print("\nERROR, el valor ingresado no es un numero");
            return false;
        }
    }
    
    @Override
    public boolean validarCadenaEsDouble(String cad)
    {   //Valida si una cadena es un numero double
        double n;
        //try-catch para evitar que el programa se caiga si se ingresa un valor
        try 
        {  //Si el valor ingresado es un numero double, se parsea a double
           n = Double.parseDouble(cad);
           return true;
        } 
        catch (NumberFormatException ex) 
        {   //Si el valor ingresado no es un numero double, se muestra un mensaje de error
            System.out.print("\nERROR, el valor ingresado no es un numero");
            return false;
        }
    }
    
    @Override
    public boolean validarLongitudMaximaCadena(String cad, int nLen)
    {   //Valida si una cadena no excede de un numero de caracteres     
        if(cad.length() > nLen)
        {   //Si la cadena excede el numero de caracteres, se muestra un mensaje de error     
            System.out.print("Error, el dato ingresado no puede exceder de "
                    + "los "+nLen+" caracteres, intente de nuevo: ");
            return false;    
        }
        else
            //Si la cadena no excede el numero de caracteres, se retorna true
            return true;
    }
    
    @Override
    public boolean validarRangoNumerico(int start, int end, int n)
    {   //Valida si un numero entero esta dentro de un rango
        if((n < start)||(n > end))
            return false;
        else
            return true;
    }
    
    @Override
    public boolean validarCadenaNumericaYRango(String cad, int start, int end)
    {   //Valida si una cadena es un numero entero y si esta dentro de un rango
        if(!validarCadenaEsEntero(cad))
        {   //Si la cadena no es un numero entero, se muestra un mensaje de error
            System.out.print("\nError, el valor ingresado no es un numero " + "entero");
            return false;
        }
        else //Si la cadena es un numero entero, se valida si esta dentro del rango
            if(validarCadenaEsEntero(cad) && !(validarRangoNumerico(start,end,Integer.parseInt(cad))))
            {   //Si la cadena no esta dentro del rango, se muestra un mensaje de error
                System.out.print("\nError, el numero entero ingresado no esta "
                    + "comprendido entre los valores "+start+" y "+end);
                return false;
            }
            else //Si la cadena esta dentro del rango, se retorna true
                return true;
    }    
    
    @Override
    public int validarValorNumerico(String nombreAtributo, int start, int end) 
    {   //Valida si un numero entero esta dentro de un rango
        Scanner scn = new Scanner(System.in);
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
        // este metodo se deberia cerrar? scn.close();
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
        Scanner scn = new Scanner(System.in);
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
        }                
        n = Double.parseDouble(sNum);        
        //scn.close();
        return n;
    }
    
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
    public void determinarVencido() 
    {   //Determina si un medicamento refrigerado esta vencido
        try 
        {   //Se parsea la fecha de caducidad a un objeto de tipo Date
            SimpleDateFormat formatoFecha = new SimpleDateFormat("MM/yyyy");
            Date fechaActual = new Date();
            Date fechaCaducidadMedicamento=formatoFecha.parse(this.fechaCaducidad);
            //Si la fecha actual es posterior a la fecha de caducidad, el medicamento esta vencido
            if (fechaActual.after(fechaCaducidadMedicamento)) 
            {   //Se muestra un mensaje indicando que el medicamento esta vencido
                System.out.println("El medicamento refrigerado " 
                        + this.nombreMedicamento + " con código " 
                        + this.codigoMedicamento + " está vencido. Venció en: " 
                        + this.fechaCaducidad);
            }
            else
            {   //Si la fecha actual es anterior a la fecha de caducidad, el medicamento no esta vencido
                
                // Calcula la diferencia en milisegundos y la convierte a meses
                long diff = fechaCaducidadMedicamento.getTime() - fechaActual.getTime();
                long diffMonths = diff / (30 * 24 * 60 * 60 * 1000);
                // un diferencia de 3 meses o menos
                if(diffMonths <= 3)
                {   //Se muestra un mensaje indicando que el medicamento esta proximo a vencer
                    System.out.println("El medicamento refrigerado " 
                            + this.nombreMedicamento 
                            + " con código " + this.codigoMedicamento +
                    " se vencerá en menos de 3 meses. Se le aplica un descuento del 30%.");
                    this.setPrecioVentaPublica(this.getPrecioVentaPublica()-
                            ((this.getPrecioVentaPublica()*30)/100));
                }
                else
                {   //Se muestra un mensaje indicando que el medicamento no esta vencido
                    System.out.println("El medicamento refrigerado " 
                            + this.nombreMedicamento + " con código " 
                            + this.codigoMedicamento + " no está vencido.");
                }

            }
        } catch (Exception e) 
          { //Si ocurre un error al parsear la fecha, se muestra un mensaje de error
            System.out.println("Error al parsear la fecha: " + e.getMessage());
          }
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
        Scanner scn = new Scanner(System.in);
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
        //scn.close();
    }    
    
    @Override
    protected void colocarOferta(int numeroLoteMedicamento)
    {   //Coloca una oferta de un medicamento refrigerado en el mercado
        if(numeroLoteMedicamento == this.getNumeroLoteMedicamento())
        {   //Si el numero de lote ingresado es igual al numero de lote del medicamento, se coloca la oferta         
            this.setVigenciaMercado(1);
            System.out.println("Se ha colocado la oferta del "
                    + "medicamento refrigerado "
                    +this.getNombreMedicamento().toUpperCase()
                            + " en el mercado");
        }
        else
        {   //Si el numero de lote ingresado no es igual al numero de lote del medicamento, se muestra un mensaje de error
            System.out.println("Error, el numero de lote "
                    +numeroLoteMedicamento+" no es valido");
        }
        //scn.close();
    }
    
    @Override
    protected void retirarLote(int numeroLoteMedicamento)
    {   //Retira un medicamento refrigerado del mercado
        if(numeroLoteMedicamento == this.getNumeroLoteMedicamento())
        {   //Si el numero de lote ingresado es igual al numero de lote del medicamento, se retira el medicamento del mercado         
            this.setVigenciaMercado(2);
            System.out.println("Se ha retirado el medicamento refrigerado "
                    +this.getNombreMedicamento().toUpperCase()+
                    " del mercado");
        }
        else
        {   //Si el numero de lote ingresado no es igual al numero de lote del medicamento, se muestra un mensaje de error
            System.out.println("Error, el numero de lote "
                    +numeroLoteMedicamento+" no es valido");
        }
    }
    
    @Override
    protected int alertaReponerInventario()
    {   //Alerta si el inventario de un medicamento refrigerado esta por debajo de 5 unidades
        Scanner scn = new Scanner(System.in);
        String sNum;
        if(this.getUnidadesExistentes() < 5)
        {   //Si el inventario esta por debajo de 5 unidades, se muestra un mensaje de alerta
            System.out.println("ALERTA: restan menos de 5 unidades existentes "
                    + "del medicamento refrigerado "
                    +this.getNombreMedicamento().toUpperCase());
        }
        else
        {   //Si el inventario no esta por debajo de 5 unidades, se muestra un mensaje indicando que no es necesario reponer el inventario
            System.out.println("No es necesario reponer el inventario\npara "
                    + "el medicamento refrigerado "
                    +this.getNombreMedicamento().toUpperCase());
        }
        System.out.print("Elija como proceder:"
                            + "\n1.Reponer el inventario del medicamento"
                            + " refrigerado seleccionado"
                            + "\n2.Regresar al menú principal"
                            + "\nSu respuesta: ");
        // se solicita la opcion a realizar para reponer el inventario (JRG: que opcion?)
        sNum = scn.nextLine();
        while(!validarCadenaNumericaYRango(sNum, 1, 2))
        {   //Si el valor ingresado no es un numero entero o no esta dentro del rango, se pide de nuevo
            System.out.print("Elija como proceder:"
                            + "\n1.Reponer el inventario del medicamento"
                            + "seleccionado"
                            + "\n2.Regresar al menú principal"
                            + "\nSu respuesta: ");
        }            
        int op = Integer.parseInt(sNum);
        //se retorna la opcion elegida
        return op;
    }
    
    @Override
    protected void reponerInventario()
    {   //Repone el inventario de un medicamento refrigerado     
        System.out.println("Se procederá a reponer las unidades existentes"
                + " del medicamento refrigerado "+nombreMedicamento);
        int unidadesAReponer = unidadesExistentes + 
                validarValorNumerico("unidades a reponer",
                1, 9999999);
        // validar que el total de unidades no exceda de 9999999
        while(unidadesExistentes+unidadesAReponer > 9999999){
            System.out.println("ERROR, la suma de unidades a reponer "
                    + " con las\nunidades existentes ("+unidadesExistentes+")"
                            + "no puede exceder\nde 9999999");
            unidadesAReponer = unidadesExistentes + 
                validarValorNumerico("unidades a reponer",
                1, 9999999);
        }
        //se muestra el total de unidades 
        unidadesExistentes = unidadesAReponer;
        System.out.println("Ahora hay un total de: "
                + unidadesExistentes+" unidades existentes");
    }
    
    @Override
    protected void mostrarCostoYPrecio()
    {   //Muestra el costo y el precio de venta al publico de un medicamento refrigerado
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
    protected int comprarMedicamentos()
    {   //Permite comprar un medicamento refrigerado
        Scanner scn = new Scanner(System.in);
        String cad = "";
        int nComprar = 0;
        while(!"SI".equals(cad))
        {   //Se valida si se desea comprar el medicamento
            nComprar = validarValorNumerico("numero de medicamentos "
                    + "a comprar",1, unidadesExistentes);
            double totalCompra = nComprar*precioVentaPublica;
            System.out.print("Se añadiran "+nComprar+" unidades del\n"
                    + "medicamento refrigerado "+nombreMedicamento+" a su factura\n"
                            + "¿Está seguro de su compra? (SI/NO): ");
            cad = scn.nextLine().toUpperCase();
            while(!validarLongitudMaximaCadena(cad, 2) && 
                    ((!"SI".equals(cad)) || (!"NO".equals(cad))))
            {
                System.out.print("Se añadiran "+nComprar+" unidades del\n"
                    + "medicamento refrigerado "+nombreMedicamento+" a su factura\n"
                            + "¿Está seguro de su compra? (SI/NO): ");
                cad = scn.nextLine().toUpperCase();
            }
        }
        this.setUnidadesExistentes(unidadesExistentes-nComprar);
        this.setUnidadesVendidas(unidadesVendidas+nComprar);
        return nComprar;
    }
    
    @Override
    protected double calcularTotalCompra(int nComprar) 
    {   //Calcula el total de la compra de medicamentos refrigerados
        return nComprar*precioVentaPublica;
    }
    
    @Override
    protected int devolverCompra(int nComprar)
    {   //Permite devolver la compra de un medicamento refrigerado
        nComprar = validarValorNumerico("numero de unidades "
                + "a devolver",1,nComprar);
        this.setUnidadesExistentes(unidadesExistentes+nComprar);
        this.setUnidadesVendidas(unidadesVendidas-nComprar);
        return nComprar;
    }
        
}
