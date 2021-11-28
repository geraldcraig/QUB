package record.collection;

import java.util.Comparator;

public class CompareByName implements Comparator<Records>{

	@Override
	public int compare(Records o1, Records o2) {
		return o1.getSurname().compareTo(o2.getSurname());
	}

}
