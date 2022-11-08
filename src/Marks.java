import java.util.ArrayList;

public class Marks <M extends Number> {
	
	public Marks() {
	}

	
	public Double orderAverage(ArrayList<M> array) {
		
		Double sum	= 0.0;
					
					for(M object : array)
							sum += object.doubleValue();
				
		return sum/array.size();
					
	}

}
