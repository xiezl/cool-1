package com.nus.cool.core.io.compression;

import com.nus.cool.core.schema.CompressType;
import lombok.Getter;

@Getter
public class Histogram {

    private int rawSize;

    private boolean sorted;

    private int uniqueValues;

    private int numOfValues;

    private long max;

    private long min;

    private CompressType type;
}
