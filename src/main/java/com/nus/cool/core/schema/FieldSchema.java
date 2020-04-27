package com.nus.cool.core.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sun.istack.internal.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FieldSchema {

    @NotNull
    private String name;

    @NotNull
    private FieldType fieldType;

    @NotNull
    private DataType dataType;

    private String aggregator;

    private String baseField;

    private int scale = 1;

    private boolean preCal;

    public boolean isNumeric() {
        return true;
    }
}
