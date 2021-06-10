package gui;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {


    @FXML
    public Button leftId;
    @FXML
    public Button rightId;
    @FXML
    public Button upId;
    @FXML
    public TextArea textArea;
    @FXML
    public TextField title;

    public int selector = 0;

    @FXML
    public void initialize() {
        textArea.setWrapText(true);
    }

    public void leftAction(ActionEvent actionEvent) {
        if (selector == 0){
            Room room1 = new Room("Old man`s terrarium", "old man has crushed u in his terrarium like an ant, gg");
            title.setText(room1.title);
            textArea.setText(room1.text);
            rightId.setDisable(true);
            upId.setDisable(true);
        }

    }

    public void rightAction(ActionEvent actionEvent) throws IOException {
        if (selector == 0){
            Room room1 = new Room("Black death", "You are now facing a black guy named Jamal hes very black, but he is kind to you and he lets you get through to your home.");

            title.setText(room1.title);
            textArea.setText(room1.text);
        }
        if (selector == 1){
            Parent root = FXMLLoader.load(
                    getClass().getResource("/ending.fxml")
            );

            Scene scene = new Scene(root, 600, 400);
            Window.stage.setScene(scene);
            Window.stage.show();

        }
        selector++;

    }

    public void upAction(ActionEvent actionEvent) {
        if (selector == 0){
            Room room1 = new Room("Death Hollows", "Welcome, to the Death Hollows, you chose death right? Well step in the chamber.");
            title.setText(room1.title);
            textArea.setText(room1.text);
            leftId.setDisable(true);
            rightId.setDisable(true);
        }
        if (selector == 1){
            Room room2 = new Room("You died", "You are now dead, better luck next time.");
            title.setText(room2.title);
            textArea.setText(room2.text);
            leftId.setDisable(true);
            rightId.setDisable(true);

        }
        selector++;
    }
}
