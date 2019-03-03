package sample.StartPage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class CStartPage implements Initializable {

    @FXML
    private RadioButton rbBinary;

    @FXML
    private RadioButton rbOctal;

    @FXML
    private Menu mbItemAbout;

    @FXML
    private Button btnContinue;

    @FXML
    private TextField txtNumber;

    @FXML
    private MenuBar mbTopStart;

    @FXML
    private GridPane panelStart;

    @FXML
    private RadioButton rbDicimal;

    @FXML
    private RadioButton rbHex;

    @FXML
    private void btnActionContinue(ActionEvent event) {
        System.out.println("Test Button");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){

    }

}

