package com.xuzekun.algorithms.day01;

/**
 * 二分查找
 */
public class BinarySearch {

    /**
     * 二分查找实现
     *
     * @param key  需要查找的键
     * @param nums 数组
     * @return -1代表不存在，返回key缩在位置
     */
    public static int rank(int key, int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key < nums[mid]) {
                high = mid - 1;
            } else if (key > nums[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int rankRecursion(int key, int[] nums, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (key < nums[mid]) {
            return rankRecursion(key, nums, low, mid - 1);
        } else if (key > nums[mid]) {
            return rankRecursion(key, nums, mid + 1, high);
        } else {
            return mid;
        }
    }

    public static int rankRecursion(int key, int[] nums) {
        return rankRecursion(key, nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(rank(1, ints));
        System.out.println(rank(3, ints));
        System.out.println(rank(10, ints));
        System.out.println(rankRecursion(1, ints));
        System.out.println(rankRecursion(3, ints));
        System.out.println(rankRecursion(10, ints));
    }
}
