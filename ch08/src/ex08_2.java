import java.io.*;

public class ex08_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f = createFile("");
			System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage()+ "다시 입력해주시길 바랍니다.");
		}
	}
	
	static File createFile(String fileName) throws Exception {
		if (fileName==null || fileName.contentEquals(""))
			throw new Exception("파일 이름이 유효하지 않습니다. ");
		File ff = new File(fileName);
		ff.createNewFile();
		return ff;
	}

}
