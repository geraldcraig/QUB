package uk.ac.qub.revision.p3.solution;

import java.util.Comparator;

public class ComparePlayersByPoints implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		
		return o1.getPoints() - o2.getPoints();
	}

}
