package com.ivanmagda.habito.utils;

import org.junit.Assert;
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
    public void isDatesInSameMonth_True() {
        Calendar c1 = Calendar.getInstance();
        c1.set(2010, 12, 2);

        Calendar c2 = Calendar.getInstance();
        c2.set(2010, 12, 4);

        Assert.assertTrue(HabitoDateUtils.isDatesInSameMonth(c1.getTimeInMillis(), c2.getTimeInMillis()));
    }

    @Test
    public void isDatesInSameMonth_DifferentYear() {
        Calendar c1 = Calendar.getInstance();
        c1.set(2010, 12, 2);

        Calendar c2 = Calendar.getInstance();
        c2.set(2011, 12, 4);

        Assert.assertFalse(HabitoDateUtils.isDatesInSameMonth(c1.getTimeInMillis(), c2.getTimeInMillis()));
    }

    @Test
    public void isDatesInSameMonth_DifferentMonth() {
        Calendar c1 = Calendar.getInstance();
        c1.set(2010, 12, 2);

        Calendar c2 = Calendar.getInstance();
        c2.set(2010, 11, 2);

        Assert.assertFalse(HabitoDateUtils.isDatesInSameMonth(c1.getTimeInMillis(), c2.getTimeInMillis()));
    }

    @Test
    public void isDatesInSameWeek_True() {
        Calendar c1 = Calendar.getInstance();
        c1.set(2017, 5, 2);

        Calendar c2 = Calendar.getInstance();
        c2.set(2017, 5, 3);

        Assert.assertTrue(HabitoDateUtils.isDatesInSameWeek(c1.getTimeInMillis(), c2.getTimeInMillis()));
    }

    @Test
    public void isDatesInSameWeek_DifferentYear() {
        Calendar c1 = Calendar.getInstance();
        c1.set(2017, 5, 2);

        Calendar c2 = Calendar.getInstance();
        c2.set(2016, 5, 5);

        Assert.assertFalse(HabitoDateUtils.isDatesInSameWeek(c1.getTimeInMillis(), c2.getTimeInMillis()));
    }

    @Test
    public void isDatesInSameWeek_DifferentWeek() {
        Calendar c1 = Calendar.getInstance();
        c1.set(2017, 5, 2);

        Calendar c2 = Calendar.getInstance();
        c2.set(2017, 5, 11);

        Assert.assertFalse(HabitoDateUtils.isDatesInSameWeek(c1.getTimeInMillis(), c2.getTimeInMillis()));
    }
}
