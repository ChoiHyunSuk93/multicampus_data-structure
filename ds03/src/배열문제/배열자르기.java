package 배열문제;

import java.util.*;

public class 배열자르기 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int start = 1;
		int end = 3;

		Solution5 sol = new Solution5();
		int[] answer = sol.solution(array, start, end);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution5 {
	public int[] solution(int[] numbers, int num1, int num2) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = num1; i <= num2; i++) {
			list.add(numbers[i]);
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}

}
