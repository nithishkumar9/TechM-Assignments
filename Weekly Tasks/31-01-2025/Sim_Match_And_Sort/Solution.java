package Sim_Match_And_Sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Sim {
    private int id;
    private String company;
    private int balance;
    private double ratePerSecond;
    private String circle;

    public Sim(int id, String company, int balance, double ratePerSecond, String circle) {
        this.id = id;
        this.company = company;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }

    public int getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public int getBalance() {
        return balance;
    }

    public double getRatePerSecond() {
        return ratePerSecond;
    }

    public String getCircle() {
        return circle;
    }
}

class Solution {
    public static Sim[] matchAndSort(Sim[] sims, String searchCircle, double searchRate) {
        List<Sim> filteredSims = new ArrayList<>();
        for (Sim sim : sims) {
            if (sim.getCircle().equalsIgnoreCase(searchCircle) && sim.getRatePerSecond() < searchRate) {
                filteredSims.add(sim);
            }
        }
        filteredSims.sort((s1, s2) -> s2.getBalance() - s1.getBalance());
        return filteredSims.toArray(new Sim[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sim[] sims = new Sim[4];

        for (int i = 0; i < 4; i++) {
            sims[i] = new Sim(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextDouble(), sc.next());
        }

        String searchCircle = sc.next();
        double searchRate = sc.nextDouble();

        Sim[] result = Solution.matchAndSort(sims, searchCircle, searchRate);
        for (Sim sim : result) {
            System.out.println(sim.getId());
        }

        sc.close();
    }
}
