import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoJDBC {
	public Connection getConexao() {
		Connection conexao = null;
		try {
			String url = "jdbc:sqlite:C:\\Users\\201713530030\\Desktop\\banco.db";
			conexao = DriverManager.getConnection(url);
			return conexao;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} 
	}
}
