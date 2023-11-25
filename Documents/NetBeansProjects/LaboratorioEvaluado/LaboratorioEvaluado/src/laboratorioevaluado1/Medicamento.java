/**
 * Clase abstracta que define la estructura de los medicamentos.
 * Contiene atributos y métodos abstractos y concretos para la gestión de medicamentos.
 * Implementa la interfaz Validaciones para validar valores numéricos y de longitud de cadenas.
 * Esta clase es utilizada por las clases MedicamentoRefrigerado y MedicamentoNoRefrigerado.
 * @author Jesus Gil
 * @version 1.0
 * @see Validaciones
 * @see MedicamentoRefrigerado
 * @see MedicamentoNoRefrigerado
 */
package laboratorioevaluado1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

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
           
    // Crear una única instancia de Scanner como variable estática
    public static Scanner scn = new Scanner(System.in);
    
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
    
    protected void determinarVencido() 
    {//Determina si un medicamento refrigerado esta vencido
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

    protected void retirarLote(int numeroLoteMedicamento)
    {//Retira un medicamento refrigerado del mercado
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

    }

    protected int comprarMedicamentos()
    {   //Permite comprar un medicamento refrigerado
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

    protected int alertaReponerInventario()
    {   //Alerta si el inventario de un medicamento refrigerado esta por debajo de 5 unidades
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
 
    public String solicitarNombreMedicamento() {
        String Nombre;
        System.out.print("Por favor ingrese el nombre del medicamento\n");
        System.out.print("Recuerde que dicho nombre no "
        + "debe exceder a 8 caracteres\nni tener solo espacios  en blanco:");  
        Nombre = scn.nextLine();
        while(!validarLongitudMaximaCadena(Nombre, 8) || Nombre.isBlank()) {
            Nombre = scn.nextLine();
        }
        return Nombre;
    }

    public String solicitarFechaCaducidad() {
        String FCaducidad;
        System.out.print("\nIngrese la fecha de caducidad del medicamento\ncon formato (mes/año): ");
        FCaducidad = scn.nextLine();
        while (!validarFecha(FCaducidad)) 
        {
            System.out.print("\nERROR, la fecha ingresada no tiene el formato "
                    + "correcto (mes/año). Por favor, ingrese la fecha nuevamente: ");
            FCaducidad = scn.nextLine();
        }
        return FCaducidad;
    }

    /////////////////////////METODOS ABSTRACTOS/////////////////////////////////////

    protected abstract void leerDatos();
    protected abstract void mostrarCostoYPrecio();
    protected abstract double calcularPrecioFinal(int porcentajeAdicional);
    protected abstract void mostrarInformacion();  
    protected abstract void modificarDatos(int opcion);

}/**
 * Clase abstracta que define la estructura de los medicamentos.
 * Contiene atributos y métodos abstractos y concretos para la gestión de medicamentos.
 * Implementa la interfaz Validaciones para validar valores numéricos y de longitud de cadenas.
 * Esta clase es utilizada por las clases MedicamentoRefrigerado y MedicamentoNoRefrigerado.
 * @author Jesus Gil
 * @version 1.0
 * @see Validaciones
 * @see MedicamentoRefrigerado
 * @see MedicamentoNoRefrigerado
 */
package laboratorioevaluado1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

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
           
    // Crear una única instancia de Scanner como variable estática
    public static Scanner scn = new Scanner(System.in);
    
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
    
    protected void determinarVencido() 
    {//Determina si un medicamento refrigerado esta vencido
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

    protected void retirarLote(int numeroLoteMedicamento)
    {//Retira un medicamento refrigerado del mercado
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

    }

    protected int comprarMedicamentos()
    {   //Permite comprar un medicamento refrigerado
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

    protected int alertaReponerInventario()
    {   //Alerta si el inventario de un medicamento refrigerado esta por debajo de 5 unidades
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
 
    public String solicitarNombreMedicamento() {
        String Nombre;
        System.out.print("Por favor ingrese el nombre del medicamento\n");
        System.out.print("Recuerde que dicho nombre no "
        + "debe exceder a 8 caracteres\nni tener solo espacios  en blanco:");  
        Nombre = scn.nextLine();
        while(!validarLongitudMaximaCadena(Nombre, 8) || Nombre.isBlank()) {
            Nombre = scn.nextLine();
        }
        return Nombre;
    }

    public String solicitarFechaCaducidad() {
        String FCaducidad;
        System.out.print("\nIngrese la fecha de caducidad del medicamento\ncon formato (mes/año): ");
        FCaducidad = scn.nextLine();
        while (!validarFecha(FCaducidad)) 
        {
            System.out.print("\nERROR, la fecha ingresada no tiene el formato "
                    + "correcto (mes/año). Por favor, ingrese la fecha nuevamente: ");
            FCaducidad = scn.nextLine();
        }
        return FCaducidad;
    }

    /////////////////////////METODOS ABSTRACTOS/////////////////////////////////////

    protected abstract void leerDatos();
    protected abstract void mostrarCostoYPrecio();
    protected abstract double calcularPrecioFinal(int porcentajeAdicional);
    protected abstract void mostrarInformacion();  
    protected abstract void modificarDatos(int opcion);

}
