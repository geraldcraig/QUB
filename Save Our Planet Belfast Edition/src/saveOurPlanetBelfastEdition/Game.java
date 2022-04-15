package saveOurPlanetBelfastEdition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

import board.Board;
import board.BoardSetup;

public class Game {

	private static final int MIN_PLAYERS = 2;
	private static final int MAX_PLAYERS = 4;

	public static void main(String[] args) {
		
		ArrayList<Player> gamePlayers = new ArrayList<Player>();
		
		//Object to handle communication with players
		UserInput userInput = new UserInput();
		
		//Create the board that will be used by t3he players for the game
		Board board = BoardSetup.getNewBoard();
		
		//Create dice to be used by the players for the game
		Dice[] dice = Dice.generateDice();
		
		//Call the board classes method to print the contents of the board to the console
		board.printBoard();
		System.out.println();
	
		//Get and store the number of game players
		int numberOfPlayers = validateNumPlayers();

		//Add players to the game
		addPlayer(numberOfPlayers, gamePlayers, userInput);
		System.out.printf("%nAll %d players have been successfully created!%n", gamePlayers.size());
		
		//Players move around the board
		
		//Display the current position of each player on the board
		printPlayerBoardPositions(gamePlayers, board);

		do {
			
			Iterator<Player> iteration = gamePlayers.iterator();
			
			while (iteration.hasNext()) {
				
				Player player = iteration.next();
				
				//Ask the player whose turn it is if they would like to continue playing the game.
				System.out.printf("%nWould player %d %s like to continue playing?%n", gamePlayers.indexOf(player) , player.getPlayerName());
				
				System.out.printf("%nPlease enter Yes or No%n");
				
				//TO DO: SHOULD HANDLE UNEXPECTED USER INPUT. ALSO NEED TO HANDLE UNEXPECTED INPUT WHEN SELECTING NAME OR MARKER, I.E USER ENTERS INT WHEN STRING IS EXPECTED
		
				//If yes then execute the current players turn
				if (userInput.continuePlaying().equalsIgnoreCase("Yes")) {
					
					System.out.printf("%n%s's go, rolling dice now!%n", player.getPlayerName());
				
					Dice.rollDice(dice);
				
					int rolledValue = Dice.sumDice(dice);
				
					System.out.printf("%n%s rolled %d%n", player.getPlayerName(), rolledValue);
				
					//Set the player's new position on the board
					player.setBoardPosition(board.getNewPlayerBoardPosition(player.getBoardPosition(), rolledValue));
				
					//Print out the players new position
					printPlayerBoardPosition(player, board);
					
				//If user chooses not to continue playing then remove the player from the list of players
				} else {
					
					iteration.remove();
					
					//TO DO: WOULD BE NICE IF I COULD REFERENCE THE NAME OF THE PLAYER WHO HAS JUST BEEN REMOVED
					System.out.printf("%nYou have been successfully removed from the game%n");
				}
				
				
				
				
				
			}
//			for (Player player : gamePlayers) {
//				
//				//Ask the player whose turn it is if they would like to continue playing the game.
//				System.out.printf("%nWould player %d %s like to continue playing?%n", gamePlayers.indexOf(player), player.getPlayerName());
//				
//				System.out.printf("%nPlease enter Yes or No%n");
//				
//				//TO DO: SHOULD HANDLE UNEXPECTED USER INPUT. ALSO NEED TO HANDLE UNEXPECTED INPUT WHEN SELECTING NAME OR MARKER, I.E USER ENTERS INT WHEN STRING IS EXPECTED
//		
//				//If yes then execute the current players turn
//				if (userInput.contintuePlaying().equalsIgnoreCase("Yes")) {
//					
//					System.out.printf("%n%s's go, rolling dice now!%n", player.getPlayerName());
//				
//					Dice.rollDice(dice);
//				
//					int rolledValue = Dice.sumDice(dice);
//				
//					System.out.printf("%n%s rolled %d%n", player.getPlayerName(), rolledValue);
//				
//					//Set the player's new position on the board
//					player.setBoardPosition(board.getNewPlayerBoardPosition(player.getBoardPosition(), rolledValue));
//				
//					//Print out the players new position
//					printPlayerBoardPosition(player, board);
//					
//				//If user chooses not to continue playing then remove the player from the list of players
//				} else {
//					
//					gamePlayers.remove(player);
//					
//					//TO DO: WOULD BE NICE IF I COULD REFERENCE THE NAME OF THE PLAYER WHO HAS JUST BEEN REMOVED
//					System.out.printf("%nYou have been successfully removed from the game%n");
//				}
//			}
			
//			for (int i = 0; i < gamePlayers.size(); i++) {
//				
//				
//				//Ask the player whose turn it is if they would like to continue playing the game.
//				System.out.printf("%nWould player %d %s like to continue playing?%n", i, gamePlayers.get(i).getPlayerName());
//				
//				System.out.printf("%nPlease enter Yes or No%n");
//				
//				//TO DO: SHOULD HANDLE UNEXPECTED USER INPUT. ALSO NEED TO HANDLE UNEXPECTED INPUT WHEN SELECTING NAME OR MARKER, I.E USER ENTERS INT WHEN STRING IS EXPECTED
//		
//				//If yes then execute the current players turn
//				if (userInput.contintuePlaying().equalsIgnoreCase("Yes")) {
//					
//					System.out.printf("%n%s's go, rolling dice now!%n", gamePlayers.get(i).getPlayerName());
//				
//					Dice.rollDice(dice);
//				
//					int rolledValue = Dice.sumDice(dice);
//				
//					System.out.printf("%n%s rolled %d%n", gamePlayers.get(i).getPlayerName(), rolledValue);
//				
//					//Set the player's new position on the board
//					gamePlayers.get(i).setBoardPosition(board.getNewPlayerBoardPosition(gamePlayers.get(i).getBoardPosition(), rolledValue));
//				
//					//Print out the players new position
//					printPlayerBoardPosition(gamePlayers.get(i), board);
//					
//				//If user chooses not to continue playing then remove the player from the list of players
//				} else {
//					
//					gamePlayers.remove(gamePlayers.get(i));
//					
//					//TO DO: WOULD BE NICE IF I COULD REFERENCE THE NAME OF THE PLAYER WHO HAS JUST BEEN REMOVED
//					System.out.printf("%nYou have been successfully removed from the game%n");
//				}
//					
//			}
			//If no players remain then the game ends	
			} while (!gamePlayers.isEmpty());

			System.out.printf("%nAll players have left the game.%n");
			
		}		
		
