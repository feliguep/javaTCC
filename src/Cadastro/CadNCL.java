/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastro;

import static cadastro.Cadastro.manterDados;

/**
 *
 * @author Guedes
 */
public class CadNCL extends CadMarca {
    
    public static void incluirDados(model.ModNCL ncl_conj) throws Exception {
        try {
         String cmdsql = "INSERT INTO ncl_conj (ncl_conj,descricao_conj) VALUES (" + ncl_conj.getNcl_conj() + ",'" + ncl_conj.getDescricao_conj() + "')";
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    public static void alterarDados(model.ModNCL ncl_conj) throws Exception {
        try {
            String cmdsql = "UPDATE ncl_conj SET descricao_conj = '" + ncl_conj.getDescricao_conj() +  "'  WHERE ncl_conj = " + ncl_conj.getNcl_conj();
           
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    public static void excluirDados(model.ModNCLSub ncl_sub_conj) throws Exception {
        try {
            String cmdsql = "DELETE FROM ncl_sub_conj WHERE ncl_subconj = " +  ncl_sub_conj.getNcl_subconj();
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
      
    
}
