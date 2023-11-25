/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorioevaluado1.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import laboratorioevaluado1.View.PantallaInicio;
import laboratorioevaluado1.model.Refrigerado;
import laboratorioevaluado1.model.TempAmbiente;

/**
 *
 * @author jrmat
 */
public class Controller implements ActionListener 
{
    
    private PantallaInicio view;
    private ArrayList<Refrigerado> listaRefrigerado;
    private ArrayList<TempAmbiente> listaTempAmbiente;

    public Controller(PantallaInicio view, 
            ArrayList<Refrigerado> listaRefrigerado, 
            ArrayList<TempAmbiente> listaTempAmbiente) 
    {
        this.view = view;
        this.listaRefrigerado = listaRefrigerado;
        this.listaTempAmbiente = listaTempAmbiente;
        this.view.btnAgregar.addActionListener(this);
        this.view.btnModificar.addActionListener(this);
        this.view.btnEliminar.addActionListener(this);
        this.view.btnConsultar.addActionListener(this);
        this.view.btnVencimiento.addActionListener(this);
        this.view.btnColocarOferta.addActionListener(this);
        this.view.btnRetirarOferta.addActionListener(this);
        this.view.btnVerCostos.addActionListener(this);
        this.view.btnComprarMedicamento.addActionListener(this);
        this.view.btnVerInventario.addActionListener(this);
    }
    
    public void iniciar()
    {
        view.setTitle("Menú principal");
        view.setLocationRelativeTo(null);
    }        

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
    }

    
    
}