	private static void printPlayerBoardPosition(Player player, Board board) {
		
		System.out.printf("%n%s is now currently on square: %d '%s'.%n", player.getPlayerName(), player.getBoardPosition(), board.getLocation(player.getBoardPosition()));
		
	}
	

	//This method prints the current position of each player on the board
	private static void printPlayerBoardPositions(ArrayList<Player> gamePlayers, Board board) {
		
		for (Player player : gamePlayers) {

			System.out.printf("%n%s is currently on square: %d '%s'.%n", player.getPlayerName(), player.getBoardPosition(), board.getLocation(player.getBoardPosition()));

		}

	}		
			
			
		
	//==================================================
	//===============::Add Player::=====================
	//==================================================
	/**
	 * Create players and add them to the list of game players. Amount of players created depends on the amount entered by the user,
	 * amount of players permitted must be within the MIN_PLAYERS & MAX_PLAYERS limits. Player names must be unique. Each game
	 * player is asked to select a game marker and each game marker must be unique per player.
	 */
	public static void addPlayer(int numberOfPlayers, ArrayList<Player> gamePlayers, UserInput userInput) {
		
		
		for (int i = 0; i < numberOfPlayers; i++) {
		
			boolean nameTaken = false;

			String playerName;
			
			do {
			
				nameTaken = false;
				
				System.out.printf("%nPlease enter your player name.%n");

				playerName = userInput.getPlayerName();
				
				for (Player player : gamePlayers) {

					if (player.getPlayerName().equalsIgnoreCase(playerName)) {
						
						System.out.printf("%nSorry that name is already taken.%n");
						
						nameTaken = true;
							
					}

				}
				
			} while (nameTaken);
			
			//Create marker and call method which validates the users selection and returns the selected marker
			Marker marker = selectMarker(gamePlayers);
			
			//Create the player
			Player player = new Player(playerName, marker);
			
			//Add the player to the list of game players
			gamePlayers.add(player);
			
			//Inform user that the player has been successfully created
			System.out.printf("%nCurrently %d player(s) created.%n", gamePlayers.size());

		}
		
	}

