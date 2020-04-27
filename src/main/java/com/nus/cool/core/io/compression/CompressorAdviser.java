package com.nus.cool.core.io.compression;

import com.nus.cool.core.schema.Codec;
import com.nus.cool.core.schema.CompressType;

public class CompressorAdviser {

    public static Codec advise(Histogram hist) {
        CompressType type = hist.getType();
        switch (type) {
            case KeyFinger:
                return Codec.INT32;
            case KeyString:
                return Codec.LZ4;
            case KeyHash:
                return null;
            case ValueFast:
                return Codec.Delta;
            case Value:
                return null;
            default:
                throw new IllegalArgumentException("Unsupported compress type: " + type);
        }
    }

    private Codec adviseForKeyHash(Histogram hist) {
        int max = (int) hist.getMax();
//        int bitmapLength =
        return null;
    }
}
