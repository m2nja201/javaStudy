// 0209~0210

public class gettersetter{
	public static void main(String [] args){
		Villain v1 = new Villain("좀비", 1020, 180, 80, "12345", 1, 90);
		v1.print();
		v1.move();
		System.out.println(" ");
		
		Villain v2 = new Villain("조커", 30, 174, 65, "87642", 3, 99.3);
		v2.print();
		v2.move();
	}
}

class Person {
	private String name;
	private int age;
	private int height;
	private int weight; // private을 통해 접근 제한 - 해당 클래스에서만 들어올 수 있도록
	
	Person(){}
	Person(String name, int age, int height, int weight){
		setname(name);
		setAge(age);
		setHeight(height);
		setWeight(weight);
	}
	
	public void setname(String name){this.name = name;} // set할 때는 반환값 X
	public String getName(){return name;}
	
	public void setAge(int age){this.age = age;}
	public int getAge(){return age;}
	
	public void setHeight(int height){this.height = height;}
	public int getHeight(){return height;}
	
	public void setWeight(int weight){this.weight = weight;}
	public int getWeight(){return weight;}
	
	public void move(){System.out.println(name + " 이동중...");}
}


class Villain extends Person{
	private String unique_key;
	private int weapon; // 숫자로 무기 선택
	private double power;
	
	Villain(){}
	Villain(String name, int age, int height, int weight, String unique_key, int weapon, double power){
		super(name, age, height, weight);
		setKey(unique_key);
		setWeapon(weapon);
		setPower(power);
	}
	
	public void setKey(String unique_key){this.unique_key = unique_key;}
	public String getKey(){return unique_key;}
	
	public void setWeapon(int weapon){this.weapon = weapon;}
	public int getWeapon(){return weapon;}
	
	public void setPower(double power){this.power = power;}
	public double getPower(){return power;}
	
	public String getWeaponName(int weapon){
		String wpname;
		switch(weapon){
			case 1:
				wpname = "주먹";
				break;
			case 2:
				wpname = "창";
				break;
			case 3:
				wpname = "총";
				break;
			default:
				wpname = "random weapon";
				break;
		}
		return wpname;
	}
	
	public void print(){
		System.out.println("-------------------------------");
		System.out.println("악당 이름 : "+getName());
		System.out.println("악당 나이 : "+getAge());
		System.out.println("악당 키 : "+getHeight());
		System.out.println("악당 체중 : "+getWeight());
		System.out.println("악당 넘버 : "+getKey());
		System.out.println("악당 무기 : "+getWeaponName(getWeapon()));
		System.out.println("악당 파워 : "+getPower());
		System.out.println("-------------------------------");
	}
}