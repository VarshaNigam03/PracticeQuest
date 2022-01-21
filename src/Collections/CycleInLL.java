package Collections;

import org.w3c.dom.Node;

import java.util.LinkedList;

//detect and remove cycle in ll
public class CycleInLL {

    static Node detectCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (slow != null && fast != null && fast.getNextSibling() != null) {
            slow = slow.getNextSibling();
            fast = fast.getNextSibling().getNextSibling();
            if (slow == fast) {
                return slow;
            }
        }
                  return null;
    }

    static Node detectFirstNode(Node head){
        Node meet= detectCycle(head);
        Node start=head;
        while(start!=meet){
            start=start.getNextSibling();
            meet=meet.getNextSibling();
        }
        return start;
    }

    public static void main(String []args){
//        LinkedList list = new LinkedList();
//        list.head.next.next
//        list.head.next = new Node(20);
//        list.head.next.next = new Node(15);
//        list.head.next.next.next = new Node(4);
//        list.head.next.next.next.next = new Node(10);
//
//        // Creating a loop for testing
//        head.next.next.next.next.next = head.next.next;
//        detectCycle(head);
//        System.out.println("Linked List after removing loop : ");
//        Node node=head;
//        while (node != null) {
//            System.out.print(node.data + " ");
//            node = node.next;
//        }
//    }


    }




}
