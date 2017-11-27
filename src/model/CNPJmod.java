
package model;

/**
 *
 * @author Guedes
 */
public class CNPJmod {
     private int  cnpj_cliente;
    private  String nome_fantasia_cliente; 
    private String razao_social_cliente;
    private String legal_nature;
   
    public int getCnpj_cliente() {
        return cnpj_cliente;
    }

    public void setCnpj_cliente(int cnpj_cliente) {
        this.cnpj_cliente = cnpj_cliente;
    }

   
    public String getNome_fantasia_cliente() {
        return nome_fantasia_cliente;
    }

    
    public void setNome_fantasia_cliente(String nome_fantasia_cliente) {
        this.nome_fantasia_cliente = nome_fantasia_cliente;
    }

    
    public String getRazao_social_cliente() {
        return razao_social_cliente;
    }

    
    public void setRazao_social_cliente(String razao_social_cliente) {
        this.razao_social_cliente = razao_social_cliente;
    }

    
    public String getLegal_nature() {
        return legal_nature;
    }

    
    public void setLegal_nature(String legal_nature) {
        this.legal_nature = legal_nature;
    }
    
}
