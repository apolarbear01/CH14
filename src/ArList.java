import java.util.ArrayList;

public class ArList {
	
	
	public static void main(String[] args) {
		
		
		Store s1 = new Store("Red Dress","Black Wallet","Blue Shoes");
		Store s2 = new Store("Yellow Dress","Pink Wallet","Blue Shoes");
		Store s3 = new Store("Green Dress","Black Wallet","White Shoes");
		Store s4 = new Store("Grey Dress","White Wallet","Blue Shoes");
		Store s5 = new Store("Purple Dress","Black Wallet","Pink Shoes");
		Store s6 = new Store("Golden Dress","Golden Wallet","Golden Shoes");
		
		
		ArrayList<Store> array = new ArrayList<Store>();
		
		
		Object [] array2 = new Store[6];
		
		Store [] array3 = new Store[6];
		
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);
		
		
		
				for(Store any: array)
						System.out.println(any);
				
				
				System.out.println(array.size());
				System.out.println(array.contains(s2));
			
				
				
				array.remove(3);
				array.add(3, s6);
				
				
			array2 = array.toArray();
				
			for(Object any: array2)
				System.out.println(any);
			
			
			array3 = array.toArray(array3);
			
			for(Store any: array3)
					System.out.println(any);
		
	}

}
