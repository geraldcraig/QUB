package saveOurPlanetBelfastEdition;

import java.util.Scanner;

public class UserInput {

	Scanner userInput ;

	public UserInput() {
		
		this.userInput = new Scanner(System.in);
	}
	
	//PERHAPS HANDLE USER ENTERING AN INT WHEN WE EXPECT A STRING AND HANDLE, I.E. LOOP UNTIL EXPECTED DATA TYPE IS ENTERED
	public String continuePlaying() {
		
		String response = userInput.next();
		
		return response;
	}
	
	public String getPlayerName() {
		
		String response = userInput.next();
		
		return response;
	
	}
	
	public String getAreaPurchaseAnswer() {
		
		String response = userInput.next();
		
		return response;
	
	}
	
	public String getPurchaseAdditionalAreaAnswer() {
		
		String response = userInput.next();
		
		return response;
	
	}
	
	public Integer getPurchaseAdditionalAreaIndexAnswer() {
		
		 Integer response = Integer.parseInt(userInput.next());
		
		return response;
	
	}
	
	public int getOfferPrice() {
		
		 int response = userInput.nextInt();
		
		return response;
	
	}
	
	public String getOfferAcceptResponse() {
		
		 String response = userInput.next();
		
		return response;
	
	}
}
