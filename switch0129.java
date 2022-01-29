//01.29
// 강의내용만 따라하지 말고 배운 내용 떠올리면서 새로 짜보기

public class switch0129{
	public static void main(String [] args){
		int age = 22;
		int about_age;
		int res = age%10;
		
		// 사용자 예외 처리
		if (res != 0){
			about_age = age-res;
		}
		else about_age = age;
		
		switch(about_age){
			case (10):
				System.out.println(about_age+"대 입니다. 10대 추천 아두이노 수업 링크는 A창구에서 받아가십시오.");
				break;
			case 20:
				System.out.println(about_age+"대 입니다. 정부지원 부트캠프 리스트를 확인하시려면 B창구에 가십시오.");
				break;
			case 30:
				System.out.println(about_age+"대 입니다. 취업 상담 코너는 C창구에 마련되어 있습니다.");
				break;
			case 40:
				System.out.println(about_age+"대 입니다. 재태크 관련 서적은 D창구에 마련되어 있습니다.");
				break;
			default:
				System.out.println("50대 이상입니다. 필요하신 부분이 있으시면 호출 버튼을 눌러주십시오.");
				break;
		}
	}
}