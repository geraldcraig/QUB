package uk.ac.qub.revision.p3;

import java.util.Comparator;
	
	public class CompareBySurname implements Comparator<Player> {

		@Override
		public int compare(Player o1, Player o2) {
			
			return o1.getLastName().compareTo(o2.getLastName());
		}
		
	}

