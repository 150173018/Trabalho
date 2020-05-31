

public class NoTree {
	private String nome;
	private int numAluno;
	private int valor;
	private NoTree filhoEsquerda;
	private NoTree filhoDireita;

	
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
	public NoTree getFilhoEsquerda() {
		return filhoEsquerda;
	}
	public void setFilhoEsquerda(NoTree filhoEsquerda) {
		this.filhoEsquerda = filhoEsquerda;
	}
	public NoTree getFilhoDireita() {
		return filhoDireita;
	}
	public void setFilhoDireita(NoTree filhoDireita) {
		this.filhoDireita = filhoDireita;
	}
	
	
	// Construtores
	public NoTree(int numAluno, int valor) {
		this.numAluno=numAluno;
		this.valor = valor;
		this.filhoEsquerda = null;
		this.filhoDireita = null;
	}
	
	// Override toString
	@Override
	public String toString() {
		return String.format("[%d , %s, %s ]\n",  this.valor, this.filhoEsquerda, this.filhoDireita );
	}
	
}
