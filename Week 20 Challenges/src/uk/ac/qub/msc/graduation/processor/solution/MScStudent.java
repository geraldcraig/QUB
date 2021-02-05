package uk.ac.qub.msc.graduation.processor.solution;

public class MScStudent extends Student {
	
	private int programming;
	private int db;
	private int computingFoundations;
	private int softwareEngineering;
	private int web;

	// defaulting to N/A
	private String classification = "Not available";

	
	/**
	 * Default constructor
	 */
	public MScStudent() {

	}

	/**
	 * MSc student constructor with args
	 * @param studentNumber
	 * @param firstName
	 * @param lastName
	 * @param programming
	 * @param db
	 * @param computingFoundations
	 * @param softwareEngineering
	 * @param web
	 */
	public MScStudent(int studentNumber, String firstName, String lastName, int programming, int db,
			int computingFoundations, int softwareEngineering, int web) {
		super(studentNumber, firstName, lastName);
		this.programming = programming;
		this.db = db;
		this.computingFoundations = computingFoundations;
		this.softwareEngineering = softwareEngineering;
		this.web = web;
	}


	/**
	 * @return the programming
	 */
	public int getProgramming() {
		return programming;
	}


	/**
	 * @param programming the programming to set
	 */
	public void setProgramming(int programming) {
		this.programming = programming;
	}


	/**
	 * @return the db
	 */
	public int getDb() {
		return db;
	}


	/**
	 * @param db the db to set
	 */
	public void setDb(int db) {
		this.db = db;
	}


	/**
	 * @return the computingFoundations
	 */
	public int getComputingFoundations() {
		return computingFoundations;
	}


	/**
	 * @param computingFoundations the computingFoundations to set
	 */
	public void setComputingFoundations(int computingFoundations) {
		this.computingFoundations = computingFoundations;
	}


	/**
	 * @return the softwareEngineering
	 */
	public int getSoftwareEngineering() {
		return softwareEngineering;
	}


	/**
	 * @param softwareEngineering the softwareEngineering to set
	 */
	public void setSoftwareEngineering(int softwareEngineering) {
		this.softwareEngineering = softwareEngineering;
	}


	/**
	 * @return the web
	 */
	public int getWeb() {
		return web;
	}


	/**
	 * @param web the web to set
	 */
	public void setWeb(int web) {
		this.web = web;
	}
	
	/**
	 * Gets the classification
	 * @return
	 */
	public String getClassification() {
		return this.classification;
	}
	
	/**
	 * Outputs all fields  to screen
	 */
	public void displayStudentRecord() {
		System.out.println("_____________________________________________\n");
		System.out.println("Student no.			\t: "+this.getStudentNumber());
		System.out.println("First name 			\t: "+this.getFirstName());
		System.out.println("Last name			\t: "+this.getLastName());
		System.out.println("Module results  ");
		System.out.println("Program		     		\t: "+this.programming);
		System.out.println("Comp Found			\t: "+this.computingFoundations);
		System.out.println("DBs			    	\t: "+this.db);
		System.out.println("Web    				\t: "+this.web);
		System.out.println("Software E			\t: "+this.softwareEngineering);
		System.out.println("Average				\t: "+this.calculateAverage());
		System.out.println("Classification			\t: "+this.classification);
		System.out.println("______________________________________\n");

	}
	
	/**
	 * Displays the student details, average and classification
	 */
	public void displayStudentClassification() {
		System.out.println("_____________________________________________\n");
		System.out.println("Student no.			\t: "+this.getStudentNumber());
		System.out.println("First name 			\t: "+this.getFirstName());
		System.out.println("Last name			\t: "+this.getLastName());
		System.out.println("Average				\t: "+this.calculateAverage());
		System.out.println("Classification			\t: "+this.classification);
		System.out.println("______________________________________\n");
		
	}
	
	/**
	 * Private method that calculates the average score for the student
	 * Note : The programming result is double weighted
	 * @return the average taught score
	 */
	private int calculateAverage() {
		int total = this.programming*2  +this.computingFoundations +this.db +this.softwareEngineering +this.web;
		return total/6;
	}
	
	/**
	 * Calculates and sets the classification for this student
	 * error < 0 or > 100
	 * distinction 70 - 100
	 * commendation 60 - 69 
	 * pass 50 -59
	 * fail 0 - 49 
	 */
	public void classifyStudent() {
		int taughtAverage = calculateAverage();
		
		if (taughtAverage<0 || taughtAverage>100) {
			this.classification = "Error";
		} else if (taughtAverage>=70 && taughtAverage<=100) {
			this.classification = "Distinction";
		} else if (taughtAverage>=60 && taughtAverage<=69) {
			this.classification = "Commendation";
		} else if (taughtAverage>=50 && taughtAverage<=59) {
			this.classification = "Pass";
		} else {
			this.classification = "Fail";
		}
	}

}
