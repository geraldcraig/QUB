package uk.ac.qub.card.sharp.solution;

import java.util.Comparator;

/**
 * @author Matthew Collins
 *
 */
public class CompareCardByFaceValue implements Comparator<PlayingCard>{

	@Override
	public int compare(PlayingCard o1, PlayingCard o2) {
		return o1.getValue() - o2.getValue();
	}

}
