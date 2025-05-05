package lab.tka.main;
import lab.tka.code.Values;
public class Test {

	public static void main(String[] args) {
		
		 Values obj=new Values();
		 	System.out.println("Default byte: " + obj.b);
	        System.out.println("Default short: " + obj.s);
	        System.out.println("Default int: " + obj.i);
	        System.out.println("Default long: " + obj.l);
	        System.out.println("Default float: " + obj.f);
	        System.out.println("Default double: " + obj.d);
	        System.out.println("Default char: [" + (int)obj.c + "]");
	        System.out.println("Default boolean: " + obj.bol);	
	}

}
