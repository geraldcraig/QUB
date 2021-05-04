package uk.ac.qub.arraylists.revision;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestExercise1 {

	String usa;
	String germany;
	String canada;
	String sweden;

	ArrayList<String> l1;
	ArrayList<String> l2;

	@BeforeEach
	public void setUp() throws Exception {
		l1 = new ArrayList<>();
		l2 = new ArrayList<>();

		usa = "usa";
		germany = "germany";
		canada = "canada";
		sweden = "sweden";

		l1.add(usa);
		l1.add(canada);

		l2.add(sweden);
		l2.add(germany);

	}

	@Test
	public void testSort() {

		boolean flag = false;
		System.out.println(l1.toString());
		Exercise1.sort(l1);
		System.out.println(l1.toString());
		// check if order is as expected
		if ((l1.get(0).equals(canada)) && (l1.get(1).equals(usa))) {
			flag = true;
		}
		assertTrue(flag);

	}

	@Test
	public void testMerge() {

		boolean flag = false;
		ArrayList<String> merged = Exercise1.merge(l1, l2);

		if ((merged.contains(canada)) && (merged.contains(usa))
				&& (merged.contains(sweden)) && (merged.contains(germany))) {
			flag = true;
		}
		
		assertTrue(flag);

	}


}
