abstract class Player {
	abstract void play(int pos);
	abstract void stop();
}

class AudioPlayer extends Player {
	void play(int pos) {
		System.out.printf("play the %dth(st, nd, rd) music of that player\n", pos);
	}
	
	void stop() {
		System.out.println("stop!");
	}
}

public class ex07_2 {
	public static void main(String[] args) {
		AudioPlayer ap = new AudioPlayer(); // Player apµµ »ó°ü X
		ap.play(100);
		ap.stop();
	}
}