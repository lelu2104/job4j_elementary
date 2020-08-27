package ru.job4j.loop;

public class PrimeNumber {

    public static boolean check(int number) {
        boolean prime = true;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            } else {
                prime = true;
                break;
            }
        }
        return prime;
    }

    public static int calc(int finish) {
        int count = 0;
        for (int number = 2; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                count = count + 1;
            }
        }
        return count;
    }
}
