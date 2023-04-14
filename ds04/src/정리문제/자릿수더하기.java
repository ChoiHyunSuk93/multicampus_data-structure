package 정리문제;

public class 자릿수더하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1234;
		Solution2 sol = new Solution2();
		int answer = sol.solution2(n);
		System.out.println(answer);
	}

}

class Solution2 {
    public int solution2(int n) {
    	String s = String.valueOf(n);
    	String[] s1 = s.split("");
    	int answer = 0;
    	for (String x : s1) {
			int s2 = Integer.parseInt(x);
			answer = answer + s2;
		}
        return answer;
    }
}