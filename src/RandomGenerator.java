import java.util.ArrayList;
import java.util.Random;

public class RandomGenerator <T>{

	private ArrayList<T> picks;

	
	public RandomGenerator() {
		picks = new ArrayList<T>();
		
	}
	
	public RandomGenerator(ArrayList<T> array) {
		
		this.picks = new ArrayList<T>();
		
			for (int i = 0; i < array.size(); i++) {
				this.picks.set(i, array.get(i));
			}
		
	}
	
	
	public void add(T object ) {
		this.picks.add(object);
	}
	
	
	public boolean isEmpty( ) {	
		if(this.picks.size() == 0)
				return true;
	
		return false;
	}
	
	
	public T drawItem() {
		
		
		T empty = null;
		
		try {
		
				if(this.isEmpty())	throw new Exception("The box is empty.");
			
					
					Random n1 = new Random();
					
					int index = n1.nextInt(this.picks.size());
					
					T returnValue = this.picks.get(index);
					this.picks.remove(index);
					return returnValue;
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
			
		
		return empty;

		
	}
	
	public ArrayList<T> getPicks() {
		return picks;
	}

	public void setPicks(ArrayList<T> picks) {
		this.picks = picks;
	}
	
	
	public void lottery() {
		
		while(!this.isEmpty()) {
				System.out.println("The item is: " + this.drawItem());
		}
		
		
	}
	
	
	public String toString() {
		
			for (int i = 0; i < this.picks.size(); i++) {
					System.out.println(this.picks.get(i));
			}
		
		return "";
	}
	
}
