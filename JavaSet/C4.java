//generate two numbers and display their greatest common divisor
import java.io.*;
class C4
{
	public static void main(String args[])
	{
		int gcd=1;
		Console con =System.console();
		System.out.println("Enter the number:");
		int a=Integer.parseInt(con.readLine());
		System.out.println("Enter the number:");
		int b=Integer.parseInt(con.readLine());
        for(int i = 1; i <= a && i <= b; i++)
        {
            if(a % i==0 && b % i==0)
                gcd = i;
        }
        System.out.printf("G.C.D of %d and %d is %d", a, b, gcd);
	}
}