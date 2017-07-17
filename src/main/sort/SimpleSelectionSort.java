package main.sort;

import java.util.Arrays;

/**
 * @author mafh
 * @create 2017-07-17 10:32
 * Created With Intellij IDEA
 * 简单选择排序
 */
public class SimpleSelectionSort {
    public static void simpleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int minKey = getMinKey(arr,i,arr.length);
            int cache = arr[minKey];
            arr[minKey] = arr[i];
            arr[i] = cache;
        }
    }
    public static int getMinKey(int[] arr,int start,int end){
        int minKey = start;
        for(int i=start+1;i<end;i++){
            if(arr[i]<arr[minKey]){
                minKey = i;
            }
        }
        return minKey;
    }

    public static void main(String[] args) {
        int[] arr = {49, 38, 65, 97, 26, 13, 27, 49, 55, 4,8};
        simpleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
