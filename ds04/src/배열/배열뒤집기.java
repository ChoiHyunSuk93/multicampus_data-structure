
package 배열;

import java.util.Arrays;

public class 배열뒤집기 {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };

		Solution2 sol = new Solution2();
		int[] answer = sol.solution(numbers);
		System.out.println(Arrays.toString(answer));
	}

}

class Solution2 {
	public int[] solution(int[] numbers) {
		int[] answer = new int[numbers.length];
		int j = numbers.length - 1;
		for (int i = 0; i < answer.length; i++) {
			answer[j] = numbers[i];
			j--;
		}
		return answer;
	}
}