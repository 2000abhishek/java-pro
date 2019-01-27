//book class for read and show of book data.
import java.io.*;
public class Book implements Item
{
	private String title,author,publication;
	Console con= System.console();
	public void read()
	{
		System.out.println("Enter title of book:");
		title=con.readLine();
		System.out.println("Enter author name:");
		author=con.readLine();
		System.out.println("Enter publication name:");
		publication=con.readLine();
	}
	public void show()
	{
		System.out.println("--------------------------------------------------------");
		System.out.println(title);
		System.out.println(author);
		System.out.println(publication);
		System.out.println("--------------------------------------------------------");
	}
}
