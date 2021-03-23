package RecusionDemo;

public class Hello {
	
	public static void main(String[] args) {
        System.out.println("Program Start");
        method1();
        System.out.println("Program End");
    }
    private static void method1() {
        System.out.println("Method 1 start");
        method2();
        System.out.println("Method 1 end");
    }
    private static void method2() {
        System.out.println("Method 2 start");
        method3();
        System.out.println("Method 2 end");
    }
    private static void method3() {
        System.out.println("Method 3 start");
        System.out.println("Method 3 end");
    }

}
