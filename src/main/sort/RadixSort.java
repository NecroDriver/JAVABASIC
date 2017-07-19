package main.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author mafh
 * @create 2017-07-19 16:34
 * Created With Intellij IDEA
 * 基数排序
 */
public class RadixSort {
    public static void sort(int[] arr){
        //1.首先确定排序的趟数
        int maxValue = arr[0];
        //2.获取最大值
        for(int i=0;i<arr.length;i++){
            if(maxValue<arr[i]){
                maxValue = arr[i];
            }
        }
        //3.获取最大值的位数
        int time = 0;
        while(maxValue>0){
            maxValue /= 10;
            time++;
        }
        //4.建立10个队列，用于存放0-9十个数
        List<List> queue = new ArrayList<>();
        for(int i=0;i<10;i++){
            queue.add(new ArrayList());
        }
        //5.进行time次分配和收集;
        for(int i=0;i<time;i++){
            //分配数组元素
            for(int j=0;j<arr.length;j++){
                //得到数字的第time+1位数;
                int x = arr[j]%(int)Math.pow(10,i+1)/(int)Math.pow(10,i);
                List xList = queue.get(x);
                xList.add(arr[j]);//将值存放进去
                queue.set(x,xList);
            }
            int count = 0;//元素计数器
            //6.收集队列元素;
            for(int q=0;q<10;q++){
                while (queue.get(q).size()>0){
                    List<Integer> qList = queue.get(q);
                    arr[count++] = qList.get(0);
                    qList.remove(0);
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,100,1};
        sort(arr);
        System.out.println("result:"+Arrays.toString(arr));
    }
}
