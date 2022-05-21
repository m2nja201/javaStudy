
public class ex07_3 {
	public static void main(String[] args) {
		Unit[] group = {new Marine(), new Tank()};
		
		for (int i = 0; i < group.length; i++) {
			group[i].move(100, 200);
		}
	}
}

abstract class Unit{
	int x, y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("stop this position ("+x+", "+y+")");
	}
}

class Marine extends Unit { // º¸º´
	void  move(int x, int y) {
		System.out.println("moving ...");
		this.x = x;
		this.y = y;
	}
	void stimPack() {
		System.out.println("using the stimPack!");
	}
}

class Tank extends Unit{
	void move(int x, int y) {
		System.out.println("moving ...");
		this.x = x;
		this.y = y;
	}
}
