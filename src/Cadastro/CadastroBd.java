
package Cadastro;


import java.sql.Connection;

import java.sql.SQLException;
import java.sql.*;
public class CadastroBd {
    
     private static Connection conectarBanco(String tcc) throws ClassNotFoundException, SQLException
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            try
            {
                 String bd = "jdbc:postgresql://localhost:5432/" + tcc; 
                Connection conexao = DriverManager.getConnection( bd, "postgres", "teste");
   
                return (conexao);
            }
            catch (SQLException excecao) {
                throw (excecao);
            }            
        }
        catch (ClassNotFoundException excecao) {
            throw (excecao);
        }
    }
    public static void manterDados(String sql) throws Exception
    {
        try
        {
            Statement comando = conectarBanco("tcc").createStatement();
            comando.executeUpdate(sql);
        }
        catch (SQLException excecao) {
            throw (excecao);
        }
    }
    public static String consultarDados(String sql) throws Exception
    {
        String dado = "";
        try
        {
            Statement comando = conectarBanco("tcc").createStatement();
            ResultSet retorno = comando.executeQuery(sql);
            retorno.next();
            try
            {
                dado = retorno.getString("cod_admin");
            }
            catch (SQLException excecao)
            {
                System.out.println(excecao.getMessage());
                throw new Exception("Código não cadastrado");
            }
            return (dado);
        }
        catch (Exception excecao)
        {
            throw (excecao);
        }
    } 
    
}
