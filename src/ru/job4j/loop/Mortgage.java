package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        do {
            int needToPay = (int) (amount + (amount * percent / 100));
            amount = needToPay - salary;
            year++;
        }
        while (amount > 0);
        return year;
    }
}
