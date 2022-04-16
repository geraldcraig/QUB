package saveOurPlanetBelfastEdition;


//==================================================
//===================::Marker::=====================
//==================================================
/**
*Creates an enum Marker with the values WINDMILL, ELECTRIC_CAR, MICROSCOPE, SOLAR_PANEL
*Player will select a marker which will move around the board and represent the player
*/
public enum Marker {
	
	WINDMILL("Windmill"), 
	
	ELECTRIC_CAR("Electric Car"), 
	
	MICROSCOPE("Microscope"), 
	
	SOLAR_PANEL("Solar Panel");

	private String title;
	
	public String getTitle() {
		return this.title;
	}
	
	 private Marker(String title) {
		this.title = title;
	}
}
