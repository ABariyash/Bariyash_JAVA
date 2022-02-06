package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

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
                if (input.getText().equals("Вячеслав")) {
                    output.setText("Привет, Вячеслав");
                } else {
                    output.setText("Нет такого имени");
                }
            } else {
                output.setText("Поле не заполнено!");
            }
        });
    }

}
