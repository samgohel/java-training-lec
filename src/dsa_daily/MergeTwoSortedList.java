package dsa_daily;

public class MergeTwoSortedList {

    public static void main(String[] args) {
        NodeUtils list1 = new NodeUtils();
        NodeUtils list2 = new NodeUtils();


        list1.add(new Node(1));
        list1.add(new Node(3));
        list1.add(new Node(5));

        list2.add(new Node(2));
        list2.add(new Node(4));
        list2.add(new Node(6));


        list1.head = mergeUsingRecursion(list1.head, list2.head);
        list1.print();
    }

    public static Node mergeUsingRecursion(Node head1, Node head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;

        if (head1.value < head2.value) {
            head1.next = mergeUsingRecursion(head1.next, head2);
            return head1;
        } else {
            head2.next = mergeUsingRecursion(head1, head2.next);
            return head2;
        }
    }


}

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        next = null;
    }
}

class NodeUtils {
    Node head;

    public void add(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}