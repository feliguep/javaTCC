
package Cadastro;

import static cadastro.Cadastro.manterDados;

/**
 *
 * @author Guedes
 */
public class CadMarca {
    
     public static void incluirDados(model.ModMarca marca) throws Exception {
        try {
            String cmdsql = "INSERT INTO marca (id_marca, nome_marca, num_processo, status_processo,num_protocolo, num_gru) VALUES (" + marca.getId_marca() + ",'" + marca.getNome_marca() + "','" + marca.getNum_processo() + "','" + marca.getStatus_processo() + "','" + marca.getNum_protocolo() + "','" + marca.getNum_gru() + "')";
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    public static void alterarDados(model.ModMarca marca) throws Exception {
        try {
            String cmdsql = "UPDATE marca SET nome_marca = '" +  marca.getNome_marca() +  "'  WHERE id_marca = " + marca.getId_marca();
           
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    public static void excluirDados(model.ModMarca marca) throws Exception {
        try {
            String cmdsql = "DELETE FROM marca WHERE id_marca = " + marca.getId_marca();
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    
    
    
}

