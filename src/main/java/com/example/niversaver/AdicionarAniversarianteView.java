package com.example.niversaver;

import com.example.niversaver.Controller.AdicionarAniversarianteController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.transform.Scale;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class AdicionarAniversarianteView {

    public void ShowAndWait() throws IOException {
        Parent window = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("adicionarAniversariante.fxml")));
        Stage stage = new Stage();
        Scene scene = new Scene(window, 283, 428);

        stage.setTitle("Adicionar Aniversariante!");
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();
    }
}
