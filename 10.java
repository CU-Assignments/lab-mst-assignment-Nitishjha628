class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low =0;
        int high = nums.length-1;
        int mid = -1;
        while(low <= high){
          mid = (low + high)/2;
            if(nums[mid] == target){
                break;
            }
            else if(target > nums[mid]){
                low = mid+1;
            }
            else{
                high = mid - 1;
            }
        }
        if(low>high){
            return new int[]{-1,-1};
        }
        else{
            int i = mid;
            while(i>=0){
                if(nums[i] != target){
                    break;
                }
                i--;
            }
            int j = mid;
            while(j <= nums.length-1){
                if(nums[j] != target){
                    break;
                }
                j++;
            }
            return new int[]{i+1 , j-1};
        
    }
}
}