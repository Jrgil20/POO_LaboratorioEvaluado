package laboratorioevaluado1;

public interface Validaciones 
{// Interface que define los metodos de validacion de datos       
       
/////////////////////////METODOS PREDETERMINADOS/////////////////////////////////////

    default boolean validarCadenaEsEntero(String cad)
    {   // Metodo que valida si una cadena es un numero entero
        try 
        {
            Integer.parseInt(cad);
            // se elimino n, ya que no se usa y solo queremos saver si se paresa a un numero
            return true;
        } 
        catch (NumberFormatException ex) 
        {
            System.out.print("\nERROR, el valor ingresado no es un numero");
            return false;
        }
    }

    default boolean validarCadenaEsDouble(String cad)
    {   // Metodo que valida si una cadena es un numero double
        try 
        {
           Double.parseDouble(cad);
           //lo mismo que la anterior, se elimina n
           return true;
        } 
        catch (NumberFormatException ex) 
        {
            System.out.print("\nERROR, el valor ingresado no es un numero");
            return false;
        }
    }
 
    default boolean validarLongitudMaximaCadena(String cad, int nLen)
    {   // Metodo que valida si una cadena no excede un numero de caracteres     
        if(cad.length() > nLen)
        {// si la longitud de la cadena es mayor al numero de caracteres imprime error     
            System.out.print("Error, el dato ingresado no puede exceder de "
                    + "los "+nLen+" caracteres, intente de nuevo: ");
            return false;    
        }
        else
            return true;
    }
    
    default boolean validarRangoNumerico(int start, int end, int n)
    {// Metodo que valida si un numero esta dentro de un rango
        if((n < start)||(n > end))
            return false;
        else
            return true;
    }

    default boolean validarCadenaNumericaYRango(String cad, int start, int end)
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

/////////////////////////METODOS ABSTRACTOS/////////////////////////////////////

    public abstract int validarValorNumerico(String nombreAtributo, int start, int end);
    public abstract double validarValorNumerico(String nombreAtributo, double start,
            double end);
    public boolean validarFecha(String fecha);
}
