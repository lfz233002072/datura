/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datura.security;

/**
 *
 * @author lfz
 */
public enum RightValue {

    None(0),
    V1(1),
    V2(2),
    V4(4),
    V8(8),
    V16(16),
    V32(32),
    V64(64),
    V128(128),
    V256(256),
    V512(512),
    V1024(1024),
    V2048(2048),
    V4096(4096),
    V8192(8192),
    V16384(16384),
    V32768(32768);

    private int intValue;
    private static java.util.HashMap<Integer, RightValue> mappings;

    private synchronized static java.util.HashMap<Integer, RightValue> getMappings() {
        if (mappings == null) {
            mappings = new java.util.HashMap<Integer, RightValue>();
        }
        return mappings;
    }

    private RightValue(int value) {
        intValue = value;
        RightValue.getMappings().put(value, this);
    }

    public int getValue() {
        return intValue;
    }

    public static RightValue forValue(int value) {
        return getMappings().get(value);
    }
}
