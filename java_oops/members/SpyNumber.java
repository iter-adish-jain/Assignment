package edu.jecrc.sdt.java_oops.members;

public class SpyNumber {

    public boolean isSpy(int num) {

        int sum = 0;
        int product = 1;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num = num / 10;
        }

        return sum == product;
    }
}
