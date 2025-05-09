package assignment6;

import java.util.Arrays;
import java.util.Comparator;

class ass_6_q1 {
    static class Item {
        int weight, profit;

        Item(int weight, int profit) {
            this.weight = weight;
            this.profit = profit;
        }
    }

    public static double fractionalKnapsack(Item[] items, int capacity) {
        Arrays.sort(items, Comparator.comparingDouble(i -> -(double)i.profit / i.weight));
        double totalProfit = 0.0;

        for (Item item : items) {
            if (capacity == 0) break;
            if (item.weight <= capacity) {
                capacity -= item.weight;
                totalProfit += item.profit;
            } else {
                totalProfit += item.profit * ((double) capacity / item.weight);
                capacity = 0;
            }
        }

        return totalProfit;
    }

    public static void main(String[] args) {
        Item[] items = {
            new Item(10, 60),
            new Item(20, 100),
            new Item(30, 120)
        };
        int capacity = 50;

        System.out.println("Maximum profit: " + fractionalKnapsack(items, capacity));
    }
}

