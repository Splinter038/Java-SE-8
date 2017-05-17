package nl.kadaster.oca;

import java.nio.charset.Charset;

public class Test {
	public static void main(String ... flipflap){
		Charset defaultCharset = Charset.defaultCharset();
	    System.out.println(defaultCharset);
	    // charset is windows-1252
		System.out.print('\u2680' + " ");
	}
}
