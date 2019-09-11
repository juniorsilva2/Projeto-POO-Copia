/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;
/**
 *
 * @author Cleuton
 */
import java.util.Date;


public class Estoque extends Produto{
    
    private int quantidade=0;
    private Date DatAquisicao;
 
    public Estoque(String nome,float preco,int quantidade,Date DatAquisicao){
       this.quantidade=quantidade;
       this.DatAquisicao=DatAquisicao;
    }
   
   public void setQuantidade(int quantidade)
   {
       this.quantidade=quantidade;
   }

    public void setDatAquisacao(Date aquisicao){
        this.DatAquisicao=aquisicao;
   }
    
    public int getQuantidade(){
        return quantidade;
    }
    
    public Date getDatAquisicao(){
        return DatAquisicao;
    }
   
}

