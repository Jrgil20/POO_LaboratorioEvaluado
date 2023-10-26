/*

 */
package laboratorioevaluado1;
import java.text.ParseException;
import java.util.Scanner;
import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author Jesus Gil y Matias silveira
 */
public class Medicamento 
{
    
    private int codigoMedicamento;
    private String nombreMedicamento;
    private float costoMedicamento;
    private float precioVentaPublica;
    private int unidadesVendidas;
    private int unidadesExistentes;
    private String fechaCaducidad;
    private int vigenciaMercado;
    private int numeroLoteMedicamento;
    
    
    public Medicamento()
    {
        Random rnd = new Random();
        this.codigoMedicamento = rnd.nextInt();
        if(this.codigoMedicamento < 0){
            this.codigoMedicamento = this.codigoMedicamento*(-1);
        }
        this.costoMedicamento = 5;
        this.fechaCaducidad = "1/2024";
        int version = rnd.nextInt();
        while(version < 0){
            version = rnd.nextInt();
        }
        this.nombreMedicamento = "GenerMed 1."+version;
        this.precioVentaPublica = costoMedicamento+(20*costoMedicamento/100);
        this.unidadesExistentes = 100;
        this.unidadesVendidas = 0;
        this.vigenciaMercado = 0;
        this.numeroLoteMedicamento = rnd.nextInt();
        if(this.numeroLoteMedicamento < 0){
            this.numeroLoteMedicamento = this.numeroLoteMedicamento*(-1);
        }
    }

    public Medicamento(int codigoMedicamento) {
        this.codigoMedicamento = 0;
        this.nombreMedicamento = "";
        this.costoMedicamento = 0;
        this.precioVentaPublica = 0;
        this.unidadesVendidas = 0;
        this.unidadesExistentes = 0;
        this.fechaCaducidad = "1/3000";
        this.vigenciaMercado = 0;
        this.numeroLoteMedicamento = 0;
    }

    public int getCodigoMedicamento() {
        return codigoMedicamento;
    }

    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public float getCostoMedicamento() {
        return costoMedicamento;
    }

    public float getPrecioVentaPublica() {
        return precioVentaPublica;
    }

    public int getUnidadesVendidas() {
        return unidadesVendidas;
    }