	//==================================================
	//========::Validate Number of Players::============
	//==================================================
	//Asks user for the number of game players and validates the input
	//will continue to ask player for number of players until it is within the accepted range as dictated by the MIN_PLAYERS & MAX_PLAYERS variables

	public static int validateNumPlayers() {
		
		boolean flag = true;
		int players = 0;
		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Please enter number of players, min 2... max 4...");
			
			String numPlayers = sc.next();
			
			if (numPlayers == null) {
				
				System.out.println("Must enter a number between "+MIN_PLAYERS+" and "+MAX_PLAYERS);
				
				flag = false;
			
			} else if ((Integer.parseInt(numPlayers) < MIN_PLAYERS)) {
				
				System.out.println("Player limit too low, you must have at least 2 players to begin the game");
				
				flag = false;
			
			} else if ((Integer.parseInt(numPlayers) > MAX_PLAYERS)) {
				
				System.out.println("Player limit too high, you can only have 4 players");
				
				flag = false;
			
			} else if ((Integer.parseInt(numPlayers) >= MIN_PLAYERS) && (Integer.parseInt(numPlayers) <= MAX_PLAYERS)) {
				
				flag = true;
				
				players = Integer.parseInt(numPlayers);
				
				System.out.println("You have selected " + numPlayers + " players.");
				System.out.println();
			}
			
		} while (!flag);
		
		return players;

	}
	
	
	//Method which asks a user to select a marker for the game.
	//Marker must be one that exists within the system
	//Each type of marker can only be used by a single player
	public static Marker selectMarker(ArrayList<Player> gamePlayers) {
		
		//Create a list of markers
		List<Marker> listOfMarkers = Arrays.asList(Marker.values());
		
		//Method variables to support the logic within this method
		int userSelection;
		Marker markerToReturn = null;
		boolean taken = false;
		
		do {
			
			//Ask user to select marker from those available within the system
			System.out.println();
			System.out.println("Please enter the numerical number according to your choice of marker:");
			System.out.println();
			
			for (Marker marker : listOfMarkers) {
				
				System.out.println("Option "+listOfMarkers.indexOf(marker)+": "+marker.getTitle());
				System.out.println();

			}
			
			//Ask user to select a marker
			Scanner sc = new Scanner(System.in);
			userSelection = Integer.parseInt(sc.next());
			
			//Reset the state of the taken variable
			taken = false;
			
			//Handle scenario where user input is out of bounds
			if (userSelection < 0 || userSelection >=4) {
				
				System.out.println();
				System.out.println("Selection out of bounds please try again.");
				System.out.println();
			
			//User selection is valid, now check that selected marker is not already taken by another player
			} else {
				
				for (Player player : gamePlayers) {
					
					if (listOfMarkers.get(userSelection) == player.getMarker()) {
						taken = true;
					}
				}
				if (taken == true) {
					
					System.out.println("Sorry "+listOfMarkers.get(userSelection).getTitle()+" is already taken please choose again");
					System.out.println();
					
				//User selected marker is not taken by another player therefore inform user and return marker 
				} else {
					
					markerToReturn = listOfMarkers.get(userSelection);
					System.out.println();
					System.out.println("You have chosen: "+markerToReturn.getTitle());
					System.out.println();
				}
				
			}
				
		} while ((userSelection < 0 || userSelection >=4) || (taken == true));
		
		return markerToReturn;
		
	}

}