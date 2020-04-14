/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

package it.polito.tdp.spellchecker;

import java.awt.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

public class FXMLController {

    @FXML
    private ChoiceBox<?> btnChoice;

    @FXML
    private TextArea txtnput;

    @FXML
    private Button btnCheck;

    @FXML
    private TextArea txtWrongWords;

    @FXML
    private Text txtCountErrors;

    @FXML
    private Button btnClear;

    @FXML
    private Text txtTimeCheck;
    
    

    @FXML
    void doClearText(ActionEvent event) {

    }

    @FXML
    void doSpellCheck(ActionEvent event) {

    }

}


