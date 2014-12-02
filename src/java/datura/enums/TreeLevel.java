/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datura.enums;

/**
 *
 * @author lfz
 */
/**
 * 树的层级（从1开始计算）
 *
 */
public enum TreeLevel {

    /**      *
     *
     */
    One(1),
    /**      *
     *
     */
    Two(2),
    /**      *
     *
     */
    Three(3),
    /**      *
     *
     */
    Four(4),
    /**      *
     *
     */
    Five(5);

    private int intValue;
    private static java.util.HashMap<Integer, TreeLevel> mappings;

    private synchronized static java.util.HashMap<Integer, TreeLevel> getMappings() {
        if (mappings == null) {
            mappings = new java.util.HashMap<Integer, TreeLevel>();
        }
        return mappings;
    }

    private TreeLevel(int value) {
        intValue = value;
        TreeLevel.getMappings().put(value, this);
    }

    public int getValue() {
        return intValue;
    }

    public static TreeLevel forValue(int value) {
        return getMappings().get(value);
    }
}
