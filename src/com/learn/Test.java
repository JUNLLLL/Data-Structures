package com.learn;

public class Test   {
   public  static  void  main(String[] args){
//       ListNode a = new Node(1);
//       ListNode b = new Node(2);
//       ListNode c = new Node(3);
//       ListNode d = new Node(4);
//       ListNode e = new Node(5);
//       a.setNext(b);
//       b.setNext(c);
//       c.setNext(d);
//       d.setNext(e);
//       System.out.println(a);/*data=1-->data=2-->data=3-->data=4-->data=5-->null*/


   }

   private void sort(int[] arr){

      for (int i = 1; i<arr.length; i++){
         int curValue = arr[i];
         int j = i-1;
         // 查找插入的位置
         for (;j>=0;j--){
              if (curValue < arr[j]){
                   arr[j+1] = arr[j];// 数据移动
              }else {
                 break;
              }
         }
         arr[j+1] = curValue; // 插入数据
      }

   }
}
