package Logical.Relation.tka.code;

public class Logical_Relational {

	public void Testing(int a,int b, int c) {
		
		if(a!=0 && b!=0 && c!=0 && a > 0 && b > 0 && c >0 ) {
			if(a>b && a>c) {
				System.out.println("A is gerater than B and C "+a);
			}
			else if(b>c) {
				System.out.println("B is gerater than A and C "+b);
			}
			else {
				System.out.println("C is gerater than A and B "+c);
			}	
		}
		else {
			System.out.println("The input value Should be Greater than 0 And \n It should not be a negative Number");
		}
	}
} 
