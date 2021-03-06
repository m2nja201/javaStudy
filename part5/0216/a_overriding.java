// 0216

class a_overriding{
	String name;
	String number;
	int birthYear;
	
	@Override
	public int hashCode(){
		final int prime = 31; // eclipse는 알아서 만들어줌
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;  // 클래스 정보
		a_overriding other = (a_overriding) obj;
		if(number == null){
			if (other.number != null) return false;
		}
		else if (!number.equals(other.number)) return false;
		return true;
	}
	
	@Override
	public String toString(){
		return "Student [name = "+name+"]  number = "+number+"]";
	}
	
public static void main(String [] args){
	a_overriding stu1 = new a_overriding();
	stu1.name = "홍길동";
	stu1.number = "1234";
	stu1.birthYear = 1995;
	
	a_overriding stu2 = new a_overriding();
	stu2.name = "홍길동";
	stu2.number = "1234";
	stu2.birthYear = 1995;
	
	
	// 오버라이딩을 하면 둘이 같다고 나옴
	if (stu1.equals(stu2)) System.out.println("s1==s2");
	else System.out.println("s1!=s2");
	
	System.out.println(stu1.hashCode());
	System.out.println(stu2.hashCode());
	
	// 오버라이딩 하면 둘 다 똑같이 나옴
	System.out.println(stu1);
	System.out.println(stu1.toString());
}
}