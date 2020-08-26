package ru.job4j.condition;

public class MultiMax {

    public static int max(int first, int second, int third) {
        int result = first > second ? first : second;
        result = third > result ? third : result;
        return result;
        }

    public static void main(String[] args) {
        System.out.println(MultiMax.max(1, 4 , 2));
        System.out.println(MultiMax.max(4, 2 , 1));
        System.out.println(MultiMax.max(1, 2 , 4));
        System.out.println(MultiMax.max(4, 4 , 4));
    }
}
