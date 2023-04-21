package 문자열;

public class 문자열긴단어출력 {
	public static void main(String[] args) {
		String s = "i am a boy";
		// 1. 배열에 한 단어씩 넣으세요.
		String[] s2 = s.split(" ");
		// 2. 최대길이를 넣을 수 있는 max 변수 선언
		int max = s2[0].length();
		// 3. 최대길이를 가지는 string을 넣어줄 수 있는
		// maxString 변수 선언
		String answer = s2[0];
		for (String x : s2) {
			if (x.length() > max) {
				max = x.length();
				answer = x;
			}
		}
		System.out.println(answer);
	}
}
