package laboratorioevaluado1;
/**
 *
 * @author Jesus Gil y Matias silveira
 */
public abstract class Medicamento 
{        
    protected String nombreMedicamento;//
    protected int codigoMedicamento;//
    protected double costoMedicamento;//
    protected double precioVentaPublica;//
    protected int unidadesVendidas;//
    protected int unidadesExistentes;//
    protected String fechaCaducidad;//
    protected int vigenciaMercado;//
    protected int numeroLoteMedicamento;//
           
    
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
    protected abstract double calcularTotalCompra(int nComprar);
    protected abstract int devolverCompra(int nComprar);
    
}

