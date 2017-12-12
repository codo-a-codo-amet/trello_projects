/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinetest;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author alumno
 */
public class Controller implements IViewEventListener{
    protected MainView view;

    public Controller(Stage primaryStage) {
        view = new MainView();
        view.AddToList(this);
        Pane root = new Pane();
        
        
        primaryStage.setTitle("Cine Java");
           final VBox layout = new VBox(10);
        layout.setStyle("-fx-background-color: cornsilk; -fx-padding: 10;");
        layout.getChildren().addAll(
                view.getMyBrowser()
        );
        VBox.setVgrow(view.getMyBrowser(), Priority.ALWAYS);
        root.getChildren().add(0, layout);
        Scene scene = new Scene(root);
        primaryStage.setScene( scene);
        primaryStage.show();
      
       
    }
    
    
    @Override
    public void listen(Event event) {
        //Event ae = (Event)event.getTarget();
        String email = view.GetElementByID("user_name");
    }
    
}
