package com.capstone.stresstestui;
import com.capstone.generate.GenerateString;
import com.capstone.testGen.GenTests;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXRadioButton;
import javafx.beans.binding.Binding;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;
import com.capstone.stresstestui.*;
import javafx.stage.Stage;

public class InputController<JFXRadioButton> extends NoOfInputController{

    @FXML
    public ToggleGroup inputType;

    @FXML
    public JFXRadioButton character;

    @FXML
    public JFXRadioButton string;

    @FXML
    public JFXRadioButton array;

    // Inputs for integer
    @FXML
    public JFXRadioButton integer;

    @FXML
    public Label intRange;

    @FXML
    public TextField intLower;

    @FXML
    public TextField intUpper;

    // Inputs for Character
    @FXML
    public Label charTypeLabel;

    @FXML
    public JFXComboBox<String> charType;

    @FXML
    public String charAlpha;

    @FXML
    public String charNum;

    @FXML
    public String charSpecChar;

    @FXML
    public String charPara;

    @FXML
    public String charBracket;

    @FXML
    public String charVowel;

    @FXML
    public String charCons;

    @FXML
    public Pane charAlphaPlane;

    @FXML
    public Label charAlphaLabel;

    @FXML
    public JFXRadioButton charAlphaUpper;

    @FXML
    public ToggleGroup charAlphaType;

    @FXML
    public JFXRadioButton charAlphaLower;

    @FXML
    public JFXRadioButton charAlphaMixed;

    @FXML
    void onCharTypeChange(ActionEvent event) {

        // check if Alphabet is selected
        if(charAlpha == charType.getSelectionModel().getSelectedItem()){
            charAlphaPlane.setVisible(true);
        }
        else{
            charAlphaPlane.setVisible(false);
        }
    }

    // Inputs for String
    @FXML
    public JFXRadioButton stringWord;

    @FXML
    public ToggleGroup stringType;

    @FXML
    public JFXComboBox <String> stringWordType;

    @FXML
    public Pane stringWordPlane;


    @FXML
    public String stringWordAlpha;

    @FXML
    public String stringWordNum;

    @FXML
    public String stringWordSpecChar;

    @FXML
    public String stringWordPara;

    @FXML
    public String stringWordBracket;

    @FXML
    public String stringWordVowel;

    @FXML
    public String stringWordCons;


    @FXML
    public Pane stringWordAlphaPane;

    @FXML
    public JFXRadioButton StringWordAlphaUpper;

    @FXML
    public ToggleGroup stringWordAlphaType;

    @FXML
    public JFXRadioButton stringWordAlphaLower;

    @FXML
    public JFXRadioButton stringWordAlphaUpper;

    @FXML
    public JFXRadioButton stringWordAlphaAsc;

    @FXML
    public ToggleGroup stringWordAlphaOrder;

    @FXML
    public JFXRadioButton stringWordAlphaDesc;

    @FXML
    public JFXRadioButton stringWordAlphaNone;

    @FXML
    public JFXRadioButton stringWordAlphaMixed;

    @FXML
    public TextField stringWordNumLower;

    @FXML
    public TextField stringWordNumUpper;

    @FXML
    public Pane stringWordNumPlane;

    // To perform action when string word type changes
    @FXML
    void onStringWordTypeChange(ActionEvent event) {

        // to show alphabet input details in string word
        if(stringWordAlpha == stringWordType.getSelectionModel().getSelectedItem()){
            stringWordAlphaPane.setVisible(true);
        }
        else{
            stringWordAlphaPane.setVisible(false);
        }

        // to show number input details in string word
        if(stringWordNum == stringWordType.getSelectionModel().getSelectedItem()){
            stringWordNumPlane.setVisible(true);
        }
        else{
            stringWordNumPlane.setVisible(false);
        }
    }

    @FXML
    public Pane stringPhrasePlane;


    @FXML
    public JFXRadioButton stringPhrase;

    @FXML
    public Pane stringPlane;

