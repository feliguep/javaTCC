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
public class Admincad extends CadastroBd {
    public static void incluirDados(model.Adminmod cadastro_admin) throws Exception {
        try {
            String cmdsql = "INSERT INTO cadastro_admin (cod_admin,email_login_adm,senha) VALUES (" + cadastro_admin.getCod_admin() + ",'" + cadastro_admin.getEmail_login_adm() + "','" + cadastro_admin.getSenha() + "')";
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    public static void alterarDados(model.Adminmod cadastro_admin) throws Exception {
        try {
            String cmdsql = "UPDATE cadastro_admin SET email_login_adm = '" + cadastro_admin.getEmail_login_adm() +  "'  WHERE cod_admin = " + cadastro_admin.getCod_admin();
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    public static void excluirDados(model.Adminmod cadastro_admin) throws Exception {
        try {
            String cmdsql = "DELETE FROM cadastro_admin WHERE cod_admin = " + cadastro_admin.getCod_admin();
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    public static String pesquisarDados(int cod_admin) throws Exception {
        try {
            String cmdsql = "SELECT *FROM cadastro_admin WHERE  cod_admin = " +  cod_admin;
            return (consultarDados(cmdsql));
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    
}
