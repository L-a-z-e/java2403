package chapter01;

import java.util.Arrays;
import java.util.List;

import static chapter01.Apple.filterApples;
import static chapter01.Apple.filterHeavyApples;

public class FilterlingApples {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(
                new Apple(80, "green"),
                new Apple(155,"green"),
                new Apple(120, "red")
        );

        List<Apple> greenApples = filterApples(inventory, Apple::isGreenApple);
        System.out.println(greenApples);

        List<Apple> heavyApples = filterApples(inventory, Apple::isHeavyApple);
        System.out.println(heavyApples);

        List<Apple> lambdaGreenApples = filterApples(inventory, (Apple a) -> "green".equals(a.getColor()));
        System.out.println(lambdaGreenApples);

        List<Apple> lambdaHeavyApples = filterApples(inventory, (Apple a) -> a.getWeight() > 150);
        System.out.println(lambdaHeavyApples);

    }

}
