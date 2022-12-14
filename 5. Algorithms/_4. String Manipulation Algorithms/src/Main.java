public class Main {
    public static void main(String[] args) {
        String str = "Hello World";

        System.out.println(StringUtils.countVowels(str));
        System.out.println(StringUtils.reverse(str));

        str = "  Trees are beautiful";
        System.out.println(StringUtils.reverseWords(str));

        System.out.println(StringUtils.areRotations("ABCD", "DACB"));

        System.out.println(StringUtils.removeDuplicate(" Hellooo!! "));

        System.out.println(
                StringUtils.mostRepeatedChar("Trees are beautiful!!"));

        System.out.println(
                StringUtils.capitalize("   trees  are    beautiful   "));

        System.out.println(StringUtils.areAnagrams("adcb", "dcba"));

        System.out.println(StringUtils.isPalidrome("acazaca"));
    }
}