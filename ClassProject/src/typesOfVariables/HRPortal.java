package typesOfVariables;

public class HRPortal {

	public static void main(String[] args) {
	
		Employee SachinT=new Employee(); //object created
SachinT.emp_name="Sachin Tendulkar";
SachinT.emp_dept="Batting";
SachinT.emp_id=10;
SachinT.emp_grade='A';
SachinT.emp_sal=123.123f;

SachinT.emp_info();

Employee ViratK=new Employee();
ViratK.emp_name="Virat Kohli";
ViratK.emp_dept="Batting";
ViratK.emp_id=18;
ViratK.emp_grade='A';
ViratK.emp_sal=3456.345f;

ViratK.emp_info();

	}

}
