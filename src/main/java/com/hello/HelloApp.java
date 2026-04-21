package com.hello;

public class HelloApp {
    public static void main(String[] args) {
        // Step 1: Set a default name
        String name = "World";

        // Step 2: Check if a command-line argument was provided
        // This prevents an ArrayIndexOutOfBoundsException
        if (args.length > 0) {
            name = args[0]; // Use the provided name
        }

        // Step 3: Display the personalized greeting
        System.out.println("Hello, " + name + "!");
    }
}