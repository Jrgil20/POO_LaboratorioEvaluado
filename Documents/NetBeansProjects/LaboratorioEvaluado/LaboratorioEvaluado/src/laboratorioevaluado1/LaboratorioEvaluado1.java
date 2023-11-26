package laboratorioevaluado1;

import java.util.ArrayList;
import laboratorioevaluado1.Controller.Controller;
import laboratorioevaluado1.View.Inicio;
import laboratorioevaluado1.View.SeleccionarTipo;
import laboratorioevaluado1.model.Refrigerado;
import laboratorioevaluado1.model.TempAmbiente;

public class LaboratorioEvaluado1
{       
    public static void main(String[] args) 
    {//Inicio del main
        Inicio view = new Inicio();
        SeleccionarTipo viewSelection = new SeleccionarTipo();
        ArrayList<Refrigerado> listaRefrigerado = new ArrayList<>();
        ArrayList<TempAmbiente> listaTempAmbiente = new ArrayList<>();
        
        Controller ctr = new Controller(view,viewSelection,
                listaRefrigerado,
                listaTempAmbiente);
        ctr.iniciar();
        view.setVisible(true);
    }
}
