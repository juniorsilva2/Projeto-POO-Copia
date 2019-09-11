/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.awt.TextField;
import java.util.Scanner;
import modelos.Usuario;

/**
 *
 * @author Cleuton
 * 
 * criando o cadastro do usuario com os campos de informações de nome,cpf,conta 
 * e senha
 */
public class Cadastro extends Usuario{

   
    public void cadastrarNome(String nome){
        super.setNome(nome);
    }
    
    private void cadastrarSenha(String senha,String confSenha){
        if(confirmarSenha(senha,confSenha)==true){
            super.setSenha(confSenha);
        }
    }
    
    public void cadastrarConta(String conta){
        super.setConta(conta);
    }
    
    public void cadastrarCPF(String cpf){
        super.setCPF(cpf);
    }    
    
    /* verifica se as senhas coincidem */
    public boolean confirmarSenha(String senha,String confirmacao){
        
        if(senha == null ? confirmacao == null : senha.equals(confirmacao)){
            return true;
        }
        else{
            return false;
        }
    }
   
    public void cadastrarCPF(TextField cpfInput) {
        throw new UnsupportedOperationException("Erro  ao cadastrar"); //To change body of generated methods, choose Tools | Templates.
    }
  
}

    