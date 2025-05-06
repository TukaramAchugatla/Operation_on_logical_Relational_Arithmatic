package Artihmetic.tka.main;

import Artihmetic.tka.code.Calculator;
public class Calculator_Test {

	public static void main(String[] args) {
		
		Calculator c=new Calculator();
		int Sum=c.Addition(10, 5);
		System.out.println("Addition is "+Sum);
		int Sub=c.Substraction(10, 5);
		System.out.println("Substration is "+Sub);
		int Mul=c.Multiplication(10, 5);
		System.out.println("Multiplication is "+Mul);
		int Div=c.Division(10, 5);
		System.out.println("Division is "+Div);
		int Mod=c.Modulus(10, 5);
		System.out.println("Modulus is "+Mod);
		
	}

}
