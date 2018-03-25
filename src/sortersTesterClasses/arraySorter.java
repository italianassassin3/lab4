package sortersTesterClasses;

import java.util.ArrayList;
import java.util.Comparator;


import interfaces.Sorter;
import sorterClasses.BubbleSortSorter;
import sorterClasses.CocktailSortSorter;
import sorterClasses.CombSortSorter;
import sorterClasses.InsertionSortSorter;
import sorterClasses.SelectionSortSorter;

public class arraySorter {


	private static Integer[]toSort = {5, 9, 20, 22, 20, 5, 4, 13, 17, 8, 22, 1, 3, 7, 11, 9, 10};
	private static ArrayList<Sorter<Integer>> sortersList = new ArrayList<>(); 

	public static void main(String[] args) { 

		sortersList.add(new BubbleSortSorter<Integer>()); 
		sortersList.add(new SelectionSortSorter<Integer>()); 
		sortersList.add(new InsertionSortSorter<Integer>()); 
		sortersList.add(new CombSortSorter<Integer>()); //Correctly implemented for lab activity
		sortersList.add(new CocktailSortSorter<Integer>());//Correctly implemented for lab activity

		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		//sortersList.add(new OddEvenSortSorter<Integer>()); //NOT WORKING, implemented for fun in the lab activity
		//sortersList.add(new GNomeSortSorter<Integer>()); //NOT WORKING, implemented for fun in the lab activity
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////


		test("Sorting Using Default Comparator<Integer> For Excercise 2", null); 
		test("Sorting Using IntegerComparator1 For Excercise 2", new IntegerComparator1()); 
		test("Sorting Using IntegerComparator2 For Excercise 2", new IntegerComparator2()); 
	}

	private static void test(String msg, Comparator<Integer> cmp) { 


		System.out.println("\n\n*******************************************************");
		System.out.println("*** " + msg + "  ***");
		System.out.println("*******************************************************");

		Integer[] original = null, arr; 
		// generates a new array whose elements are the same ones and in the same order as our given Integer[] as input; it's size is i and tests the increasing and decreasing orders
		for (int i=1; i<=toSort.length; i++) { 
			//original = randomValues(i);
			original = toSort;
			showArray("\n ---Original array of size " + i + " to sort:", original); 

			for (int s=0; s<sortersList.size(); s++) {
				Sorter<Integer> sorter = sortersList.get(s); 
				arr = original.clone(); 
				sorter.sort(arr, cmp);
				showArray(sorter.getName() + ": ", arr); 
			}
		}
	}

	private static void showArray(String msg, Integer[] a) {
		System.out.print(msg); 
		for (int i=0; i<a.length; i++) 
			System.out.print("\t" + a[i]); 
		System.out.println();
	}

}
