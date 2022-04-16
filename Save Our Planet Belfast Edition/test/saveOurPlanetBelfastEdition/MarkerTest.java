package saveOurPlanetBelfastEdition;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MarkerTest {
	
	String validTitle;
	Marker testMarker;

	@BeforeEach
	void setUp() throws Exception {
		
		validTitle = "Windmill";
		testMarker = Marker.WINDMILL;
	}

	@Test
	void testGetTitle() {
		testMarker.getTitle();
		assertEquals(validTitle, testMarker.getTitle());
	}

}
