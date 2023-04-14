package 컬렉션;

import java.util.*;

public class 배열과컬렉션변환3 {

	public static void main(String[] args) {
		String[] s2 = { "aaa", "bbb", "ccc", "aaa" };
		stringPrint(s2);
		// 배열을 가지고 하면 복잡한 처리가 있으면 list로 하면 편하다.
		// 검색, 수정, 인덱스의 작업을 하시려면 asList()를 사용하면 된다.
		// asList()로 하면 실제로는 원본 배열을 가지고 처리하는 것이기
		// 때문에 길이와 관련된 추가, 삭제, 삽입이 불가능하다.
		// 추가, 삭제, 삽입의 작업을 하시려면 모든 기능을 가진 ArrayList를
		// 새로 만들어주면 됨.
		List<String> list3 = new ArrayList<String>(Arrays.asList(s2));
		list3.add("hahaha");
		list3.remove("bbb");
		list3.set(0, "hohoho");
		System.out.println(list3);
		
		// 다시 배열로
		String[] answer = new String[list3.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list3.get(i);
		}
		stringPrint(answer);
		
	}

	public static void intPrint(int[] array) {
		System.out.println(Arrays.toString(array));
	}

	public static void stringPrint(String[] array) {
		System.out.println(Arrays.toString(array));
	}
}