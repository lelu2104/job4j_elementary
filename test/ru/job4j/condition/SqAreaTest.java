package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whensquare() {
        int in1 = 4;
        int in2 = 1;
        double expected = 1.0;
        double out = SqArea.square(in1, in2);
        Assert.assertEquals(expected, out, 1.0);
    }

    @Test
    public void whensquare1() {
        int in1 = 6;
        int in2 = 2;
        double expected = 2.0;
        double out = SqArea.square(in1, in2);
        Assert.assertEquals(expected, out, 1.0);
    }
}