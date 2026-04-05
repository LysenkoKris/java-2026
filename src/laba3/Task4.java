package laba3;

public class Task4 {
    public static void main(String[] args) {
        Node head = new Node(0, null);
        Node node1 = new Node(1, null);
        Node node2 = new Node(2, null);
        Node node3 = new Node(3, null);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;

        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}