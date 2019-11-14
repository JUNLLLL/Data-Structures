package com.learn;

import com.learn.linkedlist.MyLinkedList;

import java.util.LinkedList;

import static com.learn.array.GenericArray.addLengthArray;
import static com.learn.array.GenericArray.mergeSortedArray;

public class Test {
   public  static  void  main(String[] args){
     int[]  nums1 = {1,2,3,5};
     int[]  nums2 = {2,5,6};

     int[] num3 = mergeSortedArray(nums1,nums1.length,nums2,nums2.length);



       for(int i = 0;i<num3.length;i++){
           System.out.println(num3[i]);
       }


   }
}
