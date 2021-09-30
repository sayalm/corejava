package com.sayal.masterclass.FloatandDouble;

public class FloatandDouble {
    public static void main(String [] args) {
        // width of int = 32 (4 bytes).
        int myIntValue = 5 / 3;
        // width of float = 32 (4 bytes).
        float myFloatValue = 5f / 3f;
        // width of double = 64 (8 bytes).
        double myDoublevalue = 5d / 3d;

        System.out.println("myIntValue " + myIntValue);
        System.out.println("myFloatValue " + myFloatValue);
        System.out.println("myDoublevalue " + myDoublevalue);
    }
}
