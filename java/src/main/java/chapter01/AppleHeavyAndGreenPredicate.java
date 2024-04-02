package chapter01;

class AppleHeavyAndGreenPredicate implements ApplePredicate{
    public boolean test(Apple apple){
        return apple.getWeight() > 150 && apple.getColor().equals("green");
    }
}
