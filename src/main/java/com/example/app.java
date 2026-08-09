package com.example;

public class App {

    public static void main(String[] args) {

        System.out.println("Hello from Private EC2!");
        System.out.println("Application deployed using GitHub Actions + AWS SSM");

        while (true) {
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}