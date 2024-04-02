package chapter01;

class AppleFancyFormatter implements AppleFormatter{
    public String accept(Apple apple){
        String characteristic = apple.getWeight() > 150 ? "heavy" : "light";

        return "A " + characteristic + " " + apple.getColor() + " apple";
    }
}