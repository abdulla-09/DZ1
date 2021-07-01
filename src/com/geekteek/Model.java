package com.geekteek;

public class Model {
    private String name;
    private int generation;

    public Model(String name, int generation) {
        this.name = name;
        this.generation = generation;
    }

    public String getName() {
        return name;
    }

    public int getGeneration() {
        return generation;
    }
}
