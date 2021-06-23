package p3.solution;

import java.util.Comparator;

public class CompareByAverageStat implements Comparator<TopTrumpCard>{

	@Override
	public int compare(TopTrumpCard o1, TopTrumpCard o2) {
		// TODO Auto-generated method stub
		double dif= o2.getAverageStat()-o1.getAverageStat();
		
		if(dif<0) {
			return -1;
		}else if(dif>0) {
			return 1;
		}else {
			return 0;
		}
	}

}
