package CADASTRO_DE_PESSOAS;

public class Pessoas {
	private String nome;
	private int idade;
	private String dataNascimento;
	
	public Pessoas(){
		
	}

	public Pessoas(String nome, int idade, String dataNascimento) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	
}
