/*
 * The class represents a word in quantization
 */
public class Word {
	private String w;
	public Word(String word) {
		this.w=word;
	}
	public Word(Word word) {
		this.w=word.w;
	}
	public String getWord() {
		return this.w;
	}
	public boolean Prefix(Word other)			//check if 'this' start with 'other'
	{
		if(other==null)							//Checks if the word null is returned true
			return true;
		if(this.w.length()<other.length())		// if 'this' longer it is not prefix.
		{
			return false;
		}
		for(int i=0;i<other.length();i++)		//check the characters
		{
			if(other.getWord().charAt(i)!=this.w.charAt(i) )
				return false;
		}
		return true;
	}
	public int length() {
		return this.w.length();
	}
	
}
