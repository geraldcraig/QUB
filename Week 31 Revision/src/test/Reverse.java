package test;

public class Reverse {

	public static void main(String[] args) {
		String result = reverse("hello");
		System.out.println(result);
		
		System.out.println("Count : " + count("hello world"));
		

	}
	
	public static String reverse(String str) {
		String reverse = "";
		
		for (int i = str.length()-1; i >=0; i--) {
			reverse += str.charAt(i);
		}
		return reverse;
	}
	
	public static int count(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i ++) {
			if (str.charAt(i) != ' ') {
				count ++;
			}
		}
		
		return count;
		
	}

}
