package 문자열;

public class 서울에서김서방찾기 {

	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		Solution sol = new Solution();
		String answer = sol.solution(seoul);
		System.out.println(answer);
	}

}

class Solution {
	public String solution(String[] seoul) {
		String answer = "";
		int index = 0;
		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				index = i;
			}
		}
		answer = "김서방은 " + index + "에 있다";
		return answer;
	}
}