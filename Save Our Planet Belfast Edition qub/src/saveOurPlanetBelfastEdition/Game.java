package saveOurPlanetBelfastEdition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

import board.Areas;
import board.Board;
import board.BoardLocation;
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
		System.out.println("  _____                    ____               _____  _                  _   \r\n"
				+ " / ____|                  / __ \\             |  __ \\| |                | |  \r\n"
				+ "| (___   __ ___   _____  | |  | |_   _ _ __  | |__) | | __ _ _ __   ___| |_ \r\n"
				+ " \\___ \\ / _` \\ \\ / / _ \\ | |  | | | | | '__| |  ___/| |/ _` | '_ \\ / _ \\ __|\r\n"
				+ " ____) | (_| |\\ V /  __/ | |__| | |_| | |    | |    | | (_| | | | |  __/ |_ \r\n"
				+ "|_____/ \\__,_| \\_/ \\___|  \\____/ \\__,_|_|    |_|    |_|\\__,_|_| |_|\\___|\\__|\r\n"
				+ "                                                                            ");
		System.out.println();
		System.out.println(" ____       _  __          _     ______    _ _ _   _             \r\n"
				+ "|  _ \\     | |/ _|        | |   |  ____|  | (_) | (_)            \r\n"
				+ "| |_) | ___| | |_ __ _ ___| |_  | |__   __| |_| |_ _  ___  _ __  \r\n"
				+ "|  _ < / _ \\ |  _/ _` / __| __| |  __| / _` | | __| |/ _ \\| '_ \\ \r\n"
				+ "| |_) |  __/ | || (_| \\__ \\ |_  | |___| (_| | | |_| | (_) | | | |\r\n"
				+ "|____/ \\___|_|_| \\__,_|___/\\__| |______\\__,_|_|\\__|_|\\___/|_| |_|\r\n"
				+ "                                                                 ");
	
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
				System.out.printf("%nWould player %d %s like to continue playing?%n", gamePlayers.indexOf(player)+1 , player.getPlayerName().toUpperCase());
				
				System.out.printf("%nPlease enter Yes or No%n");
				
				//TO DO: SHOULD HANDLE UNEXPECTED USER INPUT. ALSO NEED TO HANDLE UNEXPECTED INPUT WHEN SELECTING NAME OR MARKER, I.E USER ENTERS INT WHEN STRING IS EXPECTED
		
				//If yes then execute the current players turn
				if (userInput.continuePlaying().toLowerCase().equalsIgnoreCase("yes")) {
					
					System.out.printf("%n%s's go, rolling dice now!%n", player.getPlayerName().toUpperCase());
				
					Dice.rollDice(dice);
				
					int rolledValue = Dice.sumDice(dice);
				
					System.out.printf("%n%s rolled %d%n", player.getPlayerName().toUpperCase(), rolledValue);
					
					//Logic to determine if a player has passed go and if yes then adds funds to their account
					// checks thats players previous position was below index 11
					if(player.getBoardPosition() < 11)  {
						
						// checks what it players new position will be 
						int playerPosition = player.getBoardPosition() + rolledValue;
						
						// If greater than 11 (Go) then it will add 50 tokens into the players funds and inform the player of the update
						if(playerPosition > 11) {
						
						player.updatePlayerFundsAdd(50);
						System.out.printf("%nYou have passed Go and have received some tokens, you new balance is: %.2f%n", player.getPlayerFunds());
					

						}
					}

				
					//Set the player's new position on the board
					player.setBoardPosition(board.getNewPlayerBoardPosition(player.getBoardPosition(), rolledValue));
				
					//Print out the players new position
					printPlayerBoardPosition(player, board);
					
					//Only 'ownable' areas can be purchased, therefore check the object type that the player has landed on before proceeding with buying/paying a fee
					if (board.getBoardLocation(player.getBoardPosition()) instanceof Areas) {
						
						Areas area = (Areas) board.getBoardLocation(player.getBoardPosition());
						
						//If it is not owned then ask the player if they would like to purchase it
						if (!area.isAreaOwned()) {
							
							System.out.printf("%nThis square is currently NOT owned by another player. %n%nWould you like to purchase it for a fee of %d? Enter 'Yes' or 'No' %n", area.getPurchasePrice());
							
								if (userInput.getAreaPurchaseAnswer().equalsIgnoreCase("Yes")) {
									
									//First check if player has enough funds and only then allow the player to purchase the area
									System.out.printf("%nOkay, but first lets double check that you have the sufficient funds.%n");
									
									//Execute the method to allow a user to purchase the area
									executePurchaseArea(player, area);
									
								//Current player has chosen not to purchase the area therefore ask remaining players if they would like to purchase it	
								} else {
									
									System.out.printf("%n%s has chosen not to purchase the area. Therefore the remaining players will now get the opportunity to purchase the area %n", player.getPlayerName().toUpperCase());
									
									//Execute the method to give the rest of the players the ability to purchase the area.
									executePurchaseAreaForRemainingPlayers(gamePlayers, player, area);
									
								}
	
						//Else area is owned and you will need to pay a fee to the player who does owns it
						} else {
							
							//Find out who owns the area
							Player areaOwner = findWhoOwnsTheArea(gamePlayers, area.getIndex());
							
							//DOES THE CURRENT PLAYER OWN THE AREA?
							if (areaOwner.getPlayerName().equalsIgnoreCase(player.getPlayerName())) {
								
							 System.out.printf("%nYou own the square, you do not need to pay a fee%n");
							
							} else {
								
								System.out.printf("%nUh oh this area is owned by %s you must pay them a fee of %d%n", areaOwner.getPlayerName(), area.getPurchasePrice());
								
								//CHECK IF THEY PLAYER HAS ENOUGH FUNDS TO PLAY THE FEE
								//ASSUMING FOR NOW THAT FEE IS THE SAME AS PURCHASE PRICE, THIS CAN BE UPDATED LATER
								if (player.getPlayerFunds()<area.getPurchasePrice()) {
									
									//Player does not have enough funds to pay the fee, therefore inform them and remove them from the game
									System.out.printf("%nI'm afraid you do NOT have enough funds to pay the fee%n%n%s has been removed from the game%n", player.getPlayerName().toUpperCase());
									
									//Update the ownership status of the areas that the player did own to be 'unowned'
									setAreasToUnonwed(player, board);
									
									iteration.remove();
									
								} else {
									
									//Deduct the fee from the players funds
									//FEE IS PLACEHOLDER FOR NOW, IT CAN BE UPDATED WHEN WE CONFIRM WHAT THE ACTUAL FEE SHOULD BE
									player.updatePlayerFundsSubtract(area.getPurchasePrice());
									
									//Add the funds to the area owners account
									//FEE IS PLACEHOLDER FOR NOW, IT CAN BE UPDATED WHEN WE CONFIRM WHAT THE ACTUAL FEE SHOULD BE
									areaOwner.updatePlayerFundsAdd(area.getPurchasePrice());
									
									//Inform player how many funds they have left after paying the fee
									System.out.printf("%nAfter paying the fee, you now have %.2f funds remaining and %s now has %.2f%n", player.getPlayerFunds(), areaOwner.getPlayerName().toUpperCase(), areaOwner.getPlayerFunds());
								}
							}							
						}	
					}
					
				//If user chooses not to continue playing then remove the player from the list of players
				} else {
					
					//Update the ownership status of the areas that the player did own to be 'unowned'
					setAreasToUnonwed(player, board);
					iteration.remove();
					
					//TO DO: WOULD BE NICE IF I COULD REFERENCE THE NAME OF THE PLAYER WHO HAS JUST BEEN REMOVED
					System.out.printf("%nYou have been successfully removed from the game%n");
				}
					
			}
			
			endOfRoundUpdate(gamePlayers, board);

			//If 1 player remains then the game ends and they are declared the winner	
			} while (gamePlayers.size() >= 2);

			System.out.printf("%nCongratulations %s has won the game!!!%n", gamePlayers.get(0).getPlayerName());
			
		}
	
	//This method is issued to execute the logic when a player chooses not to purchase as area. The remaining players are offered the ability to purchase the area. If a user opts to purchase an area it checks if the player has enough funds to purchase the area and if so adds it to the list of owned areas for the player and sets the ownership status of the area to true.
	private static void executePurchaseAreaForRemainingPlayers(ArrayList<Player> gamePlayers, Player player,
			Areas area) {
		
		UserInput userInput = new UserInput();
		
		//Create list of remaining players
		ArrayList<Player> remainingPlayers = gamePlayers;
		
		//Loop through remaining players to see if any of them would like to purchase the area
		for (Player remainingPlayer : remainingPlayers) {
			
			//Ignore the player who who originally declined to purchase the area
			if (remainingPlayer.getPlayerName().equalsIgnoreCase(player.getPlayerName())) {
				
			//Player is not the original player therefore offer them the opportunity to purchase the area
			} else {
				
				System.out.printf("%nWould %s like to purchase the area for a fee of %d? Enter 'Yes' or 'No' %n", remainingPlayer.getPlayerName().toUpperCase(), area.getPurchasePrice());
				
				//Next player would like to purchase the area
				if (userInput.getAreaPurchaseAnswer().equalsIgnoreCase("Yes")) {
					
					//First check that the player has enough funds
					if (remainingPlayer.getPlayerFunds()>=area.getPurchasePrice()) {
					
						System.out.printf("%nOkay you have %.2f, which is enough, lets purchase the area!%n", remainingPlayer.getPlayerFunds());
						
						//Add the area to the list of owned areas for the player
						remainingPlayer.addToOwnedAreas(area.getIndex());
						
						//Update the ownership status of the area to be owned
						area.setAreaOwned();
						
						//Debit the players funds with the fee for the area
						remainingPlayer.updatePlayerFundsSubtract(area.getPurchasePrice());
						
						//Console output to confirm that the area has been successfully added to the players list of owned areas and the players remaining funds and exit the loop
						if (remainingPlayer.getOwnedAreas().contains(area.getIndex())) {
						
							System.out.printf("%nCongrats %s, you have successfully purchased the area!! You have %.2f funds remaining%n", remainingPlayer.getPlayerName().toUpperCase(), remainingPlayer.getPlayerFunds());
							break;
						}
						
					//Else player does not have enough funds therefore inform them
					} else {
						
						System.out.printf("%nSorry you do not have enough funds to purchase the area.%n");
						
					}
				}	
			}
			
		}
		
	}

	//This method is issued to execute the logic required to purchase an area. It checks if a player has enough funds to purchase the area and if so adds it to the list of owned areas for the player and sets the ownership status of the area to true.
	private static void executePurchaseArea(Player player, Areas area) {
		
		if (player.getPlayerFunds()>=area.getPurchasePrice()) {
			
			System.out.printf("%nOkay you have %.2f, which is enough, lets purchase the area!%n", player.getPlayerFunds());
		
			//Add the area to the list of owned areas for the player
			player.addToOwnedAreas(player.getBoardPosition());
			
			//Update the ownership status of the area to be owned
			area.setAreaOwned();
			
			//Debit the players funds with the fee for the area
			player.updatePlayerFundsSubtract(area.getPurchasePrice());
		
			//Console output to confirm that the area has been successfully added to the players list of owned areas and the players remaining funds
			if (player.getOwnedAreas().contains(player.getBoardPosition())) {
			
				System.out.printf("%nCongrats %s, you have successfully purchased the area!! You have %.2f funds remaining%n", player.getPlayerName().toUpperCase(), player.getPlayerFunds());
			}
		
		//Player does not have enough funds therefore inform them
		} else {
			
			System.out.printf("%nSorry you do not have enough funds to purchase the area.%n");
		}
		
	}
	
	// This method accepts a player and a board object and updates the areas within the board objects owned variable to be not owned based on the areas that the player owns
	private static void setAreasToUnonwed(Player player, Board board) {
		
		ArrayList<Integer>list = player.getOwnedAreas();
		
		for (Integer integer : list) {
			
			Areas area = (Areas) board.getBoardLocation(integer);
			
			area.removeAreaOwnershipt();
		}
		
	}

	//Finds and returns the player who owns the area associated with the area index
	private static Player findWhoOwnsTheArea(ArrayList<Player> gamePlayers, Integer areaIndex) {
		
		Player playerToReturn = null;
		
		for (Player areaOwner : gamePlayers) {
			
			if (areaOwner.getOwnedAreas().contains(areaIndex)) {
				
				playerToReturn = areaOwner;
			}
		}
		return playerToReturn;
	}

	private static void endOfRoundUpdate(ArrayList<Player> gamePlayers, Board board) {
		
		System.out.println();
		System.out.println("============================================================================================");
		System.out.println("\r\n"
				+ " _____                       _    _____                      _      _           _ \r\n"
				+ "|  __ \\                     | |  / ____|                    | |    | |         | |\r\n"
				+ "| |__) |___  _   _ _ __   __| | | |     ___  _ __ ___  _ __ | | ___| |_ ___  __| |\r\n"
				+ "|  _  // _ \\| | | | '_ \\ / _` | | |    / _ \\| '_ ` _ \\| '_ \\| |/ _ \\ __/ _ \\/ _` |\r\n"
				+ "| | \\ \\ (_) | |_| | | | | (_| | | |___| (_) | | | | | | |_) | |  __/ ||  __/ (_| |\r\n"
				+ "|_|  \\_\\___/ \\__,_|_| |_|\\__,_|  \\_____\\___/|_| |_| |_| .__/|_|\\___|\\__\\___|\\__,_|\r\n"
				+ "                                                      | |                         \r\n"
				+ "                                                      |_|                         \r\n"
				+ "\r\n"
				+ "");
		System.out.println("============================================================================================");
		System.out.println();
		System.out.println(" _____                       _   _    _           _       _       \r\n"
				+ "|  __ \\                     | | | |  | |         | |     | |      \r\n"
				+ "| |__) |___  _   _ _ __   __| | | |  | |_ __   __| | __ _| |_ ___ \r\n"
				+ "|  _  // _ \\| | | | '_ \\ / _` | | |  | | '_ \\ / _` |/ _` | __/ _ \\\r\n"
				+ "| | \\ \\ (_) | |_| | | | | (_| | | |__| | |_) | (_| | (_| | ||  __/\r\n"
				+ "|_|  \\_\\___/ \\__,_|_| |_|\\__,_|  \\____/| .__/ \\__,_|\\__,_|\\__\\___|\r\n"
				+ "                                       | |                        \r\n"
				+ "                                       |_|                        \r\n"
				+ "");
		System.out.println("===========================================================================================");
		for (Player player : gamePlayers) {
			System.out.printf("%n%s currently has %.2f funds and currently owns:%n",player.getPlayerName().toUpperCase(), player.getPlayerFunds());
			ArrayList<Integer> ownedAreas = player.getOwnedAreas();
			for (Integer locationIndex : ownedAreas) {
				System.out.printf("%n%s%n",board.getLocation(locationIndex));
			}
			System.out.println("===========================================================================================");
			System.out.println("===========================================================================================");
		}
		
	}
		
	private static void printPlayerBoardPosition(Player player, Board board) {
		
		System.out.printf("%n%s is now currently on square: %d '%s'.%n", player.getPlayerName().toUpperCase(), player.getBoardPosition(), board.getLocation(player.getBoardPosition()));
		
	}
	

	//This method prints the current position of each player on the board
	private static void printPlayerBoardPositions(ArrayList<Player> gamePlayers, Board board) {
		
		for (Player player : gamePlayers) {

			System.out.printf("%n%s is currently on square: %d '%s'.%n", player.getPlayerName().toUpperCase(), player.getBoardPosition(), board.getLocation(player.getBoardPosition()));

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