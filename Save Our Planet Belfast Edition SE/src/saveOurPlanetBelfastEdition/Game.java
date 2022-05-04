package saveOurPlanetBelfastEdition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

import board.Areas;
import board.Board;
import board.BoardSetup;

public class Game {

	private static final int MIN_PLAYERS = 2;
	private static final int MAX_PLAYERS = 4;

	public static void main(String[] args) {

		ArrayList<Player> gamePlayers = new ArrayList<Player>();

		// Object to handle communication with players
		UserInput userInput = new UserInput();

		// Create the board that will be used by t3he players for the game
		Board board = BoardSetup.getNewBoard();

		// Create dice to be used by the players for the game
		Dice[] dice = Dice.generateDice();

		// create ui to print graphics
		UserInterface ui = new UserInterface();

		// Call the board classes method to print the contents of the board to the
		// console

		// prints title for game
		ui.printTitle();

		// Get and store the number of game players
		int numberOfPlayers = validateNumPlayers();

		// Add players to the game
		addPlayer(numberOfPlayers, gamePlayers, userInput, ui);

		System.out.printf("%nAll %d players have been successfully created!%n%n", gamePlayers.size());

		// Print out the board
		ui.printBreakLinesStar();
		System.out.println("Board Layout");
		System.out.println();
		board.printBoard();
		ui.printBreakLinesStar();

		// Display the current position of each player on the board
		ui.printBreakLinesStar();
		printPlayerBoardPositions(gamePlayers, board);
		ui.printBreakLinesStar();

		do {

			Iterator<Player> iteration = gamePlayers.iterator();

			while (iteration.hasNext()) {

				Player player = iteration.next();
				// Ask the player whose turn it is if they would like to continue playing the
				// game.
				ui.printnextPlayer();
				System.out.printf("%nWould player %d %s like to continue playing?%n", gamePlayers.indexOf(player) + 1,
						player.getPlayerName().toUpperCase());

				System.out.printf("%nPlease enter Yes or No%n");
				ui.printBreakLinesStar();

				// TO DO: SHOULD HANDLE UNEXPECTED USER INPUT. ALSO NEED TO HANDLE UNEXPECTED
				// INPUT WHEN SELECTING NAME OR MARKER, I.E USER ENTERS INT WHEN STRING IS
				// EXPECTED

				// If yes then execute the current players turn
				if (userInput.continuePlaying().toLowerCase().equalsIgnoreCase("yes")) {

					// player rolls Dice
					// HAD TO COMMENT OUT THIS METHOD CALL AS IT WASN'T WORKING, LATERPLAYERS ALWAYS
					// GOT THE SAME VALUE AS THE PLAYER WHO ROLLED FIRST
					// playerRollsDice(player, dice);
					ui.printBreakLinesStar();
					System.out.printf("%n%s's go, rolling dice now!%n", player.getPlayerName().toUpperCase());

					Dice.rollDice(dice);

					int rolledValue = Dice.sumDice(dice);

					// print graphics
					ui.printDiceRolled();

					System.out.printf("%n%s rolled %d%n", player.getPlayerName().toUpperCase(), rolledValue);

					// checks if rolled value and current board position combined exceeds index 11
					// and if it does then it adds funds to the players account
					passGoCollectMoreDoe(player, board, dice, ui, rolledValue);

					// Set the player's new position on the board
					player.setBoardPosition(board.getNewPlayerBoardPosition(player.getBoardPosition(), rolledValue));

					// Print out the players new position
					printPlayerBoardPosition(player, board);
					ui.printBreakLinesStar();

					// Only 'ownable' areas can be purchased, therefore check the object type that
					// the player has landed on before proceeding with buying/paying a fee
					if (board.getBoardLocation(player.getBoardPosition()) instanceof Areas) {

						Areas area = (Areas) board.getBoardLocation(player.getBoardPosition());

						// If it is not owned then ask the player if they would like to purchase it
						if (!area.isAreaOwned()) {

							// print graphic
							ui.printPurchaseArea();

							System.out.printf(
									"%nThis square is currently NOT owned by another player. %n%nWould you like to purchase it for a fee of %d? Enter 'Yes' or 'No' %n",
									area.getPurchasePrice());

							if (userInput.getAreaPurchaseAnswer().equalsIgnoreCase("Yes")) {

								// First check if player has enough funds and only then allow the player to
								// purchase the area
								ui.printBreakLinesStar();
								System.out.printf(
										"%nOkay, but first lets double check that you have the sufficient funds.%n");

								// Execute the method to allow a user to purchase the area
								executePurchaseArea(player, area, ui);

								// Current player has chosen not to purchase the area therefore ask remaining
								// players if they would like to purchase it
							} else {
								ui.printBreakLinesStar();
								ui.printPurchaseArea();
								System.out.printf(
										"%n%s has chosen not to purchase the area. Therefore the remaining players will now get the opportunity to purchase the area %n",
										player.getPlayerName().toUpperCase());

								// Execute the method to give the rest of the players the ability to purchase
								// the area.
								executePurchaseAreaForRemainingPlayers(gamePlayers, player, area, ui);

							}

							// Else area is owned and you will need to pay a fee to the player who does owns
							// it
						} else {

							// Find out who owns the area
							Player areaOwner = findWhoOwnsTheArea(gamePlayers, area.getIndex());

							// If current player owns the area
							if (areaOwner.getPlayerName().equalsIgnoreCase(player.getPlayerName())) {
								System.out.printf("%nYou own the square, you do not need to pay a fee%n");

								// If player also owns all of the other areas for the field in which the current
								// area resides, then they can make minor/major investments
								if (checkFieldOnwership(area, board, player)) {
									System.out.printf(
											"%nYou currently own all areas within the field that the current area resides%n");
									// Check if maximum amount of minor developments are established
									if (area.getCountOfMinorDev() == 3) {
										ui.printBreakLinesStar();
										System.out.printf(
												"%nThe maximum number of minor developments permitted has been established you can now establish a Major development! %nThe cost of establishing a Major development will be %d%n",
												area.getCostOfEstablishingMajorDev());
										ui.printBreakLinesStar();
										// Check player has enough funds to establish a major development
										if (player.getPlayerFunds() >= area.getCostOfEstablishingMajorDev()) {
											ui.printBreakLinesStar();
											System.out.printf(
													"%nOkay you have %.2f, which is enough, lets establish the Major development!%n",
													player.getPlayerFunds());
											ui.printBreakLinesStar();
											// Establish a minor development
											area.incrementMajorDevelopment();
											;

											// Debit the players funds with the fee for the area
											player.updatePlayerFundsSubtract(area.getCostOfEstablishingMajorDev());

											// Player does not have enough funds therefore inform them
										} else {
											ui.printBreakLinesStar();
											System.out.printf(
													"%nSorry you do not have enough funds to establish a Major developmet on the area.%n");
											ui.printBreakLinesStar();
										}
										// If the maximum number of minor developments has not been created on the area
										// then player can establish another minor development
									} else {
										System.out.printf(
												"%nYou can establish a Minor development on this area! The fee for doing so will be %d%n",
												area.getCostOfEstablishingMinorDev());
										// Check player has enough funds to establish a minor development
										if (player.getPlayerFunds() >= area.getCostOfEstablishingMinorDev()) {
											System.out.printf(
													"%nOkay you have %.2f, which is enough, lets establish the Minor development!%n",
													player.getPlayerFunds());
											// Establish a minor development
											area.incrementMinorDevelopment();

											// Debit the players funds with the fee for the area
											player.updatePlayerFundsSubtract(area.getCostOfEstablishingMinorDev());

											// Player does not have enough funds therefore inform them
										} else {
											System.out.printf(
													"%nSorry you do not have enough funds to establish a Minor developmet on the area.%n");
										}
									}
								}

							} else {
								ui.printBreakLinesStar();
								// print graphics
								ui.printPayFee();

								System.out.printf("%nUh oh this area is owned by %s %n", areaOwner.getPlayerName());

								// The fee to be paid will be based on a multitude of factors, therefore call
								// this method to determine the correct price
								double fee = findOutHowMuchToPay(area, ui);

								// Check if the player has enough funds to pay the fee
								if (player.getPlayerFunds() < fee) {

									// Player does not have enough funds to pay the fee, therefore inform them and
									// remove them from the game
									System.out.printf(
											"%nI'm afraid you do NOT have enough funds to pay the fee%n%n%s has been removed from the game%n",
											player.getPlayerName().toUpperCase());
									ui.printBreakLinesStar();
									// Update the ownership status of the areas that the player did own to be
									// 'unowned'
									setAreasToUnonwed(player, board);

									iteration.remove();

								} else {

									// Deduct the fee from the players funds
									player.updatePlayerFundsSubtract(fee);

									// Add the funds to the area owners account
									areaOwner.updatePlayerFundsAdd(fee);

									// Inform player how many funds they have left after paying the fee
									System.out.printf(
											"%nAfter paying the fee, you now have %.2f funds remaining and %s now has %.2f%n",
											player.getPlayerFunds(), areaOwner.getPlayerName().toUpperCase(),
											areaOwner.getPlayerFunds());
									ui.printBreakLinesStar();
								}
							}
						}

						// Offer player option to purchase a different area or make an additional
						// investment if they already own all fields in the chosen area
						makeAdditionalInvestment(player, board, gamePlayers, ui);

					}

					// If user chooses not to continue playing then remove the player from the list
					// of players
				} else {

					// Update the ownership status of the areas that the player did own to be
					// 'unowned'
					setAreasToUnonwed(player, board);
					iteration.remove();
					ui.printBreakLinesEquals();
					System.out.printf("%nYou have been successfully removed from the game%n");
					ui.printBreakLinesEquals();
				}
			}

			// Publish the current state of play at the end of the round
			endOfRoundUpdate(gamePlayers, board, ui);

			// If 1 player remains then the game ends and they are declared the winner
		} while (gamePlayers.size() >= 2);
		ui.printBreakLinesEquals();
		System.out.printf("%nCongratulations %s has won the game!!!%n", gamePlayers.get(0).getPlayerName());
		ui.printBreakLinesEquals();
	}

