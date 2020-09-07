package ru.job4j.array;

public class Defragment {

    public static String[] compress(String[] array) {
        int nullIndex = 0;
        int notNullIndex = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                for (int i = 0; i < array.length; i++) {
                        int temp = nullIndex;
                        nullIndex = notNullIndex;
                        notNullIndex = temp;
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
