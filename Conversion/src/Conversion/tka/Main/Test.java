package Conversion.tka.Main;
import Conversio.tka.code.Data_Conversion;
public class Test {

	public static void main(String[] args) {
		Data_Conversion obj=new Data_Conversion();
		
		System.out.println("// Byte to other types");
        System.out.println("byte -> short: " + obj.s);
        System.out.println("short -> int: " + obj.i);
        System.out.println("int -> long: " + obj.l);
        System.out.println("long -> float: " + obj.f);
        System.out.println("float -> double: " + obj.d);
        
        System.out.println("\nChar conversions:");
        System.out.println("char: " + obj.c + " -> int: " + obj.i2);
        System.out.println("char -> double: " + obj.d2);
        
        
        System.out.println("\nDouble to all conversions:");
        System.out.println("double -> float: " + obj.f2);
        System.out.println("float -> long: " + obj.l2);
        System.out.println("long -> int: " + obj.i3);
        System.out.println("int -> short: " + obj.s2);
        System.out.println("short -> byte: " + obj.b2);
        System.out.println("int -> char: " + obj.c2 + " (unicode: " + (int)obj.c2 + ")");
	}
	
}
