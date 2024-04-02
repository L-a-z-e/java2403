package chapter01;

class AppleSimpleFormatter implements AppleFormatter{
    @Override
    public String accept(Apple apple) {
        return "An apple of " + apple.getWeight() + "g";
    }
}
