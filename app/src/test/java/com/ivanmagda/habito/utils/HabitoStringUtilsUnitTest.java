package com.ivanmagda.habito.utils;

import org.junit.Assert;
import org.junit.Test;

public class HabitoStringUtilsUnitTest {
    @Test
    public void HabitoStringUtils_NormalInput() {
        Assert.assertEquals("Unit-test", HabitoStringUtils.capitalized("unit-test"));
    }

    @Test
    public void HabitoStringUtils_1LengthInput() {
        Assert.assertEquals("K", HabitoStringUtils.capitalized("k"));
    }

    @Test
    public void HabitoStringUtils_CapitalizedInput() {
        Assert.assertEquals("UNIT", HabitoStringUtils.capitalized("UNIT"));
    }

    @Test
    public void HabitoStringUtils_EmptyInput() {
        Assert.assertEquals("", HabitoStringUtils.capitalized(""));
    }

    @Test
    public void HabitoStringUtils_NumberFirstCharInput() {
        Assert.assertEquals("100% coverage", HabitoStringUtils.capitalized("100% coverage"));
    }
}
