package week22unittesting;

public class NumberCruncher {

	public int addNumbers(int num1, int num2) {
		return num1 + num2;
	}
	
	public int addNumbers(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	public double divNumbers(double num1, double num2) {
		return num1 / num2;
	}
	
	public double divideNumbers(double num1, double num2) throws Exception {
		if (num2 == 0) {
			//throw new Exception();
			throw new Exception("Exception : attempt to div by zero"); // could print or log message
		} else {
			return num1 / num2;
		}
	}

}
