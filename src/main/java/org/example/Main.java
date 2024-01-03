package org.example;

public class Main {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();
        toyStore.put(1, 30, 3, "robot");
        toyStore.put(2, 60, 2, "horse");
        toyStore.put(3, 10, 4, "car");
        toyStore.print();
        toyStore.iWillBeLucky();
        toyStore.iWillBeLucky();
        toyStore.iWillBeLucky();
        toyStore.iWillBeLucky();
        toyStore.iWillBeLucky();
        toyStore.iWillBeLucky();
    }
}