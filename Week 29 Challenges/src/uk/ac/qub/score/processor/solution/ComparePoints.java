package uk.ac.qub.score.processor.solution;

import java.util.Comparator;

/**
 * Comparator used to compare the points total for a team (Ascending) 
 * @author aidan mcgowan
 */
public class ComparePoints implements Comparator<Team> {

	@Override
	public int compare(Team t1, Team t2) {
		return t2.pointsTotal() - t1.pointsTotal();
	}

}