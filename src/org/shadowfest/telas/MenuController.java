/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shadowfest.telas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import org.shadowfest.identificador.GerenciamentoDeFestas;

/**
 * FXML Controller class
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MenuController implements Initializable {

    @FXML
    private Button ButtonIngresso;
    @FXML
    private Button ButtonFesta;
    @FXML
    private Button ButtonCategoria;
    @FXML
    private Button ButtonPontos;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    protected void ChangeToCategoria(ActionEvent e){
        System.out.println("*-*");
       GerenciamentoDeFestas.changeScreen("Categoria");
    }
    
    @FXML
    protected void ChangeToFesta(ActionEvent e){
        System.out.println("*-*");
       GerenciamentoDeFestas.changeScreen("Festa");
    }
    
    @FXML
    protected void ChangeToIngresso(ActionEvent e){
        System.out.println("*-*");
       GerenciamentoDeFestas.changeScreen("Ingresso");
    }
    
    @FXML
    protected void ChangeToPontos(ActionEvent e){
        System.out.println("*-*");
       GerenciamentoDeFestas.changeScreen("Pontos");
    }
    
}
