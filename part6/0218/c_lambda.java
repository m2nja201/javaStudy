// 0218
// 람다식

public class c_lambda{
	public static void exec(Compare compare){
		int k =10;
		int m = 20;
		int value = compare.compareTo(k, m);
		System.out.println(value);
	}
	
	public static void main(String [] args){
		exec((i, j)->{
			return i - j; // 음수면 j가 크다, 양수면 i가 크다, 0이면 같다
		});
		
		
		
		// 람다식 사용한 코드
		new Thread(()->{
			// 구현할 부분만 쓰면 됨
			for (int i = 0; i<10 ; i++){
				System.out.println("hello");
			}
		}).start();
		
		
	}
}

interface Compare{
	public int compareTo(int val1, int val2);
}

