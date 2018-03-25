package sortersTesterClasses;

public class Entero { 
	private int value; 
	public Entero(int v) { value = v; }
	public int getValue() { return value; } 
	public String toString() { return value + ""; }

	public int compareTo(Entero o2) {
		return compare(this.value, o2.value);
	}

	public int compare(Integer o1, Integer o2) {//This tests the Ex 2 array Sorter USING COMPARATOR1 IN DECREASING ORDER
		return o1.compareTo(o2);
	}

	//	public int compare(Integer o1, Integer o2) {//Uncomment this to be able to test the Ex 2 array Sorter USING COMPARATOR1 IN INCREASING ORDER
	//		return o2.compareTo(o1);
	//	}


} 
