package 배열문제;

import java.util.*;

public class 중앙값구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = {5, 2, 1, 9, 11, 15, 17};
		String s2 = Arrays.toString(s);
		System.out.println(s2);
		// 1. 정렬을 먼저하자
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		// 2. 중앙위치를 구하자
		// 가운데 위치 구하는 방법 -> 배열의 길이 3 / 2 = 1
		//						     5 / 2 = 2
		int center = s.length / 2;
		
		// 3. 배열의 중앙 위치값
		int answer = s[center];
		System.out.println(answer);
		
		
	}

}
