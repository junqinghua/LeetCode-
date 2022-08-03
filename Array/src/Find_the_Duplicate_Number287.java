public class Find_the_Duplicate_Number287 {
    public int findDuplicate(int[] nums) {
        //很简单 但空间和时间都是O(n) 还需要优化
        Set<Integer> res = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(res.contains(nums[i])){
                return nums[i];
            }
            res.add(nums[i]);
        }
        return 0;
    }
}
