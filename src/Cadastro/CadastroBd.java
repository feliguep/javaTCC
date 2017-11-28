
package Cadastro;


import java.sql.Connection;

import java.sql.SQLException;
import java.sql.*;
import javax.swing.JOptionPane;
public class CadastroBd {
    
     private static Connection conectarBanco(String tcc) throws ClassNotFoundException, SQLException
    {
        
            try
            {
                Class.forName("org.postgresql.Driver"); 
                String bd = "jdbc:postgresql://localhost:5432/tcc"; 
                Connection conexao = DriverManager.getConnection( bd, "postgres", "teste");
                 JOptionPane.showMessageDialog (null, "Conectado com sucesso");
                return (conexao);
            }
            catch (SQLException error) {
                JOptionPane.showMessageDialog (null, error);
                return (null);
            }            
        }

    
        
    }
     
     
     
    

    
    

