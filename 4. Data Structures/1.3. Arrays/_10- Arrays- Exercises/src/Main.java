public class Main {
    public static void main(String[] args) {
        Array integerArray1 = new Array(3);
        Array integerArray2 = new Array(6);

        integerArray1.insert(3);
        integerArray1.insert(2);
        integerArray2.insert(2);
        integerArray1.insert(1);
        integerArray1.insert(10);
        integerArray1.insert(20);
        integerArray2.insert(20);
        integerArray2.insert(30);
        integerArray2.insert(3);
        //        integerArray1.print();

        //        System.out.println(integerArray1.indexOf(11));

        //        integerArray1.remove(1);
        //        integerArray1.print();

        //        System.out.println(integerArray1.max());

        //        integerArray1.intersect(integerArray2).print();

        //        integerArray2.print();
        //        integerArray2.reverse();
        //        integerArray2.print();
        integerArray2.insertAt(0, 0);
        integerArray2.insertAt(-1, 3);
        integerArray2.insertAt(-10, 6);
        integerArray2.insertAt(-100, 10);
        integerArray2.print();
    }
}