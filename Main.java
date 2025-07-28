import java.util.*;

public class Main{
    public static void main(String[] args){
        int[] nums = {2, 4, 1, 1, 6, 5};
        Solution sol = new Solution();
        int result = sol.countHillValley(nums);
        System.out.println("Number of Hill and Valley : "+result);
    }
}
class Solution {
    public int countHillValley(int[] nums) {
        int count = 0;
        for(int i =1; i< nums.length - 1; i++){

             if (nums[i] == nums[i - 1]) continue;

            int left = i-1;
            int right  = i + 1;

            while(left >= 0 && nums[left] == nums[i]){
                left--;
            }
            while(right < nums.length && nums[right] == nums[i]){
                right++;
            }
            if(left >= 0 && right < nums.length){
                if(nums[i] > nums[left] && nums[i] > nums[right]){
                    count++;
                }
                else if(nums[i] < nums[left] && nums[i] < nums[right]){
                    count++;
                }
            }
            
            
        
    }
    return count;
}


}