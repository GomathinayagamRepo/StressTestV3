package com.capstone.stresstestui;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextArea;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.capstone.testGen.GenTests;

import java.io.IOException;

public class NoOfTestController {
    @FXML
    private JFXTextArea noOfTestCase;

    @FXML
    private JFXCheckBox deepRun;

    @FXML
    private JFXButton noOfTestNext;

    public static Integer noOfTC;
    @FXML
    public void nextScene()throws Exception{

        Parent inputFxml = FXMLLoader.load(getClass().getResource("input.fxml"));
        Stage inputStage = (Stage) noOfTestNext.getScene().getWindow();
        inputStage.setScene(new Scene(inputFxml));
    }

    // To perform action when no of text case scene next button is clicked
    @FXML
    void onClickNoOfTestNext(ActionEvent event) throws Exception {
         System.out.println("NO of test cases:"+Integer.parseInt(noOfTestCase.getText()));
         noOfTC = Integer.parseInt(noOfTestCase.getText());
         GenTests TC = new GenTests();
         TC.createFiles(noOfTC);
         if(deepRun.isSelected()){
             System.out.println("Deep Run is Selected");
         }
         nextScene();
    }

}
