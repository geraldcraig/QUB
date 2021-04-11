package uk.ac.qub.song.app.solution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 
 * @author 3048360
 *
 */
public class SongStats {

	/**
	 * Stores all songs
	 */
	public static ArrayList<Song> songs = new ArrayList<Song>();

	/**
	 * Start point for the application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		readInSongs();

		// let's show all songs
		for (Song song : songs) {
			System.out.println(song.toString());
		}

		// show all "Undertones"
		System.out.println("\nUndertones...");
		for (Song song : songs) {
			if (song.getArtist().equalsIgnoreCase("Undertones")) {
				System.out.println(song.getTitle());
			}
		}
	}

	/**
	 * Reads all songs on the csv format header Title, Artist, Chart position
	 */
	private static void readInSongs() {

		File file = new File("songlist.csv");

		FileReader fileReader;
		BufferedReader bufferedReader;
		String songInfo;
		String[] stats;

		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);

			// parse each data point - by comma

			songInfo = bufferedReader.readLine();
			// ditch the first line (header values) so read the next line
			songInfo = bufferedReader.readLine();

			do {
				// create a match and add the stats
				Song song = new Song();
				stats = songInfo.split(",");

				// parse song info into parts

				song.setTitle(stats[0]);
				song.setArtist(stats[1]);
				song.setHighestPosition(Integer.parseInt(stats[2]));

				// add to arraylist of songs
				songs.add(song);

				// read the next line
				songInfo = bufferedReader.readLine();
			} while (songInfo != null);

			// close all
			fileReader.close();
			bufferedReader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
