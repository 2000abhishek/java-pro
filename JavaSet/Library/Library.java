//application class for dvd and book.
import java.io.*;
class Library
{
	public static void main(String args[])
	{
		String x;
		Item obj[]=new Item[10];
		Console con= System.console();
		for(int i=0;i<=2;i++)
		{
			System.out.println("book or dvd <b/d>");
			x=con.readLine();
			switch(x)
			{
				case "b":
				{
					obj[i]=new Book();
					obj[i].read();
					break;
				}
				case "d":
				{
					obj[i]=new Dvd();
				    obj[i].read();
				    break;
				}
				default:
					System.out.println("Invalid Input.");
			}
		}
		for(int i=0;i<=2;i++)
		{
			obj[i].show();
		}
	}
}
