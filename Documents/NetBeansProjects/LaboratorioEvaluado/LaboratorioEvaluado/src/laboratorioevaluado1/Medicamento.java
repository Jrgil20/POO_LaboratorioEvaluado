package laboratorioevaluado1;
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
           
    //metodos abstractos
    protected abstract void leerDatos();
    protected abstract double calcularPrecioFinal(int porcentajeAdicional);
    protected abstract void mostrarInformacion();
    protected abstract void colocarOferta(int numeroLoteMedicamento);
    protected abstract void retirarLote(int numeroLoteMedicamento);
    protected abstract int alertaReponerInventario();
    protected abstract void reponerInventario();  
    protected abstract void mostrarCostoYPrecio();
    protected abstract void determinarVencido();    
    protected abstract int comprarMedicamentos();
    
    
    /////////////////////////METODOS GET Y SET/////////////////////////////////////

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
}
