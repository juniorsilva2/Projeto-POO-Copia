/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Cleuton
 * criando classe abstrata usuario
 */
public abstract class Usuario{
    
    private String nome;
    private String cpf;
    private String conta;
    private String senha;
     
    public String getNome(){
        return nome;
    }
    
    public  String getCPF(){
        return cpf;
    }

    public String getConta(){
        return conta;
    }
    
    public String getSenha(){
        return senha;
    }
    
    void setNome(String usuario){
        this.nome = usuario;
    }
   
    void setSenha(String novaSenha){
        this.senha= novaSenha;
    }
    
     void setConta(String novaConta){
        this.conta= novaConta;
    }
     
     void setCPF(String CPF){
         this.cpf= CPF;
     }
}

