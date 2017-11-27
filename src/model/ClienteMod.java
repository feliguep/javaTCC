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
public class ClienteMod {
    private int id_cliente;
     private String respon_nome;
     private String endereco_cliente; 
     private String complemento_cliente;
     private String cep_cliente;
     private String estado_cliente; 
     private String cidade_cliente;
     private String telefone_cliente;
     private String email_login_cliente; 
     private String senha;

  
    public int getId_cliente() {
        return id_cliente;
    }

    
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    
    public String getRespon_nome() {
        return respon_nome;
    }

    
    public void setRespon_nome(String respon_nome) {
        this.respon_nome = respon_nome;
    }

   
    public String getEndereco_cliente() {
        return endereco_cliente;
    }

    
    public void setEndereco_cliente(String endereco_cliente) {
        this.endereco_cliente = endereco_cliente;
    }

    
    public String getComplemento_cliente() {
        return complemento_cliente;
    }

    
    public void setComplemento_cliente(String complemento_cliente) {
        this.complemento_cliente = complemento_cliente;
    }

   
    public String getCep_cliente() {
        return cep_cliente;
    }

    
    public void setCep_cliente(String cep_cliente) {
        this.cep_cliente = cep_cliente;
    }

   
    public String getEstado_cliente() {
        return estado_cliente;
    }

    
    public void setEstado_cliente(String estado_cliente) {
        this.estado_cliente = estado_cliente;
    }

    
    public String getCidade_cliente() {
        return cidade_cliente;
    }

    
    public void setCidade_cliente(String cidade_cliente) {
        this.cidade_cliente = cidade_cliente;
    }

   
    public String getTelefone_cliente() {
        return telefone_cliente;
    }

   
    public void setTelefone_cliente(String telefone_cliente) {
        this.telefone_cliente = telefone_cliente;
    }

    
    public String getEmail_login_cliente() {
        return email_login_cliente;
    }

   
    public void setEmail_login_cliente(String email_login_cliente) {
        this.email_login_cliente = email_login_cliente;
    }

    
    public String getSenha() {
        return senha;
    }

    
    public void setSenha(String senha) {
        this.senha = senha;
    }
     
     
    
}
