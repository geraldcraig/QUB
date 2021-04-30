package RecusionDemo;

public class CountdownDemo {

	public static void main(String[] args) {
		
		countDown(5);

	}
	
	public static void countDown(int num) {
		if (num <= 0) {
			System.out.println("end");
		} else {
			//countDown(--num); //swap these lines and observe debug behaviour
			System.out.println(num);
			countDown(--num); //swap these lines and observe debug behaviour
		}
	}

}
