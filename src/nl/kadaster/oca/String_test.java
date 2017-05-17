package nl.kadaster.oca;

import java.util.Scanner;

public class String_test {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Strings are immutable
		
		// query position of chars 	- charAt indexOf substring
		// Seem to modify 			- substring trim replace
		// Others					- length startsWith endsWith
					 //012345678901234567890123
		String str1 = "Voorbeeld van een string";
		String str2 = "  Nog een   string ";
		
		System.out.println("---------------------------------");
		System.out.println("str1: \"" + str1 + "\"");
		System.out.println("str1.charAt(3);");
		System.out.println(str1.charAt(3));
		System.out.println("str1.indexOf('r'); - 1e occurance (-1 als niet gevonden)");
		System.out.println(str1.indexOf('r'));
		System.out.println("str1.indexOf('r', 10); - vanaf index 10");
		System.out.println(str1.indexOf('r', 10));
		System.out.println("str1.indexOf(\"ee\", 10); - 1e occurance");
		System.out.println(str1.indexOf("ee"));
		System.out.println("str1.indexOf(\"ee\", 10); - vanaf index 10");
		System.out.println(str1.indexOf("ee", 10));
		System.out.println("-------------------------[Enter]-");
		sc.nextLine();

		System.out.println("str1.substring(10); - vanaf index 10");
		System.out.println(str1.substring(10));
		System.out.println("str1.substring(10, 20); - vanaf index 10 TOT index 20");
		System.out.println(str1.substring(10, 20));
		System.out.println("str2: \"" + str2 + "\"");
		System.out.println("str2.trim();");
		System.out.println(str2.trim());
		System.out.println("str1.replace('g', 'k');");
		System.out.println(str1.replace('g', 'k'));
		System.out.println("str1.replace(\"ee\", \"uu\");");
		System.out.println(str1.replace("ee", "uu"));
		System.out.println("-------------------------[Enter]-");
		sc.nextLine();
		
		System.out.println("str1.length();");
		System.out.println(str1.length());
		System.out.println("str1.startsWith(\"Voor\");");
		System.out.println(str1.startsWith("Voor"));
		System.out.println("str1.startsWith(\"voor\");");
		System.out.println(str1.startsWith("voor"));
		System.out.println("str1.startsWith(\"beel\", 4);");
		System.out.println(str1.startsWith("beel", 4));
		System.out.println("str1.endsWith(\"ing\");");
		System.out.println(str1.endsWith("ing"));
		System.out.println("str2.endsWith(\"ing \");");
		System.out.println(str2.endsWith("ing "));
		
		System.out.println("X" + str1.substring(23,23) + "Y");
		sc.close();
	}
}