package 스택;

import java.util.Arrays;
import java.util.Stack;

public class 같은숫자는싫어_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 1, 3, 3, 0, 1, 1};
		Stack<Integer> stack = new Stack<>();
		stack.push(arr[0]);
		for (int x	: arr) {
			if (x != stack.peek()) {
				stack.push(x);
			}
		}
		System.out.println(stack);
		
		int[] answer = new int[stack.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = stack.get(i);
		}
		System.out.println(Arrays.toString(answer));
	}

}
