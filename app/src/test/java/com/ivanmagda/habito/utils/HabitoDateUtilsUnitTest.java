package com.ivanmagda.habito.utils;

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

    @Test
    public void isDatesInSameMonthTrue() {
        Calendar c1 = Calendar.getInstance();
        c1.set(2010, 12, 2);

        Calendar c2 = Calendar.getInstance();
        c2.set(2010, 12, 4);

        assertTrue(isDatesInSameMonth(c1.getTimeInMillis(), c2.getTimeInMillis()));
    }

    @Test
    public void isDatesInSameMonthDifferentYear() {
        Calendar c1 = Calendar.getInstance();
        c1.set(2010, 12, 2);

        Calendar c2 = Calendar.getInstance();
        c2.set(2011, 12, 4);

        assertFalse(isDatesInSameMonth(c1.getTimeInMillis(), c2.getTimeInMillis()));
    }

    @Test
    public void isDatesInSameMonthDifferentMonth() {
        Calendar c1 = Calendar.getInstance();
        c1.set(2010, 12, 2);

        Calendar c2 = Calendar.getInstance();
        c2.set(2010, 11, 2);

        assertFalse(isDatesInSameMonth(c1.getTimeInMillis(), c2.getTimeInMillis()));
    }

    @Test
    public void isDatesInSameWeekTrue() {
        Calendar c1 = Calendar.getInstance();
        c1.set(2017, 5, 2);

        Calendar c2 = Calendar.getInstance();
        c2.set(2017, 5, 3);

        assertTrue(isDatesInSameWeek(c1.getTimeInMillis(), c2.getTimeInMillis()));
    }

    @Test
    public void isDatesInSameWeekDifferentYear() {
        Calendar c1 = Calendar.getInstance();
        c1.set(2017, 5, 2);

        Calendar c2 = Calendar.getInstance();
        c2.set(2016, 5, 5);

        assertFalse(isDatesInSameWeek(c1.getTimeInMillis(), c2.getTimeInMillis()));
    }

    @Test
    public void isDatesInSameWeekDifferentWeek() {
        Calendar c1 = Calendar.getInstance();
        c1.set(2017, 5, 2);

        Calendar c2 = Calendar.getInstance();
        c2.set(2017, 5, 11);

        assertFalse(isDatesInSameWeek(c1.getTimeInMillis(), c2.getTimeInMillis()));
    }
}
