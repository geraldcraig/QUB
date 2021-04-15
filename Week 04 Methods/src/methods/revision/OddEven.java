package methods.revision;

public class OddEven {

	public static void main(String[] args) {
		
		OddEven odd = new OddEven();
		
		System.out.println("Check : " + odd.oddOrEven());
		
		String result = odd.oddOrEven();
		
		System.out.println("Result : " + result);
		
		int int1, ans;
		double double1;
		
		int1 = 7;
		double1 = 22;
		
		ans = (int) double1/int1;
		
		System.out.println(ans);
	}
	
	public String oddOrEven() {
		String check = "";
		int num = 9;
		
		if (num % 2 == 0) {
			check = "true";
		} else {
			check = "false";
		}
		return check;
		
	}

}
