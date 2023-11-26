/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorioevaluado1.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import laboratorioevaluado1.View.Inicio;
//import laboratorioevaluado1.View.SeleccionarTipo;
import laboratorioevaluado1.model.Refrigerado;
import laboratorioevaluado1.model.TempAmbiente;

/**
 *
 * @author jrmat
 */
public class Controller implements ActionListener 
{
    
    private Inicio viewMain;
    //private SeleccionarTipo viewSelection;
    private ArrayList<Refrigerado> listaRefrigerado;
    private ArrayList<TempAmbiente> listaTempAmbiente;

    public Controller(Inicio view,
            //SeleccionarTipo viewSelection,
            ArrayList<Refrigerado> listaRefrigerado, 
            ArrayList<TempAmbiente> listaTempAmbiente) 
    {
        this.viewMain = view;
        //this.viewSelection = viewSelection;
        this.listaRefrigerado = listaRefrigerado;
        this.listaTempAmbiente = listaTempAmbiente;       
    }
    
    public void iniciar()
    {
        viewMain.setTitle("Menú principal");        
    }        

    @Override
    public void actionPerformed(ActionEvent e) 
    {        
        
    }

    
    
}
