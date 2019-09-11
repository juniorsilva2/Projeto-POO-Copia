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
import modelos.Loja;
import modelos.Produto;

/**
 *
 * @author Junior Silva
 */
public class LojaDao {
    public void salvarProdutoCadastro(Loja loja) throws FileNotFoundException, IOException{
        try (FileOutputStream arq = new FileOutputStream("C:\\Users\\Junior Silva\\Desktop\\CLEUTON\\NetBeansProjects\\SupermercadoAplication\\src\\lojas\\loja.dat")) {
            DataOutputStream gravarArq = new DataOutputStream(arq);
            
            String nome = loja.getNome();
            int cnpj = loja.getCnpj();
            String telefone = loja.getTelefone();
            String proprietario = loja.getProprietario();
            
            
            gravarArq.writeUTF(nome);
            gravarArq.writeInt(cnpj);
            gravarArq.writeUTF(telefone);
            gravarArq.writeUTF(proprietario);
        }
    }
    
}
