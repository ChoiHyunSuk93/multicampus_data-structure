package 문자열;

import java.util.Arrays;

public class 확인문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String all = "국어, 영어, 수학, 컴퓨터";
		// 1. String[]로 바꾸기
		String[] all2 = all.split(", ");
		System.out.println(Arrays.toString(all2));
		// 2. 공백이 포함되어있다면 제거 후 다시 배열에 넣기
		// 3. 과목수는?
		System.out.println("과목수는 " + all2.length);
		// 4. 컴퓨터의 위치는?
		for (int i = 0; i < all2.length; i++) {
			if (all2[i].equals("컴퓨터")) {
				System.out.println("컴퓨터의 위치는 인덱스 >> " + i);
			}
		}
		
		// 5. 과목명이 3글자 미만인 과목수는?
		int count = 0;
		for (int i = 0; i < all2.length; i++) {
			if (all2[i].length() < 3) {
				count++;
			}
		}
		System.out.println("과목명이 3글자 미만인 과목수는 " + count);
		
		
	}

}
