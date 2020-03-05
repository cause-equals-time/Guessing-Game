package com.company;

public class Range {

    private int low;
    private int high;

    @Override
    public String toString() {
        return String.format("<%d,%d>",low,high);
    }

    public int getLow() {
        return low;
    }

    public int getHigh() {
        return high;
    }

    public Range(int low, int high) {
        this.low = low;
        this.high = high;
    }
}
