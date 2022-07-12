package logicalPrograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of string ");
		String a = sc.next();
		String b="";
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		System.out.println("original string is "+a);
		System.out.println("Reverse string is "+b);
		if(a.equals(b))
		{
			System.out.println("String is palindrome");
		}
		else
			System.out.println("String is not palindrome");
	}

}
