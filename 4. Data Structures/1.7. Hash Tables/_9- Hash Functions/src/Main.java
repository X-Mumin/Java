public class Main {
    public static void main(String[] args) {
        final int arraySize = 100;
        String hashMapKey = "123456-A";
        hashMapKey = "orange";

        System.out.println(hashMapKey.hashCode());
        System.out.println(hashedIndex(hashMapKey, arraySize));
    }

    private static int hashedIndex(String hashMapKey, int arraySize) {
        int hash = 0;

        for (char ch : hashMapKey.toCharArray())
            hash += ch;

        return hash%arraySize;
    }
}