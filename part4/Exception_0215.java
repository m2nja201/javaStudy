// 0215
// 예외 처리

public class Exception_0215{
	public static void main(String [] args){
		int i = 10;
		int j = 0;
		try{
			int k = i/j;
			System.out.println(k);
		} catch (ArithmeticException e){
			System.out.println("0으로 나눌 수 없다   "+ e.toString());
			// e.toString() => 예외의 정보를 알려주는 메서드
		} finally{
			System.out.println("무조건 실행");
		}
		System.out.println("");
		/////////
		
		try{
			int y = divide(i, j); 
			System.out.println(y);
		}
		catch (Exception er){
			System.out.println("오류~" + er.toString());
		}
		System.out.println("");
		//////////
		BizService sev = new BizService();
		sev.bizM(5);
		try{
			sev.bizM(-2);
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	static int divide(int i, int j) throws Exception {
		if (j == 0){
			throw new IllegalArgumentException("0으로 나눌 수 없다.");
		}
			
		int k = i/j;
		return k;
	}
	
}
class BizException extends RuntimeException {
	public BizException(String msg){
		super(msg);
	}
	public BizException(Exception ex){
		super(ex);
	}
} // unchecked exception

class BizService{
	public void bizM(int i) throws BizException{
		System.out.println("시작");
		if(i<0){
			throw new BizException("매개변수 i는 0보다 작을 수 없다.");
		}
		System.out.println("종료");
	}
}