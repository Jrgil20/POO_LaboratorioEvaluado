package laboratorioevaluado1;
// clases importadas
import java.text.ParseException;
import java.util.Scanner;
import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class TempAmbiente extends Medicamento implements Validaciones
{   // Clase que hereda de la clase Medicamento y que implementa la interfaz

    private ArrayList<String> lugaresNoAlmacenar;
    // Atributo de tipo ArrayList que almacena los lugares donde no se debe almacenar el medicamento

    //constructores de la clase

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

    // getters y setters de la clase

    public ArrayList<String> getLugaresNoAlmacenar() 
    {// getter del ArrayList de tipo String
        return lugaresNoAlmacenar;
    }

    public void setLugaresNoAlmacenar(ArrayList<String> lugaresNoAlmacenar) 
    {// setter del ArrayList de tipo String
        this.lugaresNoAlmacenar = lugaresNoAlmacenar;
    }

    public String getNombreMedicamento() 
    {  // getter del nombre del medicamento
        return nombreMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) 
    {   // setter del nombre del medicamento
        this.nombreMedicamento = nombreMedicamento;
    }

    public int getCodigoMedicamento() 
    {   //getter del codigo del medicamento
        return codigoMedicamento;
    }

    public void setCodigoMedicamento(int codigoMedicamento) 
    {   // setter del codigo del medicamento
        this.codigoMedicamento = codigoMedicamento;
    }

    public double getCostoMedicamento() 
    {   // getter del costo del medicamento
        return costoMedicamento;
    }

    public void setCostoMedicamento(double costoMedicamento)
    {   // setter del costo del medicamento
        this.costoMedicamento = costoMedicamento;
    }

    public double getPrecioVentaPublica() 
    {   // getter del precio de venta publica del medicamento
        return precioVentaPublica;
    }

    public void setPrecioVentaPublica(double precioVentaPublica) 
    {   // setter del precio de venta publica del medicamento
        this.precioVentaPublica = precioVentaPublica;
    }

    public int getUnidadesVendidas() 
    {   // getter de las unidades vendidas del medicamento
        return unidadesVendidas;
    }

    public void setUnidadesVendidas(int unidadesVendidas) 
    {   // setter de las unidades vendidas del medicamento
        this.unidadesVendidas = unidadesVendidas;
    }

    public int getUnidadesExistentes() 
    {   // getter de las unidades existentes del medicamento
        return unidadesExistentes;
    }

    public void setUnidadesExistentes(int unidadesExistentes) 
    {   // setter de las unidades existentes del medicamento
        this.unidadesExistentes = unidadesExistentes;
    }

    public String getFechaCaducidad()
    {   // getter de la fecha de caducidad del medicamento
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) 
    {   // setter de la fecha de caducidad del medicamento
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getVigenciaMercado() 
    {   // getter de la vigencia en el mercado del medicamento
        return vigenciaMercado;
    }

    public void setVigenciaMercado(int vigenciaMercado) 
    {   // setter de la vigencia en el mercado del medicamento    
        this.vigenciaMercado = vigenciaMercado;
    }

    public int getNumeroLoteMedicamento() 
    {   // getter del numero de lote del medicamento
        return numeroLoteMedicamento;
    }

    public void setNumeroLoteMedicamento(int numeroLoteMedicamento) 
    {   // setter del numero de lote del medicamento
        this.numeroLoteMedicamento = numeroLoteMedicamento;
    }        

    //Sobreescritura de metodos de la clase padre

    
    @Override
    public int validarValorNumerico(String nombreAtributo, int start, int end) 
    {// Metodo que valida si un numero esta dentro de un rango
        
        Scanner scn = new Scanner(System.in);
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
        //scn.close();
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
        Scanner scn = new Scanner(System.in);
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
        //scn.close();
        return n;
    }
    
    @Override
    public boolean validarFecha(String fecha) 
    {   // Metodo que valida si una cadena es una fecha con el formato MM/yyyy
        try 
        {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("MM/yyyy");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
            return true;
        } 
        catch (ParseException e) 
        {
            return false;
        }
    }

    @Override
    public void determinarVencido() 
    {   // Metodo que determina si un medicamento esta vencido
        try 
       {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("MM/yyyy");
            Date fechaActual = new Date();
            Date fechaCaducidadMedicamento=formatoFecha.parse(this.fechaCaducidad);

            if (fechaActual.after(fechaCaducidadMedicamento)) 
            {
                System.out.println("El medicamento " 
                        + this.nombreMedicamento + " con código " 
                        + this.codigoMedicamento + " está vencido. Venció en: " 
                        + this.fechaCaducidad);
            }
            else
            {
                // Calcula la diferencia en milisegundos y la convierte a meses
                long diff = fechaCaducidadMedicamento.getTime() - fechaActual.getTime();
                long diffMonths = diff / (30 * 24 * 60 * 60 * 1000);
                // un diferencia de 3 meses o menos
                if(diffMonths <= 3)
                {
                    System.out.println("El medicamento " 
                            + this.nombreMedicamento 
                            + " con código " + this.codigoMedicamento +
                    " se vencerá en menos de 3 meses. Se le aplica un descuento del 30%.");
                    this.setPrecioVentaPublica(this.getPrecioVentaPublica()-
                            ((this.getPrecioVentaPublica()*30)/100));
                }
                else
                {
                    System.out.println("El medicamento " 
                            + this.nombreMedicamento + " con código " 
                            + this.codigoMedicamento + " no está vencido.");
                }

            }
        } catch (Exception e) 
          {
            System.out.println("Error al parsear la fecha: " + e.getMessage());
          }
    }
    
    @Override
    protected double calcularPrecioFinal(int porcentajeAdicional)
    {// Metodo que calcula el precio final de un medicamento        
        double precioFinal = costoMedicamento+
                ((porcentajeAdicional*costoMedicamento)/100);
        return precioFinal;
    }      
    
    public boolean verificarExistenciaLugarNoAlmacenar(String cad)
    {   // Metodo que verifica si un lugar ya existe en el ArrayList de lugares donde no almacenar
        ArrayList<String> aux = lugaresNoAlmacenar;
        return aux.contains(cad);
    }

    @Override
    protected void leerDatos() 
    {// Metodo que lee los datos de un medicamento
        Scanner scn = new Scanner(System.in);
        String cad;
        int numInt;
        System.out.print("Por favor ingrese el nombre del medicamento\n"
                + "Recuerde que dicho nombre no "
                + "debe exceder a 8 caracteres\nni tener solo espacios "
                    + "en blanco: ");  
        cad = scn.nextLine();
        while(!validarLongitudMaximaCadena(cad, 8) || cad.isBlank())
        {
            cad = scn.nextLine();
        }
        nombreMedicamento = cad;
        codigoMedicamento = validarValorNumerico("codigo",
                10000000,99999999);
        costoMedicamento = validarValorNumerico("costo", 1.0,
                3500000.99);
        numInt = validarValorNumerico("porcentaje adicional de "
                + "venta al publico", 20, 100);
        precioVentaPublica = calcularPrecioFinal(numInt);
        unidadesExistentes = validarValorNumerico("unidades existentes",
                1, 9999999);
        unidadesVendidas = validarValorNumerico("unidades vendidas",1,
                unidadesExistentes);
        vigenciaMercado = validarValorNumerico("vigencia en mercado",
                0,2);
        numeroLoteMedicamento = validarValorNumerico("numero de lote",
                10000000,99999999);
        System.out.print("\nIngrese la fecha de caducidad del medicamento "
                +"\ncon formato (mes/año): ");
        cad = scn.nextLine();
        while (!validarFecha(cad)) 
        {
            System.out.print("\nERROR, la fecha ingresada no tiene el formato "
                    + "correcto (mes/año). Por favor, ingrese la fecha "
                    + "nuevamente: ");
            cad= scn.nextLine();
        }
        fechaCaducidad = cad;
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
    protected void colocarOferta(int numeroLoteMedicamento)
    {
        if(numeroLoteMedicamento == this.getNumeroLoteMedicamento())
        {            
            this.setVigenciaMercado(1);
            System.out.println("Se ha colocado la oferta del "
                    + "medicamento "
                    +this.getNombreMedicamento().toUpperCase()
                            + " en el mercado");
        }
        else
        {
            System.out.println("Error, el numero de lote "
                    +numeroLoteMedicamento+" no es valido");
        }
        //scn.close();
    }
    
    @Override
    protected void retirarLote(int numeroLoteMedicamento)
    {
        if(numeroLoteMedicamento == this.getNumeroLoteMedicamento())
        {            
            this.setVigenciaMercado(2);
            System.out.println("Se ha retirado el medicamento "
                    +this.getNombreMedicamento().toUpperCase()+
                    " del mercado");
        }
        else
        {
            System.out.println("Error, el numero de lote "
                    +numeroLoteMedicamento+" no es valido");
        }
    }
    
    @Override
    protected int alertaReponerInventario()
    {
        Scanner scn = new Scanner(System.in);
        String sNum;
        if(this.getUnidadesExistentes() < 5)
        {
            System.out.println("ALERTA: restan menos de 5 unidades existentes "
                    + "del medicamento "
                    +this.getNombreMedicamento().toUpperCase());
        }
        else
        {
            System.out.println("No es necesario reponer el inventario\npara "
                    + "el medicamento "
                    +this.getNombreMedicamento().toUpperCase());
        }
        System.out.print("Elija como proceder:"
                            + "\n1.Reponer el inventario del medicamento"
                            + " seleccionado"
                            + "\n2.Regresar al menú principal"
                            + "\nSu respuesta: ");
        sNum = scn.nextLine();
        while(!validarCadenaNumericaYRango(sNum, 1, 2))
        {
            System.out.print("Elija como proceder:"
                            + "\n1.Reponer el inventario del medicamento"
                            + "seleccionado"
                            + "\n2.Regresar al menú principal"
                            + "\nSu respuesta: ");
        }            
        int op = Integer.parseInt(sNum);
        return op;
    }
    
    @Override
    protected void reponerInventario()
    {        
        System.out.println("Se procederá a reponer las unidades existentes"
                + " del medicamento "+nombreMedicamento);
        int unidadesAReponer = unidadesExistentes + 
                validarValorNumerico("unidades a reponer",
                1, 9999999);
        while(unidadesExistentes+unidadesAReponer > 9999999){
            System.out.println("ERROR, la suma de unidades a reponer "
                    + " con las\nunidades existentes ("+unidadesExistentes+")"
                            + "no puede exceder\nde 9999999");
            unidadesAReponer = unidadesExistentes + 
                validarValorNumerico("unidades a reponer",
                1, 9999999);
        }
        unidadesExistentes = unidadesAReponer;
        System.out.println("Ahora hay un total de: "
                + unidadesExistentes+" unidades existentes");
    }
    
    @Override
    protected void mostrarCostoYPrecio()
    {
        System.out.println("El costo del medicamento "
                +nombreMedicamento+" es: "+costoMedicamento
                +  "trumps");
        int i = 20;
        while(((precioVentaPublica-((i*costoMedicamento)/100)) 
                != costoMedicamento)&&
                (i <= 100))
        {
            i++;
        }
        System.out.println("\nEl precio de venta publica del medicamento"
                + "\n"+nombreMedicamento+" es: "+precioVentaPublica
        +"trumps\nEsto se debe a que al medicamento se le aplica un "+i+"% "
                + "adicional para su venta publica");
    }      
    
    @Override
    protected int comprarMedicamentos()
    {
        Scanner scn = new Scanner(System.in);
        String cad = "";
        int nComprar = 0;
        while(!"SI".equals(cad))
        {
            nComprar = validarValorNumerico("numero de medicamentos "
                    + "a comprar",1, unidadesExistentes);
            System.out.print("Se añadiran "+nComprar+" unidades del\n"
                    + "medicamento "+nombreMedicamento+" a su factura\n"
                            + "¿Está seguro de su compra? (SI/NO): ");
            cad = scn.nextLine().toUpperCase();
            while(!validarLongitudMaximaCadena(cad, 2) && 
                    ((!"SI".equals(cad)) || (!"NO".equals(cad))))
            {
                System.out.print("Se añadiran "+nComprar+" unidades del\n"
                    + "medicamento "+nombreMedicamento+" a su factura\n"
                            + "¿Está seguro de su compra? (SI/NO): ");
                cad = scn.nextLine().toUpperCase();
            }
        }
        this.setUnidadesExistentes(unidadesExistentes-nComprar);
        this.setUnidadesVendidas(unidadesVendidas+nComprar);
        return nComprar;
    }
    
}
