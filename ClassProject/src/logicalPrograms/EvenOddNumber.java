package logicalPrograms;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		// Num/2-->remainder=0-->even
		
		System.out.println(10/2);
		System.out.println(10%2);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int a=sc.nextInt();
		
		if(a%2==0)
		{
			System.out.println("given no is even");
		}
		else {
			System.out.println("given no is odd");
		}
				

	}

}
