/*
 *UNIT TWO EX EIGHT
 *RANDOM
 */
 import java.text.DecimalFormat;
 import java.util.Random;
 public class Unit2Ex8
 {
 	public static void main (String [] args)
 	{
 		DecimalFormat df = new DecimalFormat ("0.000");
 		int num;
 		num = (int) (Math.floor(Math.random() * 10));
 		System.out.println (num);
 		
 		int num2;
 		num2 = (int) (Math.floor(Math.random() * 6));
 		System.out.println (num2 + (15));
 		
 		Random gen = new Random();
 		double num3 = gen.nextDouble();
 		System.out.println (num3);
 		
 		System.out.println (df.format(num3));
 		
 		
 		
 	}
 }