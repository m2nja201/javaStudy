// 0210

public class reference{
	public static void main(String [] args){
		int ar1[] = {1, 2, 3, 4, 5};
		char ar2[] = {'A', 'B', 'C', 'D', 'E'};
		Candidate ca[] = new Candidate[5]; // size = 5
		
		ca[0] = new Candidate("홍길동", 20);
		ca[1] = new Candidate("고길동", 26);
		ca[2] = new Candidate("이길동", 22);
		ca[3] = new Candidate("금길동", 24);
		ca[4] = new Candidate("은길동", 23);

		for (int k=0; k<ca.length; k++){
			ca[k] = new Candidate((k+1+"번 후보자"), 32+k);
		}
		
		for (int i=0; i<ca.length; i++){
			System.out.print("("+ca[i].getName()+", "+ca[i].getAge()+"살) \t");
		}
	}
}

class Candidate{
	private String name;
	private int age;
	
	Candidate(){}
	Candidate(String name, int age){
		setName(name);
		setAge(age);
	}
	
	public void setName(String name){this.name = name;}
	public String getName(){return name;}

	public void setAge(int age){this.age = age;}
	public int getAge(){return age;}
}