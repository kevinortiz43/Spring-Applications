package example1;

import java.util.Scanner;

public class Calculator {

	static int plusMethodInt(int x, int y) {
		return x + y;
	}

	static int minusMethodInt(int x, int y) {
		return x - y;
	}

	static int divideMethodInt(int x, int y) {
		return x / y;
	}

	static int multiplyMethodInt(int x, int y) {
		return x * y;
	}

	public static void main(String[] args) {

		boolean cancel = (true);
		
		System.out.println("enter a number 1-4");
		System.out.println("1 is for addition");
		System.out.println("2 is for subtraction");
		System.out.println("3 is for multiplication");
		System.out.println("4 is for division");

		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();

		System.out.println("enter your first number");
		int input1 = scan.nextInt();

		System.out.println("enter your second  number");
		int input2 = scan.nextInt();

		switch (number) {

		case 1:
			
			
			if(cancel !=true) {
			System.out.println(plusMethodInt(input1, input2));
			}
			else {
				
			}
			
			break;
			
		case 2:
			System.out.println(minusMethodInt(input1, input2));
			break;
		case 3:
			System.out.println(multiplyMethodInt(input1, input2));
			break;
		case 4:
			System.out.println(divideMethodInt(input1, input2));
			break;

		}

	}

}
