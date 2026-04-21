package com.hello;
public class HelloApp {
    public static void main(String[] args) {
        // Check if arguments exist to avoid ArrayIndexOutOfBoundsException
        if (args.length > 0) {
            // Get the name from the first command-line argument
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            // Default fallback if no argument is provided
            System.out.println("Hello, World!");
        }
    }
}