package cadastro;
import java.sql.*;
public class Cadastro {
    private static Connection conectarBanco(String banco) throws ClassNotFoundException, SQLException
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            try
            {
                String bd = "jdbc:mysql://localhost/" + banco;
                Connection conexao = DriverManager.getConnection(bd, "postgres", "banco");
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
    
}

