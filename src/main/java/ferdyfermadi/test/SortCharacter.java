package ferdyfermadi.test;

import java.util.Arrays;

public class SortCharacter {
    public static void main(String[] args) {
        String input1 = "Sample Case";
        String input2 = "Next Case";

        processAndPrintOutput(input1);
        processAndPrintOutput(input2);
    }

    public static void processAndPrintOutput(String input) {
        input = input.toLowerCase();

        String vowels = "";
        String consonants = "";

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                if (isVowel(c)) {
                    vowels += c;
                } else {
                    consonants += c;
                }
            }
        }

        char[] vowelsArray = vowels.toCharArray();
        char[] consonantsArray = consonants.toCharArray();
        Arrays.sort(vowelsArray);
        Arrays.sort(consonantsArray);

        String sortedVowels = new String(vowelsArray);
        String sortedConsonants = new String(consonantsArray);

        System.out.println("Input one line of words (S) : " + input);
        System.out.println("Vowel Characters : " + sortedVowels);
        System.out.println("Consonant Characters : " + sortedConsonants);
        System.out.println();
    }

    public static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}
