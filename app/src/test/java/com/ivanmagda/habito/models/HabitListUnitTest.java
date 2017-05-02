package com.ivanmagda.habito.models;

import com.ivanmagda.habito.models.HabitList;

import org.junit.Assert;
import org.junit.Test;

public class HabitListUnitTest {
    @Test
    public void sortOrder_FromValue_WithNameTest() {
        HabitList.SortOrder uut = HabitList.SortOrder.fromValue(0);
        Assert.assertEquals(uut, HabitList.SortOrder.NAME);
    }

    @Test
    public void sortOrder_FromValue_WithDateTest() {
        HabitList.SortOrder uut = HabitList.SortOrder.fromValue(1);
        Assert.assertEquals(uut, HabitList.SortOrder.DATE);
    }

    @Test
    public void sortOrder_FromValue_WithInvalidInput() {
        try {
            HabitList.SortOrder uut = HabitList.SortOrder.fromValue(3);
            Assert.fail("IllegalArgumentException expected!");
        } catch (IllegalArgumentException e) {
            // Exception expected
        }
    }
}
