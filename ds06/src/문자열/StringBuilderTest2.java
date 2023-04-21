package 문자열;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringBuilderTest2 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		sb1.append("honghong");
		System.out.println(sb1);
		
		StringBuilder sb11 = new StringBuilder("honghong");
		System.out.println(sb11);
		
		StringBuilder sb2 = new StringBuilder("honghong");
		System.out.println(sb2);
		
		System.out.println(sb1 == sb2);
		sb1.append("hahaha");
		System.out.println(sb1);
		sb1.replace(0, 8, "hohohoh");
		System.out.println(sb1);
		sb1.delete(0, 8);
		System.out.println(sb1);
		sb1.deleteCharAt(4);
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
		
		// 앞뒤로 바꿀 때 편하다.
		String s = "pongpong";
		StringBuilder sb3 = new StringBuilder(s);
		sb3.reverse();
		System.out.println(sb3);
		
		// 정렬된 데이터를 역정렬로 만들기도 현하다.
		String[] s4 = s.split("");
		List<String> list = Arrays.asList(s4);
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
	}
}
