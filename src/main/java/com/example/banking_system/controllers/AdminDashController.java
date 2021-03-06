package com.example.banking_system.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class AdminDashController {
    private Parent root;
    private Stage stage;
    private Scene scene;

    @FXML
    TextField textf_user;

    @FXML
    public void to_reg_new_client(ActionEvent event) throws IOException {
        //some_logic
        switch_scene("reg_new_client.fxml", event);
    }

    @FXML
    public void to_deposit(ActionEvent event) throws IOException {
        //some_logic
        switch_scene("deposit.fxml", event);
    }


    private void switch_scene(String resource, ActionEvent event) throws IOException {
        String path = "/com/example/banking_system/views/" + resource;
        root  = FXMLLoader.load(getClass().getResource(path));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root, 1280, 800);
        stage.setScene(scene);
        stage.show();
    }
}
