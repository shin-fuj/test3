package com.example.test3.util;

public class NumberUtil {

    private NumberUtil() {
        // NOP.
    }

    public static Long nullToZero(Long value) {
        if (value == null) {
            return 0L;
        }
        return value;
    }

    public static Integer nullToZero(Integer value) {
        if (value == null) {
            return 0;
        }
        return value;
    }

    public static String valueOf(int value) {
        return Integer.valueOf(value).toString();
    }
}
