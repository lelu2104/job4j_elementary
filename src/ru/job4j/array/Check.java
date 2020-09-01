package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            data[0] = true;
            if(data[i] = data[0]) {
                return true;
            }
        }
        return result;
    }
}
