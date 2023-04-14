package 문자열;

public class 스트링비교 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "정길동";
		String s2 = "정길동";
		
		System.out.println("주소 비교: " + (s == s2));
		s = "김길동";
		System.out.println("주소 비교: " + (s == s2));
	}

}
