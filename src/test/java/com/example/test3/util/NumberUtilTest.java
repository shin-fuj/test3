package com.example.test3.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumberUtilTest {
    @Test
    void testNullToZeroLong() {
        assertEquals(1L, NumberUtil.nullToZero(1L));
        Long longValue = null;
        assertEquals(0, NumberUtil.nullToZero(longValue));
    }

    @Test
    void testNullToZeroInteger() {
        assertEquals(1, NumberUtil.nullToZero(1));
        Integer intValue = null;
        assertEquals(0, NumberUtil.nullToZero(intValue));
    }
}
