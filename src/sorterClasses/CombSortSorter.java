package sorterClasses;

import java.util.Comparator;

import sorterClasses.AbstractSorter.DefaultComparator;
import sortersTesterClasses.Entero;

public class CombSortSorter<E> extends AbstractMaxValueSorter<E> {

	public CombSortSorter() {
		super("Comb Sort");
	}

	public int nextGap(int gap) {
		gap = (gap *10) /13;
		if (gap < 1) {
			return 1;
		}

		return gap;
	}

	@Override
	protected void relocateMaxValueToLastPositionAmongFirst(int i) {
		int n =i;
		int g = n;
		boolean swapped = true;

		while(g != 1 || swapped == true) {
			g =  this.nextGap(g);
			swapped = false;

			for(int j = 0; j < (n -g); j++) {
				if(cmp.compare(arr[j], arr[j+g]) > 0) {
					super.swapArrayElements(j, j+g);	

					swapped = true;
				}

			}

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