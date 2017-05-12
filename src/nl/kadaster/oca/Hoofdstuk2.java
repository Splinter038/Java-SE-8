package nl.kadaster.oca;
public class Hoofdstuk2 {
	public static void main(String[] args){
/*		char c2 = 122;
		char c3 = '\u0122';
		boolean testBoolean = true;
		char c4 = (char)-122;
		System.out.print("c2, c3, c4: " + c2 + c3 + c4);
		System.out.println(testBoolean);
		
	      Boolean b = new Boolean(true);

	      boolean bool = b;//.booleanValue();

	      String str = "Primitive value of Boolean object " + b + " is " + bool;

	      System.out.println( str );*/
		int myChar = 97;
		int yourChar = 98;
		System.out.print((char)myChar);							//force into char
		System.out.print((char)yourChar);
		System.out.print((char)myChar + (char)yourChar);		// waarom weer terug naar ints?
		System.out.println("ab" + (char)yourChar + (char)myChar);
		
		int age = 20;
		System.out.print(" ");
		System.out.print((float)age);
		System.out.println(" my age = " + age);
		double myDouble = (double)age;
		System.out.println(" my age in doubles = " + myDouble);
		System.out.println(" my age in ints = " + (int)myDouble);
		
		int a = 10;
		long b = 20;
		short c = 30;
		System.out.println(++a + ++b * c);
		
		boolean buy = true;
		Boolean sell = new Boolean(true);
		System.out.println(buy == sell);
		System.out.println(buy);
				}
}
