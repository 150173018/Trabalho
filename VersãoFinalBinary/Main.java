package Bynary;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 BinTreeAval t = new BinTreeAval();
			
			t.AvaliarAluno(new Aluno("Marco",100,9));
			t.AvaliarAluno(new Aluno("josé",28,20));
			t.AvaliarAluno(new Aluno("diogo",126,5));
			t.AvaliarAluno(new Aluno("martha",49,14));
			t.AvaliarAluno(new Aluno("maria",47,6));
			t.AvaliarAluno(new Aluno("diogo",68,17));
			t.AvaliarAluno(new Aluno("daniel",22,8));
			t.AvaliarAluno(new Aluno("jorge",12,14));
			t.AvaliarAluno(new Aluno("david",78,10));
			t.AvaliarAluno(new Aluno("miguel",178,15));
			t.AvaliarAluno(new Aluno("joao",156,8));
			
			
			NoBinTree node = t.Procurar(156);
			t.Eliminar(156);
			NoBinTree node2 = t.Procurar(156);
			
			
			System.out.println(node);
			System.out.println(node2);
			System.out.println(t.altura());
			System.out.println(t.preOrdem());
			System.out.println(t.inOrdem());
			System.out.println(t.posOrdem());
			//System.out.println(t.MostrarAprov());
			//System.out.println(t.MostrarDesa());
	}

}
