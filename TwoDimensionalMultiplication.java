package assignment6;

import java.util.Scanner;

public class TwoDimensionalMultiplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to display Multiplication table");
		int num = scan.nextInt();
		for(int i=1; i<11; i++){
			System.out.println(num+"*"+i+" ="+num*i);
		}
	}

}
