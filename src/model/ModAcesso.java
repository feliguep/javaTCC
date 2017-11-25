
package model;

/**
 *
 * @author Guedes
 */
public class ModAcesso  {
    
    private int id_acesso;
   private String login;
   private String senha; 

   
    public int getId_acesso() {
        return id_acesso;
    }

    
    public void setId_acesso(int id_acesso) {
        this.id_acesso = id_acesso;
    }

    
    public String getLogin() {
        return login;
    }

    
    public void setLogin(String login) {
        this.login = login;
    }

   
    public String getSenha() {
        return senha;
    }

   
    public void setSenha(String senha) {
        this.senha = senha;
    }
   
   
    
}
