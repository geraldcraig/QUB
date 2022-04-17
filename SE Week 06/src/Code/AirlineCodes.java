package Code;

public class AirlineCodes {

	
	/**
	 * Method translates airline codes to the full airline name
	 * @param code
	 * @return the full airline name
	 */
	public String codeToName(String code) {

		String name;

		switch (code) {
		case "AER":
			name = "Aer Lingus";
			break;
		case "BA":
			name = "British Airways";
			break;
		case "ESY":
			name = "Easy Jet";
			break;
		case "AA":
			name = "American Airways";
			break;
		default: 
			name = "Unknown";
		}
		return name;
	}
}
