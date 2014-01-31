package OJ;

import java.util.ArrayList;

public class ArrayListTest {

	
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(2);
		array.add(3);
		System.out.println(array);
		array.remove(array.size() - 1);
		System.out.println(array);
	}

}
