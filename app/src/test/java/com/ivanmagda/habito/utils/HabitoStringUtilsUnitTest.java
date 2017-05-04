package com.ivanmagda.habito.utils;

import org.junit.Assert;
import org.junit.Test;

public class HabitoStringUtilsUnitTest {
    @Test
    public void HabitoStringUtilsNormalInput() {
        Assert.assertEquals("Unit-test", HabitoStringUtils.capitalized("unit-test"));
    }

    @Test
    public void HabitoStringUtils1LengthInput() {
        Assert.assertEquals("K", HabitoStringUtils.capitalized("k"));
    }

    @Test
    public void HabitoStringUtilsCapitalizedInput() {
        Assert.assertEquals("UNIT", HabitoStringUtils.capitalized("UNIT"));
    }

    @Test
    public void HabitoStringUtilsEmptyInput() {
        Assert.assertEquals("", HabitoStringUtils.capitalized(""));
    }

    @Test
    public void HabitoStringUtilsNumberFirstCharInput() {
        Assert.assertEquals("100% coverage", HabitoStringUtils.capitalized("100% coverage"));
    }
}
