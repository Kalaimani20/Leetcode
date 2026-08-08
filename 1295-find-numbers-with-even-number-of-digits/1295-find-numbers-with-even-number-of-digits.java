class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
        int digits=String.valueOf(num).length();
        if(digits%2==0){
            count++;
        }
        }
        return count;
    }
}