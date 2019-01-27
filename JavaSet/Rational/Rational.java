//Rational class for mathematical operations.
import java.io.*;
class Rational
{
	private int numerator,denominator;

	public Rational()
	{

	}
	public Rational(int num,int denom)
	{
		numerator=num;
		denominator=denom;
	}
	public Rational(Rational m)
	{
		numerator=m.numerator;
		denominator=m.denominator;
	}
	public void add(Rational m){
		numerator = (m.denominator*numerator)+(m.numerator*denominator);
		denominator = (m.denominator*denominator);
		System.out.println("Addition :");
	}
	public void less(Rational m){
		numerator=(m.denominator*numerator)-(m.numerator*denominator);
		denominator=(m.denominator*denominator);
		System.out.println("Less :");
	}
	public void multiply(Rational m){
		numerator = m.numerator*numerator;
		denominator = m.denominator*denominator;
		System.out.println("Multiplicaton : ");
	}
	public void divide(Rational m){
		numerator = numerator*m.denominator;
		denominator = denominator*m.numerator;
		System.out.println("Division : ");
	}
	public void set()
	{
		Console con = System.console();
		System.out.println("Enter the numerator:");
		numerator=Integer.parseInt(con.readLine());
		System.out.println("Enter the denominator:");
		denominator=Integer.parseInt(con.readLine());
	}
	public void show()
	{
		System.out.println(numerator + "/" + denominator);
	}	
}
