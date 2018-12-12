import java.sql.Connection;
//import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContatoDao {

//	a	conexão	com	o	banco	de	dados									
	private Connection conexao;

	public ContatoDao() {
		this.conexao = new ConexaoJDBC().getConexao();
	}

	public void adiciona(Contato filme) {
		String sql = "insert into filmes" +
					"(título,ano,diretor,nota)" +
					" values (?,?,?,?)";
		try {
			// prepared statement para inserção
			PreparedStatement stmt = conexao.prepareStatement(sql);
			// seta os valores
			stmt.setString(1, filme.getTitulo());
			stmt.setString(2, filme.getAno());
			stmt.setString(3, filme.getDiretor());
			stmt.setString(4, filme.getNota());

			// executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Contato> getLista() throws SQLException {
		PreparedStatement stmt = this.conexao.prepareStatement("select	*	from	Filme");
		ResultSet rs = stmt.executeQuery();
		
		List<Contato> filmes = new ArrayList<Contato>();
		
		while (rs.next()) {
			// criando o objeto dos filmes
			Contato filme = new Contato();
			filme.setTitulo(rs.getString("Título "));
			filme.setAno(rs.getString("Ano "));
			filme.setDiretor(rs.getString("Diretor "));
			filme.setNota(rs.getString("Nota "));
			
			// adicionando os filmes(objetos) ao arraylist
			filmes.add(filme);
		}
		rs.close();
		stmt.close();
		return filmes;
	}
}
