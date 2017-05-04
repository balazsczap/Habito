package com.ivanmagda.habito.models;

import org.junit.Assert;
import org.junit.Test;

public class ReminderParameterObjectUnitTest {
    @Test
    public void remainderParameterObjectTest() {
        ReminderParameterObject uud = new ReminderParameterObject(2, 3);

        Assert.assertEquals(2, uud.getReminderHour());
        Assert.assertEquals(3, uud.getReminderMin());
    }
}
