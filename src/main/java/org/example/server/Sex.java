package org.example.server;

public enum Sex {

    MALE, FEMALE;

    public String value() {
        return name();
    }

    public static Sex fromValue(String v) {
        return valueOf(v);
    }
}
