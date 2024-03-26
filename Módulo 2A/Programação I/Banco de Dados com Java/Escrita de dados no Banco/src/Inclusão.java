import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Inclusão {
    public static void main(String[] args) {
        final String usuario = "postgres";
        final String senha = "teste123";
        final String url = "jdbc:postgresql://localhost:5432/postgres";
        final String instrucao_insert = "INSERT INTO pessoas(id, nome) VALUES (?,?)";
        final String driverBanco = "org.postgresql.Driver";

        try{
            Class.forName(driverBanco);
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            PreparedStatement preparedStatement = conexao.prepareStatement(instrucao_insert);
            preparedStatement.setInt (1, 30);
            preparedStatement.setString(2, "Jubiscleuza");

            preparedStatement.executeUpdate();
            System.out.println("Inclusão realizada com sucesso");

        }catch(Exception exception){
            exception.printStackTrace();
        }

    }
}