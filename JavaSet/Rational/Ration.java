//Application class for Rational class.
class Ration
{
	public static void main(String args[])
	{
		Rational a = new Rational();
		a.set();
		Rational b = new Rational(1,2);
		a.show();
		System.out.println("+++++++++++++++");
		b.show();
		System.out.println("+++++++++++++++");
		b.add(a);
		b.show();
		b = new Rational(1,2);
		b.less(a);
		b.show();
		b = new Rational(1,2);
		b.multiply(a);
		b.show();
		b = new Rational(1,2);
		b.divide(a);
		b.show();
		System.out.println("++++++++++++++++");
	}
}
