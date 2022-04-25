package saveOurPlanetBelfastEdition;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MarkerTest {


	String validTitle1, validTitle2, validTitle3, validTitle4;
	Marker testMarker1, testMarker2, testMarker3, testMarker4;

	@BeforeEach
	void setUp() throws Exception {
		
		validTitle1 = "Windmill";
		validTitle2 = "Electric Car";
		validTitle3 = "Microscope";
		validTitle4 = "Solar Panel";
		
		testMarker1 = Marker.WINDMILL;
		testMarker2 = Marker.ELECTRIC_CAR;
		testMarker3 = Marker.MICROSCOPE;
		testMarker4 = Marker.SOLAR_PANEL;
	}

	@Test
	void testGetTitle() {
		
		testMarker1.getTitle();
		assertEquals(validTitle1, testMarker1.getTitle());
		
		testMarker2.getTitle();
		assertEquals(validTitle2, testMarker2.getTitle());
		
		testMarker3.getTitle();
		assertEquals(validTitle3, testMarker3.getTitle());
		
		testMarker4.getTitle();
		assertEquals(validTitle4, testMarker4.getTitle());
		
	}

}
