package fundamentos;

import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {
		
		
		
		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt("1000");
		Long l = 1000000l;
	
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println();
		System.out.println(i * 3);
		
		Boolean bo = Boolean.parseBoolean("True");
		Character c = '#';
		
		Double d = 123.456;
		Float f = 123.456F;
		
		System.out.println(i * 3);
		System.out.println(bo);
		System.out.println(c + "...");
		System.out.println(f);
		System.out.println(d);

	}
	
}
