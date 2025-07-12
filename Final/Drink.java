package Final;

import java.util.Map;
import java.util.Optional;

public class Drink {
    private static Optional<Integer> parseString(String x){
        try {
            int i = Integer.parseInt(x);
            return Optional.of(i);
        } catch (Exception e) {
            return Optional.empty();
        }
    }
    public static void main(String[] args) {
        Map<String, String> m = Map.ofEntries(
            Map.entry("Cold Brew Coffee", "0"),
            Map.entry("Iced Green Tea", "12"),
            Map.entry("Sparkling Water", "N/A"),
            Map.entry("Lemonade", "28"),
            Map.entry("Berry Smoothie", "N/A"),
            Map.entry("Orange Juice", "23")
        );
        m.entrySet().stream().filter(e -> (parseString(e.getValue()).isPresent()))
        .filter(e -> e.getKey().toLowerCase().contains("juice") || e.getKey().equalsIgnoreCase("smoothie"))
        .filter(e -> (parseString(e.getValue()).get() < 30))
        .sorted(Map.Entry.comparingByValue())
        .sorted(Map.Entry.comparingByKey())
        .forEach(e -> System.out.println(String.format(e.getKey() + ": " + e.getValue())));
    }
}