package com.demo.datastruct.array;

/**
 * @author happy
 * @create 2020-06-04 07:18
 * 如何在未排序的整数数组中找到最大和最小的数字？
 */
public class FoundMaxMinInArray {
    public static void main(String[] args) {
        int[] arr = {2,32,443,54,65,76,878,998,223,-1,444,333,332};

        int max = arr[0];
        int min = arr[0];
        for (int a = 0; a<arr.length;a++){
            if (arr[a]>max){
                max=arr[a];
            }
            if (arr[a]<min){
                min=arr[a];
            }
        }

        System.out.println("max="+max+"---min="+min);
    }
}
