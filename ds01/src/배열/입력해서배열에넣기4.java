package 배열;

import java.util.Scanner;

public class 입력해서배열에넣기4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner	sc = new Scanner(System.in);
		double[] num = new double[5];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextDouble();
		}
		
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == 22.2) {
				count++;
			}
		}
		System.out.println("22.2의 갯수는 " + count);
	}

}
