import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryDemo {

	private ArrayList<Dictionary> array;
	
	
	public DictionaryDemo() {
		
		array = new ArrayList<>();
	}


	public static void main(String[] args) {
		
		DictionaryDemo demo1 = new DictionaryDemo();
		
		demo1.menu();
		
	}
	
	

	public void menu() {
		
		char option = ' ';
		
		String newTerm = "";
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("WELCOME TO THE PROGRAM DICTIONARY");

		
			do{
				
					
						System.out.println("1- ADD A TERM");
						System.out.println("2- DELETE A TERM");
						System.out.println("3- DISPLAY A TERM");
						System.out.println("4- SEARCH A TERM");
						System.out.println("5- EXIT");
						
						
						option = keyboard.next().charAt(0);
						
				
					switch(option) {
					
					
							case '1':
										System.out.println("PLEASE ENTER THE TERM: ");
										newTerm = keyboard.next();
										this.addArray(new Dictionary(newTerm));
									break;
							case '2':
										System.out.println("PLEASE ENTER THE TERM: ");
										newTerm = keyboard.next();
										this.deleteArray(new Dictionary(newTerm));
									break;
							case '3':
										this.display();
									break;
							case '4':
										System.out.println("PLEASE ENTER THE TERM: ");
										newTerm = keyboard.next();
										this.searchArray(new Dictionary(newTerm));
									break;
							case '5':	
											System.out.println("Aborting the program...");
									break;
							default :
									System.out.println("There is no such an option. Please try again.");
					
				
					}
				
				
				
			}while(option != '5');
		
		
		keyboard.close();
		
		
	}
	
	
	
	public ArrayList<Dictionary> getArray() {
		return array;
	}



	public void setArray(ArrayList<Dictionary> array) {
		this.array = array;
	}
	
	
	public void addArray(Dictionary object) {
		this.array.add(object);
	}

	
	public void deleteArray(Dictionary object) {
			this.array.remove(object);
	}
	
	public void display() {
			
			for(Dictionary obj: this.array)
					System.out.println(obj);
		
	}
	
	
	public void searchArray(Dictionary object) {
		
		boolean exists = false;
		
		Scanner keyboard = new Scanner(System.in);
		char option = ' ';
		
		for (int i = 0; i < this.array.size(); i++) {
				if(this.array.get(i).equals(object)) exists = true;
	
			}
		
		
		if(exists) {
			System.out.println("Term is in the dictionary"); 
		
					System.out.println("Do you want to delete it? Y/N");
					option = keyboard.next().charAt(0);
					
						if(option == 'Y' || option == 'y') this.deleteArray(object);
							
		}	
		else 
			System.out.println("Term is not in the dictionary"); 
			
		
		
	}
}
