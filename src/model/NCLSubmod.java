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
public class NCLSubmod extends model.ModNCL{
    private int ncl_subconj;
     private String descricao_sub;

    
    @Override
    public int getNcl_subconj() {
        return ncl_subconj;
    }

    
    @Override
    public void setNcl_subconj(int ncl_subconj) {
        this.ncl_subconj = ncl_subconj;
    }

   
    @Override
    public String getDescricao_sub() {
        return descricao_sub;
    }

    
    @Override
    public void setDescricao_sub(String descricao_sub) {
        this.descricao_sub = descricao_sub;
    }
     
     
    
}
