//factors of a number
import java.io.*;
class C1
{
	public static void main(String args[])
	{
		Console con=System.console();
		System.out.println("Enter the number:");
		int a=Integer.parseInt(con.readLine());
		for(int i=1;i<=a/2;i++)
		{
			if(i!=a&&i!=1)
			{
				if(a%i==0)
					System.out.println(i);
			}
		}
	}
}