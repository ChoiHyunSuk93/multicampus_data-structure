package 배열;

import java.util.Arrays;
import java.util.Random;

public class 배열최댓값구하기 {

	public static void main(String[] args) {
		Random r = new Random(99);
		int[] num = new int[10];
		int[] num2 = new int[10];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000); // 0~999
		}
		int max = num[0];
		
		for (int x : num) {
			if (x > max) {
				max = x;
			}
		}
		System.out.println("최댓값은  " + max);
		
		Arrays.sort(num);
		System.out.println("최솟값은 " + num[0]);
		System.out.println("최댓값은 " + num[9]);
		
		if (Arrays.equals(num, num2)) {
			System.out.println("두 배열이 같다.");
		} else {
			System.out.println("두 배열이 다르다.");
		}
		
		String result = Arrays.toString(num);
		System.out.println(result);
	}

}
