package 컬렉션2;

import java.util.HashMap;

public class 우승자투표찾기_map2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] all = { "홍길동", "김길동", "정길동", "홍길동", "김길동", "홍길동" };
		String[] find = {"홍길동", "김길동", "정길동"};
		
		HashMap<String, Integer> map = new HashMap<>();
		// key타입 value타입
		
		for (String x : all) {
			map.put(x, map.getOrDefault(x, 0) + 1);
			// map.get(key)가 이미 저장되어 있는 경우 값을 꺼내서 사용
		}
		System.out.println(map);
		
		int max = 0;
		for (String key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
			if (map.get(key) > max) {
				max = map.get(key);
				System.out.println("현재까지 우승자: " + key);
			}
		}
	}

}