	// ==================================================
	// ==========::Make Additional Investment::==========
	// ==================================================
	/**
	 * This method offers the ability for a player to make a further investment on
	 * the board. User can select the area to develop And will be presented with
	 * various options based on the current status of the area selected, such as
	 * purchase, make an offer to purchase from the existing owner or make an
	 * additional minor or major investment.
	 * 
	 * @param player
	 * @param board
	 * @param gamePlayers
	 * @param ui
	 */
	private static void makeAdditionalInvestment(Player player, Board board, ArrayList<Player> gamePlayers,
			UserInterface ui) {
		// print graphics
		ui.printBreakLinesStar();
		ui.printInvest();

		UserInput userInput = new UserInput();
		System.out.printf("%nWould %S like to make an additional investment in an area? Please enter 'Yes' or 'No'%n",
				player.getPlayerName());
		ui.printBreakLinesStar();

		if (userInput.getPurchaseAdditionalAreaAnswer().equalsIgnoreCase("Yes")) {

			ui.printBreakLinesStar();
			System.out.printf("%nWhich area would you like to invest in?%n");

			board.printBoard();

			System.out.printf("%nPlease enter the index associated with the area%n");
			ui.printBreakLinesStar();

			Boolean flag = false;

			int answer;

			do {
	
					answer = userInput.getPurchaseAdditionalAreaIndexAnswer();
					if (answer == 0 || answer == 6) {

						flag = false;
						ui.printBreakLinesStar();
						System.out.printf("%nYou cannot invest in %s or %s, please enter another selection%n",
								board.getBoardLocation(0).getAreaName(), board.getBoardLocation(6).getAreaName());
						ui.printBreakLinesStar();

					} else {

						flag = true;
					
					}

			} while (!flag);

			// Get the area associated with the index that has been entered
			Areas area = (Areas) board.getBoardLocation((Integer) answer);
			ui.printBreakLinesStar();
			System.out.printf("%nYou have requested to invest in the %s area%n", area.getAreaName());

			// Find out if the selected area is already owned
			if (area.isAreaOwned()) {

				// Find out who owns the area
				Player areaOwner = findWhoOwnsTheArea(gamePlayers, area.getIndex());

				// If current player owns the area
				if (areaOwner.getPlayerName().equalsIgnoreCase(player.getPlayerName())) {

					// Check if current player owns the field that the area resides in
					if (checkFieldOnwership(area, board, player)) {

						// NEED TO ADD LOGIC TO STOP PLAYER FROM ADDING 2 OR MORE MAJOR DEVELOPMENTS
						// Check if maximum amount of minor developments are established
						if (area.getCountOfMinorDev() == 3) {

							// print graphics
							ui.printMajorDevelopment();
							System.out.printf(
									"%nThe maximum number of minor developments permitted has been established you can now establish a Major development! %nThe cost of establishing a Major development will be %d%n",
									area.getCostOfEstablishingMajorDev());
							ui.printBreakLinesStar();

							// Check player has enough funds to establish a major development
							if (player.getPlayerFunds() >= area.getCostOfEstablishingMajorDev()) {

								System.out.printf(
										"%nOkay you have %.2f, which is enough, lets establish the Major development!%n",
										player.getPlayerFunds());
								ui.printBreakLinesStar();

								// Establish a minor development
								area.incrementMajorDevelopment();
								;

								// Debit the players funds with the fee for the area
								player.updatePlayerFundsSubtract(area.getCostOfEstablishingMajorDev());

								// Player does not have enough funds therefore inform them
							} else {

								System.out.printf(
										"%nSorry you do not have enough funds to establish a Major developmet on the area.%n");
								ui.printBreakLinesStar();

							}

						} else {
							// print graphics
							ui.printMinorDevelopment();
							System.out.printf(
									"%nYou can establish a Minor development on this area! The fee for doing so will be %d%n",
									area.getCostOfEstablishingMinorDev());
							ui.printBreakLinesStar();

							// Check player has enough funds to establish a minor development
							if (player.getPlayerFunds() >= area.getCostOfEstablishingMinorDev()) {

								System.out.printf(
										"%nOkay you have %.2f, which is enough, lets establish the Minor development!%n",
										player.getPlayerFunds());
								ui.printBreakLinesStar();

								// Establish a minor development
								area.incrementMinorDevelopment();

								// Debit the players funds with the fee for the area
								player.updatePlayerFundsSubtract(area.getCostOfEstablishingMinorDev());

								// Player does not have enough funds therefore inform them
							} else {

								System.out.printf(
										"%nSorry you do not have enough funds to establish a Minor developmet on the area.%n");
								ui.printBreakLinesStar();

							}
						}

					} else {

						System.out.printf(
								"%nSorry you do not own all of the areas within the field, therefore you cannot make an additional investment in this area%n");
						ui.printBreakLinesStar();

					}

					// Selected area is owned by another player therefore allow the player to make
					// an offer to purchase the area
				} else {

					System.out.printf(
							"%nThis area is already owned by %S you can make them an offer to purchase the area from them.%n",
							areaOwner.getPlayerName());
					ui.printBreakLinesStar();

					System.out.printf("%nHow much would you like to offer to purchase the area?%n");
					ui.printBreakLinesStar();

					// Store offer in a variable
					int offer = userInput.getOfferPrice();

					// Ask owner whether to accept
					System.out.printf("%nDoes %S want to sell this area for that price? Please enter 'Yes' or 'No'%n",
							areaOwner.getPlayerName());
					ui.printBreakLinesStar();

					// If owner accepts then check player has the funds to pay and if so add area to
					// players owned index and remove it from the original owner
					if (userInput.getAreaPurchaseAnswer().equalsIgnoreCase("Yes")) {

						if (player.getPlayerFunds() >= offer) {

							System.out.printf(
									"%nOkay you have %.2f, which is enough, lets complete the transfer of ownership!%n",
									player.getPlayerFunds());
							ui.printBreakLinesStar();

							// Debit the players funds with the fee for the area
							player.updatePlayerFundsSubtract(offer);

							// Credit the original owners account with the fee for the area
							areaOwner.updatePlayerFundsAdd(offer);

							// Remove area from previous owners list of owned areas
							areaOwner.removeFromOwnedAreas(area.getIndex());

							// Add area to the new owners list of owned areas
							player.addToOwnedAreas(area.getIndex());

							// Player does not have enough funds therefore inform them
						} else {

							System.out.printf("%nSorry you do not have enough funds to complete the transaction.%n");
							ui.printBreakLinesStar();

						}
					}
				}

			}

			// Area is not owned therefore purchase and add to owned
			if (!area.isAreaOwned()) {

				System.out.printf("%nThis area is not currently owned by any other player%n");

				// Does player have enough funds to purchase the area

				if (player.getPlayerFunds() >= area.getPurchasePrice()) {

					System.out.printf("%nTo purchase it you will be required to pay a fee of %d %n",
							area.getPurchasePrice());

					System.out.printf("%nOkay you have %.2f, which is enough, lets purchase the area!%n",
							player.getPlayerFunds());

					// Add the area to the list of owned areas for the player
					player.addToOwnedAreas(area.getIndex());

					// Update the ownership status of the area to be owned
					area.setAreaOwned();

					// Debit the players funds with the fee for the area
					player.updatePlayerFundsSubtract(area.getPurchasePrice());

					// Console output to confirm that the area has been successfully added to the
					// players list of owned areas and the players remaining funds
					if (player.getOwnedAreas().contains(area.getIndex())) {

						System.out.printf(
								"%nCongrats %s, you have successfully purchased the area!! You have %.2f funds remaining%n",
								player.getPlayerName().toUpperCase(), player.getPlayerFunds());
						ui.printBreakLinesStar();

					}

					// Player does not have enough funds therefore inform them
				} else {

					System.out.printf("%nSorry you do not have enough funds to purchase the area.%n");
					ui.printBreakLinesStar();

				}

			}
		}

	}

