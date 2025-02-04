package Sim_Transfer_Circle;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Sim {
    private int simId;
    private String customerName;
    private double balance;
    private double ratePerSecond;
    private String circle;

    public Sim(int simId, String customerName, double balance, double ratePerSecond, String circle) {
        this.simId = simId;
        this.customerName = customerName;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }

    public int getSimId() {
        return simId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public double getRatePerSecond() {
        return ratePerSecond;
    }

    public String getCircle() {
        return circle;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }
}

class Solution {
    public static Sim[] transferCircle(Sim[] sims, String circle1, String circle2) {
        List<Sim> filteredSims = new ArrayList<>();
        for (Sim sim : sims) {
            if (sim.getCircle().equalsIgnoreCase(circle1)) {
                sim.setCircle(circle2);
                filteredSims.add(sim);
            }
        }
        filteredSims.sort((s1, s2) -> Double.compare(s2.getRatePerSecond(), s1.getRatePerSecond()));
        return filteredSims.toArray(new Sim[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sim[] sims = new Sim[5];

        for (int i = 0; i < 5; i++) {
            sims[i] = new Sim(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextDouble(), sc.next());
        }

        String circle1 = sc.next();
        String circle2 = sc.next();

        Sim[] result = Solution.transferCircle(sims, circle1, circle2);
        for (Sim sim : result) {
            System.out.println(sim.getSimId() + " " + sim.getCustomerName() + " " + sim.getCircle() + " "
                    + sim.getRatePerSecond());
        }

        sc.close();
    }
}
