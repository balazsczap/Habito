package com.ivanmagda.habito.models;

import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public class ReminderTimeUnitTest {

    @Test
    public void reminderTimeInitialization() {
        ReminderTime uut = new ReminderTime(15, 23);

        Assert.assertEquals(15, uut.getHour());
        Assert.assertEquals(23, uut.getMinutes());
    }

    @Test
    public void reminderTimeSetTime() {
        ReminderTime uut = new ReminderTime(15, 23);
        uut.setHour(8);
        uut.setMinutes(57);

        Assert.assertNotEquals(15, uut.getHour());
        Assert.assertNotEquals(23, uut.getMinutes());

        Assert.assertEquals(8, uut.getHour());
        Assert.assertEquals(57, uut.getMinutes());
    }

    @Test
    public void reminderTimeGetTimeString() {
        ReminderTime uut = new ReminderTime(15, 23);

        Assert.assertEquals(ReminderTime.getTimeString(uut), ReminderTime.getTimeString(15, 23));
    }

    @Test
    public void reminderTimeGetTodayReminderDate() {
        ReminderTime uut = new ReminderTime(15, 23);
        Date date = uut.getTodayReminderDate();

        Calendar reminderToday = Calendar.getInstance();
        reminderToday.setTime(date);

        Calendar today = Calendar.getInstance();

        Assert.assertEquals(15, reminderToday.get(Calendar.HOUR_OF_DAY));
        Assert.assertEquals(23, reminderToday.get(Calendar.MINUTE));
        Assert.assertEquals(today.get(Calendar.DAY_OF_YEAR), reminderToday.get(Calendar.DAY_OF_YEAR));
        Assert.assertEquals(today.get(Calendar.MONTH), reminderToday.get(Calendar.MONTH));
        Assert.assertEquals(today.get(Calendar.YEAR), reminderToday.get(Calendar.YEAR));
    }
}
