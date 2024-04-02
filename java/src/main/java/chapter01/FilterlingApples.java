package chapter01;

import java.util.Arrays;
import java.util.List;

import static chapter01.Apple.*;

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

        prettyPrintApple(inventory, new AppleFancyFormatter());
        prettyPrintApple(inventory, new AppleSimpleFormatter());

        List<Apple> greenPredicate = filterApplesPredicate(inventory, new AppleGreenColorPredicate());
        List<Apple> heavyPredicate = filterApplesPredicate(inventory, new AppleHeavyWeightPredicate());
        List<Apple> heavyAndGreenPredicate = filterApplesPredicate(inventory, new AppleHeavyAndGreenPredicate());

        System.out.println(greenPredicate);
        System.out.println(heavyPredicate);
        System.out.println(heavyAndGreenPredicate);
    }

}
