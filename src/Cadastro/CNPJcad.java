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
public class CNPJcad extends CadastroBd {
     public static void incluirDados(model.CNPJmod cliente_cnpj) throws Exception {
        try {
            String cmdsql = "INSERT INTO cliente_cnpj (cnpj_cliente,nome_fantasia_cliente,razao_social_cliente,legal_nature) VALUES (" + cliente_cnpj.getCnpj_cliente() + ",'" + cliente_cnpj.getNome_fantasia_cliente() + "','" + cliente_cnpj.getRazao_social_cliente() + "','" + cliente_cnpj.getLegal_nature() + "')";
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    public static void alterarDados(model.CNPJmod cliente_cnpj) throws Exception {
        try {
            String cmdsql = "UPDATE cliente_cnpj SET nome_fantasia_cliente = '" + cliente_cnpj.getNome_fantasia_cliente() +  "'  WHERE  cnpj_cliente = " + cliente_cnpj.getCnpj_cliente();
           
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    public static void excluirDados(model.CNPJmod cliente_cnpj) throws Exception {
        try {
            String cmdsql = "DELETE FROM cliente_cnpj WHERE cnpj_cliente = " + cliente_cnpj.getCnpj_cliente();
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    
    
    
}
