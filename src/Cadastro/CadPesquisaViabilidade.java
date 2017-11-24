
package Cadastro;

import static cadastro.Cadastro.manterDados;

/**
 *
 * @author Guedes
 */
public class CadPesquisaViabilidade extends Cadastro {
     public static void incluirDados(modelo.ModPesquisa pesquisa_viabilidade) throws Exception {
        try {
            String cmdsql = "INSERT INTO pesquisa_viabilidade (cpf_cnpj_pesquisa,telefone_pesquisa,nome_pesquisa,marca_pesquisa,atividade_pesquisa,email_pesquisa,viabilty,data_pesquisa,obs_pesquisa) VALUES (" + pesquisa_viabilidade.getcpf_cnpj_pesquisa() + ",'" + pesquisa_viabilidade.gettelefone_pesquisa() + "','" + pesquisa_viabilidade.getnome_pesquisa() + "','" + pesquisa_viabilidade.getmarca_pesquisa() + "','" + pesquisa_viabilidade.getatividade_pesquisa() + "','" + pesquisa_viabilidade.getemail_pesquisa() + "','" + pesquisa_viabilidade.getviabilty() + "','" + pesquisa_viabilidade.getdata_pesquisa() + "','" + pesquisa_viabilidade.getobs_pesquisa() + "')";
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    public static void alterarDados(modelo.ModPesquisa pesquisa_viabilidade) throws Exception {
        try {
            String cmdsql = "UPDATE pesquisa_viabilidade SET telefone_pesquisa = '" + pesquisa_viabilidade.gettelefone_pesquisa() +  "'  WHERE cpf_cnpj_pesquisa = " + pesquisa_viabilidade.getcpf_cnpj_pesquisa();
            String cmdsql = "UPDATE pesquisa_viabilidade SET nome_pesquisa = '" + pesquisa_viabilidade.getnome_pesquisa() +  "'  WHERE cpf_cnpj_pesquisa = " + pesquisa_viabilidade.getcpf_cnpj_pesquisa();
            String cmdsql = "UPDATE pesquisa_viabilidade SET marca_pesquisa = '" + pesquisa_viabilidade.getmarca_pesquisa() +  "'  WHERE cpf_cnpj_pesquisa = " + pesquisa_viabilidade.getcpf_cnpj_pesquisa();
            String cmdsql = "UPDATE pesquisa_viabilidade SET atividade_pesquisa = '" + pesquisa_viabilidade.getatividade_pesquisa() +  "'  WHERE cpf_cnpj_pesquisa = " + pesquisa_viabilidade.getcpf_cnpj_pesquisa();
            String cmdsql = "UPDATE pesquisa_viabilidade SET email_pesquisa = '" + pesquisa_viabilidade.getemail_pesquisa() +  "'  WHERE cpf_cnpj_pesquisa = " + pesquisa_viabilidade.getcpf_cnpj_pesquisa();
            String cmdsql = "UPDATE pesquisa_viabilidade SET viabilty = '" + pesquisa_viabilidade.getviabilty() +  "'  WHERE cpf_cnpj_pesquisa = " + pesquisa_viabilidade.getcpf_cnpj_pesquisa();
            String cmdsql = "UPDATE pesquisa_viabilidade SET data_pesquisa = '" + pesquisa_viabilidade.getdata_pesquisa() +  "'  WHERE cpf_cnpj_pesquisa = " + pesquisa_viabilidade.getcpf_cnpj_pesquisa();
            String cmdsql = "UPDATE pesquisa_viabilidade SET obs_pesquisa = '" + pesquisa_viabilidade.getobs_pesquisa() +  "'  WHERE cpf_cnpj_pesquisa = " + pesquisa_viabilidade.getcpf_cnpj_pesquisa();
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    public static void excluirDados(modelo.ModPesquisa pesquisa_viabilidade) throws Exception {
        try {
            String cmdsql = "DELETE FROM pesquisa_viabilidade WHERE cpf_cnpj_pesquisa = " + pesquisa_viabilidade.getcpf_cnpj_pesquisa();
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    
    
}