    // To perform action when string type changes
    @FXML
    void onStringTypeChange(ActionEvent event) {

        // to Show word input details in string
          if(stringWord == (JFXRadioButton)stringType.getSelectedToggle()){
              stringWordPlane.setVisible(true);
          }
          else{
              stringWordPlane.setVisible(false);
          }
        // to Show word input details in string
          if(stringPhrase == (JFXRadioButton)stringType.getSelectedToggle()){
              stringPhrasePlane.setVisible(true);
          }
          else{
              stringPhrasePlane.setVisible(false);
          }
    }

    // For Array Inputs
    @FXML
    public Pane arrayPlane;

    @FXML
    public JFXComboBox<String> arrayType;

    @FXML
    public String intArray;

    @FXML
    public String stringArray;

    @FXML
    public String twoDArray;

    @FXML
    public Pane intArrayPlane;

    @FXML
    // To perform action on array type change
    void onArrayTypeChange(ActionEvent event) {

        // for integer array
        if(intArray == arrayType.getSelectionModel().getSelectedItem()){
            intArrayPlane.setVisible(true);
        }
        else{
            intArrayPlane.setVisible(false);
        }

        // for String array
        if(stringArray == arrayType.getSelectionModel().getSelectedItem()){
            stringArrayPane.setVisible(true);
        }
        else{
            stringArrayPane.setVisible(false);
        }

        // for 2D  array
        if(twoDArray == arrayType.getSelectionModel().getSelectedItem()){
            twoDArrayPlane.setVisible(true);
        }
        else{
            twoDArrayPlane.setVisible(false);
        }
    }

    // Integer array 2D Array
    @FXML
    public Pane twoDArrayPlane;

    @FXML
    public JFXRadioButton twoDArraySqr;

    @FXML
    public ToggleGroup twoDArrayType;

    @FXML
    public JFXRadioButton twoDArrayRec;

    @FXML
    public TextField twoDArrayLower;

    @FXML
    public TextField twoDArrayUpper;

    // Integer array inputs
    @FXML
    public JFXCheckBox intArraySort;

    @FXML
    public Pane intArraySortPlane;

    @FXML
    public JFXRadioButton intArrayAsc;

    @FXML
    public ToggleGroup intArraySortType;

    @FXML
    public JFXRadioButton intArrayDesc;

    @FXML
    public TextField intArrayLower;

    @FXML
    public TextField intArrayUpper;

    // To perform action when sorted checkbox is changed
    @FXML
    void onClickIntArraySort(ActionEvent event) {
        if(intArraySort.isSelected()){
            intArraySortPlane.setVisible(true);
        }
        else{
            intArraySortPlane.setVisible(false);
        }
    }

   // String Array Input
    @FXML
    public Pane stringArrayPane;


    @FXML
    public Pane stringArrayAlphaPlane;

    @FXML
    public JFXRadioButton stringArrayAlphaLower;

    @FXML
    public ToggleGroup stringArrayAlphaType;

    @FXML
    public JFXRadioButton stringArrayAlphaUpper;

    @FXML
    public JFXRadioButton stringArrayAlphaMixed;


    // Input type toggle
    @FXML
    void onToggleInput(ActionEvent event) {

        // To show the integer input details
        if(integer == (JFXRadioButton) inputType.getSelectedToggle()){
            intRange.setVisible(true);
            intUpper.setVisible(true);
            intLower.setVisible(true);
        }
        else{
            intRange.setVisible(false);
            intUpper.setVisible(false);
            intLower.setVisible(false);
        }

        // To show the character input details
        if(character == (JFXRadioButton) inputType.getSelectedToggle()){
            charTypeLabel.setVisible(true);
            charType.setVisible(true);
            if(charAlpha == charType.getSelectionModel().getSelectedItem()){
                charAlphaPlane.setVisible(true);
            }
        }
        else{
            charTypeLabel.setVisible(false);
            charType.setVisible(false);
            charAlphaPlane.setVisible(false);
        }

        // To show the string input details
        if(string == (JFXRadioButton) inputType.getSelectedToggle()){
            stringPlane.setVisible(true);
        }
        else{
            stringPlane.setVisible(false);
        }

        // To show the Array input details
        if(array == (JFXRadioButton) inputType.getSelectedToggle()){
            arrayPlane.setVisible(true);
        }
        else{
            arrayPlane.setVisible(false);
        }
    }

