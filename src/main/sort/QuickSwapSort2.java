package main.sort;

import java.util.Arrays;

/**
 * @author mafh
 * @create 2017-07-24 09:52
 * Created With Intellij IDEA
 * 快速排序，实现方式换一下
 */
public class QuickSwapSort2 {
    public static void main(String[] args) {
        int arr[] = {7,4,9,12,6,4,9,6,2,14,21,4};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr,int start,int end){
        //start用于最后递归时传入参数
        int left = start;
        int right = end;
        if(arr == null||arr.length < 1){
            return;
        }
        //递归开关
        if(right<left){
            return;
        }
        int key = arr[left];
        while(right>left){
            //右边比基准值大，不动，下标前移
            while(right>left && arr[right]>=key){
                right--;
            }
            //右边比基准值小，赋值
            arr[left] = arr[right];
            //左边比基准值小，不动，后移一位
            while(left<right && arr[left] <= key){
                left++;
            }
            arr[right] = arr[left];
        }
        //给左还是给右都是一样的，因为不满足条件的话，应该是right = left
        arr[left] = key;
        //向左递归
        sort(arr,start,left-1);
        //向右递归
        sort(arr,left+1,end);
    }
}
