import java.util.NoSuchElementException;

public class LinkedList {

    private int size;

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" + "value=" + value + ", next=" + next + '}';
        }
    }

    private Node first;
    private Node last;

    private boolean isEmpty() {
        return first == null;
    }

    public void addFirst(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public void addLast(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            first = last = node;
            first.next = null;
        } else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
        } else {

            Node second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }

    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
        } else {
            last = getPreviousNode(last);
            last.next = null;
        }
        size--;
    }

    public int size() {
        return size;
    }

    public boolean contains(int value) {
        return indexOf(value) != -1;
        //        if (!isEmpty()) {
        //            Node current = first;
        //            while (current != last.next)
        //                return current.value == value;
        //        }
        //        return false;
    }

    public int indexOf(int value) {
        if (!isEmpty()) {
            Node current = first;
            int index = 0;
            while (current != last.next) {
                if (current.value == value)
                    return index;
                current = current.next;
                index++;
            }
        }
        return -1;
    }

    public int[] toArray() {
        int[] array = new int[size];
        int index = 0;
        Node current = first;

        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }

        return array;
    }

    public void reverse() {
        if (isEmpty())
            return;
        //  [  10 -> 20 -> 30 -> null]
        //  [null <- 10 <- 20 <-  30]
        //          prv    cur    nxt
        //                 prv    cur    nxt
        //                        prv    cur    nxt
        Node previous = first;
        Node current = first.next;

        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        last = first;
        last.next = null;
        first = previous;

        //        //  [10 -> 20 -> 30]
        //        //  [30 -> 20 -> 10]
        //        //  for each penultimate:
        //        //  add it after the last node;
        //        //  delete original first node;
        //        //  stop at the original last node;
        //        Node current = first;
        //        Node penultimate = current;
        //        Node stop = last;
        //
        //        while (first != stop) {
        //            current = first;
        //            penultimate = current;
        //            if (current.next == stop) {
        //                addLast(first.value);
        //                removeFirst();
        //            } else {
        //                while (current.next.next != stop)
        //                    current = current.next;
        //
        //                penultimate = current.next;
        //                addLast(penultimate.value);
        //                current.next = penultimate.next;
        //                penultimate.next = null;
        //                size--;
        //            }
        //        }
    }

    public int getKthFromTheEnd(int k) {
        if (isEmpty())
            throw new IllegalStateException();

        Node head = first;
        Node tail = head;

        for (int i = 0; i < k - 1; i++) {
            head = head.next;
            if (head == null)
                throw new IllegalArgumentException();
        }

        while (head != last) {
            head = head.next;
            tail = tail.next;
        }

        return tail.value;

        //        k--;
        //        int dist = 0;
        //
        //        if (k == -1) {
        //            return last.value;
        //        }
        //
        //        while (head != last) {
        //            if(dist == k)
        //                tail = tail.next;
        //
        //            head = head.next;
        //            dist++;
        //        }
        //
        //        if (dist != k+1)
        //            throw new IllegalArgumentException();
        //
        //        return tail.value;
    }

    public String printMiddle() {
        if (isEmpty())
            throw new IllegalStateException();

        Node middle = first;
        Node head = middle;

        //  [10, 20, 30, 40, 50]
        //       mm  hh
        //           mm      hh  XX

        //  [10, 20, 30, 40, 50, 60]
        //       mm  hh
        //           mm      hh  XX

        while (head != last && head.next != last) {
            head = head.next.next;
            middle = middle.next;
        }

        if (head == last)
            return String.valueOf(middle.value);
        else
            return middle.value + ", " + middle.next.value;
    }

    public static LinkedList createWithLoop() {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        // Get a reference to 30
        Node node = list.last;

        list.addLast(40);
        list.addLast(50);
        list.addLast(60);

        // Create the loop
        list.last.next = node;

        return list;
    }

    public boolean hasLoop() {
        //           |========|
        //  [10, 20, 30, 40, 50, 60]
        //   mh
        //       mm  hh
        //           mm      hh
        //           hh  mm
        //                   hm
        Node head = first;
        Node tail = first;

        while (head != null && head.next != null) {
            head = head.next.next;
            tail = tail.next;

            if (head == tail)
                return true;
        }

        return false;
    }

    private Node getPreviousNode(Node node) {
        Node current = first;

        while (current != null) {
            if (current.next == node)
                return current;
            current = current.next;
        }

        return null;
    }
}
