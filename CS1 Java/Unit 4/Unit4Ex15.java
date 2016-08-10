import javax.swing.JOptionPane;

public class Unit3Ex9 {
	public static void main (String [] args) {
		int Fishsticks, FishPlace1, FishPlace2;
		String Dare;
		BoundedEnv env = new BoundedEnv(10, 10);
        SimpleMBSDisplay display = new SimpleMBSDisplay(env, 100);
        FishPlace1 = (int) (math.floor(math.random() * 10));
        FishPlace2 = (int) (math.floor(math.random() * 10));
        Fish fishy = new Fish(env, new Location(FishPlace1,FishPlace2));
        fishy.show(display);
        
		do {
			Dare = JOptionPane.showInputDialog ("Enter a 'f' for forward or 'r' for right.");
			if (Dare.equals("r")) {fishy.turnRight(); fishy.show(display);}
			else if (Dare.equals("f")) {fishy.forward(); fishy.show(display);}
		} while (!Dare.equals("q"));
	}
}