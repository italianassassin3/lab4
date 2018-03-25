package sorterClasses;

import java.util.Comparator;

import sorterClasses.AbstractSorter.DefaultComparator;
import sortersTesterClasses.Entero;

/**
 * Implements the cocktail sort
 *
 *@author Jose E. Frontanez Rivera (italianassassin3), 843-11-2851, 050
 */
public class CocktailSortSorter<E> extends AbstractMaxValueSorter<E> {
	boolean swapped = true;
	public CocktailSortSorter() {
		super("Cocktail Sort");
	}

	@Override
	protected void relocateMaxValueToLastPositionAmongFirst(int i) {
		boolean swapped;
		do {
			swapped = false;
			for (int j=0; j <= (i-2); j++) {
				if (cmp.compare(arr[j], arr[j+1]) > 0) {
					super.swapArrayElements(j, j+1);
					swapped = true;
				}
			}

			if(!swapped) {
				return;
			}

			for (int k=i -2; k >= 0; k--) {
				if(cmp.compare(arr[k], arr[k+1]) > 0) {
					super.swapArrayElements(k, k+1);
					swapped = true;}

			}

		}

		while(swapped) ;


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
