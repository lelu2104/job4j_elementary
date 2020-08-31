package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        for (int index = 0; index < array.length; index++) {
            for (int i = index + 1; i < array.length; i++) {
                if(array[index] > array[i]) {
                    int temp = array[index];
                    array[index] = array[i];
                    array[i] = temp;
                }
            }
        }
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
