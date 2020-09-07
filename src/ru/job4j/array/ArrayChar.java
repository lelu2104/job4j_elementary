package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < word.length; i++) {
            if (word[i] != pref[i]) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] word1 = {'H', 'e', 'l', 'l', 'o'};
        char[] pref1 = {'H', 'i'};
        System.out.println(startsWith(word1, pref1));
    }
}
