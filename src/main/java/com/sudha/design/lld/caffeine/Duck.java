package com.sudha.design.lld.caffeine;

public class Duck implements Comparable<Duck> {
    private final String name;
    private final int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return name + " : " + weight;
    }

    @Override
    public int compareTo(Duck duck) {
        return Integer.compare(this.weight, duck.weight);
    }
}
