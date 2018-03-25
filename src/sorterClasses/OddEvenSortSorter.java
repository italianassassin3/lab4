package sorterClasses;

import java.util.Comparator;

import sorterClasses.AbstractSorter.DefaultComparator;
import sortersTesterClasses.Entero;

/**
 * 
 *
 *@author Jose E. Frontanez Rivera (italianassassin3), 843-11-2851, 050
 */

//Tried to implement OddEvenSortSorter according to slides in slides for fun
//Not needed for lab
public class OddEvenSortSorter<E> extends AbstractMaxValueSorter<E> {

	public OddEvenSortSorter() {
		super("Odd Even Sort");
	}

	@Override
	protected void relocateMaxValueToLastPositionAmongFirst(int i) {
		boolean isSorted = false;
		while(!isSorted) {
			isSorted = true;
			int tmp = 0;
			// pre: 1 < i < arr.length
			for (int j=1; j <= (i-2); j = j+ 2) {
				if (cmp.compare(arr[j], arr[j+1]) > 0) {
					super.swapArrayElements(j, j+1);}
				isSorted = false;
			}

			

		}
		for (int k=0; k <= (i-2); k = k+ 2) {
			if (cmp.compare(arr[k], arr[k+1]) > 0) {
				super.swapArrayElements(k, k+1);}
			isSorted = false;
		}
		return;
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
