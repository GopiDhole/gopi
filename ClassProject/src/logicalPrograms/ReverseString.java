package logicalPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string "); // Gopi
		String a = sc.next();
		String b="";
		for(int i=a.length()-1;i>=0;i--) //3-->2-->1-->0
		{
			b=b+a.charAt(i); //0+3=i-->i+p-->i+p+o-->i+p+o+G
		}
		System.out.println("Original String is "+a);
		System.out.println("reverse string is "+b);
		
		
	}

}
