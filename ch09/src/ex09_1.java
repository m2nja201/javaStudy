import java.util.Objects;

class Card{
	String kind;
	int number;
	
	Card(){
		this("SPADE", 1);
	}
	
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	// equals 오버라이딩 하면 hashCode도 오버라이딩 해야함
	public int hashCode() {
		return Objects.hash(kind, number);
	}
	
	public boolean equals(Object obj) {
		if (!(obj instanceof Card))
			return false;
		Card card = (Card)obj;
		return this.kind.contentEquals(card.kind) && this.number==card.number;
	}
	
	// Override
	public String toString() {
		return "kind : "+kind + ", number : "+number;
	}
}

public class ex09_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		System.out.println(c1.equals(c2));
	}

}
