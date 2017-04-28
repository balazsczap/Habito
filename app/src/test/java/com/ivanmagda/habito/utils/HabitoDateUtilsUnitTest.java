package com.ivanmagda.habito.utils;

import com.ivanmagda.habito.models.Habit;
import com.ivanmagda.habito.models.HabitRecord;

import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

import static com.ivanmagda.habito.utils.HabitoDateUtils.*;

public class HabitoDateUtilsUnitTest {

    @Test
    public void getCalendarWithTimeTest() {
        Calendar calendar = getCalendarWithTime(1L);

        assertNotNull(calendar);
        assertEquals(1L, calendar.getTimeInMillis());
    }

    @Test
    public void getIsWithinRangeLongSuccess() {
        assertTrue(isWithinRange(2L, 1L, 5L));
    }

    @Test
    public void getIsWithinRangeLongFail() {
        assertFalse(isWithinRange(2L, 4L, 5L));
    }

    @Test
    public void getIsWithinRangeDateSuccess() {

        Date toCheck = new Date(2L);
        Date start = new Date(1L);
        Date end = new Date(5L);

        assertTrue(isWithinRange(toCheck, start, end));
    }

    @Test
    public void getIsWithinRangeDateFail() {

        Date toCheck = new Date(2L);
        Date start = new Date(4L);
        Date end = new Date(5L);

        assertFalse(isWithinRange(toCheck, start, end));
    }

}
