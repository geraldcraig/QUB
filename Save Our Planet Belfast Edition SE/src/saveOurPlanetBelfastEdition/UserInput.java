package saveOurPlanetBelfastEdition;

import java.util.Scanner;

public class UserInput {

	Scanner userInput;

	// ==================================================
	// ===============::Create Scanner::=================
	// ==================================================
	/**
	 * 
	 */
	public UserInput() {

		this.userInput = new Scanner(System.in);
	}

	// ==================================================
	// ==============::Continue Playing::================
	// ==================================================
	/**
	 * 
	 * @return
	 */
	public String continuePlaying() {

		String response = userInput.next();

		return response;
	}

	// ==================================================
	// ==============::Get Player Name::=================
	// ==================================================
	/**
	 * 
	 * @return
	 */
	public String getPlayerName() {

		String response = userInput.next();

		return response;

	}

	// ==================================================
	// ============::Get Purchase Answer::===============
	// ==================================================
	/**
	 * 
	 * @return
	 */
	public String getAreaPurchaseAnswer() {

		String response = userInput.next();

		return response;

	}

	// ==================================================
	// =====::get Purchase Additional Area Answer::======
	// ==================================================
	/**
	 * 
	 * @return
	 */
	public String getPurchaseAdditionalAreaAnswer() {

		String response = userInput.next();

		return response;

	}

	// ==================================================
	// ====::get Purchase Additional Area Index ::=======
	// ==================================================
	/**
	 * 
	 * @return
	 */
	public int getPurchaseAdditionalAreaIndexAnswer() {

		int response = userInput.nextInt();

		return response;

	}

	// ==================================================
	// ==============::Get Offer Price::=================
	// ==================================================
	/**
	 * 
	 * @return
	 */
	public int getOfferPrice() {

		int response = userInput.nextInt();

		return response;

	}

	// ==================================================
	// =========::Get Offer Accept Response::============
	// ==================================================
	/**
	 * 
	 * @return
	 */
	public String getOfferAcceptResponse() {

		String response = userInput.next();

		return response;

	}
}
