
import java.util.ArrayList;
import java.util.Properties;


public class Tree {
	private Node root;

	public Tree()		//empty constructor - build empty tree
	{
		this.root= new Node(new Word(""));
	}

	public boolean add(String str)		//Adds the str to the tree only if it already has a dad
	{
		Node temp = this.root;
		Node toAdd = new Node(new Word(str));
		if(temp.equals(toAdd))			//Was inserted
			return false;

		while(true) {
			for (int i = 0; i < temp.getSons().size(); i++) {
				if(temp.getSons().get(i).equals(toAdd))			//Was inserted
					return false;
				if(temp.getSons().get(i).Prefix(toAdd))			//check if what we want to add is descendant of 'temp'
				{
					temp = temp.getSons().get(i);
					if(temp.mySon(toAdd))					//if 'toAdd' is direct son of 'temp'
					{
						temp.getSons().add(toAdd);
						return true;
					}
					break;
				}
			}
			if(temp.mySon(toAdd))			//This happens when the first son is brought in
			{
				temp.getSons().add(toAdd);
				return true;
			}
		}
	}
}

