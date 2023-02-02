package com.example.niversaver.Controller;

import com.example.niversaver.AdicionarNiverAlertView;
import com.example.niversaver.Model.Aniversariante;
import com.example.niversaver.Persistence.NiverDAO;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class AdicionarAniversarianteController {
    public Button btnSalvarAniversariante;
    public Button btnCancelar;
    public TextField txtNome;
    public DatePicker dtpickerDataNasc;
    public TextArea txtareaSugestoes;

    public void salvarAniversariante(ActionEvent actionEvent) throws IOException {
        final NiverDAO dao = new NiverDAO();

        String nome = txtNome.getText();
        LocalDate dataNiver = dtpickerDataNasc.getValue();
        String sugestoes = txtareaSugestoes.getText();

        if(nome.equals("") || dataNiver == null){
            final AdicionarNiverAlertView view = new AdicionarNiverAlertView();
            view.showAndWait();

        }
        else {
            Aniversariante aniversariante = new Aniversariante(nome, dataNiver);
            aniversariante.setSugestoesPresente(txtareaSugestoes.getText());

            dao.add(aniversariante);
            for (Aniversariante aniversariante1 : dao.readAll()) {
                System.out.println(aniversariante1.toString());
            }

            setNiverNodeIntoView(createNiverNode(aniversariante), aniversariante);

            close();
        }
    }

    //Isso ta bem errado, ele temq colocar a partir do banco de dados
    //mas é só um teste pra ver se exibe
    public void setNiverNodeIntoView(VBox box, Aniversariante aniversariante){
        NiverFxmlController controllerTlPrincipal = new NiverFxmlController();

        //Verifica se o aniversário é hoje
        if(Objects.equals(aniversariante.getDataAniversario(), LocalDate.now())){
            ObservableList<Node> paneDia = controllerTlPrincipal.fpaneNiversDoDia.getChildren();
            paneDia.add(box);
        }

        /*Ou esse mês
        if (aniversariante.getDataAniversario().getMonth().equals(LocalDate.now().getMonth())){
            ObservableList<Node> paneMes = controllerTlPrincipal.fpaneNiversDoMes.getChildren();
            paneMes.add(box);
        }
        */

    }

    public VBox createNiverNode(Aniversariante aniversariante){
        VBox box = new VBox();

        box.setSpacing(10.00);
        Text nome = new Text(aniversariante.getNome());
        Text data = new Text(aniversariante.getDataAniversario().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        Text sugestoes = new Text(aniversariante.getSugestoesPresente());

        box.setSpacing(10);
        box.setAlignment(Pos.BASELINE_LEFT);
        box.getChildren().addAll(nome, data, sugestoes);

        return box;
    }

    public void cancelar(ActionEvent actionEvent) {
        close();
    }

    public void close(){
        final Stage stage = (Stage) btnCancelar.getScene().getWindow();
        stage.close();
    }
}
