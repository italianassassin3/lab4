package sorterClasses;

import java.util.Comparator;

import sorterClasses.AbstractSorter.DefaultComparator;
import sortersTesterClasses.Entero;

public class InsertionSortSorter<E> extends AbstractSorter<E> {
	public InsertionSortSorter() {
		super("Insertion Sort");
	}

	protected void auxSort() { 
		for (int i=2; i<=arr.length; i++) { 
			int j = i-2; 
			E v = arr[i-1]; 
			while (j >= 0 && cmp.compare(v, arr[j]) < 0) { 
				arr[j+1] = arr[j]; 
				j--;
			}
			arr[j+1] = v; 
		}
	}

	/**
	 * Entero sorter to be Used for lab exercise 2
	 * @param arr The entero array to sort
	 * @param cmp The comparator that we will use to sort the Entero array
	 */
	public void sort(Entero[] arr, Comparator<Integer> cmp) {
		this.arr = (E[]) arr; 
		this.cmp = (cmp != null ? (DefaultComparator<E>) cmp : new DefaultComparator<E>()); 
		auxSort(); 

	}
}
