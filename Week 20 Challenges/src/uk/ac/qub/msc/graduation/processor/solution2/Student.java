/**
 * 
 */
package uk.ac.qub.msc.graduation.processor.solution2;

/**
 * @author 3048013
 *
 */
public class Student {

	private int studentNo;
	private String firstName;
	private String lastName;
	private int[] moduleScores = new int[5];
	private Classification classification;

	/**
	 * @param studentNo
	 * @param firstName
	 * @param lastName
	 * @param moduleScores
	 */
	public Student(int studentNo, String firstName, String lastName, int[] moduleScores, Classification cls) {
		this.studentNo = studentNo;
		setFirstName(firstName);
		this.lastName = lastName;
		setModuleScores(moduleScores);
		this.setClassification(cls);
	}
	
	public Student(int studentNo, String firstName, String lastName, int[] moduleScores) {
		this.studentNo = studentNo;
		setFirstName(firstName);
		this.lastName = lastName;
		setModuleScores(moduleScores);
		this.classification = Classification.ERROR;
	}

	/**
	 * Setter for module score array, validates for length 5 and appropriate range?
	 * 
	 * @param scores
	 */
	public void setModuleScores(int[] scores) {
		if (scores.length != 5) {
			this.moduleScores = new int[5];
			System.err.println("Invalid array recieved, empty scores set");
		} else {
			for (int i = 0; i < scores.length; i++) {
				if (scores[i] < 0) {
					System.err.println("Score too small, setting to 0");
					scores[i] = 0;
				}
				if (scores[i] > 100) {
					System.err.println("Score too big, setting to 100");
					scores[i] = 100;
				}
			}

			// set instance var to now validated array
			this.moduleScores = scores;
		}
	}

	/**
	 * @return the studentNo
	 */
	public int getStudentNo() {
		return studentNo;
	}

	/**
	 * @param studentNo the studentNo to set
	 */
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */

	public void setFirstName(String firstName) {
		if (firstName.length() < 1) {
			this.firstName = "INVALID";
		} else {
			this.firstName = firstName;
		}
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void printStudentDetails() {

		System.out.println("Student Num : " + getStudentNo());
		System.out.println("First name : " + getFirstName());
		System.out.println("Last name : " + getLastName());
		System.out.println("Module Results");
		System.out.println("Program : " + moduleScores[0]);
		System.out.println("Comp Found : " + moduleScores[1]);
		System.out.println("DBs : " + moduleScores[2]);
		System.out.println("Web : " + moduleScores[3]);
		System.out.println("Software E : " + moduleScores[4]);

		System.out.printf("Average : %.2f %n", getAverageModuleScore());
		System.out.println("Classifcation : " + this.classification);
		System.out.println();

	}

	public double getAverageModuleScore() {
		double total = 0;
		for (int a : moduleScores) {
			total += a;
		}
		total += moduleScores[0];
		double average = total / (moduleScores.length + 1);

		return average;
	}

	/**
	 * @return the classification
	 */
	public Classification getClassification() {
		return classification;
	}

	/**
	 * @param classification the classification to set
	 */
	public void setClassification(Classification classification) {
		this.classification = classification;
	}

}
