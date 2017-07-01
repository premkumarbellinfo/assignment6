package assignment6;

import java.util.Scanner;

public class SecondHighest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter how many numbers to be sorted");
		int num = scan.nextInt();
		int[] number = new int[num];
		System.out.println("Enter the numbers");
		for(int i=0;i<num;i++){
			number[i]= scan.nextInt();
		}
		for (int i=0;i <number.length;i++){
			for(int j =0;j<number.length-1;j++){
				//int k = i+1;
				if (number[i] > number[j]){
					int temp;
			        temp = number[i];
			        number[i] = number[j];
			        number[j] = temp;
				}
				
			}
			
		}
		System.out.println(number[1]);
	}

}
