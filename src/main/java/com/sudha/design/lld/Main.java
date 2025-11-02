package com.sudha.design.lld;

public class Main {
    static void main() {
        System.out.println("Hello World!");
        System.out.println(Constants.marker);
        System.out.println("Running cars lld!");
        com.sudha.design.lld.cars.Main.main();
        System.out.println(Constants.marker);
        System.out.println("Running ducks game!");
        com.sudha.design.lld.ducks.Main.main();
        System.out.println(Constants.marker);
    }
}
