package com.two.sum.problem;

/*
 *  Problem Statement: Given an array of integers, return the indices of two humbers that add up to a given target
 *
 * test cases:
 * 1. [1,3,7,9,2] t=11 , ans= [3,4]
 * 2. [1,3,7,9,2] t=25, ans= null
 * 3. [] t=10, ans=null
 * 4. [1] t=11, ans= null
 * 5. [5] t=5, ans = null
 * 6. [1,6] t=7, ans = [0,1]
 */

import java.util.HashMap;

class TwoSumArrayProblem {
    public static void main(String args[]) {
        int[] result = findTwoSum((new int[]{1, 3, 4, 9, 2}), 11);
        if(result != null) {
            System.out.println("Result: " + result[0] + " " + result[1]);
        } else {
            System.out.println(result);
        }
    }

    //private static int[] findTwoSum(int nums[], int target) {
    //  for (int p1=0; p1< nums.length()-1; p1 ++) {
    //    int numToFind = target - nums[p1];
    //    for (int p2 = p1 +1; nums.length(); p2++) {
    //      if (numToFind == nums[p2]) {
    //        return new int[p1, p2];
    //      }
    //    }
    //    return null;
    //  }

    private static int[] findTwoSum(int nums[], int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int p1=0; p1<nums.length; p1++) {
            int numsToFind = target - nums[p1];
            if(hashMap.get(numsToFind) != null) {
                return new int[] {hashMap.get(numsToFind), p1};
            }
            hashMap.put(nums[p1], p1);

        }

        return null;
    }


}