    @FXML
    public JFXButton inputNext;

    @FXML
    public  Label inputPageLabel;

    @FXML
    public String label;

    // To load the input scene in the same window
    @FXML
    public void inputReScene()throws Exception{

        Parent inputReFxml = FXMLLoader.load(getClass().getResource("input.fxml"));
        Stage inputReStage = (Stage)inputNext.getScene().getWindow();
        inputReStage.setScene(new Scene(inputReFxml));
    }

    @FXML
    public void fileScene()throws Exception{

        Parent inputFileFxml = FXMLLoader.load(getClass().getResource("fileInput.fxml"));
        Stage inputFileStage = (Stage) inputNext.getScene().getWindow();
        inputFileStage.setScene(new Scene(inputFileFxml));
    }
    // Main function to this page

    @FXML
    void onClickInputNext(ActionEvent event) throws Exception {

        // To get the input details from user
        System.out.println("Details for input "+count+" :");
        System.out.println();

        // To get the integer input details from user
        if(integer == (JFXRadioButton)inputType.getSelectedToggle()){
            System.out.println("Input Type : Integer");
            onSelectInt();
        }

        // To get the character input details from user
        else if(character == (JFXRadioButton)inputType.getSelectedToggle()){
            System.out.println("Input Type : Character");
            onSelectChar();
        }

        // To get the string input details from user
        else if(string == (JFXRadioButton)inputType.getSelectedToggle()){
            System.out.println("Input Type : String");
            onSelectStr();
        }

        // To get the array input details from user
        else if(array == (JFXRadioButton)inputType.getSelectedToggle()){
            System.out.println("Input Type : Array");
            onSelectArr();
        }
        System.out.println();

        // To load the same scene or no of test case scene based on user no of input
        if(count < userNoOfInput){
            count++;
            label = "SELECT INPUT TYPE "+count+" :";
            inputReScene();
            inputPageLabel.setText(label);
        }
        else{
            fileScene();
            System.out.println("Combine this with file project");
        }

    }




    // Controller for main function
    // input for integer
    void onSelectInt(){
        System.out.println("Integer Lower Limit : "+Integer.parseInt(intLower.getText()));
        System.out.println("Integer Upper Limit : "+Integer.parseInt(intUpper.getText()));
        int a = Integer.parseInt(intLower.getText());
        int b = Integer.parseInt(intUpper.getText());
        GenTests.writeInt(a,b);
    }

    //input for character
    void onSelectChar(){
        if(charAlpha==charType.getSelectionModel().getSelectedItem()){
            System.out.println("Character Type : Alphabet");
            if(charAlphaUpper == (JFXRadioButton)charAlphaType.getSelectedToggle()){
                System.out.println("Alphabet Type : Upper Case");
                GenTests.writeUpperAlpha();
            }
            if(charAlphaLower == (JFXRadioButton)charAlphaType.getSelectedToggle()){
                System.out.println("Alphabet Type : Lower Case");
                GenTests.writeLowerAlpha();
            }
            if(charAlphaMixed == (JFXRadioButton)charAlphaType.getSelectedToggle()){
                System.out.println("Alphabet Type : Mixed");
                GenTests.writeAlpha();
            }
        }
        else if(charNum==charType.getSelectionModel().getSelectedItem()){
            System.out.println("Character Type : Number");
            GenTests.writeDigitChar();
        }
        else if(charSpecChar==charType.getSelectionModel().getSelectedItem()){
            System.out.println("Character Type : Special Character");
            GenTests.writeSplchar();
        }
        else if(charPara==charType.getSelectionModel().getSelectedItem()){
            System.out.println("Character Type : Parenthesis");
            GenTests.writeParaChar();
        }
        else if(charBracket==charType.getSelectionModel().getSelectedItem()){
            System.out.println("Character Type : Bracket");
            GenTests.writeBracketChar();
        }
        else if(charVowel==charType.getSelectionModel().getSelectedItem()){
            System.out.println("Character Type : Vowel");
            GenTests.writeVowel();
        }
        else if(charCons==charType.getSelectionModel().getSelectedItem()){
            System.out.println("Character Type : Consonant");
            GenTests.writeConsonant();
        }
    }

