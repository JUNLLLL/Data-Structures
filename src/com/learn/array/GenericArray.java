package com.learn.array;

import java.util.HashMap;

public  class GenericArray {

   //数组扩容
    public  int[] addLengthArray(int[] array){
        int[] newArray = new int [array.length*2];
        //将array数组从0位置至array.length位置，复制到newArray数组0位置到array.length位置。
        System.arraycopy(array,0,newArray,0,array.length);

//        //或者使用循环进行赋值
//         for (int i = 0; i < array.length; i++)
//                   newArray[i] = array[i];

        return newArray;
    }

    //两数之和
    public  int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int i = 0; i  < nums.length; i++){

            int key = target - nums[i];

            if (hashMap.containsKey(key)){

                return new int[]{hashMap.get(key), i};

            }

            hashMap.put(nums[i],i);

        }

        throw new IllegalArgumentException("No two sum solution");

    }

    //合并两个有序数组,返回一个新的数组
     public  int[] mergeSortedArray(int[] nums1, int m, int[] nums2, int n){
         int [] result = new int[m+n];
         int i =0,j=0,k=0;

         //比较num1数组与nums2数组，哪个小，就存入result中
         while(i < m && j < n) {
                 if(nums1[i] < nums2[j]){
                     result[k++] = nums1[i++];
                 }else{
                       result[k++] = nums2[j++];
                 }
         }
        // 判断两个数组，可能有一个没遍历完，那么把这个没遍历完的继续添加到result数组后面
         while (i < m) {
             result[k++] = nums1[i++];
         }

         while (j < n) {
             result[k++] = nums2[j++];
         }


        return result;

    }




}
