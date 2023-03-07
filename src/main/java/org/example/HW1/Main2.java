package org.example.HW1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        WaterMachine machine1 = new WaterMachine();
        List<BottleOfWater> beverages = new ArrayList<>(Arrays.asList(
                new BottleOfWater("Есентуки", 42, false),
                new BottleOfWater("Боржоми", 142, false),
                new BottleOfWater("Акваминерале", 34, true),
                new BottleOfWater("Агуша", 49, true)));

        machine1.initProduct(beverages);
        System.out.println(machine1.getProduct("Боржоми"));


        SnackMachine machine2 = new SnackMachine();
        ArrayList<Snacks> ourSnacks = new ArrayList<>(Arrays.asList(
                new Snacks("сникерс", 56, 300),
                new Snacks("марс", 80, 300),
                new Snacks("чипсы", 156, 600),
                new Snacks("сухарики", 36, 200),
                new Snacks("шоколад", 90, 1300)));
        machine2.initSnacks(ourSnacks);
        System.out.println(machine2.getProduct("чипсы"));


        HotBeveragesMachine machine3 = new HotBeveragesMachine();
        ArrayList<HotBeverages> hotBeverages = new ArrayList<>(Arrays.asList
                (new HotBeverages("кофе", 100, 75),
                        (new HotBeverages("кофе", 100, 75)),
                        (new HotBeverages("чай", 90, 75)),
                        (new HotBeverages("американо", 120, 85)),
                        (new HotBeverages("матэ", 160, 65))));
        machine3.initProduct(hotBeverages);
        System.out.println(machine3.getProduct("кофе"));
    }
}
