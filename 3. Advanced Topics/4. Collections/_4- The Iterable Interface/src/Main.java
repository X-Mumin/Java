import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        GenericList<String> list = new GenericList<String>();

        //        Iterator iterator = list.iterator();
        //
        //        while(iterator.hasNext()) {
        //            Object current = iterator.next();
        //            System.out.println(current);
        //        }

        for (Object current : list) {
            System.out.println(current);
        }
    }
}
