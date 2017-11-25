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
public class CadPagamento  {
    
     public static void incluirDados(model.ModPagamento pagamento) throws Exception {
        try {
            String cmdsql = "INSERT INTO pagamento (id_pagamento,num_cartao,nome_cartao,rede_card,cv_cartao,bank,status_pagamento) VALUES (" + pagamento.getId_pagamento() + ",'" + pagamento.getNum_cartao() + "','" + pagamento.getNome_cartao() + "','" + pagamento.getRede_card() + "','" + pagamento.getCv_cartao() + "','" + pagamento.getCv_cartao()+ "','" + pagamento.getBank() + "','" + pagamento.getStatus_pagamento() + "')";
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    public static void alterarDados(model.ModPagamento pagamento) throws Exception {
        try {
            String cmdsql = "UPDATE pagamento SET num_cartao = '" + pagamento.getNum_cartao() +  "'  WHERE id_pagamento = " + pagamento.getId_pagamento();
           
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    public static void excluirDados(model.ModPagamento pagamento) throws Exception {
        try {
            String cmdsql = "DELETE FROM pagamento WHERE id_pagamento = " + pagamento.getId_pagamento();
            manterDados(cmdsql);
        } catch (Exception excecao) {
            throw (excecao);
        }
    }
    
    
    
}