    public int getUnidadesExistentes() {
        return unidadesExistentes;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public int getVigenciaMercado() {
        return vigenciaMercado;
    }
    
    public int getNumeroLoteMedicamento() {
        return numeroLoteMedicamento;
    }

    public void setCodigoMedicamento(int codigoMedicamento) {
        this.codigoMedicamento = codigoMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    public void setCostoMedicamento(float costoMedicamento) {
        this.costoMedicamento = costoMedicamento;
    }

    public void setPrecioVentaPublica(float precioVentaPublica) {
        this.precioVentaPublica = precioVentaPublica;
    }

    public void setUnidadesVendidas(int unidadesVendidas) {
        this.unidadesVendidas = unidadesVendidas;
    }

    public void setUnidadesExistentes(int unidadesExistentes) {
        this.unidadesExistentes = unidadesExistentes;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public void setVigenciaMercado(int vigenciaMercado) {
        this.vigenciaMercado = vigenciaMercado;
    }
    
    public void setNumeroLoteMedicamento(int numeroLoteMedicamento) {
        this.numeroLoteMedicamento = numeroLoteMedicamento;
    }
    
    private void precioAPagar(int porcentaje)
    {
        Scanner scn = new Scanner(System.in);
        while(porcentaje < 20){
            System.out.print("ERROR, el porcentaje no puede ser inferior a 20");
            System.out.print("/nIngrese el porcentaje adicional para la venta del medicamento "+this.getNombreMedicamento().toUpperCase()+" (tiene que ser mayor a 20%): ");
            porcentaje = scn.nextInt();
        }
        
        this.setPrecioVentaPublica(this.getCostoMedicamento()+((porcentaje*this.getCostoMedicamento())/100));
    }
    
    private boolean validarLongitudCadenaDeEnteros(String cad, int nLen)
    {        
        if(cad.length() > nLen){     
            System.out.print("Error, el dato ingresado no puede exceder de "
                    + "los "+nLen+" caracteres, intente de nuevo: ");
            return false;    
        }
        else
            return true;
    }
    
    private boolean validarCadenaAEntero(String cad)  //REVISAR, NO FUNCIONA ADECUADAMENTE
    {
        int n = 0;
        try{
            n = Integer.parseInt(cad);
            return true;
        }
        catch (NumberFormatException e){
            System.out.print("Error, el dato ingresado no es un numero, "
                    + "ingrese otro dato: ");
            return false;     
        }   
    }        
    
    private int validarVigencia(int valorVigencia)
    {
        try (Scanner scn = new Scanner(System.in)) {
            while((valorVigencia < 0) || (valorVigencia > 2))
            {
                System.out.print("/nERROR, la vigencia tiene que ser un valor en el rango [0,2]");
                System.out.print("/nIngrese la vigencia en el mercado del medicamento "+this.getNombreMedicamento().toUpperCase()+" [0,2]: ");
                valorVigencia = scn.nextInt();
            }
        }
        return valorVigencia;
    }
    
    private int validarNumeroPositivo(int num){
        Scanner scn = new Scanner(System.in);
        while (num <= 0){
            System.out.print("/nERROR, el numero ingresado no puede ser un valor inferior ni igual a 0");
            System.out.print("/nIngrese otro numero: ");
            num = scn.nextInt();
        }
        return num;
    }
    
    private float validarNumeroPositivo(float num){
        if(num <= 0){      
            System.out.print("/nNopuede ingresar numeros inferiores o iguales a 0");
            System.out.print("/nEl numero ingresado se ha pasado a "
                    + "positivo por defecto");
            return (num*(-1));
        }
        else
            return num;
    }
    
    private boolean validarUnidadesVendidas(int nVendidas){
        return nVendidas <= this.getUnidadesExistentes();
    }
    
    public void leerDatos()
    {
        try (Scanner scn = new Scanner(System.in)) {
            String cad;
            int n;
            System.out.print("Ingrese el nombre del medicamento: ");
            this.setNombreMedicamento(scn.nextLine());
            
            System.out.print("\nIngrese el codigo del medicamento "+this.getNombreMedicamento().toUpperCase()+": ");
            cad = scn.nextLine();
            while((this.validarCadenaAEntero(cad) == false)&&
                    (this.validarLongitudCadenaDeEnteros(cad, 8) == false))
            {
                cad = scn.nextLine();
            }
            n = Integer.parseInt(cad);
            this.setCodigoMedicamento(validarNumeroPositivo(n));
            
            System.out.print("\nIngrese el costo del medicamento "+this.getNombreMedicamento().toUpperCase()+": ");
            cad = scn.nextLine();
            while((this.validarCadenaAEntero(cad) == false)&&
                    (this.validarLongitudCadenaDeEnteros(cad, 3) == false))
            {
                cad = scn.nextLine();
            }
            n = Integer.parseInt(cad);
            this.setCostoMedicamento(validarNumeroPositivo(n));
            
            System.out.print("\nIngrese el porcentaje adicional para la venta del "
                    + "medicamento "+this.getNombreMedicamento().toUpperCase()+" "
                            + "(tiene que ser mayor a 20% e inferior a 100%): ");
            n = scn.nextInt();
            while(n < 20 || n > 100)
            {
                System.out.print("\nError, el numero ingresado debe ser mayor a "
                        + "20 e inferior a 100, intente de nuevo: ");
                n = scn.nextInt();
            }
            this.precioAPagar(n);
            
            System.out.print("\nIngrese las unidades existentes del medicamento "+this.getNombreMedicamento().toUpperCase()+": ");
            this.setUnidadesExistentes(validarNumeroPositivo(scn.nextInt()));
            
            System.out.print("\nIngrese las unidades vendidas del medicamento "+this.getNombreMedicamento().toUpperCase()+": ");
            n = scn.nextInt();
            while(this.validarUnidadesVendidas(n)){
                System.out.print("\nError, las unidades vendidas no pueden ser "
                        + "números negativos ni valores mayores a las unidades"
                        + "existentes ("+this.getUnidadesExistentes()+")\n"
                                + "Ingrese otro valor: ");
                n = scn.nextInt();
            }
            this.setUnidadesVendidas(n);
            
            System.out.print("\nIngrese la vigencia en el mercado del medicamento "+this.getNombreMedicamento().toUpperCase()+" [0,2]: ");
            int vigencia = this.validarVigencia(validarNumeroPositivo(scn.nextInt()));
            this.setVigenciaMercado(vigencia);
            
            System.out.print("\nIngrese el número de lote del medicamento "+this.getNombreMedicamento().toUpperCase()+": ");
            cad = scn.nextLine();
            while((this.validarCadenaAEntero(cad) == false)&&
                    (this.validarLongitudCadenaDeEnteros(cad, 8) == false))
            {
                cad = scn.nextLine();
            }
            n = Integer.parseInt(cad);
            this.setNumeroLoteMedicamento(validarNumeroPositivo(n));
            
            System.out.print("\nIngrese la fecha de caducidad del medicamento "+this.getNombreMedicamento().toUpperCase()+"\ncon formato (mes/año): ");
            String fechaCaducidad = scn.next();
            while (!fechaValida(fechaCaducidad))
            {
                System.out.print("\nERROR, la fecha ingresada no tiene el formato correcto (mes/año). Por favor, ingrese la fecha nuevamente: ");
                fechaCaducidad = scn.next();
            }
            this.setFechaCaducidad(fechaCaducidad);
        }
    }

    private boolean fechaValida(String fecha) 
    {
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
    
    public void mostrarInformacion()
    {
        System.out.println("El medicamento con el codigo "+this.getCodigoMedicamento()+" posee los siguientes datos: ");
        System.out.println("Nombre: "+this.getNombreMedicamento());
        System.out.println("Costo: "+this.getCostoMedicamento());
        System.out.println("Precio de venta al público: "+this.getPrecioVentaPublica());
        System.out.println("Unidades existentes: "+this.getUnidadesExistentes());
        System.out.println("Unidades vendidas: "+this.getUnidadesVendidas());
        System.out.println("Numero de lote: "+this.getNumeroLoteMedicamento());
        System.out.println("Fecha de caducidad: "+this.getFechaCaducidad());
        System.out.print("Vigencia en el mercado: ");
        switch (this.getVigenciaMercado()) {
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
    }    
    
    public void determinarVencido() 
    {
        try 
       {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("MM/yyyy");
            Date fechaActual = new Date();
            Date fechaCaducidadMedicamento=formatoFecha.parse(this.fechaCaducidad);

            if (fechaActual.after(fechaCaducidadMedicamento)) 
            {
                System.out.println("El medicamento " + this.nombreMedicamento + " con código " + this.codigoMedicamento + " está vencido. Venció en: " + this.fechaCaducidad);
            }
            else
            {
                // Calcula la diferencia en milisegundos y la convierte a meses
                long diff = fechaCaducidadMedicamento.getTime() - fechaActual.getTime();
                long diffMonths = diff / (30 * 24 * 60 * 60 * 1000);
                // un diferencia de 3 meses o menos
                if(diffMonths <= 3)
                {
                    System.out.println("El medicamento " + this.nombreMedicamento + " con código " + this.codigoMedicamento +
                    " se vencerá en menos de 3 meses. Se le aplica un descuento del 30%.");
                    this.setPrecioVentaPublica(this.getPrecioVentaPublica()-((this.getPrecioVentaPublica()*30)/100));
                }
                else
                {
                    System.out.println("El medicamento " + this.nombreMedicamento + " con código " + this.codigoMedicamento + " no está vencido.");
                }

            }
        } catch (ParseException e) 
          {
            System.out.println("Error al parsear la fecha: " + e.getMessage());
          }
    }
    
    public void colocarOferta(int numeroLoteMedicamento)
    {
        Scanner scn = new Scanner(System.in);
        if(numeroLoteMedicamento == this.getNumeroLoteMedicamento())
        {            
            this.setVigenciaMercado(1);
            System.out.println("Se ha colocado la oferta del "
                    + "medicamento "+this.getNombreMedicamento().toUpperCase()
                            + " en el mercado");
        }
        else
        {
            System.out.println("Error, el numero de lote "
                    +numeroLoteMedicamento+" no es valido");
        }
        System.out.println("Ingrese cualquier tecla y luego presione "
                + "enter para continuar...");
        scn.next();
    }
    
    public void retirarLote(int numeroLoteMedicamento)
    {
        Scanner scn = new Scanner(System.in);
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
        System.out.println("Ingrese cualquier tecla y luego presione "
                + "enter para continuar...");
        scn.next();
    }
    
    public void reponerInventario(){
        if(this.getUnidadesExistentes() < 5){
            System.out.println("Alerta: restan menos de 5 unidades del medicamento "+this.getNombreMedicamento().toUpperCase());
            System.out.println("Se recomienda reponer el inventario\n");
        }
        else{
            System.out.println("No es necesario reponer el inventario\npara el medicamento "+this.getNombreMedicamento().toUpperCase());
        }
    }
    
}

