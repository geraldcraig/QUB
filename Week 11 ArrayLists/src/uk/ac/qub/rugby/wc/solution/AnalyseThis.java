package uk.ac.qub.rugby.wc.solution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Application the reads in scores from a series of games from a CSV file and
 * outputs to screen the scores and determines the winner
 * 
 * @author 3048360
 *
 */
public class AnalyseThis {

	/**
	 * Start point for the application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// reading in the file (CSV)
		// expected format is ..
		// team1,team1 score,team 2,team 2 score
		// eg Japan,30,Russia,10

		File file = new File("Scores.csv");
		// need these to compare the scores by both teams
		int team1Score, team2Score;

		// var to hold each line (i.e game details)
		String game = null;

		// var to hold each game details after it is split by ,
		// so gameInfo[0] is the team1 (name)
		// gameInfo[1] is the team1 score
		// gameInfo[2] is the team2 (name)
		// gameInfo[3] is the team2 score
		String[] gameInfo = null;

		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			// going to ignore the first line (as it is the header of the file)
			br.readLine();

			// now get each game details line by line
			game = br.readLine();

			// if we have a game info then in the loop we go ...
			while (game != null) {

				// parse the line (by each comma the line)
				gameInfo = game.split(",");

				// capturing the team scores (need to parse from a String to int
				team1Score = Integer.parseInt(gameInfo[1]);
				team2Score = Integer.parseInt(gameInfo[3]);

				// output to screen ....
				// team 1
				System.out.print(gameInfo[0] + " ");
				// team 1 score
				System.out.print(gameInfo[1] + " : ");
				// team 2
				System.out.print(gameInfo[2] + " ");
				// team 2 score
				System.out.print(gameInfo[3] + "\t");

				// determining winner
				System.out.print("\t\t Winner  ");
				if (team1Score > team2Score) {
					// winner was team 1
					System.out.println(gameInfo[0]);
				} else if (team2Score > team1Score) {
					// winner was team 2
					System.out.println(gameInfo[2]);
				} else {
					// draw
					System.out.println("Draw");
				}

				// read the next game if there is one.
				game = br.readLine();
			}
			// file read completely so close all resources
			br.close();
			fr.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Had a problem");
		}
	}
}
