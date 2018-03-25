package sortersTesterClasses;

import java.util.Comparator;

public class EnteroComparator2 implements Comparator<Entero> {

	@Override
	public int compare(Entero o1, Entero o2) {//This tests the Ex 2 array Sorter USING COMPARATOR1 IN DECREASING ORDER
		return -o1.compareTo(o2);
	}

	//	@Override
	//	public int compare(Entero o1, Entero o2) {//Uncomment this to be able to test the Ex 2 array Sorter USING COMPARATOR1 IN INCREASING ORDER
	//	return o1.compareTo(o2);
	//	}

}
