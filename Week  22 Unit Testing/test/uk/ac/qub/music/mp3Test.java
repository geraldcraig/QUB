package uk.ac.qub.music;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class mp3Test {
	
	int validRef, invalidRef;
	String artist;
	String songName;
	int validRating, invalidRating;
	int validSongLength, invalidSongLength;
	mp3 m1;

	@BeforeEach
	void setUp() throws Exception {
		validRef = 0;
		invalidRef = -1;
		artist = "Bowie";
		songName = "Fame";
		validRating = 5;
		invalidRating = 0;
		validSongLength = 2500;
		invalidSongLength = 2501;
		m1 = new mp3();
	}

	@Test
	void testSettingValidRef() {
		m1.setRef(validRef);
		assertEquals(validRef, m1.getRef());
	}
	
	@Test
	void testSettingInvalidRef() {
		String expectedMessage = "Ref less than 0";
		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			m1.setRef(invalidRef);
		});
		System.out.println(exp.getMessage());
		assertEquals(expectedMessage, exp.getMessage());
	}
	
	@Test
	void testValidConstructor() {
		mp3 m1 = new mp3(validRef, artist, songName, validRating, validSongLength);
		assertEquals(validRef, m1.getRef());
		assertEquals(artist, m1.getArtist());
		assertEquals(songName, m1.getSongName());
		assertEquals(validRating, m1.getRating());
		assertEquals(validSongLength, m1.getSongLength());
		
		System.out.println("Valid ref: " + m1.getRef());
		System.out.println("Valid artist: " + m1.getArtist());
		System.out.println("Valid song name: " + m1.getSongName());
		System.out.println("Valid rating: " + m1.getRating());
		System.out.println("Valid song length: " + m1.getSongLength());
	}

}
