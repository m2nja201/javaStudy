import java.io.*;

public class ex08_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f = createFile("");
			System.out.println(f.getName() + "������ ���������� �����Ǿ����ϴ�.");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage()+ "�ٽ� �Է����ֽñ� �ٶ��ϴ�.");
		}
	}
	
	static File createFile(String fileName) throws Exception {
		if (fileName==null || fileName.contentEquals(""))
			throw new Exception("���� �̸��� ��ȿ���� �ʽ��ϴ�. ");
		File ff = new File(fileName);
		ff.createNewFile();
		return ff;
	}

}
