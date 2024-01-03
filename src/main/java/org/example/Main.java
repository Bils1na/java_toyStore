package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
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
        toyStore.print();
        toyStore.get();
    }
}