package com.nus.cool.core.schema;

public enum ChunkType {

    META;

    //DATA;

    public static ChunkType fromInteger(int i) {
        switch (i) {
            case 0:
                return META;
            //      case 1:
            //          return DATA;
            default:
                throw new IllegalArgumentException("Invalid chunk type int: " + i);
        }
    }
}
