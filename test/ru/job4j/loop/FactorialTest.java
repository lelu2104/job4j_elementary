package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

        @Test
        public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
            int in = 5;
            int expected = 120;
            int out = Factorial.calc(in);
            Assert.assertEquals(expected, out);
            /* напишите здесь тест, проверяющий, что факториал для числа 5 равен 120. */
        }

        @Test
        public void whenCalculateFactorialForZeroThenOne() {
                int in = 0;
                int expected = 1;
                int out = Factorial.calc(in);
                Assert.assertEquals(expected, out);
            /* напишите здесь тест, проверяющий, что факториал для числа 0 равен 1. */
        }
}