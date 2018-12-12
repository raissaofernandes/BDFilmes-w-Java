//import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TesteAdiciona {
	public static void main(String[] args) throws SQLException {
		
		ContatoDao dao = new ContatoDao();
		Contato filme = new Contato();

		filme.setTitulo("A Lista de Schindler");
		filme.setAno("1993");
		filme.setDiretor("Steven Spielberg");
		filme.setNota("10");
				
		dao.adiciona(filme);
		
	}
}
