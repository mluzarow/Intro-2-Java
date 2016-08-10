public class Unit4Ex14 {
	public static void main (String [] args) {
		int Fishsticks;
		BoundedEnv env = new BoundedEnv(10, 10);
        SimpleMBSDisplay display = new SimpleMBSDisplay(env, 100);
        Fish fishy = new Fish(env, new Location(5,5));
        fishy.show(display);
        
		for (int i = 0; i < 50; i++) {
			Fishsticks = (int) (math.floor(math.random() * 2));
			
			if (Fishsticks == 0) {fishy.turnRight(); fishy.show(display);}
			else if (Fishsticks == 1) {fishy.forward(); fishy.show(display);}
		}
	}
}