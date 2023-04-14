package 프로그래머스;

public class 배열의연산2 {

	
	// {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} 90
	// {1, 2, 3, 4, 5, 9, 10} 90
	// {-20, -30, 3, 4, 5, 9, 10} 600
	// 두 수를 곱했을 때 가장 큰 숫자 구하기
	// 배열이 오름차순으로 정렬이 되어 있는 상태
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution4 sol = new Solution4();
		int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int answer = sol.solution(num);
		System.out.println(answer);
	}

}

class Solution4 {
	public int solution(int[] numbers) {
		int post = numbers[numbers.length - 2] 
					* numbers[numbers.length - 1];
		int pre = numbers[0] * numbers[1];
		int answer = 0;
		if(post > pre) {
			answer = post;
		}else {
			answer = pre;
		}
		return answer;
	}
}
