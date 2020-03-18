package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label helloworld;

    public void sayhelloworld(ActionEvent actionEvent) {
        helloworld.setText("Hello world");
    }
}