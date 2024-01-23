package arrays_hashing;

import java.util.Arrays;
import java.util.HashSet;

/*
Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.
 */

public class ContainsDuplicate {

    // Sorts the array, then parses to check adjacent values for duplicates
    public static boolean containsDuplicate1(int[] nums){
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++){
            if (nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
    }

    // Utilises a hash set to keep track of seen numbers
    public static boolean containsDuplicate2(int[] nums){
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums){
            if (seen.contains(num))
                return true;
            seen.add(num);
        }
        return false;
    }



    public static void main(String[] args){

        int[] numbers = {1,2,3,3};
        boolean containsDuplicate = containsDuplicate2(numbers);

        System.out.println(containsDuplicate);
    }

}

