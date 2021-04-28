package uk.ac.qub.revision.p3.solution;

import java.util.Comparator;

public class ComparePlayersBySurname implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		return o1.getSurname().compareTo(o2.getSurname());
	}

	
}
