package com.fankf.utils;

public class StringUtils {

    public static boolean isBlank(String string) {

        if (string != null && string.trim().length() > 0) {
            return true;
        }
        return false;
    }

    public static int compareTo(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int min = Math.min(s1.length(), c2.length);

        for (int i = 0; i < min; i++) {
            if (c1[i] > c2[i]) {
                return 1;
            } else if (c1[i] < c2[i]) {
                return -1;
            }
        }
        if (s1.length() < s2.length()) {
            return -1;
        } else if (s1.length() > s2.length()) {
            return 1;
        }
        return 0;
    }
}
