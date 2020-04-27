package com.nus.cool.core.io.writestore;

import com.nus.cool.core.io.Output;
import com.nus.cool.core.schema.FieldType;

public interface MetaFieldWS extends Output {

    void put(String v);

    int find(String v);

    int count();

    FieldType getFieldType();

    void complete();
}
