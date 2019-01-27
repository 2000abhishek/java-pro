//read data of employee.
class Employee
{
	private String s1;
	private int age;
	private int salary;

	public void read(String s2,int age1,int salary1)
	{
		s1=s2;
		age=age1;
		salary=salary1;
	}
	public void show()
	{
		System.out.println("Your Name : "+s1);
		System.out.println("Age : "+age);
		System.out.println("Salary : "+salary);
	}
}
