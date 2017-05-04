package com.ivanmagda.habito.models;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import static org.junit.Assert.*;

public class HabitUnitTest {

    private Habit habit;
    private HabitRecord habitRecord;

    @Before
    public void init() {
        habitRecord = Mockito.mock(HabitRecord.class);
        habit = new Habit("id", habitRecord);
    }

    @Test
    public void copyTest() {
        when(habitRecord.copy()).thenReturn(habitRecord);
        Habit copy = habit.copy();

        assertEquals(habit.getId(), copy.getId());
        assertSame(habit.getRecord(), copy.getRecord());

        verify(habitRecord, times(1)).copy();
    }

    @Test
    public void isReminderOnHourMatchesMinNot() {
        when(habitRecord.getReminderHour()).thenReturn(0);
        when(habitRecord.getReminderMin()).thenReturn(-1);

        boolean result = habit.isReminderOn();

        assertFalse(result);
    }

    @Test
    public void isReminderOnMinMatchesHourNot() {
        when(habitRecord.getReminderHour()).thenReturn(-1);
        when(habitRecord.getReminderMin()).thenReturn(0);

        boolean result = habit.isReminderOn();

        assertFalse(result);
    }

    @Test
    public void isReminderOnBothMatches() {
        when(habitRecord.getReminderHour()).thenReturn(0);
        when(habitRecord.getReminderMin()).thenReturn(0);

        boolean result = habit.isReminderOn();

        assertTrue(result);
    }

    @Test
    public void isReminderOnNeitherMatches() {
        when(habitRecord.getReminderHour()).thenReturn(-1);
        when(habitRecord.getReminderMin()).thenReturn(-1);

        boolean result = habit.isReminderOn();

        assertFalse(result);
    }
}
