public class Unit5Ex4 {
	public static void main (String [] args) {
		for (int x = 1; x != 6; x++) {
			System.out.print (x + "\t");
			SpanishNum(x);
		}
	}
	public static void SpanishNum(int x) {
		if (x == 1) {
			System.out.print (" Uno" + "\n");
		} else if (x == 2) {
			System.out.print (" Dos" + "\n");
		} else if (x == 3) {
			System.out.print (" Tres" + "\n");
		} else if (x == 4) {
			System.out.print (" Cuatro" + "\n");
		} else if (x == 5) {
			System.out.print (" Cinco" + "\n");
		}
	}
}