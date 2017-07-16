package main.sort;

/**
 * @author mafh
 * @create 2017-07-14 16:28
 * Created With Intellij IDEA
 * 直接插入排序
 */
public class StraightInsertionSort {
    public static int[] insertSort(int[] arr){
        for(int i=1;i<arr.length;i++){//从第二个数开始和前一个数比较
            if(arr[i]<arr[i-1]){//如果后一个数小于前一个数，那么后一个数需要往前插入
                int cache = arr[i];//哨兵缓存当前数据
                int j = i-1;
                while(cache<arr[j]){//第一个和for循环第一次值一致，所以一定可以运行
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1]=cache;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {49,38,65,97,76,13,27,49};
        System.out.println(insertSort(arr));
    }
}
