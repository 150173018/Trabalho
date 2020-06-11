package Bynary;

public class BinTreeAval implements BinTree {

	private NoBinTree raiz;

	@Override
	public void AvaliarAluno(Aluno aluno) {
       
		/*if(aluno.getValor()>=10) {
			aluno.setAprovado(true);
		}else {
			aluno.setAprovado(false);
		}*/
		raiz = AvaliarAluno(raiz, aluno);

	}

	public NoBinTree AvaliarAluno(NoBinTree no, Aluno aluno) {
		

		if (no == null) {
			
			
			return new NoBinTree(aluno);
		}

		if (aluno.getNumAluno() <= no.getValor().getNumAluno())  {
			// Segue pela esquerda

			

		}

		else if (aluno.getNumAluno() >= no.getValor().getNumAluno()) {
			// Segue pela direita
			no.setFilhoDireita(AvaliarAluno(no.getFilhoDireita(), aluno));
			
			
		}
		return no;

	}

	/*@Override
	public String MostrarAprov() {
		if (raiz == null) {
			return "arvore vazia";
		}

		return MostrarAprov(raiz);
		
	}

	
	public String MostrarAprov(NoBinTree no) {
		String retorno = "";
		
		
		if(no != null) {
			if (no.getValor().isAprovado()==true) {
			retorno += no.getValor() + " ";	
			}
		}
		
		if(no.getFilhoEsquerda() != null) {
			if (no.getValor().isAprovado()==true) {
			retorno += MostrarAprov(no.getFilhoEsquerda());
			} 
		}
		
		if(no.getFilhoDireita() != null) {
			if (no.getValor().isAprovado()==true) {
			retorno += MostrarAprov(no.getFilhoDireita());
			} 
		}
		
		return retorno;

	}
	@Override
	public String MostrarDesa() {
		if (raiz == null) {
			return "arvore vazia";
		}

		return MostrarDesa(raiz);
		
	}

	
	public String MostrarDesa(NoBinTree no) {
		String retorno = "";
		
		
		if(no != null) {
			if (no.getValor().isAprovado()==false) {
			retorno += no.getValor() + " ";	
			}
		}
		
		if(no.getFilhoEsquerda() != null) {
			if (no.getValor().isAprovado()==false) {
			retorno += MostrarDesa(no.getFilhoEsquerda());
			} 
		}
		
		if(no.getFilhoDireita() != null) {
			if (no.getValor().isAprovado()==false) {
			retorno += MostrarDesa(no.getFilhoDireita());
			} 
		}
		
		return retorno;

	}*/
	
	
	@Override
	public NoBinTree Procurar(int num) {
		// TODO Auto-generated method stub

		return Procurar(raiz, num);

	}

	private NoBinTree Procurar(NoBinTree no, int num) {

		if (no == null) {
			return null;

		}
		if (num < no.getValor().getNumAluno()) {

			return Procurar(no.getFilhoEsquerda(), num);

		} else if (num > no.getValor().getNumAluno()) {

			return Procurar(no.getFilhoDireita(), num);
		} else

			return no;

	}

	
	
	public void Eliminar(int num)
	{
		raiz = Eliminar(raiz, num);
	}
	
	private NoBinTree Eliminar(NoBinTree no, int num)
	{
		if(no == null) {
			return no;
		}
		
		if(num < no.getValor().getNumAluno()) {
			no.setFilhoEsquerda(Eliminar(no.getFilhoEsquerda(), num));
		} else if(num > no.getValor().getNumAluno()) {
			no.setFilhoDireita(Eliminar(no.getFilhoDireita(), num));
		}else {
			
			if(no.getFilhoEsquerda() == null) {
				return no.getFilhoDireita();
			}else if(no.getFilhoDireita() == null) {
				return no.getFilhoEsquerda();
			}

			//no.setValor(min(no.getFilhoDireita()));
			no.setFilhoDireita(Eliminar(no.getFilhoDireita(), no.getValor().getNumAluno()));
			
		}
		
		return no;
	}
	
	
	public String preOrdem() {
		if (raiz == null) {
			return "arvore vazia";
		}

		return preOrdem(raiz);
	}

	public String preOrdem(NoBinTree no) {
		String retorno = "";

		if(no != null) {
			
			retorno += no.getValor() + " ";	
		}
		
		if(no.getFilhoEsquerda() != null) {
			retorno += preOrdem(no.getFilhoEsquerda());
		}
		
		if(no.getFilhoDireita() != null) {
			retorno += preOrdem(no.getFilhoDireita());
		}
		
		return retorno;

	}

	
	public String inOrdem() {
		if (raiz == null) {
			return "arvore vazia";
		}

		return inOrdem(raiz);
	}

	public String inOrdem(NoBinTree no) {
		String retorno = "";
		
		if(no.getFilhoEsquerda() != null) {
			retorno += inOrdem(no.getFilhoEsquerda());
		}
		
		retorno += no.getValor() + " ";
		
		if(no.getFilhoDireita() != null) {
			retorno += inOrdem(no.getFilhoDireita());
		}
		
		return retorno;
	}
	
	public String posOrdem() {
		if (raiz == null) {
			return "arvore vazia";
		}

		return posOrdem(raiz);
	}

	public String posOrdem(NoBinTree no) {
		String retorno = "";
		
		if(no.getFilhoEsquerda() != null) {
			retorno += posOrdem(no.getFilhoEsquerda());
		}
		
		if(no.getFilhoDireita() != null) {
			retorno += posOrdem(no.getFilhoDireita());
		}
		
		retorno += no.getValor() + " ";
		
		return retorno;
	}
	
	public int altura()
	{
		return raiz.altura();
	}

	
	@Override
	public String toString() {
		return "BinTreeAval [raiz=" + raiz + "]";
	}

}
