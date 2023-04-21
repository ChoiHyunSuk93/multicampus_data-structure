package 문자열;

public class 수박수박수박수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		String answer = "";
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				answer = answer + "수";
			} else {
				answer = answer + "박";
			}
		}
		System.out.println(answer);
	}

}
