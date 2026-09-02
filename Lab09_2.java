package oop.lsp;

import java.util.ArrayList;
import java.util.List;

public class Lab09_2 {
    public static void main(String[] args) {
        List<Moveable> birds = new ArrayList<>();
        birds.add(new Penguin());
        birds.add(new Sparrow());
        birds.add(new Ostrich());
        birds.add(new Eagle());

        System.out.println("All birds can move:");
        for (Moveable bird : birds) {
            makeItMove(bird);
        }

        List<Flyable> flyingBirds = new ArrayList<>();
        flyingBirds.add(new Sparrow());
        flyingBirds.add(new Eagle());

        System.out.println("\nOnly flying birds use fly():");
        for (Flyable bird : flyingBirds) {
            makeItFly(bird);
            makeItMove(bird);
        }
    }

    private static void makeItMove(Moveable bird) {
        bird.move();
    }

    private static void makeItFly(Flyable bird) {
        bird.fly();
    }
}
