abstract class Unit2{
	int x, y;
	abstract void move(int x, int y);
	void stop() {System.out.println("stop!");}
}

interface Fightable {
	// public abstract가 생략된 상태
	void move(int x, int y);
	void attack(Fightable f);
}

class Fighter extends Unit2 implements Fightable{
	public void move(int x, int y)
	{
		System.out.printf("[%d, %d]로 이동\n", x, y);
	}
	public void attack(Fightable f)
	{
		System.out.println(f+"를 공격!");
	}
	
	Fightable getFightable() {
		Fighter ff = new Fighter();
		return ff;
	}
}

public class ex07_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighter f = new Fighter(); // Fightable 참조 변수도 가능한데, stop 못씀
		f.move(100, 200);
		f.attack(new Fighter());
		Fightable f2 = f.getFightable();
		f2.attack(f);
	}

}
