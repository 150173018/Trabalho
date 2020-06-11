package Bynary;

public interface BinTree {

		
		// a avaliacao o aluno com o nome numero e nota na arvore
		public void  AvaliarAluno(Aluno aluno );
		
		
		//mostrara os alunos aprovados
		//public String MostrarAprov( );
		
		//mostrara os alunos desaprovados
		//public String MostrarDesa( );
		
		
		//mostrar aluno pelo numero 
		public NoBinTree  Procurar(int num);
		
		//elimina um aluno
		public void  Eliminar(int num);
		
		//comprimento da arvore
		public int altura();
		
		//preordem dos alunos pelo numero
		public String preOrdem();
		
		// INordem dos alunos pelo numero
		public String inOrdem();
		
		//posordem dos alunos pelo numero
		public String posOrdem();
		
		
		
		
	
}
