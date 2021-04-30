package RecusionDemo;

public class RecursionExample {

	public static void main(String[] args) {
		
		callMe(1);

	}

	public static void callMe(int num) {
		if (num == 20) {
		System.out.println("Call me please  " + num);
		} else {
		System.out.println("Call me please  " + num);	
		callMe(num + 1);
		}
	}

}
