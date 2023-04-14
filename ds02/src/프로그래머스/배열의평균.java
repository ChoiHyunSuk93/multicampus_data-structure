package 프로그래머스;

public class 배열의평균 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution2 sol = new Solution2();
		int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		double answer = sol.solution(num);
		System.out.println(answer);
	}

}

class Solution2 {
    public double solution(int[] numbers) {
    	int size = numbers.length;
    	int sum = 0;
    	for (int x : numbers) {
			sum = sum + x;
		}
    	
    	double answer = (double)sum / size;
        return answer;
    }
}
