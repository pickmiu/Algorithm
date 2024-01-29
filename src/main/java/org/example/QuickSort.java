/**
 * @(#)QuickSort.java, 2024/1/25.
 *     <p/>
 *     Copyright 2024 Netease, Inc. All rights reserved. NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license
 *     terms.
 */
package org.example;

/**
 * @author 唐李一 (tangliyi@corp.netease.com)
 */
public class QuickSort {

    /**
     * 局部排序
     * @param a
     * @param left
     * @param right
     * @return
     */
    public static int partSort(int[] a, int left, int right) {
        int keyIndex = left;
        // 当两边没有相遇
        while (left < right) {
            while (left < right && a[right] >= a[keyIndex]) {
                right--;
            }
            while (left < right && a[left] <= a[keyIndex]) {
                left++;
            }
            swap(a, left, right);
        }
        // 交换key和相遇位置的元素
        swap(a, left, keyIndex);
        // 返回key的位置
        return left;
    }

    public static void quickSort(int[] a, int left, int right) {
        if (left >= right) {
            // 区间没有元素
            return;
        }
        int key = partSort(a, left, right);
        quickSort(a, left, key - 1);
        quickSort(a, key + 1, right);
    }

    public static void swap(int[] a, int p1, int p2) {
        int temp = a[p1];
        a[p1] = a[p2];
        a[p2] = temp;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 1, 2, 2};
        quickSort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
