package com.corejava.InnerClasss;

public class OuterClass {
    // instance method of the outer class
    void my_method() {
        int num = 23;

        // method-local inner class
        class MethodInner_Demo {
            public void print() {
                System.out.println("This is method inner class: " + num);
            }
        } // end of the inner class

        // Accessing the inner class
        MethodInner_Demo inner = new MethodInner_Demo();
        inner.print();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.my_method();
    }
}
