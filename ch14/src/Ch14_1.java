
public class Ch14_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Object obj = (a, b) -> a > b ? a : b // ���ٽ� (�͸� ��ü)
				
		// ���� ��������
		/*
		MyFunc f = new MyFunc() {
			
			@Override
			public int max(int a, int b) {
				// TODO Auto-generated method stub
				return a > b ? a :b;
			}
		}*/
		
		MyFunc f = (a, b) -> a > b ? a : b;
		
		int val = f.max(3, 5); // �Լ��� �������̽��� �ʿ�
		System.out.println("value = "+val);
	}

}

@FunctionalInterface // �ϳ��� �߻� �޼��常 �־�� �ϹǷ� �� ������ �����ָ� �߻� �޼��尡 �ϳ� �� ���� �� ���� ǥ������
interface MyFunc{
	public abstract int max(int a, int b);
}