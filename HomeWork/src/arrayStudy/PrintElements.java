package arrayStudy;

public class PrintElements {
	public static void main(String[] args) {
	int a[]=new int[3];
	a[0]=10;
	a[1]=20;
	a[2]=30;
	
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
	System.out.println("**********************");
	
	int b[]=new int[3];
	b[0]=10;
	b[1]=20;
	b[2]=30;
	for(int i=0;i<=2;i++)
	{
		System.out.println(b[i]);
	}
	System.out.println("**********************");
	for(int c:b)
	{
		System.out.println(c);
	}
	System.out.println("**********************");
	int d[]= {100,200,300};
	for(int e:d)
	{
		System.out.println(e);
	}
	
	}
}

