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
    }


    /**
     * 获取数据
     * @param index 索引
     * @return 数据t
     */
    public T get(int index){
        if (index < 0 || index >= size)
            return  null;

        return getNode(index).getData();
    }


    /**
     * 删除指定的节点T,并返回T
     * @param index 为索引号
     * @return 返回删除的元素data
     */
    public T remove(int index) {
        if (index < 0 || index >= size)
            return  null;
        if (index == 0) {// 当索引为0时，把第一个节点的下一个节点赋值给头节点
            Node<T> node = head.getNext();
            head.setNext(node.getNext());
            size--;
            return node.getData();
        }
        // 获取要删除节点的前一个节点
        Node<T> previousNode = getNode(index-1);
        // 获取要删除的节点
        Node<T> currNode = previousNode.getNext();
        // 获取要删除节点的后一个节点
        Node<T> nextNode = currNode.getNext();
        // 先建立删除节点的前一个节点和删除节点的后一个节点的关系
        previousNode.setNext(nextNode);
        // 清除当前Node的下一个节点
        currNode.setNext(null);
        size--;// 计数器减1
        return currNode.getData();// 返回删除节点中的数据域
    }




    //插入位置
    public T set(int index, T t){

        if (index < 0 || index >= size)
            return  null;

        Node<T> insertNode= new Node<>(t);// 以t实例化一个节点

        if (index == 0) {// 当索引为0时，把第一个节点的下一个节点赋值给头节点
            Node<T> node = head.getNext();
            head.setNext(insertNode);
            insertNode.setNext(node);
            size++;
            return insertNode.getData();
        }

        // 获取要插入节点的前一个节点
        Node<T> previousNode = getNode(index-1);

        // 获取要当前节点
        Node<T> currNode = previousNode.getNext();

        // 建立和前一个节点的联系，
        previousNode.setNext(insertNode);

        // 插建立和下一个节点的联系
        insertNode.setNext(currNode);
        size++;
        return insertNode.getData();// 返回删除节点中的数据域

    }


    //根据获取节点信息
    public Node<T> getNode(int index){
        Node<T> temp = head;
        //因为索引从0开始，每一次循环就是获取到第几个节点
        for (int i=0;i<=index;i++){
            temp = temp.getNext();
        }
        return temp;
    }



}
