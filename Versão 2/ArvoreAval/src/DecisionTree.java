
public interface DecisionTree {

	
	
	// a avaliacao o aluno com o nome numero e nota na arvore
	public void  AvaliarAluno(Aluno aluno);
	
	
	//mostrara os alunos aprovados
	public NoTree MostrarAprov( );
	
	//mostrara os alunos desaprovados
	public NoTree MostrarDesa( );
	
	//mostrar aluno pelo numero 
	public NoTree Procurar(int numAluno);
	
	
	
}
