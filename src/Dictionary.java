import java.util.ArrayList;
import java.util.Objects;

public class Dictionary {

	private String term;
	private ArrayList<String> synonyms;
	
	
	
	public Dictionary() {
		
		synonyms = null;
		term = "";
		
	}
	
	

	public Dictionary(String term) {
		this.setTerm(term);
		synonyms = null;
	}


	public Dictionary(String term, ArrayList<String> synonyms) {
		super();
		this.term = term;
		this.setSynonyms(synonyms);
	}



	public String getTerm() {
		return term;
	}



	public void setTerm(String term) {
		this.term = term;
	}



	public ArrayList<String> getSynonyms() {
		return synonyms;
	}



	public void setSynonyms(ArrayList<String> synonyms) {
		
		this.synonyms = new ArrayList<String>(synonyms); 
	}



	@Override
	public String toString() {
		return this.getTerm();
	}



	@Override
	public int hashCode() {
		return Objects.hash(synonyms, term);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dictionary other = (Dictionary) obj;
		return Objects.equals(synonyms, other.synonyms) && Objects.equals(term, other.term);
	}
	
	
	
	
}
