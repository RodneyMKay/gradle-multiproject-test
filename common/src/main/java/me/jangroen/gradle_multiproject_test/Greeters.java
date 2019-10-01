package me.jangroen.gradle_multiproject_test;

import java.lang.reflect.InvocationTargetException;

public class Greeters {
    public static void greetHelloWorld() {
        try {
            Greeter greeter = (Greeter) Class.forName("me.jangroen.gradle_multiproject_test.HelloWorldGreeter").getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
