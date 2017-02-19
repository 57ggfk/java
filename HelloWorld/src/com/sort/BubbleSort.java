package com.sort;

import java.util.Arrays;

/**
 * Created by wangji on 2017/2/19.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,5,3,7,2,9,6,4,0};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSort(int[] arr) {
        boolean flag;
        int temp;
        for (int i=0;i<arr.length-1;i++) {
            flag = true;
            for (int j=0;j<arr.length-1-i;j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;

                }

            }
            if (flag) {
                break; //小循环没发生交换，说明已经排好
            }
        }

    }
}
