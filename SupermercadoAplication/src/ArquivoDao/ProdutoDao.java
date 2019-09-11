/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArquivoDao;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import modelos.Cadastro;
import modelos.Produto;

/**
 *
 * @author Junior Silva
 */
public class ProdutoDao {
    
    public class UsuarioDao {
    
    public void salvarProdutoCompra(Produto produto) throws FileNotFoundException, IOException{
        try (FileOutputStream arq = new FileOutputStream("C:\\Users\\Junior Silva\\Desktop\\CLEUTON\\NetBeansProjects\\SupermercadoAplication\\src\\produtos\\produto.dat")) {
            DataOutputStream gravarArq = new DataOutputStream(arq);
            
            int quantidade = produto.getQuantidade();
            String descricao = produto.getDescricao();
            float preco = produto.getPreco();
            
            
            
            gravarArq.writeInt(quantidade);
            gravarArq.writeUTF(descricao);
            gravarArq.writeFloat(preco);
        }
        }
    }
    
    public void salvarProdutoCadastro(Produto produto) throws FileNotFoundException, IOException{
        try (FileOutputStream arq = new FileOutputStream("C:\\Users\\Junior Silva\\Desktop\\CLEUTON\\NetBeansProjects\\SupermercadoAplication\\src\\produtos\\produto.dat")) {
            DataOutputStream gravarArq = new DataOutputStream(arq);
            
            String nome = produto.getNome();
            String descricao = produto.getDescricao();
            int codigo = produto.getCodProduto();
            
            
            
            gravarArq.writeUTF(nome);
            gravarArq.writeUTF(descricao);
            gravarArq.writeInt(codigo);
        }
    }
    
    public void salvarProdutoVenda(Produto produto) throws FileNotFoundException, IOException{
        try (FileOutputStream arq = new FileOutputStream("C:\\Users\\Junior Silva\\Desktop\\CLEUTON\\NetBeansProjects\\SupermercadoAplication\\src\\produtos\\produto.dat")) {
            DataOutputStream gravarArq = new DataOutputStream(arq);
            
            String notaFiscal = produto.getNotaFiscal();
            float ValorUniRevenda = produto.getValorUnitRevenda();
            float preco = produto.getPreco();
            int quantidade = produto.getQuantidade();
            float valorNota = produto.getValorNota();
            float totalVenda = produto.getTotalVenda();
            
            
            gravarArq.writeInt(quantidade);
            gravarArq.writeFloat(ValorUniRevenda);
            gravarArq.writeFloat(preco);
            gravarArq.writeInt(quantidade);
            gravarArq.writeFloat(valorNota);
            gravarArq.writeFloat(totalVenda);
        }
    }
}
