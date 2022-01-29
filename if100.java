//1.29
// c++이랑 거의 동일해서 빠르게 학습하기

public class if100 {
	public static void main(String[] args){
		int kor=20, eng=90, math=90;
		double avr = (kor+eng+math)/3;
		
		if (avr>90){
			System.out.println("본인의 평균 점수는 "+avr+"이므로 A학점 입니다.");
		}
		else if(avr<=90 && avr>85){
			System.out.println("본인의 평균 점수는 "+avr+"이므로 B학점 입니다");
		}
		else if(avr<=85 && avr>70){
			System.out.println("본인의 평균 점수는 "+avr+"이므로 C학점 입니다");
		}
		else{
			if(math>=50){
				System.out.println("본인의 평균 점수는 "+avr+"이고 수학점수는 "+math+"점이므로 D학점이며, 재수강 대상자가 아닙니다.");
			}
			else System.out.println("본인의 평균 점수는 "+avr+"이고 수학점수는 "+math+"점이므로 D학점이며, 재수강 대상자 입니다.");
			
		}
	}
}