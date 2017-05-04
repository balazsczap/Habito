package com.ivanmagda.habito.utils;

import org.junit.Assert;
import org.junit.Test;

public class HabitoStringUtilsUnitTest {
    @Test
    public void habitoStringUtilsNormalInput() {
        Assert.assertEquals("Unit-test", HabitoStringUtils.capitalized("unit-test"));
    }

    @Test
    public void habitoStringUtils1LengthInput() {
        Assert.assertEquals("K", HabitoStringUtils.capitalized("k"));
    }

    @Test
    public void habitoStringUtilsCapitalizedInput() {
        Assert.assertEquals("UNIT", HabitoStringUtils.capitalized("UNIT"));
    }

    @Test
    public void habitoStringUtilsEmptyInput() {
        Assert.assertEquals("", HabitoStringUtils.capitalized(""));
    }

    @Test
    public void habitoStringUtilsNumberFirstCharInput() {
        Assert.assertEquals("100% coverage", HabitoStringUtils.capitalized("100% coverage"));
    }
}
