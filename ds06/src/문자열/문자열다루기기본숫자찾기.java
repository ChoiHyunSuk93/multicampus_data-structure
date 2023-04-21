package 문자열;

import java.util.Arrays;

public class 문자열다루기기본숫자찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "a234"; // false
		String s = "1234"; // true
		boolean answer = true;

		// 4글자 혹은 6글자인지 확인해서 맞으면 아래를 실행
		// 글자 수 구해주자
		int size = s.length();
		if (size == 4 || size == 6) {
			// 1. 글자 하나씩 떨어뜨려라.
			// for문 돌려서 하나씩 꺼낸 다음
			// 글자 하나하나가 0~9사이인지 확인
			char[] c = s.toCharArray();
			System.out.println(Arrays.toString(c));
			for (char x : c) {
				if (x < '0' || x > '9') { // ASCII 코드
					answer = false;
					break;
				}
			} // for
		} else {
			answer = false;
		}
		System.out.println(answer);
		
		// 2. 숫자로 바꾸어서 에러가 생기면 문자가 포함되어 있음.
		if (size == 4 || size == 6) {
			try {
				Integer.parseInt(s);
			} catch (NumberFormatException e) {
				// 에러처리할 내용
				// answer에 넣자
				answer = false;
			}
		} else {
			answer = false;
		}

		System.out.println(answer);

		// 2. 숫자로 바꾸어서 에러가 생기면
		// 문자가 포함되어 있음.

	}

}
