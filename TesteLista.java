import java.sql.SQLException;
import java.util.List;

public class TesteLista {

	public static void main(String[] args) {
		ContatoDao	dao	=	new	ContatoDao(); 
		List<Contato> filmes;
		try {
			filmes = dao.getLista();
			for	(Contato	filme	:	filmes)	{
				System.out.println("Título:  "	+	filme.getTitulo());										
				System.out.println("Ano:	"	+	filme.getAno());										
				System.out.println("Diretor:"	+   filme.getDiretor());	
				System.out.println("Nota:"	+   filme.getNota());				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}
