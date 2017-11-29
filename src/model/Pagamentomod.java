/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Guedes
 */
public class Pagamentomod  extends model.ClienteMod {
     private int id_pagamento;
   private String num_cartao;
   private String nome_cartao;
   private String rede_card;
   private String cv_cartao; 
   private String bank;
   private String status_pagamento; 
     
      public String getStatus_pagamento() {
        return status_pagamento;
    }

    
    public void setStatus_pagamento(String status_pagamento) {
        this.status_pagamento = status_pagamento;
    }
    
   
   
    public int getId_pagamento() {
        return id_pagamento;
    }

    
    public void setId_pagamento(int id_pagamento) {
        this.id_pagamento = id_pagamento;
    }


    
    public String getNum_cartao() {
        return num_cartao;
    }

    
    public void setNum_cartao(String num_cartao) {
        this.num_cartao = num_cartao;
    }

    
    public String getNome_cartao() {
        return nome_cartao;
    }

    
    public void setNome_cartao(String nome_cartao) {
        this.nome_cartao = nome_cartao;
    }

    
    public String getRede_card() {
        return rede_card;
    }

   
    public void setRede_card(String rede_card) {
        this.rede_card = rede_card;
    }

    
    public String getCv_cartao() {
        return cv_cartao;
    }

    
    public void setCv_cartao(String cv_cartao) {
        this.cv_cartao = cv_cartao;
    }

    
    public String getBank() {
        return bank;
    }

   
    public void setBank(String bank) {
        this.bank = bank;
    }
   
   
    
}
