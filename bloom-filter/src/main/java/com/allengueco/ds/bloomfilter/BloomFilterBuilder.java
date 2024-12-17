package com.allengueco.ds.bloomfilter;

public class BloomFilterBuilder<T> {
    private int expectedInsertions;
    private double falsePositiveRate;

    public BloomFilterBuilder(int expectedInsertions, double falsePositiveRate) {
        this.expectedInsertions = expectedInsertions;
        this.falsePositiveRate = falsePositiveRate;
    }

    public BloomFilter<T> build() {
        return new BloomFilter<>();
    }
}
