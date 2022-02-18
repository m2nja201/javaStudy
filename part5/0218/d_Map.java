// 0218
// Map

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class d_Map{
	public static void main(String [] args){
		Map<String, String> map = new HashMap<>();
		map.put("001", "red"); // key, value
		map.put("002", "yellow");
		map.put("003", "green");
		map.put("001", "blue"); // key값을 중복 될 수 없음
		
		System.out.println(map.size()); // 3
		System.out.println(map.get("001")); // 최신으로 덮어씀
		
		System.out.println("================");
		
		Set<String> keys = map.keySet(); // return type : Set
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()){
			String key = iter.next();
			System.out.println(key + " : " + map.get(key));
		}
	}
}