	// ==================================================
	// ===========::Check Field Ownership::==============
	// ==================================================
	/**
	 * This method checks the see if the player supplied owns all areas within the
	 * field for which the supplied area is and returns true if yes
	 * 
	 * @param area
	 * @param board
	 * @param player
	 * @return
	 */
	private static Boolean checkFieldOnwership(Areas area, Board board, Player player) {

		Boolean response = false;

		Boolean allAreasOwned = false;

		Boolean playerOwnsAllAreas = false;

		// Get all of the areas that are in the field
		ArrayList<Areas> allAreasInField = board.getAreasInField(area.getAreaField());

		// Loop through all areas in the field and check that they are all owned
		for (Areas areas : allAreasInField) {

			if (areas.isAreaOwned()) {

				allAreasOwned = true;

			} else {

				allAreasOwned = false;
			}
		}

		// Check that the current player owns all of the areas
		for (Areas areas : allAreasInField) {

			if (player.getOwnedAreas().contains(areas.getIndex())) {

				playerOwnsAllAreas = true;

			} else {

				playerOwnsAllAreas = false;
			}

		}

		if (allAreasOwned == true && playerOwnsAllAreas == true) {

			response = true;
		}

		return response;
	}

	// ==================================================
	// ==========::License Fee Calculation::=============
	// ==================================================
	/**
	 * This method is used to determine the amount due for landing on the area
	 * 
	 * @param area
	 * @param ui
	 * @return
	 */
	private static double findOutHowMuchToPay(Areas area, UserInterface ui) {

		double fee = 0;

		// If major development is present
		if (area.getCountOfMajorDev() >= 1) {
			System.out.printf("%nThis area contains %d Major Development(s), therefore you must pay %.2f%n",
					area.getCountOfMajorDev(), area.areaMajorDevelopmentsLicenseFee());

			fee = area.areaMajorDevelopmentsLicenseFee();

			// If minor development is present
		} else if (area.getCountOfMinorDev() >= 1) {
			System.out.printf("%nThis area contains %d Minor Development(s), therefore you must pay %.2f%n",
					area.getCountOfMinorDev(), area.areaMinorDevelopmentsLicenseFee());

			fee = area.areaMinorDevelopmentsLicenseFee();

			// Else only the license fee is due
		} else {

			System.out.printf(
					"%nLuckily for you there are NO Minor or Major developments present on this area, therefore you must pay the base license fee of %.2f%n",
					area.areaLicenseFee());

			fee = area.areaLicenseFee();
		}

		return fee;
	}

