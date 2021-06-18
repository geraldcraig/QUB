package uk.ac.qub.p3;

import java.util.Comparator;

public class CompareByStat implements Comparator<TopTrumpCard> {

	@Override
	public int compare(TopTrumpCard o1, TopTrumpCard o2) {
		double average1 = (double) (o1.getSpeed() + o1.getStrength() 
		+ o1.getAgility() + o1.getIntelligence()) / 4;
		double average2 = (double) (o2.getSpeed() + o2.getStrength() 
		+ o2.getAgility() + o2.getIntelligence()) / 4;
		
		if (average1 > average2) {
			return -1; 
		} else if (average1 < average2) {
			return 1;
		} else {
			return 0;
		}
	}

}
