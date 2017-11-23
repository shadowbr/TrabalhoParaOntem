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
public class FestaController implements Initializable {

    @FXML
    private Button ButtonCadastrarFesta;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
     @FXML
    protected void ChangeToMenu(ActionEvent e){
        System.out.println("*-*");
       GerenciamentoDeFestas.changeScreen("Menu");
    }
    
}
