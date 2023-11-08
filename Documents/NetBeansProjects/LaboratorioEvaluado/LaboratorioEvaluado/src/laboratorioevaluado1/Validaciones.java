package laboratorioevaluado1;

public interface Validaciones 
{// Interface que define los metodos de validacion de datos       
       
    public boolean validarCadenaEsEntero(String cad);
    public boolean validarCadenaEsDouble(String cad);
    public boolean validarCadenaNumericaYRango(String cad, int start, int end);    
    public boolean validarLongitudMaximaCadena(String cad, int nLen);   
    public boolean validarRangoNumerico(int start, int end, int n);
    public abstract int validarValorNumerico(String nombreAtributo, int start,
            int end);
    public abstract double validarValorNumerico(String nombreAtributo, double start,
            double end);
    public boolean validarFecha(String fecha);
}
