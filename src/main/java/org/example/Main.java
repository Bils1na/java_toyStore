package org.example;

public class Main {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();
        toyStore.put(1, 20, 3, "robot");
        toyStore.put(2, 30, 2, "horse");
        toyStore.put(3, 20, 4, "car");
        toyStore.print();
    }
}