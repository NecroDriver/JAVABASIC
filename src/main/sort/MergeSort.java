package main.sort;

import java.util.Arrays;

/**
 * @author mafh
 * @create 2017-07-19 15:07
 * Created With Intellij IDEA
 * 合并排序
 */
public class MergeSort {
    public static void mergeSort(int[] arr,int start,int end){
        if(start<end){
            int middle = (start+end)/2;
            //通过递归划分最小分组，2个一个分组
            mergeSort(arr,start,middle);
            mergeSort(arr,middle+1,end);
            //合并
            merge(arr,start,middle,end);
        }
    }
    public static void merge(int[] arr,int start,int middle,int end){
        int[] cache = new int[arr.length];//缓存数组
        int mid = middle+1;
        int third = start;//third记录中间数组的索引
        int temp = start;
        while (start<=middle&&mid<=end){//极限情况，两个数，start=0,end=1,middle=0,mid=1
            //取出左右两数组中的最小值比较
            if(arr[start]<=arr[mid]){
                cache[third++] = arr[start++];
            }else{
                cache[third++] = arr[mid++];
            }
        }//这部分完成后，缓存数组中存放的是当前最小的一组值
        //剩余部分依次放入中间数组
        while(mid<=end){
            cache[third++] = arr[mid++];
        }
        while (start<=middle){
            cache[third++] = arr[start++];
        }
        //将缓存数组的内容复制到原数组
        while(temp<=end){
            arr[temp] = cache[temp++];
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
//        int arr[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
        int arr[] = {49,38,65,97,76};
        mergeSort(arr,0,arr.length-1);
        System.out.println("result:"+Arrays.toString(arr));
    }
}
