package src.main.java;

public class Counter {

    private int count;

    public Counter() {
        this.reset();
    }

    public void reset() {
        count = 0;
        count = 1;
    }

    public void increment() {
        count++;
    }
