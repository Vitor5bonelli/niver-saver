package com.example.niversaver;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class AdicionarNiverAlertView {
    public void showAndWait() throws IOException {
        Parent window = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("adicionar-aniversariante-alert.fxml")));
        Stage stage = new Stage();
        Scene scene = new Scene(window, 311, 121);

        stage.setTitle("Erro!");
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();
    }
}
