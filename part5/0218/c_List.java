// 0218
// List

import java.util.List;
import java.util.ArrayList;

public class c_List{
	public static void main(String [] args){
		List<String> list = new ArrayList<>();
		list.add("red");
		list.add("pink");
		list.add("red");
		
		System.out.println(list.size());
		
		for (int i=0; i<list.size(); i++){
			String str = list.get(i);
			System.out.println(str);
		}
	}
}