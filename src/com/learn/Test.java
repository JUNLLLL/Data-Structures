package com.learn;


public class Test   {
   public  static  void  main(String[] args) {
//          int[] a = {1,5,8,9};
//          int[] b ={2,3,6,7,8};
//          int[] c =new GenericArray().mergeSortedArray(a,a.length,b,b.length);
//
//       for (int i =0; i<c.length;i++){
//           System.out.println(c[i]);
//       }
       int a[] = {51, 46, 20, 18, 65, 97, 46, 82, 30, 77, 50};


  }

    public Node find(Node node,int data) {
        Node p = node;
        while (p != null) {
            if (data < p.data) p = p.left;
            else if (data > p.data) p = p.right;
            else return p;
        }
        return null;
    }



        public  class Node {
            private int data;
            private Node left;
            private Node right;

            public Node(int data) {
                this.data = data;
            }
        }


}