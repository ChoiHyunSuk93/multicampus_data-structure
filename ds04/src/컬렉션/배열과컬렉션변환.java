package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열과컬렉션변환 {
	public static void main(String[] args) {
		int[] s = {5, 2, 1, 9, 11, 15, 17};
		Arrays.sort(s);
		intPrint(s);
		
		String[] s2 = {"aaa", "bbb", "ccc", "aaa"};
		stringPrint(s2);
		
		// 1. 배열에 aaa가 궁금
		// List로 변형
		List<String> list = Arrays.asList(s2);
		System.out.println(list);
		System.out.println(list.contains("aaa"));
		
		// bbb삭제
//		list.remove(1);
		// ccc위치
		System.out.println(list.indexOf("ccc"));
		// aaa가 들어있는 마지막 위치
		System.out.println(list.lastIndexOf("aaa"));
		// 전체 내용 프린트
		System.out.println(list);
		// 맨 앞에 ddd 삽입
//		list.add(0,"ddd");
		// 맨 뒤에 fff 삽입
		// 인덱스2번의 내용을 ggg로 변경
		list.set(2,"ggg");
		// 전체 프린트
		System.out.println(list);
		
		// 제약이 없는 ArrayList를 다시 만들어주면 된다
		List<String> list3 = new ArrayList<String>(Arrays.asList(s2));
		list3.add("hahaha");
		list3.remove("bbb");
		System.out.println(list3);
		
		// 코딩테스트에서는 반환을 거의 배열로 하게 되어있다
//		String[] s3 = (String[])list3.toArray();
//		stringPrint(s3);
		
	}
	
	public static void intPrint(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	
	public static void stringPrint(String[] array) {
		System.out.println(Arrays.toString(array));
	}
}
