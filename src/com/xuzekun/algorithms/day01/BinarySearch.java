package com.xuzekun.algorithms.day01;

/**
 * 二分查找
 */
public class BinarySearch {

    /**
     *
     *
     * @param key  需要查找的键
     * @param sums 数组
     * @return -1代表不存在，返回key缩在位置
     */
    public static int rank(int key, int[] sums) {
        int low = 0;
        int high = sums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key < sums[mid]) {
                high = mid - 1;
            } else if (key > sums[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