	// ==================================================
	// ====::Execute Purchase for Remaining Players::====
	// ==================================================
	/**
	 * This method is issued to execute the logic when a player chooses not to
	 * purchase an area. The remaining players are offered the ability to purchase
	 * the area. If a user opts to purchase an area it checks if the player has
	 * enough funds to purchase the area and if so adds it to the list of owned
	 * areas for the player and sets the ownership status of the area to true.
	 * 
	 * @param gamePlayers
	 * @param player
	 * @param area
	 * @param ui
	 */
	private static void executePurchaseAreaForRemainingPlayers(ArrayList<Player> gamePlayers, Player player, Areas area,
			UserInterface ui) {

		UserInput userInput = new UserInput();

		// Create list of remaining players
		ArrayList<Player> remainingPlayers = gamePlayers;

		// Loop through remaining players to see if any of them would like to purchase
		// the area
		for (Player remainingPlayer : remainingPlayers) {

			// Ignore the player who who originally declined to purchase the area
			if (remainingPlayer.getPlayerName().equalsIgnoreCase(player.getPlayerName())) {

				// Player is not the original player therefore offer them the opportunity to
				// purchase the area
			} else {
				System.out.printf("%nWould %s like to purchase the area for a fee of %d? Enter 'Yes' or 'No' %n",
						remainingPlayer.getPlayerName().toUpperCase(), area.getPurchasePrice());
				ui.printBreakLinesStar();

				// Next player would like to purchase the area
				if (userInput.getAreaPurchaseAnswer().equalsIgnoreCase("Yes")) {

					// First check that the player has enough funds
					if (remainingPlayer.getPlayerFunds() >= area.getPurchasePrice()) {

						System.out.printf("%nOkay you have %.2f, which is enough, lets purchase the area!%n",
								remainingPlayer.getPlayerFunds());

						// Add the area to the list of owned areas for the player
						remainingPlayer.addToOwnedAreas(area.getIndex());

						// Update the ownership status of the area to be owned
						area.setAreaOwned();

						// Debit the players funds with the fee for the area
						remainingPlayer.updatePlayerFundsSubtract(area.getPurchasePrice());

						// Console output to confirm that the area has been successfully added to the
						// players list of owned areas and the players remaining funds and exit the loop
						if (remainingPlayer.getOwnedAreas().contains(area.getIndex())) {

							System.out.printf(
									"%nCongrats %s, you have successfully purchased the area!! You have %.2f funds remaining%n",
									remainingPlayer.getPlayerName().toUpperCase(), remainingPlayer.getPlayerFunds());

							break;
						}

						// Else player does not have enough funds therefore inform them
					} else {

						System.out.printf("%nSorry you do not have enough funds to purchase the area.%n");

					}
				}
			}

		}

	}

