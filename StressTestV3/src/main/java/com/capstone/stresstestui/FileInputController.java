package com.capstone.stresstestui;

import com.capstone.testGen.CopyFiles;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;

import java.io.File;

public class FileInputController {

    @FXML
    private JFXButton bruteFileButton;

    @FXML
    private JFXButton optimalFileButton;

    @FXML
    private Label bruteLabel;

    @FXML
    private JFXButton inputFileNext;

    @FXML
    private Label optimalLabel;

    File bruteFile;
    File optimalFile;

    //To select a Brute Force file
    @FXML
    void onClickBruteFile(ActionEvent event) {
        FileChooser bruteFC = new FileChooser();
        bruteFC.getExtensionFilters().add(new FileChooser.ExtensionFilter("Java Files","*.java"));
        bruteFile = bruteFC.showOpenDialog(null);

        if(bruteFile != null){
            bruteLabel.setText(bruteFile.getName());
        }
    }

    //To perform action when file input scene next button is clicked
    @FXML
    void onClickInputFileNext(ActionEvent event) {
        if(bruteFile != null && optimalFile != null){
            System.out.println("Brute Force and Optimal Solution Files are selected");
            String brutePath = bruteFile.getAbsolutePath();
            String optimalPath = optimalFile.getAbsolutePath();
            CopyFiles.copy(brutePath,optimalPath);
            System.out.println(brutePath);
            System.out.println(optimalPath);
        }
        else{
            if(bruteFile == null){
                bruteLabel.setText("Please select brute file!");
            }
            if(optimalFile == null){
                optimalLabel.setText("Please select optimal file!");
            }
        }
    }

    //To select an Optimal file
    @FXML
    void onClickOptimalFile(ActionEvent event) {
        FileChooser optimalFC = new FileChooser();
        optimalFC.getExtensionFilters().add(new FileChooser.ExtensionFilter("Java Files","*.java"));
        optimalFile = optimalFC.showOpenDialog(null);

        if(optimalFile != null){
            optimalLabel.setText(optimalFile.getName());
        }
    }
}
