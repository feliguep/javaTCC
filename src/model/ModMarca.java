
package model;

/**
 *
 * @author Guedes
 */
public class ModMarca extends ModNCL {
   private int  id_marca;
   private String nome_marca; 
   private String num_processo; 
   private String status_processo; 
   private String num_protocolo; 
   private  String num_gru; 

    
    public int getId_marca() {
        return id_marca;
    }

    
    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

   
    public String getNome_marca() {
        return nome_marca;
    }

    
    public void setNome_marca(String nome_marca) {
        this.nome_marca = nome_marca;
    }

    public String getNum_processo() {
        return num_processo;
    }

    
    public void setNum_processo(String num_processo) {
        this.num_processo = num_processo;
    }

    
    public String getStatus_processo() {
        return status_processo;
    }

    
    public void setStatus_processo(String status_processo) {
        this.status_processo = status_processo;
    }

  
    public String getNum_protocolo() {
        return num_protocolo;
    }

    
    public void setNum_protocolo(String num_protocolo) {
        this.num_protocolo = num_protocolo;
    }

    public String getNum_gru() {
        return num_gru;
    }

    
    public void setNum_gru(String num_gru) {
        this.num_gru = num_gru;
    }
   
   
   
}
