package org.shadowfest.identificador;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;
import org.shadowfest.telas.CategoriaController;
import org.shadowfest.telas.FestaController;
import org.shadowfest.telas.IngressoController;
import org.shadowfest.telas.MenuController;
import org.shadowfest.telas.PontosController;

/**
 *
 * @author Lucas Sombra!
 */

public class GerenciamentoDeFestas extends Application {
 
    private static Stage stage;
    
    private static Scene Menu;
    private static Scene Categoria;
    private static Scene Ingresso;
    private static Scene Festa;
    private static Scene Pontos;
   
    
   @Override
   public void  start (Stage primaryStage) throws Exception{
       stage = primaryStage;
       
       Parent fxmlMenu  = FXMLLoader.load(MenuController.class.getResource("Menu.fxml"));
       Menu = new Scene(fxmlMenu, 600, 400);
       
       Parent fxmlCategoria  = FXMLLoader.load(CategoriaController.class.getResource("Categoria.fxml"));
       Categoria = new Scene(fxmlCategoria, 600, 400);
       
       Parent fxmlFesta  = FXMLLoader.load(FestaController.class.getResource("Festa.fxml"));
       Festa = new Scene(fxmlFesta, 600, 400);
       
       Parent fxmlIngresso = FXMLLoader.load(IngressoController.class.getResource("Ingresso.fxml"));
       Ingresso = new Scene(fxmlIngresso, 600, 400);
       
       Parent fxmlPontos  = FXMLLoader.load(PontosController.class.getResource("Pontos.fxml"));
       Pontos = new Scene(fxmlPontos, 600, 400);
           
       primaryStage.setScene(Menu);
       primaryStage.show();
   }
   
   
   public static void changeScreen(String scr){
       switch(scr){
       case "Menu":
           stage.setScene(Menu);
          break;
       case "Categoria":
            stage.setScene(Categoria);
            break;
        case "Festa":
            stage.setScene(Festa);
            break;
        case "Ingresso":
            stage.setScene(Ingresso);
            break;
        case "Pontos":
            stage.setScene(Pontos);
            break;
       }
       }
   
   public static void main(String[ ] args){
       launch(args);
   }
}