package 스택;

import java.util.Stack;

public class 백준_stack확인 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println(stack.empty());
		
		try {
			System.out.println(stack.pop()); //2
			System.out.println(stack.pop()); //1
			System.out.println(stack.pop()); //?? 에러
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("-1");
		}
		System.out.println(stack.size());
		System.out.println(stack.empty()? 1 : 0);
		
		try {
			System.out.println(stack.pop());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("-1");
		}
		
		stack.push(3);
		System.out.println(stack.empty()? 1 : 0);
		System.out.println(stack.peek());
	}

}