	// ==================================================
	// ===========::Execute Purchase Price::=============
	// ==================================================
	/**
	 * This method is issued to execute the logic required to purchase an area. It
	 * checks if a player has enough funds to purchase the area and if so adds it to
	 * the list of owned areas for the player and sets the ownership status of the
	 * area to true.
	 * 
	 * @param player
	 * @param area
	 * @param ui
	 */
	private static void executePurchaseArea(Player player, Areas area, UserInterface ui) {

		if (player.getPlayerFunds() >= area.getPurchasePrice()) {
			System.out.printf("%nOkay you have %.2f, which is enough, lets purchase the area!%n",
					player.getPlayerFunds());

			// Add the area to the list of owned areas for the player
			player.addToOwnedAreas(player.getBoardPosition());

			// Update the ownership status of the area to be owned
			area.setAreaOwned();

			// Debit the players funds with the fee for the area
			player.updatePlayerFundsSubtract(area.getPurchasePrice());

			// Console output to confirm that the area has been successfully added to the
			// players list of owned areas and the players remaining funds
			if (player.getOwnedAreas().contains(player.getBoardPosition())) {

				System.out.printf(
						"%nCongrats %s, you have successfully purchased the area!! You have %.2f funds remaining%n",
						player.getPlayerName().toUpperCase(), player.getPlayerFunds());

			}

			// Player does not have enough funds therefore inform them
		} else {

			System.out.printf("%nSorry you do not have enough funds to purchase the area.%n");

		}

	}

