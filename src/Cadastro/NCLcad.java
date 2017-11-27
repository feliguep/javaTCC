/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastro;

/**
 *
 * @author Guedes
 */
public class NCLcad extends CadastroBd{
     public static void incluirDados(model.NCLmod ncl_conj) throws Exception {
        try {
         String cmdsql = "INSERT INTO ncl_conj (ncl_conj,descricao_conj) VALUES (" + ncl_conj.getNcl_conj() + ",'" + ncl_conj.getDescricao_conj() + "')";
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    public static void alterarDados(model.NCLmod ncl_conj) throws Exception {
        try {
            String cmdsql = "UPDATE ncl_conj SET descricao_conj = '" + ncl_conj.getDescricao_conj() +  "'  WHERE ncl_conj = " + ncl_conj.getNcl_conj();
           
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    public static void excluirDados(model.NCLmod ncl_conj) throws Exception {
        try {
            String cmdsql = "DELETE FROM ncl_conj WHERE ncl_conj = " +  ncl_conj.getNcl_conj();
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
      
    
    
}
