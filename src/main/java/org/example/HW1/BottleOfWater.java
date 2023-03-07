package org.example.HW1;


public class BottleOfWater extends Goods {

    private final boolean still;

    public BottleOfWater(String name, int cost, boolean still) {
        super(name, cost);
        this.still = still;
    }
    @Override
    public String toString() {
        String line;
        if (still) line = "вода без газа";
        else line = "газированная вода";
        return "BottleOfWater {" +
                "name = '" + name + '\'' +
                ", cost = " + cost + '\'' + ", " +
                line + '}';
    }


}
