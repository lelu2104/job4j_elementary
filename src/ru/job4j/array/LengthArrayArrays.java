package ru.job4j.array;

import java.util.Arrays;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int [][] array = {{1}, {2, 2}, {3, 3, 3}, {4, 4, 4, 4}};
        for (int i = 0; i < array.length; i++) {
            System.out.println("Количество элементов вложенного массива = " + array[i].length);
        }
    }
}
