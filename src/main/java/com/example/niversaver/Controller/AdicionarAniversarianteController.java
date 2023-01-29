package com.example.niversaver.Controller;

import com.example.niversaver.Model.Aniversariante;
import com.example.niversaver.NiverView;
import com.example.niversaver.Persistence.NiverDAO;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.time.LocalDate;

import static jdk.internal.net.http.common.Utils.close;

public class AdicionarAniversarianteController {
    public Button btnSalvarAniversariante;
    public Button btnCancelar;
    public TextField txtNome;
    public DatePicker dtpickerDataNasc;
    public TextArea txtareaSugestoes;

    public void salvarAniversariante(ActionEvent actionEvent) {
        final NiverDAO dao = new NiverDAO();

        String nome = txtNome.getText();
        LocalDate dataNiver = dtpickerDataNasc.getValue();
        String sugestoes = txtareaSugestoes.getText();

        Aniversariante aniversariante = new Aniversariante(nome, dataNiver);
        aniversariante.setSugestoesPresente(txtareaSugestoes.getText());

        dao.add(aniversariante);
        for (Aniversariante aniversariante1 : dao.readAll()) {
            System.out.println(aniversariante1.toString());
        }
    }

    public void cancelar(ActionEvent actionEvent) {
        final Stage stage = (Stage) btnCancelar.getScene().getWindow();
        stage.close();
    }
}
