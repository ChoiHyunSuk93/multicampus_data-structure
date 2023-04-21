package 컬렉션;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Set반복자이터레이터2 {

	public static void main(String[] args) {

		HashSet<Integer> money = new HashSet<Integer>();
		// 일주일간 받았던 용돈
		// 1000, 2000, 3000, 2000, 4000, 2000, 3000
		money.add(1000);
		money.add(2000);
		money.add(3000);
		money.add(2000);
		money.add(4000);
		money.add(2000);
		money.add(3000);

		// 일주일간 받았던 용돈 중에서
		// 금액별로 얼마씩 받았는지 전체 프린트
		// 1000, 2000, 3000, 4000
		Iterator<Integer> it = money.iterator();
		for (int i = 0; i < money.size(); i++) {
			int x = it.next();
			System.out.println(x + "원");
		}
		System.out.println("------");
		Object[] money2 = money.toArray();
		Arrays.sort(money2);
		for (Object x : money2) {
			System.out.println(x + "원");
		}
		
	}

}
