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
public class Parceirocad extends CadastroBd{
     public static void incluirDados(model.Parceiromod parceiro) throws Exception {
        try {
            String cmdsql = "INSERT INTO parceiro (codigo_indica,nome_parceiro,telefone_parceiro,senha,email_parceiro) VALUES (" + parceiro.getCodigo_indica() + ",'" + parceiro.getNome_parceiro() + "','" + parceiro.getTelefone_parceiro() + "','" + parceiro.getSenha() + "','" + parceiro.getEmail_parceiro() + "')";
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    public static void alterarDados(model.Parceiromod parceiro) throws Exception {
        try {
            String cmdsql = "UPDATE parceiro SET nome_parceiro = '" + parceiro.getNome_parceiro() +  "'  WHERE codigo_indica = " + parceiro.getCodigo_indica();
           
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    public static void excluirDados(model.Parceiromod parceiro) throws Exception {
        try {
            String cmdsql = "DELETE FROM parceiro WHERE codigo_indica = " + parceiro.getCodigo_indica();
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    
    
    
}