package me.jangroen.gradle_multiproject_test;

public final class HelloWorldGreeter implements Greeter {
    @Override
    public void greet() {
        System.out.println("Hello World!");
    }
}
