package uk.ac.qub.p3test;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		Card c1 = new Card("Spider-Man", 82, 77, 90, 70);
		Card c2 = new Card("Superman", 85, 90, 64, 75);
		Card c3 = new Card("Mario", 40, 55, 67, 60);
		Card c4 = new Card("Luigi", 45, 55, 70, 60);
		Card c5 = new Card("Solomon Grundy", 40, 85, 30, 20);
		
		List<Card> card = new ArrayList<Card>();
		card.add(c1);
		card.add(c2);
		card.add(c3);
		card.add(c4);
		card.add(c5);
		
		
		
		
		
		diplayAll(card);
		
		getMaxStat();
		
		//getScore(stat);
		
	}

	private static void getScore(int stat) {
		// TODO Auto-generated method stub
		
	}

	private static void getMaxStat() {
		// TODO Auto-generated method stub
		
	}

	private static void diplayAll(List<Card> card) {
		for (Card c : card) {
			System.out.println(c.toString());
		}
		
	}

}
