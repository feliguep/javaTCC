
package Cadastro;

/**
 *
 * @author Guedes
 */
import java.sql.*;
public class CadastroBd {
    
     private static Connection conectarBanco(String banco) throws ClassNotFoundException, SQLException
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            try
            {
               
                Connection conexao = DriverManager.getConnection("jdbc:postgresql//localhost:5432", "postgres", "teste");
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
                dado = retorno.getString("tcc");
            }
            catch (SQLException excecao)
            {
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
