/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Parceiromod {
     private int codigo_indica; 
   private String nome_parceiro;
   private String telefone_parceiro; 
   private String senha; 
   private String email_parceiro;

    
    public int getCodigo_indica() {
        return codigo_indica;
    }

   
    public void setCodigo_indica(int codigo_indica) {
        this.codigo_indica = codigo_indica;
    }

    
    public String getNome_parceiro() {
        return nome_parceiro;
    }

    
    public void setNome_parceiro(String nome_parceiro) {
        this.nome_parceiro = nome_parceiro;
    }

    
    public String getTelefone_parceiro() {
        return telefone_parceiro;
    }

    
    public void setTelefone_parceiro(String telefone_parceiro) {
        this.telefone_parceiro = telefone_parceiro;
    }

    
    public String getSenha() {
        return senha;
    }

    
    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    public String getEmail_parceiro() {
        return email_parceiro;
    }


    public void setEmail_parceiro(String email_parceiro) {
        this.email_parceiro = email_parceiro;
    }
  
   
    
}
