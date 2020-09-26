/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

import com.gluonhq.charm.glisten.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author Shabani Magawila
 */
public class convertController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField txt2;
    @FXML
    private TextField txt1;
    @FXML
    private TextField txt3;
    @FXML
    private TextArea display;
    
    private void handleButtonAction(ActionEvent event) {
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private void handleButtonAction(MouseEvent event) {
        
    }

    @FXML
    private void convertButton(MouseEvent event) {
        float num1 = Float.parseFloat(txt1.getText());
        float num2 = Float.parseFloat(txt2.getText());
        float num3 = Float.parseFloat(txt3.getText());
        
        
        float calc = -(-(num1) + (num2/60) + (num3/3600));
        display.setText(String.valueOf(calc));
    }
    
}
