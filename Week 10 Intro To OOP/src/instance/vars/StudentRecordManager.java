/**
 * 
 */
package instance.vars;

/**
 * @author Gerald
 *
 */
public class StudentRecordManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// student no. 1
		Student s1 = new Student();
		s1.setName("Aidan");
		System.out.println(s1.getName());
		
		// student no. 2
		Student s2 = new Student();
		s2.setName("Claire");
		System.out.println(s2.getName());
	}

}
