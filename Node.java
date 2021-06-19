/*
 * The Tree containing this Nodes
 */
import java.util.ArrayList;

public class Node {
	private Word value;
	private ArrayList<Node> sons;
	
	public Node(Word w)					//constructor
	{
		this.value=new Word(w);
		this.sons = new ArrayList<>();
	}
	
	public ArrayList<Node> getSons() {
		return sons;
	}
	
	public Word getValue() {
		return this.value;
	}
	
	
	public boolean mySon(Node other)	//check if 'other' is the son of 'this'
	{
		return ((this.value.getWord().length()==other.value.getWord().length()-1)&&Prefix(other));
	}
	
	public void addSon(Node son)		// if 'son' is son of 'this' - add 'son' to the sons list
	{
		if(mySon(son))
			sons.add(son);
	}
	
	
	public boolean Prefix(Node s)		//check if 's' is Prefix of 'this'
	{
		if(s.getValue().Prefix(this.value))
			return true;
		return false;
	}
	
	
	public boolean equals(Node other) {
		return this.value.getWord().equals(other.value.getWord());
	}
}
