package org.example.HW1;


public abstract class Goods {
    protected String name;
    protected int cost;

    public String getName() {
        return name;
    }

    public Goods(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }


}
