/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package program.searchinsertposition;

import com.sun.source.doctree.DocTree;

/**
 *
 * @author Barbara Angelin
 */
public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        if (nums[0] > target){
                return 0;
            }
        else if (nums[nums.length-1]<target){
                return nums.length;
            }
        else 
        for (int x = 0; x <= nums.length; x++){
            if (nums[x] == target){
                return x;
            }
            if (nums[x] > target && nums[x-1] < target){
                return x;
            }
         }
        return 0;
    }

    public static void main(String[] args) {
        int nums[] = {1,3,5,6};
        System.out.println(searchInsert(nums, 5));
    }
}
