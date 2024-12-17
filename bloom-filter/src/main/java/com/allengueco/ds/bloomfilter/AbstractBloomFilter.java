package com.allengueco.ds.bloomfilter;

import java.nio.charset.Charset;

/**
 * Bloom filter efficiently answers the membership test.
 * @param <T>
 */
public interface AbstractBloomFilter<T> {
    default byte[] toBytes(T object) {
        return object.toString().getBytes(Charset.defaultCharset());
    }

    boolean find(T object);
    boolean insert(T object);
    void clear();
}