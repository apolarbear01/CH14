import java.util.ArrayList;

public class MarksDemo {

	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> array = new ArrayList<>();
		
		array.add(5);
		array.add(10);
		array.add(15);
		array.add(20);
		array.add(25);
		array.add(30);
		
			
		Marks<Integer> m1 = new Marks<Integer>();
		
		Double average	=	m1.orderAverage(array);
				
			System.out.println("The average of the Marks  Class is: " + average );
			
			
	  ArrayList<Double> array2 = new ArrayList<>();
	  
	  
	  array2.add(4.2);
	  array2.add(10.1);
	  array2.add(5.7);
	  array2.add(8.6);
		
	  
	  		Marks<Double> m2 = new Marks<Double>();
	  		
	  		
	  		Double average2 = m2.orderAverage(array2);
	  		
			System.out.println("The average of the Marks  Class is: " + average2 );

				
	}
	
}
	