	// ==================================================
	// ===========::Set Areas to Un-owned::==============
	// ==================================================
	/**
	 * This method accepts a player and a board object and iterates through the
	 * areas owned by the player and sets their ownership status to false in
	 * addition any minor or major developments are set to 0
	 * 
	 * @param player
	 * @param board
	 */
	private static void setAreasToUnonwed(Player player, Board board) {

		ArrayList<Integer> list = player.getOwnedAreas();

		for (Integer integer : list) {

			Areas area = (Areas) board.getBoardLocation(integer);

			area.removeAreaOwnershipt();
			area.removeMinorDevelopment();
			area.removeMajorDevelopment();
		}

	}

	// ==================================================
	// ==============::Who Owns the Area::===============
	// ==================================================
	/**
	 * Finds and returns the player who owns the area associated with the area index
	 * 
	 * @param gamePlayers
	 * @param areaIndex
	 * @return
	 */
	private static Player findWhoOwnsTheArea(ArrayList<Player> gamePlayers, Integer areaIndex) {

		Player playerToReturn = null;

		for (Player areaOwner : gamePlayers) {

			if (areaOwner.getOwnedAreas().contains(areaIndex)) {

				playerToReturn = areaOwner;
			}
		}
		return playerToReturn;
	}

	// ==================================================
	// ============::End of Round Update::===============
	// ==================================================
	/**
	 * displays an update at the end of each round to display important information
	 * to the players
	 * 
	 * @param gamePlayers
	 * @param board
	 * @param ui
	 */
	private static void endOfRoundUpdate(ArrayList<Player> gamePlayers, Board board, UserInterface ui) {

		// print graphics
		ui.printRoundComplete();

		// print graphics
		ui.printRoundUpdate();

		for (Player player : gamePlayers) {

			System.out.printf("%n%s currently has %.2f funds and currently owns:%n",
					player.getPlayerName().toUpperCase(), player.getPlayerFunds());

			ArrayList<Integer> ownedAreas = player.getOwnedAreas();

			for (Integer locationIndex : ownedAreas) {

				// System.out.printf("%n%s%n", board.getLocation(locationIndex));

				Areas area = (Areas) board.getBoardLocation(locationIndex);

				System.out.printf("%n%s which is part of the field %S %n", area.getAreaName(), area.getAreaField());

				if (area.getCountOfMinorDev() > 0) {

					System.out.printf("This area currently has %d minor development(s)%n", area.getCountOfMinorDev());

				} else if (area.getCountOfMajorDev() > 0) {

					System.out.printf("This area currently has %d major development(s)%n", area.getCountOfMajorDev());
				}

			}

			// print break lines
			ui.printBreakLinesEquals();

		}

	}

