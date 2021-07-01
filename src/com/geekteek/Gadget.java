package com.geekteek;

public class Gadget {
    private int year;
    private Color color;
    private Model model;

    public Gadget(int year, Color color, Model model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public Color getColor() {
        return color;
    }

    public Model getModel() {
        return model;
    }
}
