package uk.ac.qub.revision;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SongStats {

	public static void main(String[] args) {

		ArrayList<Song> songs = new ArrayList<Song>();

		String songInfo;

		File file = new File("songlist.csv");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			br.readLine();
			songInfo = br.readLine();

			do {
				Song song = new Song();
				String[] stats = songInfo.split(",");

				song.setTitle(stats[0]);
				song.setArtist(stats[1]);
				song.setHiPos(Integer.parseInt(stats[2]));

				songs.add(song);

				songInfo = br.readLine();

			} while (songInfo != null);
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("problem reading file");
		} catch (Exception e) {
			System.out.println("something else happened");
		}
		
		for (Song s : songs) {
			System.out.println(s.toString());
		}
	}
}
