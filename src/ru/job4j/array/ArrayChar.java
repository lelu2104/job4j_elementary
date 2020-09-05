package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < pref.length; j++) {
                if (word[i] != pref[j]) {
                    result = true;
                    break;
                }
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
