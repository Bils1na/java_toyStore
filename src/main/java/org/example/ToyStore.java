package org.example;

import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

public class ToyStore {
    private PriorityQueue<Toy> toysPriority;
    private ArrayList<Toy> toys;
    private ArrayList<Toy> prizes;


    public ToyStore() {
        Comparator<Toy> toyComparator = new Comparator<Toy>() {
            @Override
            public int compare(Toy t1, Toy t2) {
                return t2.getWeight() - t1.getWeight();
            }
        };
        this.toysPriority = new PriorityQueue<>(toyComparator);
        this.toys = new ArrayList<>();
        this.prizes = new ArrayList<>();
    }

    public void print() {
        System.out.println(toys);
    }

    public void put(Integer id, Integer weight, Integer number, String name) {
        Toy toy = new Toy(id, weight, name);
        this.toysPriority.add(toy);
        for (int i = 0; i < number; i++) {
            this.toys.add(toy);
        }
    }

    public void iWillBeLucky() {
        Toy toy = toysPriority.poll();
        if (checkToy(toy)) {
            this.prizes.add(getToy(toy));

        }
        if (checkToy(toy)) toysPriority.add(toy);
    }

    public void get() throws IOException {
        FileHandler.writeData(this.prizes, Path.of("./prizes.txt"));
    }

    private boolean checkToy(Toy toy) {
        return toys.contains(toy);
    }

    private Toy getToy(Toy toy) {
        Iterator<Toy> iterator = this.toys.iterator();
        while (iterator.hasNext()) {
            Toy next = iterator.next();
            if (toy.getId().equals(next.getId())) {
                this.toys.remove(next);
                return next;
            }
        }
        return toy;
    }

}
