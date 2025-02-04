package Medicine_Get_Price_by_Disease;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Medicine {
    private String medicineName;
    private String batch;
    private String disease;
    private int price;

    public Medicine(String medicineName, String batch, String disease, int price) {
        this.medicineName = medicineName;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }

    public String getDisease() {
        return disease;
    }

    public int getPrice() {
        return price;
    }
}

class Solution {
    public static Integer[] getPriceByDisease(Medicine[] medicines, String disease) {
        List<Integer> prices = new ArrayList<>();
        for (Medicine medicine : medicines) {
            if (medicine.getDisease().equalsIgnoreCase(disease)) {
                prices.add(medicine.getPrice());
            }
        }
        Collections.sort(prices);
        return prices.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Medicine[] medicines = new Medicine[4];

        for (int i = 0; i < 4; i++) {
            medicines[i] = new Medicine(sc.next(), sc.next(), sc.next(), sc.nextInt());
        }

        String searchDisease = sc.next();
        
        Integer[] result = Solution.getPriceByDisease(medicines, searchDisease);
        for (int price : result) {
            System.out.println(price);
        }
        
        sc.close();
    }

}

