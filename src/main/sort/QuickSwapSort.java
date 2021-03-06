package main.sort;

import java.util.Arrays;

/**
 * @author mafh
 * @create 2017-07-17 15:21
 * Created With Intellij IDEA
 * 快速交换排序
 */
public class QuickSwapSort {
    public static void quickSort(int[] arr){
        if(arr == null || arr.length <1){
            return;
        }
        group(arr,0,arr.length-1);
    }
    public static void group(int[] arr,int start,int end){
        int left = start;
        int right = end;
        //递归开关
        if(right<=left){
            return;
        }
        int key = arr[left];
        boolean flag = true;
        while(right>left){
            if(flag){
                if(arr[right]<key){//右侧小，赋值
                    arr[left] = arr[right];
                    flag = false;
                }else{
                    right--;
                }
            }else{
                if(arr[left]>key){//左侧大，赋值
                    arr[right] = arr[left];
                    flag = true;
                }else{
                    left++;
                }
            }
        }
        //中间值
        arr[left] = key;//这一步是必须的，因为数组是全局操作，不给赋值，该数组中间值会有问题。
        group(arr,start,left-1);
        group(arr,left+1,end);
    }
    public static void main(String[] args) {
        int[] array = {49, 38, 65, 97, 26, 13, 27, 49, 55};
        System.out.println("排序前："+ Arrays.toString(array));
        quickSort(array);
        System.out.println("排序后："+Arrays.toString(array));
    }
}
