package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenmaxa() {
        int in1 = 1;
        int in2 = 2;
        int expected = 2;
        int out = Max.max(in1, in2);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenmaxa1() {
        int in1 = 2;
        int in2 = 1;
        int expected = 2;
        int out = Max.max(in1, in2);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenmaxa2() {
        int in1 = 2;
        int in2 = 2;
        int expected = 2;
        int out = Max.max(in1, in2);
        Assert.assertEquals(expected, out);
    }
}