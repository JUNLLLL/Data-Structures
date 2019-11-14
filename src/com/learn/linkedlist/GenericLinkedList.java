package com.learn.linkedlist;

public class GenericLinkedList {

    //使用递归实现链表反转
    public  Node  reverseList(Node head){

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
    public  Node reverseLinkedList(Node head) {

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


    //合并两个有序链表
    public  ListNode mergeTwoLists(ListNode listNode1, ListNode listNode2) {
        ListNode head = new ListNode(0); //记录头部节点，最后返回
        ListNode temp = head;

        while ( listNode1 != null && listNode2 != null ){
            if (listNode1.data < listNode2.data){
                temp.next = listNode1;
                listNode1 = listNode1.next;//后移，用于继续比较选出接下来最小的节点
            }
            else{
                temp.next = listNode2;
                listNode2 = listNode2.next;
            }
            temp = temp.next;//后移，用于接收下一个节点信息
        }

        if (listNode1 != null) { temp.next = listNode1; }
        if (listNode2 != null) { temp.next = listNode2; }
        return head.next;
    }

    class ListNode {
        int data;//节点的属性，存储节点的值
        ListNode next;//节点的属性，存储了下一个节点的地址
        ListNode(int x) { data = x; }
      }



}
