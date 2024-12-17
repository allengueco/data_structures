package com.allengueco.ds.bloomfilter;

import java.security.MessageDigest;
import java.util.BitSet;

public class BloomFilter<T> implements AbstractBloomFilter<T> {
    private BitSet bloom;
    private static <T> BloomFilterBuilder<T> create(int expectedInsertions, double falsePositiveRate) {
        return new BloomFilterBuilder<>(expectedInsertions, falsePositiveRate);
    }

    @Override
    public boolean find(T object) {
        return false;
    }

    @Override
    public boolean insert(T object) {
        return false;
    }

    @Override
    public void clear() {
        bloom.clear();
    }
}
