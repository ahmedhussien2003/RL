package com.example.donor333;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.cat;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;

import model.dog;

public  class Dogs implements Initializable {
    @FXML
    private VBox chosenDogCard;
    @FXML
    private Label dogNameLabel;
    @FXML
    private Label dogGenderLabel;
    @FXML
    private ImageView dogImg;
    @FXML
    private ScrollPane scroll;
    @FXML
    private GridPane grid;
    @FXML
    private Button Back;
    @FXML
    private Button Adopt;
    private List<dog> dogs = new ArrayList<>();
    private Image image;
    private MyListener2 myListener2;


    private List<dog> getData() {
        List<dog> dogs = new ArrayList<>();
        dog dog5;

        dog5 = new dog();
        dog5.setName("Molly");
        dog5.setGender("Female");
        dog5.setImgSrc("Molly.png");
        dog5.setColor("#BAEAC3");
        dogs.add(dog5);

        dog5 = new dog();
        dog5.setName("Avenger");
        dog5.setGender("Male");
        dog5.setImgSrc("Avenger.png");
        dog5.setColor("#BAEAC3");
        dogs.add(dog5);

        dog5 = new dog();
        dog5.setName("Lucy");
        dog5.setGender("Female");
        dog5.setImgSrc("Lucy.png");
        dog5.setColor("#BAEAC3");
        dogs.add(dog5);

        dog5 = new dog();
        dog5.setName("Dingo");
        dog5.setGender("Male");
        dog5.setImgSrc("Dingo.png");
        dog5.setColor("#BAEAC3");
        dogs.add(dog5);

        dog5 = new dog();
        dog5.setName("Sparky");
        dog5.setGender("Male");
        dog5.setImgSrc("Sparky.png");
        dog5.setColor("#BAEAC3");
        dogs.add(dog5);

        dog5 = new dog();
        dog5.setName("Tilly");
        dog5.setGender("Female");
        dog5.setImgSrc("Tilly.png");
        dog5.setColor("#BAEAC3");
        dogs.add(dog5);

        dog5 = new dog();
        dog5.setName("Shadow");
        dog5.setGender("Male");
        dog5.setImgSrc("Shadow.png");
        dog5.setColor("#BAEAC3");
        dogs.add(dog5);

        dog5 = new dog();
        dog5.setName("Romeo");
        dog5.setGender("Male");
        dog5.setImgSrc("Romeo.png");
        dog5.setColor("#BAEAC3");
        dogs.add(dog5);

        dog5 = new dog();
        dog5.setName("Rocco");
        dog5.setGender("Male");
        dog5.setImgSrc("Rocco.png");
        dog5.setColor("#BAEAC3");
        dogs.add(dog5);

        dog5 = new dog();
        dog5.setName("Pip");
        dog5.setGender("Female");
        dog5.setImgSrc("Pip.png");
        dog5.setColor("#BAEAC3");
        dogs.add(dog5);

        dog5 = new dog();
        dog5.setName("Oscar");
        dog5.setGender("Male");
        dog5.setImgSrc("Oscar.png");
        dog5.setColor("#BAEAC3");
        dogs.add(dog5);

        dog5 = new dog();
        dog5.setName("Mocha");
        dog5.setGender("Female");
        dog5.setImgSrc("Mocha.png");
        dog5.setColor("#BAEAC3");
        dogs.add(dog5);

        dog5 = new dog();
        dog5.setName("Mia");
        dog5.setGender("Female");
        dog5.setImgSrc("Mia.png");
        dog5.setColor("#BAEAC3");
        dogs.add(dog5);

        dog5 = new dog();
        dog5.setName("Lexi");
        dog5.setGender("Female");
        dog5.setImgSrc("Lexi.png");
        dog5.setColor("#BAEAC3");
        dogs.add(dog5);

        dog5 = new dog();
        dog5.setName("Jess");
        dog5.setGender("Male");
        dog5.setImgSrc("Jess.png");
        dog5.setColor("#BAEAC3");
        dogs.add(dog5);

        dog5 = new dog();
        dog5.setName("Hank");
        dog5.setGender("Male");
        dog5.setImgSrc("Hank.png");
        dog5.setColor("#BAEAC3");
        dogs.add(dog5);

        dog5 = new dog();
        dog5.setName("Bo");
        dog5.setGender("Male");
        dog5.setImgSrc("Bo.png");
        dog5.setColor("#BAEAC3");
        dogs.add(dog5);

        dog5 = new dog();
        dog5.setName("Benji");
        dog5.setGender("Male");
        dog5.setImgSrc("Benji.png");
        dog5.setColor("#BAEAC3");
        dogs.add(dog5);

        dog5 = new dog();
        dog5.setName("AJ");
        dog5.setGender("Male");
        dog5.setImgSrc("AJ.png");
        dog5.setColor("#BAEAC3");
        dogs.add(dog5);

        dog5 = new dog();
        dog5.setName("Abbe");
        dog5.setGender("Male");
        dog5.setImgSrc("Abbe.png");
        dog5.setColor("#BAEAC3");
        dogs.add(dog5);

        return dogs;
    }
    private void setChosenDogCard(dog dog5){
        dogNameLabel.setText(dog5.getName());
        dogGenderLabel.setText(dog5.getGender());
        image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(dog5.getImgSrc())));
        dogImg.setImage(image);
        chosenDogCard.setStyle("-fx-background-color:#D3D3D3;\n"+"-fx-background-radius:30;");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        dogs.addAll(getData());
        if (dogs.size()>0){
            setChosenDogCard(dogs.get(0));
            myListener2= new MyListener2() {
                @Override
                public void onClickListener(dog dog5) {
                    setChosenDogCard(dog5);
                }

            };


        }
        int column = 0;
        int row = 5;
        try {
            for (int i = 0; i < dogs.size(); i++) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("item2.fxml"));

                AnchorPane anchorPane = fxmlLoader.load();

                Item2 item2 = fxmlLoader.getController();
                item2.setData(dogs.get(i),myListener2);
                if (column == 4){
                    column = 0;
                    row++;
                }
                grid.add(anchorPane,column++,row); // (child,column,row)
                //set item grid width
                grid.setMinWidth(Region.USE_COMPUTED_SIZE);
                grid.setPrefWidth(Region.USE_COMPUTED_SIZE);
                grid.setMaxWidth(Region.USE_COMPUTED_SIZE);

                //set grid height
                grid.setMinHeight(Region.USE_COMPUTED_SIZE);
                grid.setPrefHeight(Region.USE_COMPUTED_SIZE);
                grid.setMaxHeight(Region.USE_COMPUTED_SIZE);


                GridPane.setMargin(anchorPane,new Insets(10));
            }
        } catch(IOException e){
            throw new RuntimeException(e);
        }
    }
    public void choose (Event event) {
        try {

            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Choose.fxml")));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception ex) {
            System.out.println("y" + ex.getMessage());

        }
    }

    public void appointment (Event event) {
        try {

            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("appointment.fxml")));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception ex) {
            System.out.println("y" + ex.getMessage());

        }
    }
}
