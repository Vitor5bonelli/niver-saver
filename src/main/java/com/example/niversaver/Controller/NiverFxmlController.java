package com.example.niversaver.Controller;

import com.example.niversaver.AdicionarAniversarianteView;
import com.example.niversaver.Model.Aniversariante;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
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
        final AdicionarAniversarianteController controller = new AdicionarAniversarianteController();

        view.ShowAndWait();
    }

    public void setNiverIntoView(){

    }

    public void createNiverNode(Aniversariante aniversariante){
        VBox box = new VBox();
        ObservableList<Node> listaNivers = box.getChildren();

        box.setSpacing(10.00);
        Text nome = new Text(aniversariante.getNome());
        Text data = new Text(aniversariante.getDataAniversario().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        Text sugestoes = new Text(aniversariante.getSugestoesPresente());
    }
}
