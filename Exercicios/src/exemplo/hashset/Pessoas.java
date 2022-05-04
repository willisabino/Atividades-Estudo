package exemplo.hashset;

public class Pessoas {

	private String nome;

	public Pessoas(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Nome " + nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
