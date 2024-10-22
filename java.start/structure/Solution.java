package structure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Solution {
	// map 모든키를 돌면서 true 가 있는지 검사 true가있으면 true 리턴
	public static boolean containsDuplicate() {

		int[] nums = { 1, 2, 3, 4, 1 };


		Map<Integer, Boolean> map = new HashMap<>();




		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];

			if (map.get(num) != null) {
				map.put(num, true);
			} else {
				map.put(num, false);
			}
		}
		System.out.println("맵 상태: " + map.toString());

		Set<Integer> keySet = map.keySet();
		Iterator<Integer> iterator = keySet.iterator();

		while (iterator.hasNext()) {
			int key = iterator.next();
			if (map.get(key)) {
				return true;
			}
		}
			//System.out.println(keySet);
		return false;
	}


	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 1 };
		boolean result = Solution.containsDuplicate();
		System.out.println(result);
	}
}
// for문으로 돌린 값을 key 값으로 뽑아서 set으로 가져온다
// set으로 가져온것에서 set(중복된 값은 넣을수가없음) if문으로 !set.value 형식으로 true, false 찾아서 return
// String으로 하지말고 set(이터널 헤즈 넥스트)