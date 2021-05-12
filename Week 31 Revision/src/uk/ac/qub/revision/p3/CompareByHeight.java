package uk.ac.qub.revision.p3;

import java.util.Comparator;

public class CompareByHeight implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		if (o1.getHeight() > o2.getHeight()) {
			return -1;
		} else if (o1.getHeight() < o2.getHeight()) {
			return 1;
		} else {
			return 0;
		}
	}

}
