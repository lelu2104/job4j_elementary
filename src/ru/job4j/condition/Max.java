package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class Max {
    public static int max(int left, int right) {
        boolean can = left > right;
        int result = can ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int a = Max.max(1, 2);
        System.out.println(a);
        int a1 = Max.max(2, 1);
        System.out.println(a1);
        int a2 = Max.max(2, 2);
        System.out.println(a2);
    }
}
