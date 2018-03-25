package sorterClasses;

import java.util.Comparator;

import sorterClasses.AbstractSorter.DefaultComparator;
import sortersTesterClasses.Entero;

public class BubbleSortSorter<E> extends AbstractMaxValueSorter<E> {

	public BubbleSortSorter() {
		super("Bubble Sort");
	}

	@Override
	protected void relocateMaxValueToLastPositionAmongFirst(int i) {
		// pre: 1 < i < arr.length
		for (int j=0; j < i-1; j++) 
			if (cmp.compare(arr[j], arr[j+1]) > 0)
				super.swapArrayElements(j, j+1);

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
