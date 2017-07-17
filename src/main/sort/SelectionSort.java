package main.sort;

import java.util.Arrays;

/**
 * @author mafh
 * @create 2017-07-17 10:58
 * Created With Intellij IDEA
 * 二元选择排序
 */
public class SelectionSort {
    public static void selectSort(int[] arr){
        for(int i=0;i<arr.length/2;i++){
            int minKey = i;
            int maxKey = i;
            for(int j=i+1;j<arr.length-i;j++){
                if(arr[j]<arr[minKey]){
                    minKey = j;
                }
                if(arr[j]>arr[maxKey]){
                    maxKey = j;
                }
            }
            int cache = arr[minKey];
            arr[minKey] = arr[i];
            arr[i] = cache;
            cache = arr[maxKey];
            arr[maxKey] = arr[arr.length-1-i];
            arr[arr.length-1-i] = cache;
        }
    }
    public static void main(String[] args) {
        int[] arr = {49, 38, 65, 97, 26, 13, 27, 49, 55, 4,8};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
