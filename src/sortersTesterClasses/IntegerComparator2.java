package sortersTesterClasses;

import java.util.Comparator;

public class IntegerComparator2 implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {//This tests the Ex 2 array Sorter USING COMPARATOR2 IN DECREASING ORDER
		return -o1.compareTo(o2);
	}

	//	public int compare(Integer o1, Integer o2) {//Uncomment this to be able to test the Ex 2 array Sorter USING COMPARATOR2 IN INCREASING ORDER
	//		return o1.compareTo(o2);
	//	}

}
