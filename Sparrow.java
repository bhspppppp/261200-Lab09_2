package oop.lsp;

public class Sparrow implements Flyable {
    @Override
    public void move() {
        System.out.println("Sparrow hops on the ground.");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow flies over the garden.");
    }
}
