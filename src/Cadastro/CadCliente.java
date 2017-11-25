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
public class CadCliente {
    
     public static void incluirDados(model.ModCliente cadastro_cliente) throws Exception {
        try {
            String cmdsql = "INSERT INTO cadastro_cliente (id_cliente,respon_nome,endereco_cliente,complemento_cliente,cep_cliente,estado_cliente,cidade_cliente,telefone_cliente,email_login_cliente,senha) VALUES (" + cadastro_cliente.getId_cliente() + ",'" + cadastro_cliente.getRespon_nome() + "','" + cadastro_cliente.getEndereco_cliente() + "','" + cadastro_cliente.getComplemento_cliente() + "','" + cadastro_cliente.getCep_cliente() + "','" + cadastro_cliente.getEstado_cliente() + "','" + cadastro_cliente.getCidade_cliente() + "','" + cadastro_cliente.getTelefone_cliente() + "','" + cadastro_cliente.getEmail_login_cliente() + "','" + cadastro_cliente.getSenha() + "')";
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    public static void alterarDados(model.ModCliente cadastro_cliente) throws Exception {
        try {
            String cmdsql = "UPDATE cadastro_cliente SET respon_nome = '" + cadastro_cliente.getRespon_nome() +  "'  WHERE id_cliente = " + cadastro_cliente.getId_cliente();
           
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    public static void excluirDados(model.ModCliente cadastro_cliente) throws Exception {
        try {
            String cmdsql = "DELETE FROM cadastro_cliente WHERE id_cliente = " + cadastro_cliente.getId_cliente();
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    
    
}
