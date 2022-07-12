package stringClassStudy;

public class StringUse {

	public static void main(String[] args) {
		String name="Velocity";//without using new keyword
		String city=new String("Pune");//with using new keyword
		
		//length() method use
		
		System.out.println(name.length());
		System.out.println(city.length());
		
		int output=name.length();//storing output in reference variable
		System.out.println("length of string is "+output);//we can reuse reference variable
		
		System.out.println("************************");
		
		//touppercase() method use
		
		String a="VElocity";
		System.out.println(a);
		System.out.println(a.toUpperCase());
		System.out.println("***********************");
		String b=a.toUpperCase();
		System.out.println(b);
		
		//tolowercase() method use
		
		System.out.println(b.toLowerCase());
		System.out.println("*************************");
		String c=b.toLowerCase();
		System.out.println(c);
		System.out.println("=========================");
		
		//equals() method use--> == -->compares memory location-->return type boolean
		String a1="velocity";
		String a2="velocity";
		String a3=new String("Velocity");
		String a4=new String("velocity");
		String a5=new String("Class");
		System.out.println(a1==a2);//memory location same-->true
		System.out.println(a1==a3);//memory location different-->false
		System.out.println(a3==a4);//memory location different-->false
		System.out.println("***************************");
		
		//.equals() method use-->compares content --> return type boolean
		System.out.println(a1.equals(a2));//-->true
		System.out.println(a1.equals(a3));//-->false
		System.out.println(a3.equals(a4));//-->false
		System.out.println(a4.equals(a5));//-->false
		System.out.println("============================");
		
		//equalsIgnorecase() method use-->return type boolean
		System.out.println(a1.equalsIgnoreCase(a3));//-->true
		System.out.println(a2.equalsIgnoreCase(a4));//-->true
		System.out.println(a1.equalsIgnoreCase(a5));//-->false
		System.out.println("==============================");
		
		//contains() method use--> check character sequence in any object-->return type boolean
		String b1="Velocity";
		System.out.println(b1.contains("lo"));//-->true
		boolean result = b1.contains("lo"); //reference variable is used to use in future
		System.out.println("Result is "+result);//-->true
		System.out.println(b1.contains("city"));//-->true
		System.out.println(b1.contains("vl"));//--false
		System.out.println("================================");
		
		//isEmpty() method use-->return type boolean
		String m="Pune";
		String n="";
		String o=" ";
		//String l=null;
		System.out.println(m.length());
		System.out.println(n.length());
		System.out.println(o.length());
		//System.out.println(l.length());//null pointer exception
		
		//length=0-->true
		//length!=0-->false
		
		System.out.println(m.isEmpty());//-->false
		System.out.println(n.isEmpty());//-->true
		System.out.println(o.isEmpty());//-->false
		System.out.println("================================");
		
		//isBlank() method use-->return type boolean
		System.out.println(m.isBlank());//-->false
		System.out.println(n.isBlank());//-->true
		System.out.println(o.isBlank());//-->true
		System.out.println("=================================");
		
		//charAt() method use-->return type character
		String p="INDIA";
		System.out.println(p.charAt(3));//-->I
		System.out.println(p.charAt(1));//-->N
		
		char requiredChar = p.charAt(0);//-->I
		System.out.println(requiredChar);
		//System.out.println(p.charAt(-1));//String Index Out of Bounds Exception
		//System.out.println(p.charAt(9));//String Index Out of Bounds Exception
		System.out.println("====================================");
		
		String word1="INDIA";
		for(int z1=0;z1<=word1.length()-1;z1=z1+1)
		{
			
			System.out.println(word1.charAt(z1));
		}
//		System.out.println("==================================");
//		String word2="INDIA IS MY COUNTRY";
//		for(int z1=word2.length();z1>=0;z1=z1-1)
//		{
//			
//			System.out.println(word2.charAt(z1));
//		}
		
		System.out.println("==================================");
		//endsWith() method use-->last character sequence-->return type boolean
		String e="Velocity";
		System.out.println(e.endsWith("ty"));//-->true
		System.out.println(e.endsWith("city"));//-->true
		System.out.println(e.endsWith("City"));//It is case sensitive-->false
		System.out.println(e.endsWith("Vel"));//-->false
		
		System.out.println("==================================");
		//startsWith method use-->return type boolean
		System.out.println(e.startsWith("vel"));//-->false
		System.out.println((e.startsWith("Vel")));//-->true
		System.out.println((e.startsWith("lo")));//-->false
		
		System.out.println("==================================");
		
		//Substring method use
		String test="Velocity Corporate Training Center ";
		System.out.println(test.substring(9));//beginIndex
		 String myString = test.substring(9);
		 System.out.println(myString);
		 
		 System.out.println(test.substring(9, 18 ));//beginIndex and EndIndex
		
		 System.out.println("====================================");
		//concat Method use
		 
		 String x="Pune";
		 String y="City";
		 System.out.println(x.concat(y));
		 System.out.println(x.concat(" ").concat(y));
		 System.out.println("====================================");
		 
		 //IndexOf method use
		 String h="INDIAIAIAD";
		 System.out.println(h.indexOf('A'));//indexOf
		 System.out.println(h.indexOf('I'));
		 System.out.println(h.indexOf('I',6));
		 System.out.println(h.lastIndexOf('I'));//lastIndexOf
		 System.out.println(h.lastIndexOf('I',8));
		 System.out.println("====================================");
		 
		 //replace method use
		 String j="Automation Testing";
		 System.out.println(j.replace('t','m'));
		 System.out.println(j.replace("ti", "aa"));
		 System.out.println(j.replace(' ','$'));
		 
		// System.out.println("This is string class ");
		
	}

}
