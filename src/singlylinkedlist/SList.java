/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlylinkedlist;

/**
 *
 * @author admin
 */
public class SList<E> {

    private SNode<E> head, tail;
    private int size;

    //Constructor to create list
    public SList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size <= 0;
    }

    public SNode first() {
        return head;
    }

    public SNode last() {
        return tail;
    }

    public void addFirst(SNode newNode) {
        newNode.setNext(head);
        head = newNode;
        if (isEmpty()) {
            tail = newNode;
            head.setNext(tail);
        }
        size++;
    }

    //Activity for June 18
    public void addLast(SNode newNode) {
        tail.setNext(newNode);
        tail = newNode;
        if (isEmpty()) {
            head = newNode;
            tail.setNext(head);
        }
        size++;
    }
    
    //Activity for June 18
    public SNode removeFirst(){
        SNode<E> tempNode = head;
        head = head.getNext();
        tempNode.setNext(head);
        size--;
        return tempNode;
    }

    public void showList() {

        SNode temp = head;
        
        System.out.print("[" + temp.getElement() + "]");
        temp = temp.getNext();
        System.out.print("[" + temp.getElement() + "]");
        temp = temp.getNext();
        System.out.print("[" + temp.getElement() + "]");
        temp = temp.getNext();
        System.out.print("[" + temp.getElement() + "]");
        temp = temp.getNext();
        System.out.print("[" + temp.getElement() + "]");
        temp = temp.getNext();

        
        
        
        
        
    }
}