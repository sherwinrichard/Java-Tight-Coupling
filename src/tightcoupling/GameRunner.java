package tightcoupling;
public class GameRunner {
	SuperContra a;
	public GameRunner(SuperContra a) {
		this.a = a;	
	}
	public static void main(String[] args) {	
		Mario mario = new Mario();
		SuperContra supercontra = new SuperContra();
		BatMan batman = new BatMan();
		
		GameRunner obj = new GameRunner(supercontra);
		obj.runGame();
	}
	void runGame() {
		a.up();
		a.down();
		a.right();
		a.left();			
	}
}


	
	
