package 정리문제;

public class 머쓱이할머니 {

	public static void main(String[] args) {
		String message = "happy birthday";
		Solution sol = new Solution();
		int answer = sol.solution(message);
		System.out.println(answer);

	}

}

class Solution {
	public int solution(String message) {
		int answer = 2 * message.length();
		return answer;
	}
}
