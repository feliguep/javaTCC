
package model;

/**
 *
 * @author Guedes
 */
public class ModCPF extends ModCliente{
   private int cpf_cliente;
   private String nome_cliente; 
   private String legal_nature;

    
    public int getCpf_cliente() {
        return cpf_cliente;
    }

   
    public void setCpf_cliente(int cpf_cliente) {
        this.cpf_cliente = cpf_cliente;
    }

    
    public String getNome_cliente() {
        return nome_cliente;
    }

    
    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    
    public String getLegal_nature() {
        return legal_nature;
    }

    
    public void setLegal_nature(String legal_nature) {
        this.legal_nature = legal_nature;
    }
   
   
}
