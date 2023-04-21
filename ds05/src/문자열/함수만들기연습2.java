package 문자열;

public class 함수만들기연습2 {

	public static void 세수하기() {
		System.out.println("얼굴을 씻는다.");
		System.out.println("클렌징을 한다.");
		System.out.println("얼굴을 헹군다.");
	}
	
	public static void 밥먹기() {
		System.out.println("밥을 차린다.");
		System.out.println("밥을 먹는다.");
		System.out.println("밥을 치운다.");
	}
	
	public static void 운동하기() {
		System.out.println("운동복을 갈아입는다.");
		System.out.println("운동장으로 간다.");
		System.out.println("뛴다.");
	}
	
	public static void 잠자기() {
		System.out.println("잠옷을 입는다.");
		System.out.println("잔다.");
	}
	
	public static void 화장하기() {
		System.out.println("피부를 정리한다.");
		System.out.println("베이스를 깐다.");
		System.out.println("눈화장을 한다.");
		System.out.println("입술을 바른다.");
	}
	public static void main(String[] args) {
		세수하기();
		밥먹기();
		운동하기();
		잠자기();
		밥먹기();
		세수하기();
		화장하기();
		밥먹기();
		운동하기();
		잠자기();
		
	}

}