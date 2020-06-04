
public class Aluno {
	private String nome;
	private int numAluno;
	private int valor;
	private boolean aprovado; 
	

	
	// Acessores
	public int getNumAluno() {
		return numAluno;
	}
	public void setNumAluno(int numAluno) {
		this.numAluno = numAluno;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isAprovado() {
		return aprovado;
	}
	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
	
	
	
	// Construtores
		public Aluno(String nome, int numAluno,int valor) {
			this.nome=nome;
			this.numAluno = numAluno;
			this.valor = valor;
			
		}
		
		
		
		
}
