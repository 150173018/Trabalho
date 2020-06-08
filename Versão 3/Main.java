import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  static BufferedReader keyboardInput = new
	                           BufferedReader(new InputStreamReader(System.in));
	    static ArvoreDecisions newTree;

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

	       
	        newTree = new ArvoreDecisions();

	        generateTree();
	        queryTree();
	        }

	

	    static void generateTree() {
	        newTree.createRoot(1,"Nota igual ou superior a 10?");
	        newTree.addYesNode(1,2,"Aprovado!");
	        newTree.addNoNode(1,3,"Vai a exame?");
	        newTree.addYesNode(3,4,"Nota igual ou superior a 10 no exame?");
	        newTree.addNoNode(3,5,"Reprovado!");
	        newTree.addYesNode(4,6,"Aprovado!");
	        newTree.addNoNode(4,7,"Reprovado!");
	        }

	   
		
	    static void queryTree() throws IOException {
	        System.out.println("\nDECISION TREE");
	        System.out.println("===================");
	        newTree.queryBinTree();

	       
	        optionToExit();
	        }

	    

	    static void optionToExit() throws IOException {
	        System.out.println("Sair? (enter \"sim\" ou \"nao\")");
	        String answer = keyboardInput.readLine();
	        if (answer.equals("sim")) return;
	        else {
	            if (answer.equals("nao")) queryTree();
	            else {
	                System.out.println("ERRO: Responda com \"sim\" ou \"nao\"");
	                optionToExit();
	                }
	            }
	        }
		
		
		
	

}
