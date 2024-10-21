package structure;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	// map 모든키를 돌면서 true 가 있는지 검사 true가있으면 true 리턴
	public static boolean containsDuplicate(int[] nums) {
		Map<Integer, Boolean> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.get(nums[i]) != null) {
				map.put(nums[i], true);
			} else {
				map.put(nums[i], false);
			}
		}

		System.out.println("맵 상태: " + map.toString());
		return false;
	}
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 1 };
		boolean result = Solution.containsDuplicate(nums);
		System.out.println(result);
	}
}
// for문으로 돌린 값을 key 값으로 뽑아서 set으로 가져온다
// set으로 가져온것에서 set(중복된 값은 넣을수가없음) if문으로 !set.value 형식으로 true, false 찾아서 return
// String으로 하지말고 set(이터널 헤즈 넥스트)