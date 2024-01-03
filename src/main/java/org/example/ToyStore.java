package org.example;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ToyStore {
    private PriorityQueue<Toy> toys;

    public ToyStore() {
        Comparator<Toy> toyComparator = new Comparator<Toy>() {
            @Override
            public int compare(Toy t1, Toy t2) {
                return t2.getWeight() - t1.getWeight();
            }
        };
        this.toys = new PriorityQueue<>(toyComparator);
    }

    public void print() {
        System.out.println(toys);
    }

    public void put(Integer id, Integer weight, Integer number, String name) {
        Toy toy = new Toy(id, weight, name);
        for (int i = 0; i < number; i++) {
            this.toys.add(toy);
        }

    }


}
