package com.learn.linkedlist;

public class GenericLinkedList {

    class Node {
        int data;//节点的属性，存储节点的值
        Node next;//节点的属性，存储了下一个节点的地址
        Node(int x) { data = x; }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }



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
    public  Node mergeTwoLists(Node listNode1, Node listNode2) {
        Node head = new Node(0); //记录头部节点，最后返回
        Node temp = head;

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


    // 删除倒数第K个结点
    //定义两个节点pFast和pSlow，都指向头结点，pFast先后移k-1位，使pFast指向第k个结点，此时pSlow就是相对pFast的倒数第k个结点。
    // 然后同时后移，当pFast走到表尾时，pSlow正好指向倒数第k个结点。然后将pSlow指向的结点删除
    public  Node deleteLastKth(Node list, int k) {
        Node fast = list;
        Node slow = list;
        int i = 1;
        while (fast != null && i < k) {
            fast = fast.next;
            ++i;
        }

        if (fast == null) return list;//没有k个节点

        Node prev = null;//记录倒数k节点前一个的的位置,方便删除倒数k节点
        //两者一起先后移动，直到到达最后一个节点
        while (fast.next != null) {
            fast = fast.next;
            prev = slow;
            slow = slow.next;
        }

        if (prev == null) {//说明刚刚好头节点是倒数K
            list = list.next;
        } else {
            prev.next = prev.next.next;
        }
        return list;
    }


   // 求中间结点
    //将快慢指针先指向头结点，快指针移动2个步长，慢指针移动1个步长，当快指针指向链表末尾的时候，慢指针刚好就在中间节点上
    public static Node findMiddleNode(Node list) {
        if (list == null) return null;

        Node fast = list;
        Node slow = list;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }


}
