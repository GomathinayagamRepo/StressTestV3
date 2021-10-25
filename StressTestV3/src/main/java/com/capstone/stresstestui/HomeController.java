package com.capstone.stresstestui;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HomeController {

    @FXML
    private JFXButton homeNext;

    @FXML
    void onClickHomeNext(ActionEvent event)throws Exception {

        // To open the no of input scene in same window
        Parent noOfFxml = FXMLLoader.load(getClass().getResource("noOfInput.fxml"));
        Stage noOfStage = (Stage) homeNext.getScene().getWindow();
        noOfStage.setScene(new Scene(noOfFxml));
    }

}
