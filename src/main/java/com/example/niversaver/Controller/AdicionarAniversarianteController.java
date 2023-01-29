package com.example.niversaver.Controller;

import com.example.niversaver.NiverView;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import static jdk.internal.net.http.common.Utils.close;

public class AdicionarAniversarianteController {
    public Button btnSalvarAniversariante;
    public Button btnCancelar;

    public void salvarAniversariante(ActionEvent actionEvent) {
    }

    public void cancelar(ActionEvent actionEvent) {
        final Stage stage = (Stage) btnCancelar.getScene().getWindow();
        stage.close();
    }
}
