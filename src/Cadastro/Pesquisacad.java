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
public class Pesquisacad extends CadastroBd {
       public static void incluirDados(model.PesquisaMod pesquisa_viabilidade) throws Exception {
        try {
            String cmdsql = "INSERT INTO pesquisa_viabilidade (cpf_cnpj_pesquisa,telefone_pesquisa,nome_pesquisa,marca_pesquisa,atividade_pesquisa,email_pesquisa,viabilty,data_pesquisa,obs_pesquisa) VALUES (" + pesquisa_viabilidade.getCpf_cnpj_pesquisa() + ",'" + pesquisa_viabilidade.getTelefone_pesquisa() + "','" + pesquisa_viabilidade.getNome_pesquisa() + "','" + pesquisa_viabilidade.getMarca_pesquisa() + "','" + pesquisa_viabilidade.getAtividade_pesquisa() + "','" + pesquisa_viabilidade.getEmail_pesquisa() + "','" + pesquisa_viabilidade.getViabilty() + "','" + pesquisa_viabilidade.getData_pesquisa() + "','" + pesquisa_viabilidade.getObs_pesquisa() + "')";
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    public static void alterarDados(model.PesquisaMod pesquisa_viabilidade) throws Exception {
        try {
            String cmdsql = "UPDATE pesquisa_viabilidade SET telefone_pesquisa = '" + pesquisa_viabilidade.getTelefone_pesquisa() +  "'  WHERE cpf_cnpj_pesquisa = " + pesquisa_viabilidade.getCpf_cnpj_pesquisa();
           
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    public static void excluirDados(model.PesquisaMod pesquisa_viabilidade) throws Exception {
        try {
            String cmdsql = "DELETE FROM pesquisa_viabilidade WHERE cpf_cnpj_pesquisa = " + pesquisa_viabilidade.getCpf_cnpj_pesquisa();
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    
    
    
}