 public class Unit5Ex7 {
 	public static void main (String [] args) {
 		System.out.println (sum100(0));
 	}
 	
 	public static int sum100 (int x) {
 		int i = 0, num = 0;
 		
 		while(i != 100) {
 			i++;
 			num = num + 1;
 			x = x + num;
 		}
 		return(x);
 	}
 }