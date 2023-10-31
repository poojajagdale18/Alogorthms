package com.array.area;


**
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 *
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 *
 * Return the maximum amount of water a container can store.
 *
 * Notice that you may not slant the container.
 */
  ////[2,5,6,7,9] = 15
  //[] = 0
  //[1] = 0
  //[1,1] = 1
public class MostWaterContainer {

    private static int findMaxArea(int[] heights) {
        int maxArea = 0;
        int p1= 0;
        int p2 = heights.length-1;
        while(p1 <= p2) {
          int height = Math.min(heights[p1], heights[p2]);
          int width = p2-p1;
          int area = height * width;
          if(maxArea < area) {
              maxArea = area;
          }

          if(heights[p1] < heights[p2]) {
              p1 ++;
          } else {
              p2--;
          }
        }
        return maxArea;
    }

    public static void main(String[] args) {
              System.out.println(findMaxArea(new int[] {2,3,4,5,18,17,6}));
    }
}
