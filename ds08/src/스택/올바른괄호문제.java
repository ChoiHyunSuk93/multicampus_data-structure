package 스택;

import java.util.Stack;

public class 올바른괄호문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "()()";
		String s = ")()(";
		boolean answer = false;
		
		Stack<Character> stack = new Stack<>();
		try {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '(') {
					stack.push('(');
				} else {
					stack.pop();
				}//if-else
			}//for
			answer = stack.empty();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			answer = false;
		}
		System.out.println(stack);
		System.out.println(answer);
	}

}
