package CADASTRO_DE_PESSOAS;

public class Cadastro_Pessoas {
	private Pessoas [] p;
	private int tamanho;
	
	
	 
	public Cadastro_Pessoas(int tamanho) {
		p = new Pessoas[tamanho];
		this.tamanho = 0;
	}
	
	public void add(Pessoas p) {
		if(this.p.length == tamanho) {
			aumentarTamanho();
		}
		for(int i = 0; i < this.p.length;i++) {
			if(this.p != null) {
				this.p[tamanho] = p;
				tamanho++;
				break;
			}
		}
	}
	public void excluir(int indx) {
		for(int i = 0; i < tamanho;i++) {
			if(p != null) {
				p[indx] = null;
				tamanho--;
				break;
			}
		}
		
	}
	public void editar(int indx, Pessoas p ) {
		for(int i = 0; i < tamanho;i++) {
			if(p != null) {
				this.p[indx] = p;
				break;
			}
		}
	}
	
	public void aumentarTamanho() {
		Pessoas novoArray [] = new Pessoas[tamanho * 2];
		for(int i = 0; i < tamanho;i++) {
			novoArray[i] = p[i];
		}
		p = novoArray;
	}
	public boolean pesquisarPessoa() {
		for(int i = 0; i <  tamanho;i++) {
			if(p.equals(p)) {
				
			}
		}
		
		return true;
	}
	
	public void exibir() {
		for(Pessoas pe : p) {
			if(pe != null) {
				System.out.println(pe.getNome() + ", " + pe.getIdade() + ", " + pe.getDataNascimento());
			}
		}
	}
	
}
