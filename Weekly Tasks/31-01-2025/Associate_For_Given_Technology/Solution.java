package Associate_For_Given_Technology;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Associate {
    private int id;
    private String name, technology;
    private int experienceInYears;

    public Associate(int id, String name, String technology, int experienceInYears) {
        this.id = id;
        this.name = name;
        this.technology = technology;
        this.experienceInYears = experienceInYears;
    }

    public int getId() {
        return id;
    }

    public String getTechnology() {
        return technology;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }
}

class Solution {
    public static Associate[] associatesForGivenTechnology(Associate[] associates, String searchTechnology) {
        List<Associate> result = new ArrayList<>();
        for (Associate associate : associates) {
            if (associate.getTechnology().equalsIgnoreCase(searchTechnology)
                    && associate.getExperienceInYears() % 5 == 0) {
                result.add(associate);
            }
        }
        return result.toArray(new Associate[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Associate[] associates = new Associate[5];

        for (int i = 0; i < 5; i++) {
            associates[i] = new Associate(sc.nextInt(), sc.next(), sc.next(), sc.nextInt());
        }

        Associate[] filteredAssociates = Solution.associatesForGivenTechnology(associates, sc.next());

        for (Associate associate : filteredAssociates) {
            System.out.println(associate.getId());
        }

        sc.close();
    }
}
