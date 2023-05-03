class Problem1_Two_Sum{

    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j] == target){
                return new int[] {i,j};
            }
            }
        }
        return new int[] {};
    }
    public static void main(String[] args)
    {
          new Problem1_Two_Sum();
    }
}