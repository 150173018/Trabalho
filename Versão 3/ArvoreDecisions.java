import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArvoreDecisions  {


    static BufferedReader    keyboardInput = new
                           BufferedReader(new InputStreamReader(System.in));
    NoTree rootNode = null;
    

    public ArvoreDecisions() {
	}
    

    public void createRoot(int newNodeID, String newQuestAns) {
	rootNode = new NoTree(newNodeID,newQuestAns);	
	
	//System.out.println("Criado no na raiz!" + newNodeID);	
	}
			

    public void addYesNode(int existingNodeID, int newNodeID, String newQuestAns) {
	
	
	if (rootNode == null) {
	    System.out.println("ERRO: Sem raiz!");
	    return;
	    }
	
	
	
	if (searchTreeAndAddYesNode(rootNode,existingNodeID,newNodeID,newQuestAns)) {
	   // System.out.println("No " + newNodeID + " Adicionado ao no " + existingNodeID);
	    }
	else System.out.println("No " + existingNodeID + " não encontrado");
	}


    private boolean searchTreeAndAddYesNode(NoTree currentNode,
    			int existingNodeID, int newNodeID, String newQuestAns) {
    	if (currentNode.getNodeID() == existingNodeID) {
	    
	    if (currentNode.getSim() == null)
	    	currentNode.setSim(new
	    		NoTree(newNodeID,newQuestAns));
	    else {
	        System.out.println("WARNING: Overwriting previous node " +
			"(id = " + currentNode.getSim().getNodeID() +
			") ligado ao ramo sim do no " +
			existingNodeID);
		currentNode.setSim( new NoTree(newNodeID,newQuestAns));
		}		
    	    return(true);
	    }
	else {
	    
	    if (currentNode.getSim() != null) { 	
	        if (searchTreeAndAddYesNode(currentNode.getSim(),
		        	existingNodeID,newNodeID,newQuestAns)) {    	
	            return(true);
		    }	
		else {
    	       
	    	    if (currentNode.getNao() != null) {
    	    		return(searchTreeAndAddYesNode(currentNode.getNao(),
				existingNodeID,newNodeID,newQuestAns));
			}
		    else return(false);	
		    }
    		}
	    return(false);		
	    }
   	} 	
    		
    

    public void addNoNode(int existingNodeID, int newNodeID, String newQuestAns) {
	
	
	if (rootNode == null) {
	    System.out.println("ERRO: Sem raiz!");
	    return;
	    }
	
	
	
	if (searchTreeAndAddNoNode(rootNode,existingNodeID,newNodeID,newQuestAns)) {
	   // System.out.println("No " + newNodeID + " Adicionado ao no " + existingNodeID);
	    }
	else System.out.println("No " + existingNodeID + " não encontrado");
	}
	
    

    private boolean searchTreeAndAddNoNode(NoTree currentNode,
    			int existingNodeID, int newNodeID, String newQuestAns) {
    	if (currentNode.getNodeID() == existingNodeID) {
	    
	    if (currentNode.getNao() == null) currentNode.setNao(new
	    		NoTree(newNodeID,newQuestAns));
	    else {
	        System.out.println("WARNING: Overwriting previous node " +
			"(id = " + currentNode.getNao().getNodeID() +
			") linked to yes branch of node " +
			existingNodeID);
		currentNode.setNao(new NoTree(newNodeID,newQuestAns));
		}		
    	    return(true);
	    }
	else {
	    
	    if (currentNode.getSim() != null) { 	
	        if (searchTreeAndAddNoNode(currentNode.getSim(),
		        	existingNodeID,newNodeID,newQuestAns)) {    	
	            return(true);
		    }	
		else {
    	       
	    	    if (currentNode.getNao() != null) {
    	    		return(searchTreeAndAddNoNode(currentNode.getNao(),
				existingNodeID,newNodeID,newQuestAns));
			}
		    else return(false);	
		    }
		 }
	    else return(false);	
	    }
   	} 	

   

    public void queryBinTree() throws IOException {
        queryBinTree(rootNode);
        }

    private void queryBinTree(NoTree currentNode) throws IOException {

        

        if (currentNode.getSim()==null) {
            if (currentNode.getNao()==null) System.out.println(currentNode.getQuest());
            else System.out.println("Error: Missing \"Yes\" branch at \"" +
            		currentNode.getQuest() + "\" question");
            return;
            }
        if (currentNode.getNao()==null) {
            System.out.println("Erro: Missing \"No\" branch at \"" +
            		currentNode.getQuest() + "\" question");
            return;
            }

        

        askQuestion(currentNode);
        }

    private void askQuestion(NoTree currentNode) throws IOException {
        System.out.println(currentNode.getQuest() + " (Responda com \"sim\" ou \"nao\")");
        String answer = keyboardInput.readLine();
        if (answer.equals("sim")) queryBinTree(currentNode.getSim());
        else {
            if (answer.equals("nao")) queryBinTree(currentNode.getNao());
            else {
                System.out.println("ERRO: Responda com \"sim\" ou \"nao\"");
                askQuestion(currentNode);
                }
            }
        }

   


}
