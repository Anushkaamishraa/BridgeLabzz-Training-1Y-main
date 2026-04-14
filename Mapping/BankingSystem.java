import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {

        HashMap<String, Double> accounts = new HashMap<>();

        accounts.put("A101", 5000.0);
        accounts.put("A102", 8000.0);
        accounts.put("A103", 3000.0);
        accounts.put("A104", 10000.0);

        String acc = "A101";
        double deposit = 2000;
        accounts.put(acc, accounts.get(acc) + deposit);

        double withdraw = 9000;
        if (accounts.get(acc) >= withdraw) {
            accounts.put(acc, accounts.get(acc) - withdraw);
        } else {
            System.out.println("Insufficient Balance");
        }

        List<Map.Entry<String, Double>> list = new ArrayList<>(accounts.entrySet());
        list.sort((a, b) -> Double.compare(b.getValue(), a.getValue()));

        System.out.println("All Customers Sorted:");
        for (Map.Entry<String, Double> e : list) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        System.out.println("Top 3 Customers:");
        for (int i = 0; i < Math.min(3, list.size()); i++) {
            System.out.println(list.get(i));
        }
    }
}