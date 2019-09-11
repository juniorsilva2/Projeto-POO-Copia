/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArquivoDao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import modelos.Cadastro;

/**
 *
 * @author Junior Silva
 */
public class UsuarioDao {
    
    public boolean salvarUsuario(Cadastro cadastro) throws FileNotFoundException, IOException{
       
            File usuario = new File(cadastro.getConta());
            FileWriter usuarioModif = new FileWriter(cadastro.getConta(), false);
            
            if (usuario.exists()) {
                if (usuario.isFile()) {
                   return false;
                }
           
            }
            
            else{
                usuario.canWrite();
                usuarioModif.write(cadastro.getCPF());
                usuarioModif.write(cadastro.getConta());
                usuarioModif.write(cadastro.getNome());
                usuarioModif.write(cadastro.getSenha());
                
                
                
                return true;
            }
            
            usuarioModif.close(); 
        return false;
          
        }
    }

    
