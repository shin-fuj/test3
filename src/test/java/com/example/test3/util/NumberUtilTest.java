package com.example.test3.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumberUtilTest {
    @Test
    void testNullToZeroLong() {
        assertEquals(1L, NumberUtil.nullToZero(1L));
    }

    @Test
    void testNullToZeroInteger() {
        Integer intValue = null;
        assertEquals(1, NumberUtil.nullToZero(intValue));
    }
}
