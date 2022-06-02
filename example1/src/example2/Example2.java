package example2;

import java.util.ArrayList;

public class Example2 {

	public static void main(String[] args) {
//	an array list,  of ten elements, integers, 10 different integers and sum them
// DISPLAY 1, 4 AND 7
		// 0, 3, 6

		int sum = 0;
		int product = 1;
		int answer = 0;

		ArrayList<Integer> arrayInt2 = new ArrayList<>();
		ArrayList<Integer> arrayInt = new ArrayList<>();

		arrayInt.add(1);
		arrayInt.add(2);
		arrayInt.add(3);
		arrayInt.add(4);
		arrayInt.add(5);
		arrayInt.add(6);
		arrayInt.add(7);
		arrayInt.add(8);
		arrayInt.add(9);
		arrayInt.add(10);

		for (int i = 0; i < arrayInt.size(); i++) {
			sum += arrayInt.get(i);
			product *= arrayInt.get(i);
			answer = sum + product;
		}

		for (int j = 0; j <arrayInt.size(); j+=3) {

			System.out.println(arrayInt.get(j));

		}
		System.out.println(sum);
		System.out.println(product);
		System.out.println(answer);
//		System.out.println(arrayInt.get(0));
//		System.out.println(arrayInt.get(3));
//		System.out.println(arrayInt.get(6));
	}

}
