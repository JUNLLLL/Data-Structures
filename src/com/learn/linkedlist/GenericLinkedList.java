package com.learn.linkedlist;

public class GenericLinkedList {


    //使用递归实现链表反转
    public static Node  reverseList(Node head){

        // head看作是前一结点，head.getNext()是当前结点，reHead是反转后新链表的头结点
        if (head == null || head.getNext() == null) {
            return head;// 若为空链或者当前结点在尾结点，则直接还回
        }
        Node reHead = reverseList(head.getNext());// 找到了最后一个, 当前head为n-1  reHead为n
        head.getNext().setNext(head);// 将当前结点的指针域指向前一结点
        head.setNext(null);// 前一结点的指针域令为null;
        return reHead;// 反转后新链表的头结点
    }

   //遍历反转链表
    public static Node reverseLinkedList(Node head) {

        if (head == null) {
            return head;
        }

        Node pre = head;// 上一结点
        Node cur  = head.getNext();//当前节点
        Node temp; // 临时结点，用于保存当前结点的指针域（即下一结点）
        while(cur != null){ // 当前结点为null，说明位于尾结点
            temp = cur.getNext();
            cur.setNext(pre);// 反转指针域的指向，当前节点指向前一个

            // 指针往下移动
            pre = cur;  //当前节点使用完毕，沦为上一个节点
            cur = temp;  //当前节点获取下一个节点信息继续使用
        }
        // 最后将原链表的头节点的指针域置为null，还回新链表的头结点，即原链表的尾结点
        head.setNext(null);
        return pre;
    }


}