    // input for string
    void onSelectStr(){
        if(stringWord == (JFXRadioButton)stringType.getSelectedToggle()){
            System.out.println("String Type : Word");
            if(stringWordAlpha == stringWordType.getSelectionModel().getSelectedItem()){
                System.out.println("Word Type : Alphabet");
                if(stringWordAlphaLower == (JFXRadioButton)stringWordAlphaType.getSelectedToggle()){
                    System.out.println("Alphabet Type: Lower Case");
                    if(stringWordAlphaAsc == (JFXRadioButton)stringWordAlphaOrder.getSelectedToggle()){
                        System.out.println("Order Type: Ascending");
                        GenTests.writeLowerSortWord();
                    }
                    else if(stringWordAlphaDesc == (JFXRadioButton)stringWordAlphaOrder.getSelectedToggle()){
                        System.out.println("Order Type: Descending");
                        GenTests.writeLowerDSortWord();
                    }
                    else if(stringWordAlphaNone == (JFXRadioButton)stringWordAlphaOrder.getSelectedToggle()){
                        System.out.println("Order Type: None");
                        GenTests.writeLowerWord();
                    }

                }
                else if(stringWordAlphaUpper == (JFXRadioButton)stringWordAlphaType.getSelectedToggle()){
                    System.out.println("Alphabet Type: Upper Case");
                    if(stringWordAlphaAsc == (JFXRadioButton)stringWordAlphaOrder.getSelectedToggle()){
                        System.out.println("Order Type: Ascending");
                        GenTests.writeUpperSortWord();
                    }
                    else if(stringWordAlphaDesc == (JFXRadioButton)stringWordAlphaOrder.getSelectedToggle()){
                        System.out.println("Order Type: Descending");
                        GenTests.writeUpperDSortWord();
                    }
                    else if(stringWordAlphaNone == (JFXRadioButton)stringWordAlphaOrder.getSelectedToggle()){
                        System.out.println("Order Type: None");
                        GenTests.writeUpperWord();
                    }

                }
                else if(stringWordAlphaMixed == (JFXRadioButton)stringWordAlphaType.getSelectedToggle()){
                    System.out.println("Alphabet Type: Mixed");
                    if(stringWordAlphaAsc == (JFXRadioButton)stringWordAlphaOrder.getSelectedToggle()){
                        System.out.println("Order Type: Ascending");
                        GenTests.writeSortWord();
                    }
                    else if(stringWordAlphaDesc == (JFXRadioButton)stringWordAlphaOrder.getSelectedToggle()){
                        System.out.println("Order Type: Descending");
                        GenTests.writeDSortWord();
                    }
                    else if(stringWordAlphaNone == (JFXRadioButton)stringWordAlphaOrder.getSelectedToggle()){
                        System.out.println("Order Type: None");
                        GenTests.writeWord();
                    }

                }

            }
            else if(stringWordNum == stringWordType.getSelectionModel().getSelectedItem()){
                System.out.println("Word Type : Number");
                System.out.println("Number Lower Limit : "+Integer.parseInt(stringWordNumLower.getText()));
                System.out.println("Number Upper Limit : "+Integer.parseInt(stringWordNumUpper.getText()));
                int a = Integer.parseInt(stringWordNumLower.getText());
                int b = Integer.parseInt(stringWordNumUpper.getText());
                GenTests.writeWordRange(a,b);
            }
            else if(stringWordSpecChar == stringWordType.getSelectionModel().getSelectedItem()){
                System.out.println("Word Type : Special Character");
                GenTests.writeSplWord();
            }
            else if(stringWordPara == stringWordType.getSelectionModel().getSelectedItem()){
                System.out.println("Word Type : Parenthesis");
                GenTests.writeParaWord();
            }
            else if(stringWordBracket == stringWordType.getSelectionModel().getSelectedItem()){
                System.out.println("Word Type : Bracket");
                GenTests.writeBracketWord();
            }
            else if(stringWordVowel == stringWordType.getSelectionModel().getSelectedItem()){
                System.out.println("Word Type : Vowel");
                GenTests.writeVowelWord();
            }
            else if(stringWordCons == stringWordType.getSelectionModel().getSelectedItem()){
                System.out.println("Word Type : Consonant");
                GenTests.writeConsonantWord();
            }
        }
        else if(stringPhrase == (JFXRadioButton)stringType.getSelectedToggle()){
            System.out.println("String Type : Phrase");
            GenTests.writePhrase();
        }
    }

