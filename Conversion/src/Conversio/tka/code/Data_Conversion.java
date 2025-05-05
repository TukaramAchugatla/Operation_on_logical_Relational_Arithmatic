package Conversio.tka.code;

public class Data_Conversion {
	
	public boolean boolVal = true;
   

   
	public byte b = 10;
	public short s = b;        
	public int i = s;         
	public long l = i;         
	public float f = l;        
	public double d = f;       


	public char c = 'A';       
	public int i2 = c;
	public double d2 = c;

   
	public double d3 = 123.456;
	public float f2 = (float) d3;
	public long l2 = (long) f2;
	public int i3 = (int) l2;
	public short s2 = (short) i3;
	public byte b2 = (byte) s2;
	public char c2 = (char) i3;

}
