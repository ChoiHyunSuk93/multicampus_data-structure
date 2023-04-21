package 컬렉션2;

import java.util.Arrays;

public class K번째큰수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {3, 4, 5, 1, 2};
		int k = 2;
		
		Arrays.sort(num);
		for (int x : num) {
			System.out.println(x);
		}
		String num2 = Arrays.toString(num);
		System.out.println(num2);
		System.out.println(Arrays.toString(num));
		
		System.out.println("제일 큰 수: " + num[num.length - 1]);
		System.out.println("두 번째 큰 수: " + num[num.length - 2]);
		System.out.println("세 번째 큰 수: " + num[num.length - 3]);
		System.out.println(k + " 번째 큰 수: " + num[num.length - k]);
	}

}
