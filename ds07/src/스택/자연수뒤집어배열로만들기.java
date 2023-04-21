package 스택;

import java.util.Arrays;
import java.util.Stack;

public class 자연수뒤집어배열로만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12345;
		String[] s = String.valueOf(n).split("");
		int[] answer = new int[s.length];
		Stack<String> stack = new Stack<>();
		for (String x : s) {
			stack.push(x);
		}

		for (int i = 0; i < s.length; i++) {
			answer[i] = Integer.parseInt(stack.pop());
		}
		System.out.println(Arrays.toString(answer));
	}

}
