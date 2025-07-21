package Day1.basic;

import java.util.Scanner;

public class AdditionScanner {

	public static void main(String[] args) {
		
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = a + b;
		System.out.println("Addition of a = " +a + " and b = "+ b +" is " +c);
	}

}
