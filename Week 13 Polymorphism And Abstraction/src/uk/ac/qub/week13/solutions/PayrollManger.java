package uk.ac.qub.week13.solutions;

/**
 * Represents a payroll manangement class. 
 * @author aidan mcgowan
 *
 */
public class PayrollManger {

	// Static variable to hold employees
	public static Employee[] employees = new Employee[6];

	public static int HOURS_PER_WEEK = 35;

	/**
	 * Constructor for class
	 */
	public PayrollManger() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		// create all employees
		Employee porter1 = new Porter("Ivana", "Patient", 10.50, "Royal");
		Employee porter2 = new Porter("Amanda", "Pushabed", 10.50, "BCH");
		Employee surgeon1 = new Surgeon("Jack", "Ripper", 55.25, "Renal",
				650.00);
		Employee surgeon2 = new Surgeon("Edward", "Lister", 55.25, "Vascular",
				800.00);
		Employee pharmacist = new Pharmacist("Poppy", "Pill", 30.50, 7, 750);

		// call method to handle adding the employees to the list
		addEmployeeToList(porter1);
		addEmployeeToList(porter2);
		addEmployeeToList(surgeon1);
		addEmployeeToList(surgeon2);
		addEmployeeToList(pharmacist);

		// show all employees
		displayAllEmployees();
		System.out.println();
		// run payroll
		processWeeklyPayroll();

	}

	/**
	 * Adds new employee type to the list. Checks if there is room in the list
	 * before doing so.
	 * 
	 * @param employee
	 */
	public static void addEmployeeToList(Employee employee) {

		for (int loop = 0; loop < employees.length; loop++) {
			if (employees[loop] == null) {
				// add the employee to the empty array index
				employees[loop] = employee;
				break;
			}
		}

	}

	/**
	 * Displays details of all employees in the system
	 */
	public static void displayAllEmployees() {
		System.out
				.println("Display all employees ________________________________");
		int totalEmployees = 0;
		System.out.printf("[%-10s] %-20s %-20s %-6s %s \n", "Type",
				"First name", "Last name", "Rate", "Other", "Consultation Fee");
		for (Employee e : employees) {
			// check if the array index is not null
			if (e != null) {
				e.printAll();
				totalEmployees++;
				System.out.println(); // line break
			} else {
				// no more records so quit loop
				break;
			}
		}
		System.out.println("Total employees in system : " + totalEmployees);
		System.out
				.println("______________________________________________________");
	}

	/**
	 * Processes the weekly salary for each employee
	 */
	public static void processWeeklyPayroll() {
		System.out
				.println("Payroll run..... _____________________________________");
		int totalEmployees = 0;
		for (Employee e : employees) {
			// check if the array index is not null
			if (e != null) {
				e.calculateWeeklySalary(HOURS_PER_WEEK);
				totalEmployees++;
				System.out.println(); // line break
			} else {
				// no more records so quit loop
				break;
			}
		}
		System.out.println("Total records processed : " + totalEmployees);
		System.out
				.println("______________________________________________________");
	}
}
