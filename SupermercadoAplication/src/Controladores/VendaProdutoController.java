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
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Cleuton
 */
public class VendaProdutoController implements Initializable {

    
    @FXML private TextField codigoInput;

    @FXML private TextField notaInput;

    @FXML private Button atualizarButton;

    @FXML private TextField QuantItensInput;

    @FXML private Button voltarButton;

    @FXML private TextField valorVendaInput;
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
