package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonStart;

    @FXML
    private TextField input;

    @FXML
    private Text output;

    @FXML
    private Text text;

    @FXML
    void initialize() {
        buttonStart.setOnAction(actionEvent -> {
            if (!input.getText().isEmpty()) {
                try {
                    double number = Double.parseDouble(input.getText());
                    if (number > 7) {
                        output.setText("Привет");
                    } else {
                        output.setText("Введенное число не верное");
                    }
                } catch (Exception ex) {
                    output.setText("Введенное значение не является числом");
                }
            } else {
                output.setText("Поле не заполнено!");
            }
        });
    }

}



