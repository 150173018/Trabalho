
public interface DecisionTree {

	
	
	//inserir o aluno com o nome numero e nota na arvore
	public void inserir(String nome, int numAluno,  int valor );
	
	
	//mostrara os alunos aprovados
	public NoTree MostrarAprov( );
	//mostrara os alunos desaprovados
	public NoTree MostrarDesa( );
	
	//mostrar aluno pelo numero 
	public NoTree Procurar(int numAluno);
	
	
	
}
