package laboratorioevaluado1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Jesus Gil y Matias silveira
 */

public abstract class Medicamento implements Validaciones
{//clase que define la estructura de los medicamentos   
    
    //Atributos de la clase abstracta Medicamento     
    protected String nombreMedicamento;//
    protected int codigoMedicamento;//
    protected double costoMedicamento;//
    protected double precioVentaPublica;//
    protected int unidadesVendidas;//
    protected int unidadesExistentes;//
    protected String fechaCaducidad;//
    protected int vigenciaMercado;//
    protected int numeroLoteMedicamento;//
           
/////////////////////////METODOS ABSTRACTOS/////////////////////////////////////

    protected abstract void leerDatos();
    protected abstract double calcularPrecioFinal(int porcentajeAdicional);
    protected abstract void mostrarInformacion();
    protected abstract void colocarOferta(int numeroLoteMedicamento);
    protected abstract void retirarLote(int numeroLoteMedicamento);
    protected abstract int alertaReponerInventario();
    protected abstract void reponerInventario();  
    protected abstract void mostrarCostoYPrecio();     
    protected abstract int comprarMedicamentos();
    
    
    /////////////////////////METODOS CONCRETOS GET Y SET/////////////////////////////////////

    public String getNombreMedicamento() {
        return nombreMedicamento;
    }
    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    public int getCodigoMedicamento() {
        return codigoMedicamento;
    }
    public void setCodigoMedicamento(int codigoMedicamento) {
        this.codigoMedicamento = codigoMedicamento;
    }

    public double getCostoMedicamento() {
        return costoMedicamento;
    }
    public void setCostoMedicamento(double costoMedicamento) {
        this.costoMedicamento = costoMedicamento;
    }

    public double getPrecioVentaPublica() {
        return precioVentaPublica;
    }
    public void setPrecioVentaPublica(double precioVentaPublica) {
        this.precioVentaPublica = precioVentaPublica;
    }

    public int getUnidadesVendidas() {
        return unidadesVendidas;
    }
    public void setUnidadesVendidas(int unidadesVendidas) {
        this.unidadesVendidas = unidadesVendidas;
    }

    public int getUnidadesExistentes() {
        return unidadesExistentes;
    }
    public void setUnidadesExistentes(int unidadesExistentes) {
        this.unidadesExistentes = unidadesExistentes;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }
    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getVigenciaMercado() {
        return vigenciaMercado;
    }
    public void setVigenciaMercado(int vigenciaMercado) {
        this.vigenciaMercado = vigenciaMercado;
    }
    
    public int getNumeroLoteMedicamento() {
        return numeroLoteMedicamento;
    }
    public void setNumeroLoteMedicamento(int numeroLoteMedicamento) {
        this.numeroLoteMedicamento = numeroLoteMedicamento;
    }

    /////////////////////////METODOS CONCRETOS/////////////////////////////////////
    protected double calcularTotalCompra(int nComprar)
    {   // Metodo que calcula el total de la compra de un medicamento
        return nComprar*precioVentaPublica;
    }

    protected int devolverCompra(int nComprar)
    { // Metodo que devuelve la compra de un medicamento
        nComprar = validarValorNumerico("numero de unidades "
                + "a devolver",1,nComprar);
        this.setUnidadesExistentes(unidadesExistentes+nComprar);
        this.setUnidadesVendidas(unidadesVendidas-nComprar);
        return nComprar;
    }    
    
    protected void determinarVencido() 
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

}