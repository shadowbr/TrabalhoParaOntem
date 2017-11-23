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
import javafx.scene.control.TextField;
import org.shadowfest.identificador.Arquivos;
import org.shadowfest.identificador.Cliente;
import org.shadowfest.identificador.GerenciamentoDeFestas;

/**
 * FXML Controller class
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class IngressoController implements Initializable {

    @FXML
    private Button ButtonComprarIngresso;
    @FXML
    private TextField textNome;
    @FXML
    private TextField textNEmail;
    @FXML
    private TextField textCPF;
    @FXML
    private TextField textSexo;
    @FXML
    private TextField textNFesta;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
     @FXML
    private void ChangeToMenu(ActionEvent e){
        Cliente c = new Cliente();
        c.setNome(textNome.getText());
        c.setEmail(textNEmail.getText());
        c.setCpf(textCPF.getText());
        c.setSexo(textSexo.getText());
        
        //for ()
        
        System.out.println("*-*");
       GerenciamentoDeFestas.changeScreen("Menu");
    }
    
}
