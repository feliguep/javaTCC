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
public class Adminmod {
     private int cod_admin;
    private String email_login_adm;
    private String senha;

    
    public int getCod_admin() {
        return cod_admin;
    }

    
    public void setCod_admin(int cod_admin) {
        this.cod_admin = cod_admin;
    }

    
    public String getEmail_login_adm() {
        return email_login_adm;
    }

    
    public void setEmail_login_adm(String email_login_adm) {
        this.email_login_adm = email_login_adm;
    }

    
    public String getSenha() {
        return senha;
    }

    
    public void setSenha(String senha) {
        this.senha = senha;
    }
   
    
}
