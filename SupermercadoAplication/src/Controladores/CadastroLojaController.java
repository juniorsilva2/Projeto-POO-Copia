/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Cleuton
 */
public class CadastroLojaController implements Initializable {

    
     @FXML private javafx.scene.control.TextField telefoneInput;

    @FXML private javafx.scene.control.TextField nomeLojaInput;

    @FXML private javafx.scene.control.TextField proprietarioInput;

    @FXML private javafx.scene.control.Button cadastrarButton;

    @FXML private javafx.scene.control.TextField cnpjInput;

    @FXML private javafx.scene.control.Button voltarButton;
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
