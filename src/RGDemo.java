
public class RGDemo {

	public static void main(String[] args) {
		
		RandomGenerator<Integer> randomgenerator = new RandomGenerator<>();
		
		randomgenerator.add(10);
		randomgenerator.add(50);
		randomgenerator.add(100);
		randomgenerator.add(430);
		randomgenerator.add(200);
		
		
			randomgenerator.lottery();
			
			
		System.out.println();
			
			
		RandomGenerator<String> randomstrings = new RandomGenerator<>();
		
		
		randomstrings.add("Hasan");
		randomstrings.add("Omer");
		randomstrings.add("Baris");
		randomstrings.add("Yigit");
		randomstrings.add("Muhammet");
		
			randomstrings.lottery();
	
		
	}
}
