package 컬렉션2;

import java.util.HashMap;

public class 완주하지못한선수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] participant = { "leo", "kiki", "eden" };
		String[] completion = { "eden", "kiki" };

		HashMap<String, Integer> map = new HashMap<>();
		for (String player : participant) {
			map.put(player, map.getOrDefault(player, 0));
		}
		// leo : 0 , kiki : 0, eden : 0
		
		for (String key : completion) {
			map.put(key, map.get(key)+ 1);
		}
		
		System.out.println(map);
		String answer = "";
		for (String key : map.keySet()) {
			if (map.get(key) == 0) {
				answer += key;
			}
		}
		System.out.println(answer);
	}

}
