

public class NoTree {
	
	
	private int nodeID;
	private String  quest =null;
	private NoTree sim =null;
	private NoTree nao =null;
	

	
	// Acessores
	
    public int getNodeID() {
		return nodeID;
	}
	public void setNodeID(int nodeID) {
		this.nodeID = nodeID;
	}
	public String getQuest() {
		return quest;
	}
	public void setQuest(String quest) {
		this.quest = quest;
	}
	public NoTree getNao() {
		return nao;
	}
	public void setNao(NoTree nao) {
		this.nao = nao;
	}
	public NoTree getSim() {
		return sim;
	}
	public void setSim(NoTree sim) {
		this.sim = sim;
	}
	
	
	// Construtores
	public NoTree(int nodeID, String quest) {
		this.nodeID =nodeID;
		this.quest = quest;
		
	}
	
	// Override toString
	@Override
	public String toString() {
		return String.format("[%d , %s, %s ]\n",this.nodeID,  this.quest, this.nao, this.sim );
	}
	
	
}
