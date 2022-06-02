package example1;

import java.util.ArrayList;

public class exampleClass {

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<>();

		nums.add(0);
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		nums.add(7);
		nums.add(8);
		nums.add(9);
		nums.add(10);

//		for (int i = 0; i < nums.size(); i++) {
//			int current = nums.get(i);
//			System.out.println(current);

		int j = 10 ;

		while (j >= 0) {
			int current = nums.get(j);

			System.out.println(current);
			j--;
		
		}

	}

}
