package com.nus.cool.core.io.compression;

public interface Compressor {

    int maxCompressedLength();

    int compress(byte[] src, int srcOff, int srcLen, byte[] dest, int destOff, int maxDestLen);

    int compress(int[] src, int srcOff, int srcLen, byte[] dest, int destOff, int maxDestLen);

    int compress(long[] src, int srcOff, int srcLen, byte[] dest, int destOff, int maxDestLen);

    int compress(float[] src, int srcOff, int srcLen, byte[] dest, int destOff, int maxDestLen);
}
