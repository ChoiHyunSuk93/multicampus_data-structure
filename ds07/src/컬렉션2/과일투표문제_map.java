package 컬렉션2;

import java.util.HashMap;

public class 과일투표문제_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"apple", "banana", "apple", "banana", "melon", "apple"};
		HashMap<String, Integer> map = new HashMap<>();
		for (String key : s) {
			map.put(key, map.getOrDefault(key, 0) + 1);
		}
		System.out.println(map);
		
		int max = 0;
		String maxKey = "";
		for (String key : map.keySet()) {
			if (map.get(key) > max) {
				max = map.get(key);
				maxKey = key;
			}
		}
		System.out.println(maxKey + "의 득표수는 " + max);
		System.out.println(map.keySet());
	}

}
