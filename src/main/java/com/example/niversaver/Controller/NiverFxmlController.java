package com.example.niversaver.Controller;

import com.example.niversaver.AdicionarAniversarianteView;
import com.example.niversaver.Model.Aniversariante;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class NiverFxmlController {
    public Button btnAdicionar;
    public FlowPane fpaneNiversDoDia;
    public FlowPane fpaneNiversDoMes;


    public void adicionarAniversariante(ActionEvent actionEvent) throws IOException {
        final AdicionarAniversarianteView view = new AdicionarAniversarianteView();

        view.ShowAndWait();
    }

}
