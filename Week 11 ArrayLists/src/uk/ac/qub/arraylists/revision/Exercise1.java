package uk.ac.qub.arraylists.revision;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise1 {

	public static void sort(ArrayList<String> ar) {
		Object[] obs = ar.toArray();
		Arrays.sort(obs);

		// transfer back to an arraylist
		for (int loop = 0; loop < obs.length; loop++) {
			ar.set(loop, (String) obs[loop]);
		}
	}
	
	
	public static ArrayList<String> merge(ArrayList<String> list1, ArrayList<String> list2) {
		ArrayList<String> merged = new ArrayList<>();
		
		for (int loop=0;loop<list1.size();loop++){
			merged.add(list1.get(loop));
		}
		
		
		for (int loop=0;loop<list2.size();loop++){
			merged.add(list2.get(loop));
		}
		
		return merged;	
	}
		
}
