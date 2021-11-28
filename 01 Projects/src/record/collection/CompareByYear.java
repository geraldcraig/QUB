package record.collection;

import java.util.Comparator;

public class CompareByYear implements Comparator<Records> {

	@Override
	public int compare(Records o1, Records o2) {
		if (o1.getYear() < o2.getYear()) {
			return -1;
		} else if (o1.getYear() > o2.getYear()) {
			return 1;
		} else {
			return 0;
		}
	}

}
