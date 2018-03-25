package sorterClasses;

import java.util.Comparator;

import sorterClasses.AbstractSorter.DefaultComparator;
import sortersTesterClasses.Entero;
//Tried to implement OddEvenSortSorter according to slides in slides for fun
//Not needed for lab
public class GNomeSortSorter<E> extends AbstractMaxValueSorter<E> {
	
	public GNomeSortSorter() {
		super("Cocktail Sort");
	}

	@Override
	protected void relocateMaxValueToLastPositionAmongFirst(int i) {
	
	int index = 0;
	while(index < i) {
		if(index == 0) {
			index++;
		}
		if(cmp.compare(arr[index], arr[index+1]) >= 0) {
			index++;
		}
		else {
			super.swapArrayElements(index, index-1);
		}
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
