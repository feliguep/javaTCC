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
public class CPFcad extends CadastroBd{
    public static void incluirDados(model.CPFmod cliente_cpf) throws Exception {
        try {
            String cmdsql = "INSERT INTO cliente_cpf (cpf_cliente,nome_cliente,legal_nature) VALUES (" + cliente_cpf.getCpf_cliente() + ",'" + cliente_cpf.getNome_cliente() + "','" + cliente_cpf.getLegal_nature() + "')";
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    public static void alterarDados(model.CPFmod cliente_cpf) throws Exception {
        try {
            String cmdsql = "UPDATE cliente_cpf SET nome_cliente = '" + cliente_cpf.getNome_cliente() +  "'  WHERE cpf_cliente = " + cliente_cpf.getCpf_cliente();
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    public static void excluirDados(model.CPFmod cliente_cpf) throws Exception {
        try {
            String cmdsql = "DELETE FROM cliente_cpf WHERE cliente_cpf = " + cliente_cpf.getCpf_cliente();
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    
}
