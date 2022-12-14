import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class StringUtils {
    public static boolean isPalidrome(String str) {
        if (str == null)
            return false;

        int left = 0;
        int right = str.length() - 1;
        while (left < right)
            if (str.charAt(left++) != str.charAt(right--))
                return false;

        return true;

//        if (str.length() % 2 == 1)
//            str = str.replace("" + str.charAt(str.length() / 2), "");
//
//        int length = str.length();
//        for (int i = 0; i < (length/2); i++) {
//            if (str.charAt(i) != str.charAt(length - 1 - i))
//                return false;
//        }

//        return true;

//        return new StringBuilder(str).reverse().toString().equals(str);
    }

    public static boolean areAnagrams(String str1, String str2) {
        //        if (str1 == null || !(str1.equals(str2)))
        //            return false;

        //        final int ENGLISH_ALPHABET = 26;
        //        AtomicInteger[] freqs = new AtomicInteger[ENGLISH_ALPHABET];
        //        Arrays.stream(freqs)
        //              .forEach(i -> i = new AtomicInteger(0));

        //        String temp1 = str1.toLowerCase();
        //        String temp2 = str2.toLowerCase();

        //        IntStream.range(0, temp1.length())
        //                 .mapToObj(i -> freqs[temp1.charAt(i) - 'a']
        //                 .incrementAndGet());
        //
        //        return IntStream.range(0, temp2.length())
        //                        .peek(x -> System.out.println(
        //                                freqs[temp2.charAt(x) - 'a']))
        //                        .mapToObj(i -> freqs[temp2.charAt(i) -
        //                                'a'].decrementAndGet())
        //                        .anyMatch(i -> freqs[temp2.charAt(i) - 'a']
        //                        .equals(-1));

        char[] temp1 = str1.toCharArray();
        char[] temp2 = str2.toCharArray();
        Arrays.sort(temp1);
        Arrays.sort(temp2);

        return new String(temp1).equals(new String(temp2));
    }

    public static String capitalize(String str) {
        if (str == null || str.trim()
                              .isEmpty())
            return "";

        String[] words = str.trim()
                            .replaceAll(" +", " ")
                            .split(" ");

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1)
                               .toUpperCase() + words[i].substring(1)
                                                        .toLowerCase();
        }

        return String.join(" ", words);

        //        return Arrays.stream(str.trim()
        //                                .split(" "))
        //                     .filter(s -> !(s.isEmpty()))
        //                     .map(word -> word.replace(word.charAt(0),
        //                                               Character.toUpperCase(
        //                                                       word.charAt
        //                                                       (0))))
        //                     .collect(Collectors.joining(" "));
    }

    public static char mostRepeatedChar(String str) {
        if (str == null)
            return Character.MIN_VALUE;

        final int ASCII_SIZE = 256;
        int[] freqs = new int[ASCII_SIZE];

        for (char c : str.toCharArray())
            freqs[c]++;

        return (char) IntStream.range(0, ASCII_SIZE)
                               .boxed()
                               .max(Comparator.comparing(i -> freqs[i]))
                               .orElse((int) Character.MIN_VALUE)
                               .intValue();

        //        return Arrays.stream(str.replace(" ", "")
        //                                .split(""))
        //                     .collect(Collectors.groupingBy(Function
        //                     .identity(),
        //                                                    Collectors
        //                                                    .counting()))
        //                     .entrySet()
        //                     .stream()
        //                     .max(Map.Entry.comparingByValue())
        //                     .map(Map.Entry::getKey)
        //                     .orElse("");
    }

    public static String removeDuplicate(String str) {
        if (str == null)
            return "";

        StringBuilder output = new StringBuilder(str.length());
        HashSet<Character> seen = new HashSet<>();

        for (char c : str.trim()
                         .toCharArray()) {
            if (!seen.contains(c)) {
                output.append(c);
                seen.add(c);
            }
        }

        return output.toString();

        //        return Arrays.stream(str.trim().split(""))
        //                     .distinct()
        //                     .collect(Collectors.joining(""));
    }

    public static boolean areRotations(String str1, String str2) {
        //        StringBuilder str = new StringBuilder(str1);
        //        str.insert(0, str.charAt(str.length() - 1));
        //        str.deleteCharAt(str.length() - 1);
        //
        //        return str2.compareTo(str.toString()) == 0;

        //  ABCDABCD
        //    CDAB
        return (str1.length() == str2.length()) &&
                ((str1 + str1).contains(str2));
        // efficient in case of short strings.
    }

    public static String reverseWords(String str) {
        List<String> words = Arrays.asList(str.trim()
                                              .split(" "));
        Collections.reverse(words);

        return String.join(" ", words);
    }

    public static String reverse(String str) {
        if (str == null)
            return "";

        StringBuilder reversed = new StringBuilder(str.length());

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }

    public static int countVowels(String str) {
        int count = 0;
        String vowels = "a,e,i,o,u";
        Set<String> set = new HashSet<>(Arrays.asList(vowels.split(",")));

        if (str == null)
            return 0;

        for (Character c : str.toLowerCase()
                              .toCharArray())
            if (set.contains(c.toString()))
                count++;

        return count;
    }
}
