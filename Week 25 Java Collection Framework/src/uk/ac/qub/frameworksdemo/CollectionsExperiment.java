package uk.ac.qub.frameworksdemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsExperiment {

	public static void main(String[] args) {
		
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("dublin");
		arrList.add("belfast");
		arrList.add("paris");
		
		ArrayList<Integer> arrlist2 = new ArrayList<Integer>();
		arrlist2.add(2);
		
		LinkedList<String> linkList = new LinkedList<String>();
		linkList.add("barcelona");
		linkList.add("dubai");
		linkList.add("texas");
		
		showAll(arrList);
		showAll(linkList);
		
	}
	
	public static void showAll(List<String> myArrList) {
		for (String str: myArrList) {
			System.out.println(str);
		}
		System.out.println();
	}
	
	

}
