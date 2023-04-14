package 프로그래머스기본;

public class 각도기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Solution {
    public int solution(int angle) {
        int answer = 0;
        if (angle < 90 && angle > 0) {
			answer = 1;
		} else if (angle == 90) {
			answer = 2;
		} else if (angle > 90 && angle < 180) {
			answer = 3;
		} else if (angle == 180) {
			answer = 4;
		}
        return answer;
    }
}