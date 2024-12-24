package com.example.myapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class DetailsController {

    private MainController mainController;

    @FXML
    private Button confirmBtn;

    @FXML
    private TextField txtAge;

    @FXML
    private TextField txtHeight;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtWeight;

    private String name;
    private int age, height;
    private double weight;

    public void setMainMenuController(MainController mainMenuController) {
        this.mainController = mainMenuController;
    }

    @FXML
    void onConfirm(ActionEvent event) {
        name = txtName.getText();
        age = Integer.parseInt(txtAge.getText());
        height = Integer.parseInt(txtHeight.getText());
        weight = Double.parseDouble(txtWeight.getText());
        Profile profile = new Profile(name, age, height, weight);

        mainController.updateProfileLabels(profile.getName(), profile.getAge(), profile.getHeight(), profile.getWeight());

        ((Button) event.getSource()).getScene().getWindow().hide();
    }

    public void details() {
        Profile profile = new Profile();

        txtName.setText(profile.getName());
        txtAge.setText(String.valueOf(profile.getAge()));
        txtHeight.setText(String.valueOf(profile.getHeight()));
        txtWeight.setText(String.valueOf(profile.getWeight()));
    }

    // Getter methods for external access
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}
