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
public class NCLmod extends model.ModMarca{
     private int ncl_conj;
   private String descricao_conj;

    
    public int getNcl_conj() {
        return ncl_conj;
    }

    
    public void setNcl_conj(int ncl_conj) {
        this.ncl_conj = ncl_conj;
    }

    
    public String getDescricao_conj() {
        return descricao_conj;
    }

    
    public void setDescricao_conj(String descricao_conj) {
        this.descricao_conj = descricao_conj;
    }
   
    
}
