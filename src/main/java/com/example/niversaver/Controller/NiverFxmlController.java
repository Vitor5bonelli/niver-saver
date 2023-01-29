package com.example.niversaver.Controller;

import com.example.niversaver.AdicionarAniversarianteView;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class NiverFxmlController {
    public Button btnAdicionar;
    public Pane paneNiverDia;
    public Pane paneNiverMes;

    public void adicionarAniversariante(ActionEvent actionEvent) throws IOException {
        final AdicionarAniversarianteView view = new AdicionarAniversarianteView();
        final AdicionarAniversarianteController controller = new AdicionarAniversarianteController();

        view.ShowAndWait();
    }
}
