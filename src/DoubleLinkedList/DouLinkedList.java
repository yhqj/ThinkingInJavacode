//package DoubleLinkedList;
//
//import java.util.LinkedList;
//
//class Node {
//    public Node node;
//
//    public Node getNode() {
//        return node;
//    }
//
//    public void setNode(Node node) {
//        this.node = node;
//    }
//
//    public Node getPre() {
//        return pre;
//    }
//
//    public void setPre(Node pre) {
//        this.pre = pre;
//    }
//
//    public Node getNext() {
//        return next;
//    }
//
//    public void setNext(Node next) {
//        this.next = next;
//    }
//
//    Node pre;
//    Node next;
//
//    public Node(Node node) {
//        this.node = node;
//    }
//
//    public Boolean hasNext(){
//        return node.next ==null;
//    }
//}
//
//public class DouLinkedList {
//    Node head;
//    int size;
//
//   public DouLinkedList(Node node){
//        head = node;
//    }
//
//    public boolean isEmpty() {
//        return size == 0;
//    }
//
//    public void add(Node node) {
//        if (isEmpty()) {
//            head = node;
//        }
//        node.next = head;
//        head.pre = node;
//        head = node;
//        size ++;
//    }
//    public int getSize(){
//       return size;
//    }
//
//    public Node indexOf(int index){
//       if (size<index){
//           return null;
//       }
//       for (int i=0;i<index;i++){
//            Node cur = head;
//            head = head.next;
//       }
//    }
//
//    LinkedList
//    /**insert a before b**/
//    public void addBefore(Node a,Node b){
//        if (isEmpty()){
//            return;
//        }
//           for (int i = 0;i<getSize();i++){
//               if (Node)
//           }
//        }
//    }
//}
