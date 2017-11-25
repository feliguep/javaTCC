
package Cadastro;

import static cadastro.Cadastro.manterDados;

/**
 *
 * @author Guedes
 */
public class CadParceiro {
     public static void incluirDados(model.ModParceiro parceiro) throws Exception {
        try {
            String cmdsql = "INSERT INTO parceiro (codigo_indica,nome_parceiro,telefone_parceiro,senha,email_parceiro) VALUES (" + parceiro.getCodigo_indica() + ",'" + parceiro.getNome_parceiro() + "','" + parceiro.getTelefone_parceiro() + "','" + parceiro.getSenha() + "','" + parceiro.getEmail_parceiro() + "')";
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    public static void alterarDados(model.ModParceiro parceiro) throws Exception {
        try {
            String cmdsql = "UPDATE parceiro SET nome_parceiro = '" + parceiro.getNome_parceiro() +  "'  WHERE codigo_indica = " + parceiro.getCodigo_indica();
           
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    public static void excluirDados(model.ModParceiro parceiro) throws Exception {
        try {
            String cmdsql = "DELETE FROM parceiro WHERE codigo_indica = " + parceiro.getCodigo_indica();
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    
    
}
