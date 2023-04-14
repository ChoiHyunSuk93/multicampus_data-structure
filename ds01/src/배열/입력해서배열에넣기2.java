package 배열;

import java.util.Scanner;

public class 입력해서배열에넣기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner	sc = new Scanner(System.in);
		double[] num = new double[5];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextDouble();
		}
		for (double d : num) {
			System.out.println(d);
		}
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] == 22.2) {
				System.out.println("위치는 " + i);
			}
			if (num[i] == 33.3) {
				System.out.println("위치는 " + i);
				
			}
		}
	}

}
