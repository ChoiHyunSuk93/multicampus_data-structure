package 프로그래머스;

public class 배열의연산 {

	
	// {1,2,3,4,5,6,7,8,9,10}
	// 세 수를 더했을 때 가장 큰 숫자를 구해보기
	// 배열이 오름차순으로 정렬이 되어 있는 상태
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution3 sol = new Solution3();
		int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int answer = sol.solution(num);
		System.out.println(answer);
	}

}

class Solution3 {
    public int solution(int[] numbers) {
    	int answer = numbers[numbers.length-1] + 
    				numbers[numbers.length-2] + 
    				numbers[numbers.length-3];
        return answer;
    }
}
