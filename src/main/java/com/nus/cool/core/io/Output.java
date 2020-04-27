package com.nus.cool.core.io;

import java.io.DataOutput;
import java.io.IOException;

/**
 * Base interface for all write-only data structures
 */
public interface Output {

    int writeTo(DataOutput out) throws IOException;
}
