package org.example;

public class Toy {
    private Integer id;
    private Integer weight;
    private String name;

    public Toy(Integer id, Integer weight, String name) {
        this.id = id;
        this.weight = weight;
        this.name = name;
    }

    public Integer get() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("%s: %s-%s", this.id, this.name, this.weight);
    }
}
