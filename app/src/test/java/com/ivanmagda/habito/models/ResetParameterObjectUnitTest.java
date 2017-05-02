package com.ivanmagda.habito.models;

import org.junit.Assert;
import org.junit.Test;

public class ResetParameterObjectUnitTest {
    @Test
    public void resetParameterObject_constructor_notNull() {
        ResetParameterObject uud = new ResetParameterObject("reset", 1);

        Assert.assertEquals(uud.getResetFreq(), "reset");
        Assert.assertEquals(uud.getResetTimestamp(), 1);
    }

    @Test
    public void resetParameterObject_constructor_null() {
        ResetParameterObject uud = new ResetParameterObject(null, -1);

        Assert.assertNull(uud.getResetFreq());
        Assert.assertEquals(uud.getResetTimestamp(), -1);
    }
}
