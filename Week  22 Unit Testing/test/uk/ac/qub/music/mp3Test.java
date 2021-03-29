package uk.ac.qub.music;

import static org.junit.jupiter.api.Assertions.*;

import java.util.InputMismatchException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class mp3Test {
	
	mp3 m1;

	@BeforeEach
	void setUp() throws Exception {
		m1 = new mp3();
	}

	@Test
	void testGetRef() {
		fail("Not yet implemented");
	}

	@Test
	void testSetRef() {
		fail("Not yet implemented");
	}

	@Test
	void testGetArtist() {
		fail("Not yet implemented");
	}

	@Test
	void testSetArtist() {
		fail("Not yet implemented");
	}

	@Test
	void testGetSongName() {
		fail("Not yet implemented");
	}

	@Test
	void testSetSongName() {
		fail("Not yet implemented");
	}

	@Test
	void testGetRating() {
		fail("Not yet implemented");
	}

	@Test
	void testSetRating() {
		fail("Not yet implemented");
	}

	@Test
	void testGetSongLength() {
		fail("Not yet implemented");
	}

	@Test
	void testSetSongLength() {
		fail("Not yet implemented");
	}

	@Test
	void testMp3() {
		
		InputMismatchException input = assertThrows(InputMismatchException.class, () -> {
			m1.setSongLength(2500
					);
		});
		System.out.println(input.getMessage());
	}

}
