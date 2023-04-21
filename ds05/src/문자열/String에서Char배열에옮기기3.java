package 문자열;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class String에서Char배열에옮기기3 {

	public static void main(String[] args) {
		String sno = "2056521";

		// 1. 마지막 위치의 숫자가 1이면 서대문구에서 출생, 1이 아니면 다른 구에서 출생
		if (sno.charAt(sno.length() - 1) == '1') {
			System.out.println("서대문구에서 출생");
		} else {
			System.out.println("다른 구에서 출생");
		}

		// 2. "52"를 추출해서 두 수를 더하기
		// 더해서 10이 넘지 않아야 유효한 주민번호
		// 유효한 주민번호인지 아닌지 출력
//		char[] two = new char[2];
//		sno.getChars(4, 6, two, 0); 
		// 원본인 sno에서 4~5째 문자를 추출해서 char[] two에 인덱스 0부터 넣어주세요
		int sum = Character.getNumericValue(sno.charAt(4)) + Character.getNumericValue(sno.charAt(5));
		if (sum <= 10) {
			System.out.println("유효한 전화번호");
		} else {
			System.out.println("유효하지 않은 전화번호");
		}

		// 3. 주민번호에 포함된 5의 갯수를 출력
		int count = 0;
		for (int i = 0; i < sno.length(); i++) {
			if (sno.charAt(i) == '5') {
				count++;
			}
		}
		System.out.println(count);

		// 인덱스를 빨리 찾는 방법(함수)
		String[] stringArray = sno.split("");
		System.out.println(Arrays.binarySearch(stringArray, "5"));

		// 배열에 특정한 값을 한꺼번에 변경할 수 있는 함수
		Arrays.fill(stringArray, 0, 3, "hoho");
		System.out.println(Arrays.toString(stringArray));

		// 배열의 순서를 다 뒤집는 방법(함수)
		Arrays.sort(stringArray); // 정렬(오름차순)
		// Arrays로 내림차순을 할 수는 있으나 너무 복잡
		// ==>컬렉션으로 변환해서 하면 더 간단.
		System.out.println(Arrays.toString(stringArray));

		List<String> list = Arrays.asList(stringArray);
		Collections.sort(list); // 정렬(오름차순)
		Collections.reverse(list); // 정렬(내림차순)
		System.out.println(list);

		// 배열안에 데이터의 빈도수(횟수)구하는 방법(함수)
		int count3 = Collections.frequency(list, "hoho");
		System.out.println(count3);
	}

}