/*
Title: 5.7
Name: Angie Seto
Date Created: May 6, 2026
Date Updated: May 6, 2026 */

import java.util.ArrayList;

public class PracticeProblem {

	public static void main(String args[]) {
	}

	//q1
	public static void swap (ArrayList<String> arrL, int one, int two) {
		//swap two elements from the index numbers 
		String temp = arrL.get(two);
		
		arrL.set(two, arrL.get(one));
		arrL.set(one, temp);
	}

	//q2
	public static ArrayList<Double> createArrayList (double[] arr) {
		ArrayList<Double> arrL = new ArrayList<Double>();
		
		for (int i = 0; i < arr.length; i++) {
			arrL.add(arr[i]);
		}
		return arrL;
	}

	//q3
	public static ArrayList<Integer> mergeLists (ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
		ArrayList<Integer> arrL = new ArrayList<Integer>();

		for (int i = 0; i < arr1.size(); i++) { //fix this
			arrL.add(arr1.get(i));
		}
		
		for (int b = 0; b < arr2.size(); b++) {
			arrL.add(arr2.get(b));
		}
		return arrL;
	}
}
