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
public class SinglyLinkedList {
    
    String s;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SNode<String> node1 = new SNode<>("node1", null);
        SNode<String> node2 = new SNode<>("node2", null);
        SNode<String> node3 = new SNode<>("node3", null);
        SNode<String> node4 = new SNode<>("node4", null);
        SNode<String> node5 = new SNode<>("node5", null);
         
        SList<String> sList = new SList<>();
        
        sList.addFirst(node1);
        sList.addFirst(node2);
        sList.addFirst(node3);
        sList.addFirst(node4);
        sList.addLast(node5);

        System.out.println("Output()\n");
        sList.showList();
    }
}
