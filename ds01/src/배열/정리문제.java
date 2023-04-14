package 배열;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 정리문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1번
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		int min = num[0];
		for (int x : num) {
			if (x < min) {
				min = x;
			}
		}
		System.out.println("최솟값은 : " + min);

		// 2번
		Random r = new Random();
		int[] num2 = new int[20];
		for (int i = 0; i < num2.length; i++) {
			num2[i] = r.nextInt(900);
		}
		int max = num2[0];
		for (int x : num2) {
			if (x > max) {
				max = x;
			}
		}
		System.out.println("최댓값은 : " + max);

		// 3번
		String s1 = "참좋다";
		String s2 = "진짜좋다";

		if (s1.equals(s2)) {
			System.out.println("동일");
		} else {
			System.out.println("동일하지 않다.");
		}

		if (s1.length() > s2.length()) {
			System.out.println("s1이 더 크다.");
		} else if (s1.length() < s2.length()) {
			System.out.println("s2가 더 크다.");
		} else {
			System.out.println("같다.");
		}

		// 4번
		String s3 = "나는 진짜 java programmer가 되었어";
		String s33 = s3.substring(6, 21);
		System.out.println(s33.toUpperCase());

		// 5번
		String s4 = "2056521";
		char s44 = s4.charAt(0);
		if (s44 == '1') {
			System.out.println("남자");
		} else if (s44 == '2') {
			System.out.println("여자");
		}
		
		// 6번
		String s5 = "[ 10, 20, 30, 40, 50]";
		String s6 = s5.replace("[", "");
		String s7 = s6.replace("]", "");
		String s8 = s7.trim();
		String[] s55 = s8.split(", ");
		System.out.println(s55[0]);
		System.out.println(s55[1]);
		System.out.println(s55[2]);
		System.out.println(s55[3]);
		System.out.println(s55[4]);
		int sum = 0;
		for (String x : s55) {
			int x2 = Integer.parseInt(x);
			sum = sum + x2;
		}
		System.out.println(sum);
		
		// 7번
		int[] newArray = new int[s55.length];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = Integer.parseInt(s55[i]);
		}
		System.out.println(Arrays.toString(newArray));
		
		
	}

}
