package com.learn;

import com.learn.array.GenericArray;

import java.util.Arrays;

public class Test   {
   public  static  void  main(String[] args){
//          int[] a = {1,5,8,9};
//          int[] b ={2,3,6,7,8};
//          int[] c =new GenericArray().mergeSortedArray(a,a.length,b,b.length);
//
//       for (int i =0; i<c.length;i++){
//           System.out.println(c[i]);
//       }
       int a[] = { 51, 46, 20, 18, 65, 97, 46,82, 30, 77, 50 };

      // quickSort(a, 0, a.length - 1);
      // System.out.println("排序结果：" + Arrays.toString(a));

       bucketSort(99,a);
   }




     /*排序*/
     public static void bucketSort(int range,int[] array){
         int[] buckets = new int[range];//空间换时间

             for(int i=0;i<array.length;i++){
                 buckets[array[i]]++;
             }


         for (int i = 0; i < buckets.length; i++)         {
             for(int j=1;j<=buckets[i];j++)  //值1开始，
                 System.out.println(i);
         }



      }




}
