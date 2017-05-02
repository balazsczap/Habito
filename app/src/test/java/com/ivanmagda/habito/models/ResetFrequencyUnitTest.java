package com.ivanmagda.habito.models;

import org.junit.Assert;
import org.junit.Test;

public class ResetFrequencyUnitTest {
    @Test
    public void ResetFrequency_EmptyContructor() {
        ResetFrequency uud = new ResetFrequency();

        Assert.assertEquals(ResetFrequency.Type.NEVER, uud.getType());
        Assert.assertEquals(ResetFrequency.NEVER, uud.getTypeName());
    }

    @Test
    public void ResetFrequency_TypeConstructor() {
        ResetFrequency uud = new ResetFrequency(ResetFrequency.Type.MONTH);

        Assert.assertEquals(ResetFrequency.Type.MONTH, uud.getType());
        Assert.assertEquals(ResetFrequency.MONTH, uud.getTypeName());
    }

    @Test
    public void ResetFrequency_StringConstructor() {
        ResetFrequency uud = new ResetFrequency(ResetFrequency.DAY);

        Assert.assertEquals(ResetFrequency.DAY, uud.getTypeName());
        Assert.assertEquals(ResetFrequency.Type.DAY, uud.getType());
    }

    @Test
    public void ResetFrequency_SetType_WithType() {
        ResetFrequency uud = new ResetFrequency(ResetFrequency.Type.WEEK);
        uud.setType(ResetFrequency.Type.YEAR);

        Assert.assertNotEquals(ResetFrequency.Type.WEEK, uud.getType());
        Assert.assertEquals(ResetFrequency.Type.YEAR, uud.getType());
        Assert.assertEquals(ResetFrequency.YEAR, uud.getTypeName());
    }

    @Test
    public void ResetFrequency_SetType_WithString() {
        ResetFrequency uud = new ResetFrequency(ResetFrequency.WEEK);
        uud.setType(ResetFrequency.YEAR);

        Assert.assertNotEquals(ResetFrequency.WEEK, uud.getTypeName());
        Assert.assertEquals(ResetFrequency.YEAR, uud.getTypeName());
        Assert.assertEquals(ResetFrequency.Type.YEAR, uud.getType());
    }

    @Test
    public void ResetFrequency_StringFor() {
        Assert.assertEquals(ResetFrequency.DAY, ResetFrequency.stringFor(ResetFrequency.Type.DAY));
        Assert.assertEquals(ResetFrequency.MONTH, ResetFrequency.stringFor(ResetFrequency.Type.MONTH));
        Assert.assertEquals(ResetFrequency.YEAR, ResetFrequency.stringFor(ResetFrequency.Type.YEAR));
        Assert.assertEquals(ResetFrequency.NEVER, ResetFrequency.stringFor(ResetFrequency.Type.NEVER));
        Assert.assertEquals(ResetFrequency.WEEK, ResetFrequency.stringFor(ResetFrequency.Type.WEEK));
    }

    @Test
    public void ResetFrequency_TypeFor() {
        Assert.assertEquals(ResetFrequency.Type.DAY, ResetFrequency.typeFrom(ResetFrequency.DAY));
        Assert.assertEquals(ResetFrequency.Type.WEEK, ResetFrequency.typeFrom(ResetFrequency.WEEK));
        Assert.assertEquals(ResetFrequency.Type.MONTH, ResetFrequency.typeFrom(ResetFrequency.MONTH));
        Assert.assertEquals(ResetFrequency.Type.YEAR, ResetFrequency.typeFrom(ResetFrequency.YEAR));
        Assert.assertEquals(ResetFrequency.Type.NEVER, ResetFrequency.typeFrom(ResetFrequency.NEVER));

        try {
            ResetFrequency.Type t = ResetFrequency.typeFrom("test-invalid-input");
            Assert.fail();
        } catch (Exception e) {
            // Exception expected
        }
    }
}
