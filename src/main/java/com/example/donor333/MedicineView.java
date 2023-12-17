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

import java.util.ArrayList;
import java.util.Scanner;

public class MedicineView {

    @FXML
    private Label Button1;

    @FXML
    private Label Button2;

    @FXML
    private Button label_1;

    @FXML
    private Button label_10;

    @FXML
    private Button label_11;

    @FXML
    private Button label_12;

    @FXML
    private Button label_13;

    @FXML
    private Button label_14;

    @FXML
    private Button label_15;

    @FXML
    private Button label_17;

    @FXML
    private Button label_18;

    @FXML
    private Button label_2;

    @FXML
    private Button label_3;

    @FXML
    private Button label_4;

    @FXML
    private Button label_5;

    @FXML
    private Button label_6;

    @FXML
    private Button label_7;

    @FXML
    private Button label_8;

    @FXML
    private Button label_9;

    public static void main(String[]args){
        ArrayList<String> array = new ArrayList<String>();
        array.add("10:00am");
        array.add("10:30am");
        array.add("11:00am");
        array.add("11:30am");
        array.add("12:00pm");
        array.add("12:30pm");
        array.add("1:00pm");
        array.add("1:30pm");
        array.add("2:00pm");
        array.add("2:30pm");
        array.add("3:00pm");
        array.add("3:30pm");
        array.add("4:00pm");
        array.add("4:30pm");
        array.add("5:00pm");
        array.add("5:30pm");

        System.out.println("Available appointments");


        for(int i = 0; i< array.toArray().length ; i++)
        {
            System.out.println(array.get(i) +" ");

        }
        System.out.println("please choose the appointment");

        Scanner input=new Scanner(System.in);
        int arraySize,searchedappo;
        arraySize = input.nextInt();


        if (arraySize<=15)

            System.out.println(array.get(arraySize));
        else
            System.out.println("The appointment is not found");


    }

      public void appoindown (Event event){
        try {

            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(getClass().getResource("AppointmentR.view.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception ex) {
            System.out.println("y" + ex.getMessage());

        }
    }
    public void back (Event event){
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

    }}



