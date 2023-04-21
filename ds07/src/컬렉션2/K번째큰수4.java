package 컬렉션2;

import java.util.ArrayList;
import java.util.Scanner;

public class K번째큰수4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 1번. 배열이나 list등의 선형구조를 이용한 풀이
		int k = sc.nextInt(); // k번째 작은수 : 2
		ArrayList<Integer> list = new ArrayList<Integer>();

		while (true) {
			int data = sc.nextInt();
			if (data == 0) { // 0 입력하면 멈추기
				break;
			} else {
				list.add(data);
			}
		}

	}

}
