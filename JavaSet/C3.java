//generate 5 digit number and calculate sum
import java.io.*;
class C3
{
	public static void main(String args[])
	{
		Console con =System.console();
		System.out.println("Enter the 5 digit number:");
		int a=Integer.parseInt(con.readLine());
		int sum=0;
		while(a>0)
		{
			int b=a%10;
			a=a/10;
			sum=sum+b;
		}
		System.out.println(sum);
	}
}