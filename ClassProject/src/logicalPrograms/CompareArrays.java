package logicalPrograms;

import java.util.Arrays;

public class CompareArrays {

	public static void main(String[] args) {
		int ar1[]= {10,20,30};
		int ar2[]= {40,50,90};
		int ar3[]= {10,20,30};
		System.out.println(Arrays.equals(ar1, ar2)); //false
		System.out.println(Arrays.equals(ar1, ar3)); //true
		System.out.println((Arrays.equals(ar2, ar3))); //false


	}

}
