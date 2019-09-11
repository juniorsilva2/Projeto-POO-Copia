/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Junior Silva
 */
public class Loja {
    private String nome;
    private int cnpj;
    private String telefone;
    private String proprietario;
    
    public String getNome(){
        return nome;
    }
    
    public int getCnpj(){
        return cnpj;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public String getProprietario(){
        return proprietario;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setCnpj(int cnpj){
        this.cnpj = cnpj;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public void setProprietario(String proprietario){
        this.proprietario = proprietario;
    }
}