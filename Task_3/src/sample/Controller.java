package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

public class Controller {

    private int[] array;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonStart;

    @FXML
    private Text output;

    @FXML
    private Text outputArray;

    @FXML
    private Text text;

    @FXML
    private Text textoutput;

    @FXML
    void initialize() {
        Model model = new Model();
        array = model.createArray();
        outputArray.setText(Arrays.toString(array));

        buttonStart.setOnAction(actionEvent -> {
            textoutput.setText("Числа кратные 3");
            output.setText(model.foundNumbers(array));
        });

    }

}

