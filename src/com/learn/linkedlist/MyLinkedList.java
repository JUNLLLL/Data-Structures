package com.learn.linkedlist;

public class MyLinkedList<T> {
    // 声明头节点
    private Node<T> head;
    //声明 尾节点
    private Node<T> last;
    // 链表的大小
    private int size;

    public MyLinkedList() {
        head = new Node<T>();// 实例化头节点
        last = head;//头节点首先赋值给尾节点
    }

    /**
     * 获取单链表中存储的元素总数
     *
     * @return 返回size属性
     */
    public int size() {
        return size;
    }

    /**
     * 增加
     * @param t 要添加的元素
     */
    public void add(T t) {
       Node<T> node= new Node<>(t);// 以t实例化一个节点
       last.setNext(node);//往尾节点后加节点
       last = node;//该节点设为最后一个节点
       size++;

        System.out.println("head"+head.getData());
        System.out.println("last"+last.getData());
        System.out.println("----------------");
    }


    /**
     * 删除指定的节点T,并返回T
     * @param index 为索引号
     * @return 返回删除的元素data
     */
    public T remove(int index) {
        if (index < 0 || index >= size)
            return  null;
//        if (index == 0) {// 当索引为0时，令头节点的下一个节点为头节点
//            Node<T> node = head.getNext();
//            head.setNext(node.getNext());
//            size--;
//            return node.getData();
//        }
        // 获取要删除节点的前一个节点
        Node<T> bNode =null;// Select(index);
        // 获取要删除的节点
        Node<T> Node = bNode.getNext();
        // 获取要删除节点的后一个节点
        Node<T> nNode = Node.getNext();

        // 先建立删除节点的前一个节点和删除节点的后一个节点的关系
        bNode.setNext(nNode);
        // 清除dNode的下一个节点
        Node.setNext(null);
        size--;// 计数器减1
        return Node.getData();// 返回删除节点中的数据域
    }


    private T find(int index){
        T data = null;
        if (index == 0) //删除头结点
        {
            data = head.getData();
            head = head.getNext();
        }
        else
        {
            Node<T> temp = head;
            for (int i = 1; i <= index - 1; i++) {
                //让temp向后移动一个位置
                temp = temp.getNext();
            }
            Node<T> preNode = temp;
            Node<T> currentNode = temp.getNext();
            data = currentNode.getData();
            Node<T> nextNode = temp.getNext().getNext();
            preNode.setNext(nextNode);
        }
        return data;
    }


}