    // input for array
    void onSelectArr(){
        if(intArray == arrayType.getSelectionModel().getSelectedItem()){
            System.out.println("Array Type : Integer");
            System.out.println("Integer Lower Limit : "+Integer.parseInt(intArrayLower.getText()));
            System.out.println("Integer Upper Limit : "+Integer.parseInt(intArrayUpper.getText()));
            int a = Integer.parseInt(intArrayLower.getText());
            int b = Integer.parseInt(intArrayUpper.getText());
            if(intArraySort.isSelected()){
                if(intArrayAsc == (JFXRadioButton)intArraySortType.getSelectedToggle()){
                    System.out.println("Order Type : Ascending");
                    GenTests.writeSortIntArray(a,b);
                }
                else if(intArrayDesc == (JFXRadioButton)intArraySortType.getSelectedToggle()){
                    System.out.println("Order Type : Descending");
                    GenTests.writeDSortIntArray(a,b);
                }
            }
            else{
                System.out.println("Order Type : Unsorted");
                GenTests.writeIntArray(a,b);
            }
        }
        else if(stringArray == arrayType.getSelectionModel().getSelectedItem()){
            System.out.println("Array Type : String");

            System.out.println("String Type : Alphabet");
            if(stringArrayAlphaLower == (JFXRadioButton) stringArrayAlphaType.getSelectedToggle()){
                System.out.println("Alphabet Type : Lower Case");
                GenTests.writeLowerStringArray();
            }
            else if(stringArrayAlphaUpper == (JFXRadioButton) stringArrayAlphaType.getSelectedToggle()){
                System.out.println("Alphabet Type : Upper Case");
                GenTests.writeUpperStringArray();
            }
            else if(stringArrayAlphaMixed == (JFXRadioButton) stringArrayAlphaType.getSelectedToggle()){
                System.out.println("Alphabet Type : Mixed");
                GenTests.writeStringArray();
            }

        }
        else if(twoDArray == arrayType.getSelectionModel().getSelectedItem()){
            System.out.println("Array Type : Matrix");
            int a = Integer.parseInt(twoDArrayLower.getText());
            int b = Integer.parseInt(twoDArrayUpper.getText());
            if(twoDArraySqr == (JFXRadioButton)twoDArrayType.getSelectedToggle()){
                System.out.println("Matrix Type : Square");
                GenTests.writeMat(a,b,"square");
            }
            else if(twoDArrayRec == (JFXRadioButton)twoDArrayType.getSelectedToggle()){
                System.out.println("Matrix Type : Rectangle");
                GenTests.writeMat(a,b,"Rectangle");
            }
            System.out.println("Values Lower Limit : "+Integer.parseInt(twoDArrayLower.getText()));
            System.out.println("Values Upper Limit : "+Integer.parseInt(twoDArrayUpper.getText()));
        }
    }

}