package com.corejava.Multithreading.example1;

public class DisplayMessage implements Runnable{
    public String message;

    public DisplayMessage(String message) {
        this.message = message;
    }
    public void run() {
        while(true) {
            System.out.println(message);
        }
    }
}
