package Inventory_Replenish;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Inventory {
    private String inventoryId;
    private int maxQuantity, minQuantity, threshold;

    public Inventory(String inventoryId, int maxQuantity, int minQuantity, int threshold) {
        this.inventoryId = inventoryId;
        this.maxQuantity = maxQuantity;
        this.minQuantity = minQuantity;
        this.threshold = threshold;
    }

    public String getInventoryId() {
        return inventoryId;
    }

    public int getThreshold() {
        return threshold;
    }
}

public class Solution {
    static Inventory[] replenish(Inventory[] inventories, int limit) {
        List<Inventory> res = new ArrayList<Inventory>();
        for (Inventory i : inventories) {
            if (limit <= i.getThreshold()) {
                res.add(i);
            }
        }
        return res.toArray(new Inventory[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Inventory[] inventories = new Inventory[n];
        for (int i = 0; i < n; i++) {
            inventories[i] = new Inventory(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        int limit = sc.nextInt();
        Inventory[] filteredInv = Solution.replenish(inventories, limit);
        for (Inventory i : filteredInv) {
            String s = "";
            int threshold = i.getThreshold();
            if (threshold > 75) {
                s += "Critical Filling";
            } else if (75 >= threshold && threshold >= 50) {
                s += "Moderate Filling";
            } else {
                s += "Non-Critical Filling";
            }
            System.out.println(i.getInventoryId() + " " + s + " " + i.getThreshold());
        }
        sc.close();
    }
}