	// ==================================================
	// =======::Print Player Board Position::============
	// ==================================================
	/**
	 * Prints the players current board position
	 * 
	 * @param player
	 * @param board
	 */
	private static void printPlayerBoardPosition(Player player, Board board) {

		System.out.printf(
				"%n%s is now currently on square: %d '%s' and their marker '%s' has been placed on this location.%n",
				player.getPlayerName().toUpperCase(), player.getBoardPosition(),
				board.getLocation(player.getBoardPosition()), player.getMarker().getTitle());

	}

	// ==================================================
	// =======::Print Player Board Positions::===========
	// ==================================================
	/**
	 * This method prints the current position of each player on the board
	 * 
	 * @param gamePlayers
	 * @param board
	 */
	private static void printPlayerBoardPositions(ArrayList<Player> gamePlayers, Board board) {

		for (Player player : gamePlayers) {

			System.out.printf("%n%s is currently on square: %d '%s'.%n", player.getPlayerName().toUpperCase(),
					player.getBoardPosition(), board.getLocation(player.getBoardPosition()));

		}

	}

	// ==================================================
	// ========::Validate Number of Players::============
	// ==================================================
	/**
	 * Asks user for the number of game players and validates the input will
	 * continue to ask player for number of players until it is within the accepted
	 * range as dictated by the MIN_PLAYERS & MAX_PLAYERS variables
	 * 
	 * @return
	 */
	public static int validateNumPlayers() {

		boolean flag = true;
		int players = 0;
		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Please enter number of players, min 2... max 4...");

			
			try {
				String numPlayers = sc.next();

				if (numPlayers == null) {

					System.out.println("Must enter a number between " + MIN_PLAYERS + " and " + MAX_PLAYERS);

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
			} catch (NumberFormatException e) {
				
				flag = false;
			}
			
		} while (!flag);

		return players;

	}

	// ==================================================
	// ===============::Add Player::=====================
	// ==================================================
	/**
	 * Create players and add them to the list of game players. Amount of players
	 * created depends on the amount entered by the user, amount of players
	 * permitted must be within the MIN_PLAYERS & MAX_PLAYERS limits. Player names
	 * must be unique. Each game player is asked to select a game marker and each
	 * game marker must be unique per player.
	 */
	public static void addPlayer(int numberOfPlayers, ArrayList<Player> gamePlayers, UserInput userInput,
			UserInterface ui) {

		for (int i = 0; i < numberOfPlayers; i++) {

			boolean nameTaken = false;

			String playerName;

			do {

				nameTaken = false;

				// print graphics
				ui.printBreakLinesStar();
				ui.printEnterName();
				System.out.printf("%nPlease enter your player name.%n");
				ui.printBreakLinesStar();

				playerName = userInput.getPlayerName();

				for (Player player : gamePlayers) {

					if (player.getPlayerName().equalsIgnoreCase(playerName)) {

						System.out.printf("%nSorry that name is already taken.%n");

						nameTaken = true;

					}

				}

			} while (nameTaken);

			// Create marker and call method which validates the users selection and returns
			// the selected marker
			Marker marker = selectMarker(gamePlayers, ui);

			// Create the player
			Player player = new Player(playerName, marker);

			// Add the player to the list of game players
			gamePlayers.add(player);

			// Inform user that the player has been successfully created
			System.out.printf("%nCurrently %d player(s) created.%n", gamePlayers.size());

		}

	}

	// ==================================================
	// ==========::Pass Go Collect More Doe::============
	// ==================================================
	/**
	 * Logic to determine if a player has passed go and if yes then adds funds to
	 * their account based on investments and a base fee of 50 tokens
	 * 
	 * @param player
	 * @param board
	 * @param dice
	 * @param ui
	 * @param rolledValue
	 */
	public static void passGoCollectMoreDoe(Player player, Board board, Dice[] dice, UserInterface ui,
			int rolledValue) {

		if ((player.getBoardPosition() + rolledValue) > 11) {

			// print graphic
			ui.printBreakLinesStar();
			ui.printPassedGo();

			// If greater than 11 (Go) then it will add 50 tokens into the players funds and
			// inform the player of the update

			double returnInvestment = 50;

			System.out.printf("%nYou have passed GO! For passing 'GO' you will get %.2f%n", returnInvestment);

			// if player has 1 or more owned areas then it checks the owned areas and adds
			// them to their return investment

			double addInvestment = 0;

			ArrayList<Integer> playersOwnedAreas = player.getOwnedAreas();

			for (Integer integer : playersOwnedAreas) {

				Areas location = (Areas) board.getBoardLocation(integer);

				addInvestment += location.calculateInvestmentReturn() + location.developmentInvestmentReturn();

				System.out.printf("%nReturn on : " + location.getAreaName() + " is: %.2f%n",
						location.calculateInvestmentReturn() + location.developmentInvestmentReturn());

			}

			returnInvestment = returnInvestment + addInvestment;
			System.out.println("Total return on investment for your owned areas is: " + returnInvestment);

			player.updatePlayerFundsAdd(returnInvestment);

			System.out.printf("%n" + player.getPlayerName().toUpperCase() + " For passing 'Go' and have received "
					+ returnInvestment + " tokens, your new balance is: %.2f%n", player.getPlayerFunds());
			ui.printBreakLinesStar();

		}
	}

