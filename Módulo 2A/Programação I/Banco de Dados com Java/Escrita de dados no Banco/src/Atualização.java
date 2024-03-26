import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Atualização {
    public static void main(String[] args) {
        final String usuario = "postgres";
        final String senha = "teste123";
        final String url = "jdbc:postgresql://localhost:5432/postgres";
        final String instrucaoUpdate = "UPDATE pessoas SET nome=? WHERE ID=?";
        final String driverBanco = "org.postgresql.Driver";

        try{
            Class.forName(driverBanco);
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            PreparedStatement preparedStatement = conexao.prepareStatement(instrucaoUpdate);
            preparedStatement.setString(1, "Gisele");
            preparedStatement.setInt (2, 2);

            preparedStatement.executeUpdate();
            System.out.println("Atualização realizada com sucesso");

        }catch(Exception exception){
            exception.printStackTrace();
        }

    }
}