import java.util.HashMap;

public class ProblemReversVowelsString {
    public boolean isVowels(char s) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        for (var vowel : vowels) {
            if (vowel == s) {
                return true;
            }
        }

        return false;
    }

    public void swapStrBuilder(StringBuilder stringBuilder, int left, int right) {
        char temp = stringBuilder.charAt(left);
        stringBuilder.setCharAt(left, stringBuilder.charAt(right));
        stringBuilder.setCharAt(right, temp);

    }

    public String reverseVowels(String s) {
        int leftPointer = 0, rightPointer = s.length() - 1;

        StringBuilder stringBuilder = new StringBuilder(s);

        while (leftPointer < rightPointer) {

            if (isVowels(stringBuilder.charAt(leftPointer))) {

                while (leftPointer < rightPointer) {
                    if (isVowels(stringBuilder.charAt(rightPointer))) {
                        swapStrBuilder(stringBuilder, leftPointer, rightPointer);
                        rightPointer--;
                        break;
                    }
                    rightPointer--;
                }

            }


            leftPointer++;
        }

        return stringBuilder.toString();
    }

    public static void run() {
        var run = new ProblemReversVowelsString();
//
        System.out.println(run.reverseVowels("leetcode"));
        System.out.println(run.reverseVowels("ai"));
        System.out.println(run.reverseVowels("race car"));

        System.out.println(run.reverseVowels("Euston saw I was not Sue.")); //"euston saw I was not SuE."
    }
}