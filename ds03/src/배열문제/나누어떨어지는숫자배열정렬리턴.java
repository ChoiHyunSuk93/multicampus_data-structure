package 배열문제;

import java.util.*;

public class 나누어떨어지는숫자배열정렬리턴 {

	public static void main(String[] args) {
		int[] array = { 5, 9, 7, 10 };
		int divisor = 5;
		Solution4 sol = new Solution4();
		int[] answer = sol.solution(array, divisor);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution4 {
	public int[] solution(int[] array, int divisor) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] % divisor == 0) {
				list.add(array[i]);
			}//if
		}//for
		int[] answer = null;
		if (list.size() != 0) {
			answer = new int[list.size()];
			for (int i = 0; i < list.size(); i++) {
				answer[i] = list.get(i);
			}//for
		} else {
			answer = new int[1];
			answer[0] = -1;
		}

		Arrays.sort(answer);
		return answer;
	}
}
