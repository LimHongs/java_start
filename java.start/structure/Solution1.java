package structure;

import java.util.HashMap;

public class Solution1 {

    public static boolean containsDuplicate1(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i< nums.length; i++){
                if(map.containsKey(nums[i])){
                    return true;
                }
                map.put(nums[i],1);
            }
            return false;
           }

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,2};
		boolean result = Solution1.containsDuplicate1(nums);
		System.out.println(result);


	}

}
