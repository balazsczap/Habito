package com.ivanmagda.habito.models;

import org.junit.Assert;
import org.junit.Test;

public class HabitListUnitTest {
    @Test
    public void sortOrderFromValueWithNameTest() {
        HabitList.SortOrder uut = HabitList.SortOrder.fromValue(0);
        Assert.assertEquals(uut, HabitList.SortOrder.NAME);
    }

    @Test
    public void sortOrderFromValueWithDateTest() {
        HabitList.SortOrder uut = HabitList.SortOrder.fromValue(1);
        Assert.assertEquals(uut, HabitList.SortOrder.DATE);
    }

    @Test
    public void sortOrderFromValueWithInvalidInput() {
        try {
            HabitList.SortOrder.fromValue(3);
            Assert.fail("IllegalArgumentException expected!");
        } catch (IllegalArgumentException e) {
            // Exception expected
        }
    }
}
