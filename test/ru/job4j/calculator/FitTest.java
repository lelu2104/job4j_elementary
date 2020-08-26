package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenmanWeight() {
        short in = 187;
        double expected = 100.05;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenwomanWeight() {
        short in = 170;
        double expected = 69.00;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);

    }
}