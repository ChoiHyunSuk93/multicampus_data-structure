package 배열;

import java.util.Arrays;

public class 짝수가싫어요 {

	public static void main(String[] args) {
		int n = 10;
		Solution3 sol = new Solution3();
		int[] answer = sol.solution(n);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution3 {
	public int[] solution(int n) {
		int size = 0;
		if (n % 2 == 0) {
			size = n / 2;
		} else {
			size = n / 2 + 1;
		}
		int[] answer = new int[size];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = (i * 2) + 1;
		}

		return answer;
	}
}