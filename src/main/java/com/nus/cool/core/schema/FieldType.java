package com.nus.cool.core.schema;

// TODO: NEED CLEAN
public enum FieldType {
    AppKey,

    UserKey,

    ActionTime,

    Action;

    public static FieldType fromInteger(int i) {
        switch (i) {
            case 0:
                return AppKey;
            case 1:
                return UserKey;
            case 2:
                return ActionTime;
            case 3:
                return Action;
            default:
                throw new IllegalArgumentException("Invalid field type int: " + i);
        }
    }
}