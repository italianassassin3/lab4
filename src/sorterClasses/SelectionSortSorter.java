package sorterClasses;

import java.util.Comparator;

import sorterClasses.AbstractSorter.DefaultComparator;
import sortersTesterClasses.Entero;

public class SelectionSortSorter<E> extends AbstractMaxValueSorter<E> {

	public SelectionSortSorter() {
		super("Selection Sort");
	}

	@Override
	protected void relocateMaxValueToLastPositionAmongFirst(int i) {
		// pre: 1 < i < arr.length
		int mpi = 0; 
		for (int j=1; j < i; j++) 
			if (cmp.compare(arr[j], arr[mpi]) > 0)
				mpi = j; 

		if (mpi < i-1)
			super.swapArrayElements(mpi, i-1);

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
