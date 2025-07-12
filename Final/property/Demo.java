package Final.property;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Demo {
    public static void main(String[] args) {
        List<Property> properties = new ArrayList<>();
        Property house1 = new Property("Chicago", "3", 200, 40, 5);
        properties.add(new Property("Fairfield", "1", 100, 50, 3));
        properties.add(new Property("Fairfield", "2", 100, 50, 4));
        properties.add(house1);
        Function<String, String> upperCase = (x) -> x.toUpperCase();
        System.out.println(upperCase.apply("Fairfield"));
        Function<Property, Integer> calcRent = x -> x.getBase() + x.getMonthlyFee();
        System.out.println(calcRent.apply(house1));
        Comparator<Property> comparator = (o1, o2) ->o2.getNumberOfBedroom() - o1.getNumberOfBedroom();
        var sorted = properties.stream().sorted(comparator).toList();
        System.out.println(sorted);
        BiConsumer<String, String> print = (firstName, lastName) -> {
            System.out.println(firstName + " " + lastName);
        };
        print.accept("Azeem", "Nguyen");
        BiFunction<String, String, String> reqIdGenereation = (o1, o2) -> o1 + "-" + o2;
        System.out.println(reqIdGenereation.apply("PROP77", "21"));
    }
}
