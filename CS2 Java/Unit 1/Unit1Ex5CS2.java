/*
 *	Store 50 random numbers from 1-100 into an integer array. 
 * Then display a frequency chart that shows how many of the
 * numbers were in each range (by 10's).  Print one asterisk 
 *to represent each number.  The chart should look something like this:


		a	1 - 10:		*****
		b	11 - 20:	*********
		c	21 - 30:	**
		d	31 - 40:	****
		e	41 - 50:	*************
		f	51 - 60:	****
		g	61 - 70:	******
		h	71 - 80:	***
		i	80 - 81:	
		j	91 - 100:	****
*/
public class Unit1Ex5CS2 {
	public static void main (String [] args) {
		int Num[] = new int[100];
		int Ran;
		String a = "", b = "", c = "", d = "", e = "", f = "", g = "", h = "", i = "", j = ""; 
		for (int ei = 0; ei < 100; ei++) {
			Ran = (int) (Math.floor(Math.random() * 99));
			Num[ei] = Ran;
			if ((Ran >= 1) && (Ran <= 10)) {
				a = a + "*";
			} else if ((Ran >= 11) && (Ran <= 20)) {
				b = b + "*";
			} else if ((Ran >= 21) && (Ran <= 30)) {
				c = c + "*";
			} else if ((Ran >= 31) && (Ran <= 40)) {
				d = d + "*";
			} else if ((Ran >= 41) && (Ran <= 50)) {
				e = e + "*";
			} else if ((Ran >= 51) && (Ran <= 60)) {
				f = f + "*";
			} else if ((Ran >= 61) && (Ran <= 70)) {
				g = g + "*";
			} else if ((Ran >= 71) && (Ran <= 80)) {
				h = h + "*";
			} else if ((Ran >= 81) && (Ran <= 90)) {
				i = i + "*";
			} else if ((Ran >= 91) && (Ran <= 100)) {
				j = j + "*";
			}
		}
			System.out.println("1-10: " + a);
			System.out.println("11-20: " + b);
			System.out.println("21-30: " + c);
			System.out.println("31-40: " + d);
			System.out.println("41-50: " + e);
			System.out.println("51-60: " + f);
			System.out.println("61-70: " + g);
			System.out.println("71-80: " + h);
			System.out.println("81-90: " + i);
			System.out.println("91-100: " + j);
	}
}
