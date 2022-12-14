import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addFirst(10);
        System.out.println(linkedList.size());

        System.out.println(linkedList.indexOf(30));
        linkedList.removeLast();
        System.out.println(linkedList.contains(10));

        linkedList.addLast(30);
        linkedList.addLast(40);
        System.out.println(Arrays.toString(linkedList.toArray()));
        linkedList.reverse();
        System.out.println(Arrays.toString(linkedList.toArray()));

        System.out.println(linkedList.getKthFromTheEnd(1));

        linkedList.addFirst(50);
        linkedList.addFirst(60);
        System.out.println(Arrays.toString(linkedList.toArray()));
        System.out.println(linkedList.printMiddle());

        linkedList = LinkedList.createWithLoop();
        System.out.println(linkedList.hasLoop());
    }
}
