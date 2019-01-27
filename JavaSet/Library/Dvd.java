//dvd class for show and read dvd data.
import java.io.*;
public class Dvd implements Item
{
	private String title,director,category;
	Console con= System.console();
	public void read()
	{
		System.out.println("Enter title of Movie:");
		title=con.readLine();
		System.out.println("Enter director name:");
		director=con.readLine();
		System.out.println("Enter category name:");
		category=con.readLine();
	}
	public void show()
	{
		System.out.println("--------------------------------------------------------");
		System.out.println(title);
		System.out.println(director);
		System.out.println(category);
		System.out.println("--------------------------------------------------------");
	}
}
