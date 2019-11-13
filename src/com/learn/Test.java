package com.learn;

import com.learn.linkedlist.MyLinkedList;

import java.util.LinkedList;

public class Test {
   public  static  void  main(String[] args){
       MyLinkedList<Integer> linkedList = new MyLinkedList<>();
       linkedList.add(2222);
       linkedList.add(3333);
       linkedList.add(44444);
       linkedList.add(55555);

    //   System.out.println(linkedList.remove(2));
          linkedList.set(0,9999);

       for (int i=0;i<linkedList.size();i++)
           System.out.println(linkedList.get(i));

   }
}
