import java.util.ArrayList;

public class PriorityQueue <T> {

	private ArrayList<T> queue;
	private ArrayList<Integer> priorityArray;
	
	
	public PriorityQueue() {
		queue = new ArrayList<>();
		priorityArray = new ArrayList<>();
		
	}
	
	
	
	public void Add(T item,int priority) {
		
		int index = 0;
		boolean xx = false;
		
				
		
		if(this.priorityArray.size() != 0) {
		
		
				for (int i = 0; i < this.priorityArray.size(); i++) {
					
						if(priority >= this.priorityArray.get(i)) {
							xx = true;
							index = i;
							break;
						}
						
						
				}
				
				
			if(xx) {	
				this.queue.add(index, item);
				this.priorityArray.add(index, priority);
			}
			else {
				this.queue.add(item);
				this.priorityArray.add(priority);
			}
		}
		else {
			
			this.queue.add(item);
			this.priorityArray.add(priority);
			
		}
		
		
	}


	public T Remove() {
		
			if(this.queue.isEmpty())
					return null;
		
		return this.queue.remove(0);
		
	}



	@Override
	public String toString() {

			for (int i = 0; i < queue.size(); i++) {
					System.out.println(this.queue.get(i) + " " + this.priorityArray.get(i));
			}
		
		
		return "";
	}
	
	
	
	
}

