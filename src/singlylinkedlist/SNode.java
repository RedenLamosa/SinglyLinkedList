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
public class SNode<E> {
    private E element;
    private SNode next;
    
    //constructor of SNode
    public SNode(E element, SNode next){
        this.element = element;
        this.next = next;
    }

    /**
     * @return the element
     */
    public E getElement() {
        return element;
    }

    /**
     * @param element the element to set
     */
    public void setElement(E element) {
        this.element = element;
    }

    /**
     * @return the next
     */
    public SNode getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(SNode next) {
        this.next = next;
    }
    
    
}
