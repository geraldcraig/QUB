package p3.solution;

import java.util.Comparator;

public class CompareByName implements Comparator<TopTrumpCard>{

	@Override
	public int compare(TopTrumpCard o1, TopTrumpCard o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
