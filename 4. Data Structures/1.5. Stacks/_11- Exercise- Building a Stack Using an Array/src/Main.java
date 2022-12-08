public class Main {
    public static void main(String[] args) {
        Stack twoStacks = new Stack(3);

//        System.out.println(twoStacks.pop());
        twoStacks.push(1);
        twoStacks.push(2);
        twoStacks.push(3);
//        twoStacks.push(-1);
        System.out.println(twoStacks.peek());
        System.out.println(twoStacks);
        System.out.println(twoStacks.pop());
        System.out.println(twoStacks);
        System.out.println(twoStacks.pop());
    }
}