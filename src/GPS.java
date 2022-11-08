import java.util.ArrayList;
import java.util.Scanner;

public class GPS {

	private ArrayList<Point> points;
	private ArrayList<Integer> timestamps;
	

	

	public GPS() {
		this.points = new ArrayList<Point>();
		this.timestamps = new ArrayList<Integer>();
	}


	public GPS(ArrayList<Point> points, ArrayList<Integer> timestamps) {
		super();
		this.points = points;
		this.timestamps = timestamps;
	}
	
	
	public void setTimestamp(ArrayList<Integer> timestamps) {
			this.timestamps = timestamps;
	}
	
	public ArrayList<Point> getPoints() {
		return points;
	}
	public void setPoints(ArrayList<Point> points) {
		this.points = points;
	}

	public ArrayList<Integer> getTimestamps() {
		return timestamps;
	}
	public void setTimestamps(ArrayList<Integer> timestamps) {
		this.timestamps = timestamps;
	}
	
	
	
	public void menu() {
		
	char option = ' ';
	double x = 0.0;
	double y = 0.0;
	int ts = 0;
	
	Scanner keyboard = new Scanner(System.in);
	
	
			do{
				
				System.out.println("Please enter the points with whitespace: ");
				x = keyboard.nextDouble();
				y = keyboard.nextDouble();
				System.out.println("Please enter the timestamp");
				ts = keyboard.nextInt();
						
						this.points.add(new Point(x,y));
						this.timestamps.add(ts);
				
						this.calculate();
						
						
				System.out.println("Please enter * if you want to quit the program");
				option = keyboard.next().charAt(0);
				
			}while(option != '*');
	
	
	
	}
	
	
	
	public void calculate() {
		
		
	if(points.size() == 1) {
		System.out.println("The hiker traveled " + Math.sqrt(this.points.get(0).getX()*this.points.get(0).getX() + this.points.get(0).getY()*this.points.get(0).getY())/10 + " per " + this.timestamps.get(0) + " seconds. ");
		}
		
		
	
		for (int i = 1; i < points.size(); i++) {
			
			double distanceX =	this.points.get(i).getX() - this.points.get(i-1).getX();
			double distanceY = this.points.get(i).getY() - this.points.get(i-1).getY();
			
			double distance = Math.sqrt((distanceY*distanceY) + (distanceX*distanceX));
			
			
			System.out.println("The hiker traveled " + distance/10 + " per " + this.timestamps.get(i) + "seconds. ");



		}
		
		
	
		
	}

}
