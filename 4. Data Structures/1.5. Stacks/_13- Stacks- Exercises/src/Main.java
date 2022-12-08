public class Main {
    public static void main(String[] args) {
        TwoStacks twoStacks = new TwoStacks(3,5);

//        System.out.println(stack.pop());
        twoStacks.push1(10);
        twoStacks.push1(20);
        twoStacks.push1(30);
//        stack.push(-1);
        System.out.println(twoStacks);
        System.out.println(twoStacks.pop1());
        System.out.println(twoStacks);
        System.out.println(twoStacks.pop1());

        twoStacks.push2(100);
        twoStacks.push2(200);
        twoStacks.push2(300);

        System.out.println(twoStacks);
        System.out.println(twoStacks.pop2());
        System.out.println(twoStacks);
        System.out.println(twoStacks.pop2());
        System.out.println(twoStacks.pop2());
//        System.out.println(twoStacks.pop2());
        System.out.println(twoStacks);
    }
}