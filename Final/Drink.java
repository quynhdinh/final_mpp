package Final;

import java.util.Map;

public class Drink {
    private static Double parseString(String x){
        try {
            double double1 = Double.parseDouble(x);
            return double1;
        } catch (Exception e) {
            return null;
        }
    }
    public static void main(String[] args) {
        Map<String, String> m = Map.ofEntries(
            Map.entry("Cold Brew Coffee", "0"),
            Map.entry("Iced Green Tea", "12"),
            Map.entry("Sparkling Water", "N/A"),
            Map.entry("Orange Juice", "23")
        );
        m.entrySet().stream().filter(e -> (parseString(e.getValue()) != null))
        .filter(e -> e.getKey().toLowerCase().contains("juice") || e.getKey().equalsIgnoreCase("smoothie"))
        .filter(e -> (parseString(e.getValue()) < 30))
        .sorted(Map.Entry.comparingByValue())
        .sorted(Map.Entry.comparingByKey())
        .forEach(e -> System.out.println(String.format(e.getKey() + ": " + e.getValue())));
    }
}
