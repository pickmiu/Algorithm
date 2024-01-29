/**
 * @(#)BinarySearch.java, 2024/1/26.
 *     <p/>
 *     Copyright 2024 Netease, Inc. All rights reserved. NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license
 *     terms.
 */
package org.example;

/**
 * @author 唐李一 (tangliyi@corp.netease.com)
 */
public class BinarySearch {
    /**
     * 二分查找
     * 基于有序数组
     * @param nums
     * @param target
     * @return
     */
    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target < nums[mid]) {
                right = mid - 1;
            } else if (nums[mid] == target){
                return mid;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
