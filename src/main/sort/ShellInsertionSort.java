package main.sort;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author mafh
 * @create 2017-07-17 09:08
 * Created With Intellij IDEA
 * 希尔排序
 */
public class ShellInsertionSort {
    public static void shellSort(int[] arr){
        int num = arr.length/2;
        while(num>0){
            for(int i=0;i<num;i++){//这是次数
                while(i+num<arr.length){
                    if(arr[i+num] < arr[i]){
                        int cache = arr[i+num];
                        int j = i;
                        while(j>=0 && cache < arr[j]){
                            arr[j+num] = arr[j];
                            j -= num;
                        }
                        arr[j+num] = cache;
                    }
                    i += num;
                }
            }
            num = num/2;
        }
    }

    public static void main(String[] args) {
        int[] arr = {49, 38, 65, 97, 26, 13, 27, 49, 55, 4,8};
        shellSort(arr);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
