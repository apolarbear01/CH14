
public class PQDemo {

	public static void main(String[] args) {
		
		PriorityQueue<String> queue = new PriorityQueue<>();
		
		queue.Add("Hasan", 10);
		queue.Add("Baris", 6);
		queue.Add("Omer", 8);

		System.out.println(queue);
		
		System.out.println(queue.Remove());
		System.out.println(queue.Remove());
		System.out.println(queue.Remove());
		
	}
	
}
