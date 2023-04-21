package 정리문제;

public class 문장속긴단어출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "he is a superman";
		String[] s = a.split(" ");
		int max = s[0].length();
		String answer = s[0];
		for (String x : s) {
			if (x.length() > max) {
				max = x.length();
				answer = x;
			}
		}
		System.out.println(answer);
	}

}
