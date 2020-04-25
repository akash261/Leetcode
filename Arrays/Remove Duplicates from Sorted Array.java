//Remove Duplicates from Sorted Array
//Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

//Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        
        int index= 1;
        for(int i=0;i<nums.size()-1 ;i++)
        {
             if(nums[i]!=nums[i+1])
             {
                 nums[index++]=nums[i+1];
                 
             }
        }

        return index;
        
    }
};