package typesOfVariables;

public class Employee {

	//name,id,dept,sal,grade
	
	String emp_name;
	int emp_id;
	String emp_dept;
	float emp_sal;
	char emp_grade;
	
	public void emp_info()
	{
		System.out.println("======================================");
		System.out.println("Employee name is :"+emp_name);
		System.out.println("Employee id is   :"+emp_id);
		System.out.println("Employee dept is :"+emp_dept);
		System.out.println("Employee sal is  :"+emp_sal);
		System.out.println("Employee grade is:"+emp_grade);
	}
	public static void main(String[] args) {
		
		Employee SachinT=new Employee(); //object created
		SachinT.emp_name="Sachin Tendulkar";
		SachinT.emp_dept="Batting";
		SachinT.emp_id=10;
		SachinT.emp_grade='A';
		SachinT.emp_sal=123.123f;

		SachinT.emp_info();
	}

}
