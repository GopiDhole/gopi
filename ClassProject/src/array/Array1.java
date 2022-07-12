package array;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		//with using new keyword
		//without using new keyword
		//static coding
		//dynamic coding
		//reverse
		//char,String,int,float,double
		
		//1. array declaration
		char grade[] =new char[4];
		//array initialization
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		
		//usage
		System.out.println(grade[0]);
		System.out.println(grade[1]);
		System.out.println(grade[3]);
		//System.out.println(grade[4]);
		
		System.out.println("========================");
		
		for(int i=0;i<=3;i++) //static coding
		{
		
		System.out.println(grade[i]);
		}
		System.out.println("========================");
		
		for(int i=0;i<=grade.length-1;i++)//dynamic coding
		{
			System.out.println(grade[i]);
		}
		System.out.println("========================");
		
		for(int i=3;i>=0;i--) //reverse static coding
		{
			System.out.println(grade[i]);
		}
		System.out.println("========================");
		
		
		
		for(int i=grade.length-1;i>=0;i--)//reverse dynamic coding
		{
			System.out.println(grade[i]);
		}
		System.out.println("========================");
		
		String name[]=new String[3];
		name[0]="Ram";
		name[1]="Laxman";
		name[2]="Seeta";
		
		for(int i=0;i<=name.length-1;i++) //dynamic coding 
		{
			System.out.println(name[i]);
			
		}
		
		System.out.println("========================");
		for(int i=0;i<=2;i++) //static coding
		{
			System.out.println(name[i]);
		}
		System.out.println("========================");
		
		for(int i=name.length-1;i>=0;i--) //reverse dynamic coding
		{
			System.out.println(name[i]);
		}
		System.out.println("========================");
		int rollNo[]= {6,2,4,9,1,7};// declaration and initialization
		for(int i=0;i<=5;i++)//static coding
		{
			System.out.println(rollNo[i]);
		}
		System.out.println("========================");
		
		for(int i=0;i<=rollNo.length-1;i++)//dynamic coding
		{
			System.out.println(rollNo[i]);
		}
		System.out.println("========================");
		
		for(int i=rollNo.length-1;i>=0;i--) //reverse dynamic coding
		{
			System.out.println(rollNo[i]);
		}
		System.out.println("========================");
		
		//sort method
		Arrays.sort(rollNo);
		for(int i=0;i<=rollNo.length-1;i++)
		{
			System.out.println(rollNo[i]);
		}
		System.out.println("========================");
		Arrays.sort(rollNo);
		for(int i=rollNo.length-1;i>=0;i--)
		{
			System.out.println(rollNo[i]);
		}
			
		System.out.println("========================");
		
		String s="VELOCITY CORPORATE TRAINING CENTER";
		String[] output=s.split("T");
		for(int i=0;i<=output.length-1;i++)
		{
			System.out.println(output[i]);
		}
				
	}

}
