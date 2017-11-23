package org.shadowfest.identificador;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

/**
 *
 * @author Lucas Sombra!
 */

public class GerenciamentoDeFestas extends Application {
 
    private static Stage stage;
    
    private static Scene Menu;
    private static Scene telaAluno;
    private static Scene telaAdmin;
    private static Scene cadasAdmin;
    private static Scene cadasAluno;
    private static Scene cadasProfessor;
    private static Scene cadasCurso;
    private static Scene cadasProva;
    private static Scene cadasTurma;
    private static Scene telaProfessor;
    
   @Override
   public void  start (Stage primaryStage) throws Exception{
       stage = primaryStage;
       
       Parent fxmlMenu  = FXMLLoader.load(getClass().getResource("Menu.fxml"));
       Menu = new Scene(fxmlMenu, 600, 400);
       
       Parent fxmlAluno  = FXMLLoader.load(getClass().getResource("TelaAluno.fxml"));
       telaAluno = new Scene(fxmlAluno, 600, 400);
       
       Parent fxmlProfessor  = FXMLLoader.load(getClass().getResource("TelaProfessor.fxml"));
       telaProfessor = new Scene(fxmlProfessor, 600, 400);
       
       Parent fxmlAdmin = FXMLLoader.load(getClass().getResource("TelaAdmin.fxml"));
       telaAdmin = new Scene(fxmlAdmin, 600, 400);
       
       Parent fxmlCadasAluno  = FXMLLoader.load(getClass().getResource("TelaCadasAluno.fxml"));
       cadasAluno = new Scene(fxmlCadasAluno, 600, 400);
       
       primaryStage.setScene(Menu);
       primaryStage.show();
   }
   
   
   public static void changeScreen(String scr){
       switch(scr){
       case "Menu":
           stage.setScene(Menu);
          break;
       case "tAluno":
            stage.setScene(telaAluno);
            break;
        case "tAdmin":
            stage.setScene(telaAdmin);
            break;
        case "tProfessor":
            stage.setScene(telaProfessor);
            break;
        case "tCadasAluno":
            stage.setScene(cadasAluno);
            break;
         case "tCadasAdmin":
            stage.setScene(cadasAdmin);
            break;
       }
       }
   
   public static void main(String[ ] args){
       launch(args);
   }
}