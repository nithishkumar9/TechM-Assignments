package Player_Get_Average_of_Runs;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Player {
    private int id;
    private String name;
    private int iccRank;
    private int matchesPlayed;
    private int runsScored;

    public Player(int id, String name, int iccRank, int matchesPlayed, int runsScored) {
        this.id = id;
        this.name = name;
        this.iccRank = iccRank;
        this.matchesPlayed = matchesPlayed;
        this.runsScored = runsScored;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public double getAverageRuns() {
        return (double) runsScored / matchesPlayed;
    }
}

class Solution {
    public static double[] findAverageOfRuns(Player[] players, int target) {
        List<Double> averages = new ArrayList<>();
        for (Player player : players) {
            if (player.getMatchesPlayed() >= target) {
                averages.add(player.getAverageRuns());
            }
        }
        return averages.stream().mapToDouble(Double::doubleValue).toArray();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player[] players = new Player[4];

        for (int i = 0; i < 4; i++) {
            players[i] = new Player(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        int target = sc.nextInt();

        double[] averages = Solution.findAverageOfRuns(players, target);
        for (double avg : averages) {
            if (avg >= 80 && avg <= 100) {
                System.out.println("Grade A");
            } else if (avg >= 50 && avg < 80) {
                System.out.println("Grade B");
            } else {
                System.out.println("Grade C");
            }
        }

        sc.close();
    }

}
