package array;

public class MultiDimensionalArray1 {

	public static void main(String[] args) {
		int a[][]=new int[2][2]; //array declaration
		a[0][0]=1; //array assign value
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		
		//usage
//		System.out.println(a[0][0]);
//		System.out.println(a[0][1]);
//		System.out.println(a[1][0]);
//		System.out.println(a[1][1]);
		
		//usage using for loop
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
			System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		String name[][]= {{"Velocity","Corporate","training"},{"Center","Katraj","Pune"}};
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
			System.out.print(name[i][j]+"   ");
			}
			System.out.println();
		}
			
	}
	

}
