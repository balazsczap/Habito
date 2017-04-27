package com.ivanmagda.habito.utils;

import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.*;

import static com.ivanmagda.habito.utils.HabitoDateUtils.getCalendarWithTime;

public class HabitoDateUtilsUnitTest {

    @Test
    public void getCalendarWithTimeTest() {
        Calendar calendar = getCalendarWithTime(1L);

        assertNotNull(calendar);
        assertEquals(1L, calendar.getTimeInMillis());
    }

}
