package uk.ac.qub.revision;

import java.util.ArrayList;

public class SongDriver {

	public static void main(String[] args) {
		
		Song s1 = new Song("David Bowie", "Heroes", 3);
		Song s2 = new Song("U2", "Pride", 5);
		Song s3 = new Song("The Specials", "Ghost Town", 1);
		
		ArrayList<Song> songs = new ArrayList<Song>();
	
		songs.add(s1);
		songs.add(s2);
		songs.add(s3);
		
		s1.displayAll();
		s2.displayAll();
		s3.displayAll();
		
		
		for (int i = 0; i < songs.size(); i++) {
			System.out.println();
		}
		
	}

}
