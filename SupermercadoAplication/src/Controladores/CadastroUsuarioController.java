/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import ArquivoDao.UsuarioDao;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import modelos.Cadastro;


/**
 * FXML Controller class
 *
 * @author Cleuton
 */
public class CadastroUsuarioController implements Initializable {

    @FXML private TextField senhaInput;

    @FXML private TextField nomeInput;

    @FXML private TextField cpfInput;

    @FXML private Button cadastrarButton;

    @FXML private TextField confSenhaInput;

    @FXML private Button voltarButton;

    @FXML private TextField emailInput;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    
        cadastrarButton.setOnAction((ActionEvent e) -> {
            Cadastro novo= new Cadastro();
            
            
            String cpf = cpfInput.getText();
            String senha = senhaInput.getText();
            String email = emailInput.getText();
            String nome = nomeInput.getText();
            String confSenha = confSenhaInput.getText();
            
            novo.cadastrarNome(nome);
            novo.cadastrarCPF(cpf);
            novo.cadastrarConta(email);
            novo.confirmarSenha(senha,confSenha);
            
            UsuarioDao usuarioArq = new UsuarioDao();
                
  
            try {
                if(usuarioArq.salvarUsuario(novo) == true){
                    JOptionPane.showMessageDialog(null,"Usuário"+ novo.getConta()+"Salvo com sucesso");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Usuário"+novo.getConta()+"já existe");
                }
            } catch (IOException ex) {
                Logger.getLogger(CadastroUsuarioController.class.getName()).log(Level.SEVERE, null, ex);
            }
      

        });
    }
    
}
