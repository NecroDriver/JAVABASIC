package main.sort;

import java.util.Arrays;

/**
 * @author mafh
 * @create 2017-07-17 15:06
 * Created With Intellij IDEA
 * 冒泡交换排序
 */
public class BubbleSwapSort {
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int cache = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = cache;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {49, 38, 65, 97, 26, 13, 27, 49, 55, 4,8};
        System.out.println("排序前："+ Arrays.toString(array));
        bubbleSort(array);
        System.out.println("排序后："+Arrays.toString(array));
    }
}
