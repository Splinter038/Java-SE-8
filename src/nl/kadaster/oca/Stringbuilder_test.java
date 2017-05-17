package nl.kadaster.oca;

import java.util.Scanner;

public class Stringbuilder_test {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Strings are immutable
		
		// query position of chars 	- charAt indexOf substring
		// Modify StringBuilder		- append insert delete
		// Others					- length trimToSize setLength
		
		StringBuilder str1 = new StringBuilder("Voorbeeld van een string");
		StringBuilder str2 = new StringBuilder("  Nog een   string ");
		
		System.out.println("---------------------------------");
		System.out.println(">str1: \"" + str1 + "\"");
		System.out.println(">str1.charAt(3);");
		System.out.println(str1.charAt(3));
		System.out.println(">str1.indexOf(\"ee\", 10); - 1e occurance (-1 als niet gevonden) - geen char als argument, wel bij String");
		System.out.println(str1.indexOf("ee"));
		System.out.println(">str1.indexOf(\"ee\", 10); - vanaf index 10");
		System.out.println(str1.indexOf("ee", 10));
		System.out.println(">str1.substring(10); - vanaf index 10");
		System.out.println(str1.substring(10));
		System.out.println(">str1.substring(10, 20); - vanaf index 10 TOT index 20");
		System.out.println(str1.substring(10, 20));
		System.out.println(">str1: \"" + str1 + "\" -> ongewijzigd");
		System.out.println("-------------------------[Enter]-");
		sc.nextLine();

		System.out.println(">str1.append(true); - boolean (true)");
		System.out.println(str1.append(true));
		System.out.println(">str1.append('A'); - char");
		System.out.println(str1.append('A'));
		char[] chars = {'C', 'h', 'a', 'r'};
		System.out.println(">str1.append(chars); - char array: char[] chars = {'C', 'h', 'a', 'r'};");
		System.out.println(str1.append(chars));
		char[] chars2 = {'C', 'h', 'a', 'r', 'A', 'r', 'r', 'a', 'y'};
		System.out.println(">str1.append(chars2, 4, 3); - char array: char[] chars2 = {'C', 'h', 'a', 'r', 'A', 'r', 'r', 'a', 'y'};");
		System.out.println(str1.append(chars2, 4, 3));
		System.out.println(">str1.append(3.14F); - float (of 3.14 als double, of 3 als int, of 3L als long)");
		System.out.println(str1.append(3.14F));
		System.out.println(">str1.append(new stringbuilder_test()); - object argument -> leash w");
		System.out.println(str1.append(new Stringbuilder_test()));
		System.out.println(">str1.append(\"String werkt natuurlijk ook\"); - String");
		System.out.println(str1.append("String werkt natuurlijk ook"));
		System.out.println("-------------------------[Enter]-");
		sc.nextLine();
		
		System.out.println("--str1 = \"hier<voor\"------------");
		System.out.println("--werking gelijk aan append-----");
		str1 = new StringBuilder("hier<voor");
		System.out.println(">str1: \"" + str1 + "\"");
		System.out.println(">str1.insert(4, true); - boolean (true)");
		System.out.println(str1.insert(4, true));
		System.out.println(">str1.insert(4, 'A'); - char");
		System.out.println(str1.insert(4, 'A'));
		char[] chars3 = {'C', 'h', 'a', 'r'};
		System.out.println(">str1.insert(4, chars3); - char array: char[] chars = {'C', 'h', 'a', 'r'};");
		System.out.println(str1.insert(4, chars));
		char[] chars4 = {'C', 'h', 'a', 'r', 'A', 'r', 'r', 'a', 'y'};
		System.out.println(">str1.insert(4, chars4, 4, 3); - char array: char[] chars2 = {'C', 'h', 'a', 'r', 'A', 'r', 'r', 'a', 'y'};");
		System.out.println(str1.insert(4, chars4, 4, 3));
		System.out.println(">str1.insert(4, 3.14F); - float (of 3.14 als double, of 3 als int, of 3L als long)");
		System.out.println(str1.insert(4, 3.14F));
		System.out.println(">str1.insert(4, new stringbuilder_test()); - object argument -> leash w");
		System.out.println(str1.insert(4, new Stringbuilder_test()));
		System.out.println(">str1.insert(4, \"String werkt natuurlijk ook\"); - String");
		System.out.println(str1.insert(4, "String werkt natuurlijk ook"));
		System.out.println("-------------------------[Enter]-");
		sc.nextLine();
		
		System.out.println(">str1: \"" + str1 + "\"");
		System.out.println(">str1.delete(4, 11); - vanaf index 4 tot index 11 weghalen -> \"String \"");
		System.out.println(str1.delete(4, 11));
		System.out.println(">str1.deleteCharAt(4); - char op index 4 ('w') weghalen");
		System.out.println(str1.delete(4, 11));
		System.out.println(">str1.length() - lengte van de Stringbuilder variabele");
		System.out.println(str1.length());
		System.out.println(">str1.trimToSize() - Attempts to reduce storage used for the character sequence.");
		System.out.println("void method, dus geen return en valt er weinig te printen. Geen method om spaties of zo weg te halen.");
		str1.trimToSize();
		System.out.println(">str1.setLength(4) - Stringbuilder inkorten naar 4 chars, geen returntype");
		str1.setLength(4);
		System.out.println(">str1: \"" + str1 + "\"");
		System.out.println("-------------------------[Enter]-");
		sc.nextLine();
		
		System.out.println("--str1 = \"redrum redrum\"--------");
		str1 = new StringBuilder("redrum redrum");
		System.out.println(">str1: \"" + str1 + "\"");
		System.out.println(">str1.reverse();");
		System.out.println(str1.reverse());
		System.out.println(">str1.replace(6, 7, \"spatie\"); -> vanaf index 6 TOT index 7 wordt vervangen door \"spatie\"");
		System.out.println(str1.replace(6, 7, "spatie"));

		sc.close();
	}
}