package io.zipcoder.microlabs.mastering_loops;
import java.lang.Math;

public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String st = "";
        int i;
        for(i = start; i<stop;i++) {
            if (i % 2 == 1) {
                st = st + i;
            }
        }
        return st;
    }


    public static String getOddNumbers(int start, int stop) {
        String st = "";
        int i;
        for(i = start; i<stop;i++) {
            if (i % 2 == 0) {
                st = st + i;
            }
        }
        return st;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String st = "";
        int i;
        for(i = start; i<stop;i++) {
            if (i % 5 == 0) {
                st = st + i*i;
            }
        }
        return st;
    }

    public static String getRange(int start) {
        String st = "";
        int i;
        for(i = 0; i < start;i++) {
            st = st + i;
            }
        return st;
        }

    public static String getRange(int start, int stop) {
        String st = "";
        int i;
        for(i = start; i<stop;i++) {
            st = st + i;
            }
        return st;
    }


    public static String getRange(int start, int stop, int step){
        String st = "";
        int i;
        for(i=start;i < stop;i=i+step){
            st = st + i;
        }
        return st;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String st = "";
        int i;
        for(i = start; i<stop;i=i+step) {
        st = st + Math.pow(i, exponent);
        }
        return st;
    }
}
