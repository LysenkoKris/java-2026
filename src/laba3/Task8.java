package laba3;

public class Task8 {
    static class Node {
        int value;
        Node next;

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    static class SingleLinkedList {
        Node head;

        public void createHead(int[] values) {
            head = null;
            for (int value : values) {
                head = new Node(value, head);
            }
        }

        public void createTail(int[] values) {
            head = null;
            Node tail = null;
            for (int value : values) {
                Node newNode = new Node(value, null);
                if (head == null) {
                    head = newNode;
                } else {
                    tail.next = newNode;
                }
                tail = newNode;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node ref = head;
            while (ref != null) {
                sb.append(ref.value).append(" ");
                ref = ref.next;
            }
            return sb.toString();
        }

        public void addFirst(int value) {
            head = new Node(value, head);
        }

        public void addLast(int value) {
            Node newNode = new Node(value, null);
            if (head == null) {
                head = newNode;
                return;
            }
            Node ref = head;
            while (ref.next != null) {
                ref = ref.next;
            }
            ref.next = newNode;
        }

        public void insert(int index, int value) {
            if (index == 0) {
                addFirst(value);
                return;
            }

            Node prev = head;
            int i = 0;
            while (prev != null && i < index - 1) {
                prev = prev.next;
                i++;
            }

            if (prev != null) {
                prev.next = new Node(value, prev.next);
            }
        }

        public void removeFirst() {
            if (head != null) {
                head = head.next;
            }
        }

        public void removeLast() {
            if (head == null) {
                return;
            }
            if (head.next == null) {
                head = null;
                return;
            }

            Node ref = head;
            while (ref.next.next != null) {
                ref = ref.next;
            }
            ref.next = null;
        }

        public void remove(int index) {
            if (head == null) {
                return;
            }
            if (index == 0) {
                removeFirst();
                return;
            }

            Node prev = head;
            int i = 0;
            while (prev.next != null && i < index - 1) {
                prev = prev.next;
                i++;
            }

            if (prev.next != null) {
                prev.next = prev.next.next;
            }
        }

        public void createHeadRec(int[] values) {
            head = null;
            createHeadRecHelper(values, 0);
        }

        private void createHeadRecHelper(int[] values, int index) {
            if (index >= values.length) {
                return;
            }
            head = new Node(values[index], head);
            createHeadRecHelper(values, index + 1);
        }

        public void createTailRec(int[] values) {
            head = createTailRecHelper(values, 0);
        }

        private Node createTailRecHelper(int[] values, int index) {
            if (index >= values.length) {
                return null;
            }
            return new Node(values[index], createTailRecHelper(values, index + 1));
        }

        public String toStringRec() {
            return toStringRecHelper(head);
        }

        private String toStringRecHelper(Node node) {
            if (node == null) {
                return "";
            }
            return node.value + " " + toStringRecHelper(node.next);
        }
    }

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        int[] values = {1, 2, 3, 4, 5};

        System.out.println("Создание с головы:");
        list.createHead(values);
        System.out.println(list.toString());

        System.out.println("Создание с хвоста:");
        list.createTail(values);
        System.out.println(list.toString());

        System.out.println("Добавить в начало:");
        list.addFirst(100);
        System.out.println(list.toString());

        System.out.println("Добавить в конец:");
        list.addLast(200);
        System.out.println(list.toString());

        System.out.println("Вставка по индексу 3:");
        list.insert(3, 300);
        System.out.println(list.toString());

        System.out.println("Удалить первый:");
        list.removeFirst();
        System.out.println(list.toString());

        System.out.println("Удалить последний:");
        list.removeLast();
        System.out.println(list.toString());

        System.out.println("Удалить по индексу 2:");
        list.remove(2);
        System.out.println(list.toString());

        System.out.println("Рекурсивное создание с головы:");
        list.createHeadRec(values);
        System.out.println(list.toStringRec());

        System.out.println("Рекурсивное создание с хвоста:");
        list.createTailRec(values);
        System.out.println(list.toStringRec());
    }
}