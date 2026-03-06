package edu.jecrc.sdt.java_oops.members;

public class AutoBiographical {

    public boolean AutoBiographical(int num) {

        String str = String.valueOf(num);
        int length = str.length();
        int[] count = new int[length];

        // Count occurrences of digits
        for (int i = 0; i < length; i++) {
            int digit = str.charAt(i) - '0';
            if (digit < length) {
                count[digit]++;
            }
        }

        // Compare digit count with actual digits
        for (int i = 0; i < length; i++) {
            if (count[i] != (str.charAt(i) - '0')) {
                return false;
            }
        }

        return true;
    }
}