	// ==================================================
	// ==============::Is String Numeric::===============
	// ==================================================
	/**
	 * checks if a string is numeric returns true if numeric and false if not
	 * numeric
	 * 
	 * @param strNum
	 * @return
	 */
	public static boolean isNumeric(String strNum) {
		if (strNum == null) {
			return false;
		}
		try {
			int d = Integer.parseInt(strNum);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	// ==================================================
	// ========::Validate Number of Players::============
	// ==================================================
	/**
	 * Method which asks a user to select a marker for the game. Marker must be one
	 * that exists within the system Each type of marker can only be used by a
	 * single player
	 * 
	 * @param gamePlayers
	 * @param ui
	 * @return
	 */
	public static Marker selectMarker(ArrayList<Player> gamePlayers, UserInterface ui) {

		// Create a list of markers
		List<Marker> listOfMarkers = Arrays.asList(Marker.values());

		// Method variables to support the logic within this method
		int userSelection;
		Marker markerToReturn = null;
		boolean taken = false;

		do {

			// Ask user to select marker from those available within the system

			// print graphics
			ui.printBreakLinesStar();
			ui.printMarker();
			System.out.println("Please enter the numerical number according to your choice of marker:");
			System.out.println();

			for (Marker marker : listOfMarkers) {

				System.out.println("Option " + listOfMarkers.indexOf(marker) + ": " + marker.getTitle());
				System.out.println();

			}

			ui.printBreakLinesStar();

			try {
				// Ask user to select a marker
				Scanner sc = new Scanner(System.in);
				userSelection = Integer.parseInt(sc.next());

				// Reset the state of the taken variable
				taken = false;

				if (isNumeric(String.valueOf(userSelection)) == true) {

					taken = false;

				}

				// Handle scenario where user input is out of bounds
				if (userSelection < 0 || userSelection >= 4) {

					System.out.println();
					System.out.println("Selection out of bounds please try again.");
					System.out.println();

					// User selection is valid, now check that selected marker is not already taken
					// by another player
				} else {

					for (Player player : gamePlayers) {

						if (listOfMarkers.get(userSelection) == player.getMarker()) {
							taken = true;
						}
					}
					if (taken == true) {

						System.out.println("Sorry " + listOfMarkers.get(userSelection).getTitle()
								+ " is already taken please choose again");
						System.out.println();

						// User selected marker is not taken by another player therefore inform user and
						// return marker
						} else {

							markerToReturn = listOfMarkers.get(userSelection);
							System.out.println();
							System.out.println("You have chosen: " + markerToReturn.getTitle());
							System.out.println();
						}

					}
			} catch (NumberFormatException e) {
				
				taken = true;
				userSelection = 5;
				System.out.printf("%nYour selection is not recognised, please try again.%n");
			}
			


		} while ((userSelection < 0 || userSelection >= 4) || (taken == true));

		return markerToReturn;

	}

	// ==================================================
	// ==========::Make Development Player::=============
	// ==================================================
	/**
	 * Allows user to make a development on an owned area
	 * 
	 * @param player
	 * @param board
	 */
	public static void makeDevelopmentPlayer(Player player, Board board) {

		// checks if player owns any areas
		if (player.getOwnedAreas().size() > 0) {

			int userSelection;
			Boolean flag = false;

			do {

				System.out.println();
				System.out.println("Please enter the area you wish to develop");
				System.out.println();
				for (int i = 0; i < player.getOwnedAreas().size(); i++) {

					System.out.println("Option " + player.getOwnedAreas().indexOf(i) + ": " + player.getOwnedAreas());

					// take user input
					Scanner sc = new Scanner(System.in);
					userSelection = Integer.parseInt(sc.next());

					// if user input matches an index value in the list then flag = true and user
					// leaves loop
					if (userSelection == player.getOwnedAreas().indexOf(i)) {
						flag = true;

					}

					// else loop repeats until a correct value is selected
					else {
						flag = false;
					}

				}
				;

			} while (flag = false);

		}

	}

}