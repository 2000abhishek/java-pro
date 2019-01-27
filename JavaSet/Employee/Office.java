//application of employee class
import java.io.*;
class Office
{
	public static void main(String args[])
	{
		int age,salary;
		String name;
		Console con=System.console();
		System.out.println("Enter the Name:");
		name=con.readLine();
		System.out.println("Enter the Age:");
		age=Integer.parseInt(con.readLine());
		System.out.println("Enter the Salary:");
		salary=Integer.parseInt(con.readLine());
		Employee e1=new Employee();
		e1.read(name,age,salary);
		e1.show();
	}
}
