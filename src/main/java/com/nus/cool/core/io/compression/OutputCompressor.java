package com.nus.cool.core.io.compression;

import com.nus.cool.core.io.Output;
import com.nus.cool.core.schema.Codec;

import java.io.DataOutput;

public class OutputCompressor implements Output {

    private static enum DataType {INTEGER, STRING}

    private DataType dataType;

    private int[] vec;

    private byte[] strVec;

    private int off;

    private int len;

    private Histogram hist;

    public void reset(Histogram h, int[] vec, int off, int len) {
        this.hist = h;
        this.vec = vec;
        this.off = off;
        this.len = len;
        this.dataType = DataType.INTEGER;
    }

    public void reset(Histogram h, byte[] vec, int off, int len) {
        this.hist = h;
        this.strVec = vec;
        this.off = off;
        this.len = len;
        this.dataType = DataType.STRING;
    }

    @Override
    public int writeTo(DataOutput out) {
        int bytesWritten = 0;
        Codec codec = CompressorAdviser.advise(this.hist);
        Compressor compressor = CompressorFactory.newCompressor(codec, this.hist);
        return 0;
    }
}
