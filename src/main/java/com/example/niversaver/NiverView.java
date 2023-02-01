package com.example.niversaver;

import com.example.niversaver.Persistence.NiverDAO;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class NiverView extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("NiverSaver :D");

        Parent raiz = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("niver-fxml.fxml")));
        primaryStage.setScene(new Scene(raiz, 580, 400));
        primaryStage.show();
    }

}
