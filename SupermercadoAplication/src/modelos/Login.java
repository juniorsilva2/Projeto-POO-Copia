/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Cleuton
 * 
 * procurando o nome e a senha que serao informados apartir de uma lista de 
 * cadastros linkada. 
 */
public class Login{

    /**
     *
     * @param lista
     * @param campoConta
     * @param campoSenha
     * @return 
     */
    public Cadastro checar(LinkedList lista,String campoConta,String campoSenha){
        
        for (Iterator it = lista.iterator(); it.hasNext();) {
            Cadastro a;
            a = (Cadastro) it.next();
  
            String conta= a.getConta();

            String senha= a.getSenha();
            
            if((campoConta == null ? conta == null : campoConta.equals(conta))&&(campoSenha == null ? senha == null : campoSenha.equals(senha))){
                return a;
            }
        }
        return null;
     }

    
     public void logar(LinkedList lista){
        System.out.println("Login");
        System.out.println("infomrme a conta");
        Scanner scanner= new Scanner(System.in);
        String campoConta= scanner.nextLine();
        
        System.out.println("infomrme a senha");
        scanner= new Scanner(System.in);
        String campoSenha= scanner.nextLine();
        
        Cadastro a=checar(lista,campoConta,campoSenha);
        
        if(a!=null){
            System.out.println("imprimindo dados da da sua conta");
            System.out.println(a.getNome());
            System.out.println(a.getCPF());
        }
           else{
                System.out.println("Conta e senha incorretas ou usuario nao cadastrado no sistema!");
            }
        
     }
    
 
   
}
