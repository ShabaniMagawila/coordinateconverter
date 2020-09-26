/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Shabani Magawila
 */
public class Converter extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("convert.fxml"));
        stage.initStyle(StageStyle.DECORATED);
        stage.setResizable(false);
        stage.setHeight(380);
        stage.setTitle("Coordinate Converter");
        stage.getIcons().add(new Image("converter/img/icons8_longitude_40px_1.png"));
        stage.setWidth(900);
        Scene scene = new Scene(root);
        
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
