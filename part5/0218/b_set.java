// 0218
// set

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class b_set{
	public static void main(String [] args){
		Set<String> set1 = new HashSet<>();
		boolean flag1 = set1.add("it's yellow"); // add 할 때마다 boolean이 return (중복이 되지 않기 때문)
		boolean flag2 = set1.add("blue");
		boolean flag3 = set1.add("it's yellow"); // false
		
		System.out.println(set1.size()); // 2 (중복이 있었기 때문)
		System.out.println(flag1);
		System.out.println(flag2);
		System.out.println(flag3); // 중복됐기 때문에 false를 출력
		
		Iterator<String> iter = set1.iterator();
		// 이 set에 iterator가 있니?
		while(iter.hasNext()){
			String str = iter.next();
			System.out.println(str);
		}
	}
}