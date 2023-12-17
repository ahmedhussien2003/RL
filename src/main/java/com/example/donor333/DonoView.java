package com.example.donor333;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class DonoView {

    @FXML
    private Button button_1;

    @FXML
    private Button button_2;

    @FXML
    private Button buttonback;

    @FXML
    private Label label_1;


    public void donate (Event event){
        try {
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(getClass().getResource("Donate.view.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception ex) {
            System.out.println("y" + ex.getMessage());

        }

    }
    public void Adopt (Event event){
        try {
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(getClass().getResource("Choose.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception ex) {
            System.out.println("y" + ex.getMessage());

        }

    }
}

