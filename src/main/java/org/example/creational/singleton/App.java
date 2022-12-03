package org.example.creational.singleton;

public class App {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Singleton singleton = Singleton.getSingleton();
            System.out.println(i);

        }

    }
}
