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
public class NCLSubcad extends CadastroBd{
     public static void incluirDados(model.NCLSubmod ncl_sub_conj) throws Exception {
        try {
         String cmdsql = "INSERT INTO ncl_sub_conj (ncl_subconj,descricao_sub) VALUES (" + ncl_sub_conj.getNcl_subconj() + ",'" + ncl_sub_conj.getDescricao_sub() + "')";
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    public static void alterarDados(model.NCLSubmod ncl_sub_conj) throws Exception {
        try {
            String cmdsql = "UPDATE ncl_sub_conj SET descricao_sub = '" + ncl_sub_conj.getDescricao_sub() +  "'  WHERE ncl_subconj = " + ncl_sub_conj.getNcl_subconj();
           
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    public static void excluirDados(model.NCLSubmod ncl_sub_conj) throws Exception {
        try {
            String cmdsql = "DELETE FROM ncl_sub_conj WHERE ncl_subconj = " +  ncl_sub_conj.getNcl_subconj();
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    
}
