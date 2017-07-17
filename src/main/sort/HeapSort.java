package main.sort;

import java.util.Arrays;

/**
 * @author mafh
 * @create 2017-07-17 12:41
 * Created With Intellij IDEA
 * 堆排序
 */
public class HeapSort {
    public static void heapSort(int[] arr){
        if(arr==null||arr.length<1){//判空
            return;
        }
        //从最底下往上循环遍历
        int half = arr.length/2-1;//获取最末尾的父节点的下标
        for(int i= half;i>=0;i--){
            getMaxHeap(arr,arr.length,i);
        }
        //以上代码的目的是为了得到最大的值放在第一个，并且所有的子树都遵循大根堆的标准
        System.out.println("第一次循环以后："+Arrays.toString(arr));
        //利用大根堆拿到最大值将其放在最末尾，然后再循环产生
        for(int i=arr.length-1;i>0;i--){
            int cache = arr[0];
            arr[0] = arr[i];
            arr[i] = cache;
            getMaxHeap(arr,i,0);
            System.out.println(i+"次："+Arrays.toString(arr));
        }
    }
    public static void getMaxHeap(int[] arr,int length,int index){
        int max = index;//最大值的下标初始默认为父节点
        int left = index*2+1;//获取左侧子节点的下标
        int right = index*2+2;//获取右侧子节点的下标
        if(left<length && arr[left]>arr[max]){//如果左侧子节点没有超过范围而且比当前最大值大，则替换最大值下标
            max = left;
        }
        if(right<length && arr[right]>arr[max]){//如果右侧子节点没有超过范围而且比当前最大值大，则替换最大值下标
            max = right;
        }
        if(max != index){
            //交换下标的值
            int cache = arr[max];
            arr[max] = arr[index];
            arr[index] = cache;
            //数据交换以后，下层数可能不满足大根堆，所以用一次递归
            getMaxHeap(arr,length,max);
        }
    }
    public static void main(String[] args) {
        int[] array = {49, 38, 65, 97, 26, 13, 27, 49, 55, 4,8};
        System.out.println("排序前："+Arrays.toString(array));
        heapSort(array);
        System.out.println("排序后："+Arrays.toString(array));
    }
}
