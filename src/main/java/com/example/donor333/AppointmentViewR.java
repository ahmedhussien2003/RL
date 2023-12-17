package com.example.donor333;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class AppointmentViewR {

    @FXML
    private Label label;

    @FXML
    private Circle shape_1;

    @FXML
    private Label shape_2;

    public static void main(String[]args){

    System.out.println("The appointment has been booked");
}
    public void mainlist (Event event){
        try {

            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(getClass().getResource("Dono.View.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception ex) {
            System.out.println("y" + ex.getMessage());

        }}
}