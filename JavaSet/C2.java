//calculate first power of second number. 
//(seccond)^(first)
import java.io.*;
class C2
{
	public static void main(String args[])
	{
		Console con=System.console();
		System.out.println("Enter the first number:");
		int a=Integer.parseInt(con.readLine());
		System.out.println("Enter the second number:");
		int b=Integer.parseInt(con.readLine());
		int answer=1;
		for(int i=1;i<=b;i++)
		{
			answer=answer*a;
		}
		System.out.println(answer);
	}
}