package record.collection;

import java.util.Comparator;

public class Test {
	
	public class Compare implements Comparator<Records> {

		@Override
		public int compare(Records o1, Records o2) {
			// TODO Auto-generated method stub
			return o1.getYear() - o2.getYear();
		}	
	}
	
	

}
