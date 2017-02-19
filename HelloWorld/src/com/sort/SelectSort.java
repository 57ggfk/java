package com.sort;

import java.util.Arrays;

/**
 * Created by wangji on 2017/2/19.
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {1,5,3,7,2,9,6,4,0};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectSort(int[] arr) {
        int temp;
        for (int i=0;i<arr.length-1;i++) {  //外循环减1
            for (int j=i+1;j<arr.length;j++) { //内循环不减1
                if (arr[i]>arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
