public class Contato {
	
	public String titulo;
	public  String ano;
	public  String diretor;
	public String nota;

	public Contato() {
	}
	
	public Contato(String titulo, String ano, String diretor, String nota) {
		super();
		this.titulo = titulo;
		this.ano = ano;
		this.diretor = diretor;
		this.nota = nota; 
	}

	// métodos get e set para título, ano, diretor, e nota
	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String novo) {
		this.titulo = novo;
	}

	public String getAno() {
		return this.ano;
	}

	public void setAno(String novo) {
		this.ano = novo;
	}

	public String getDiretor() {
		return this.diretor;
	}

	public void setDiretor(String novo) {
		this.diretor = novo;
	}
	
	public String getNota(){
		return this.nota; 
	}
	
	public void setNota(String novo){
		this.nota = novo; 
	}
}
