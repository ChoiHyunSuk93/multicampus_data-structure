package 문자열;

public class StringBuilderTest {
	public static void main(String[] args) {
		String s = "pongpong";
		String s2 = "pongpong";
		System.out.println(s == s2); // 주소비교
		
		s = "hahaha";
		System.out.println(s == s2);
	}
}
