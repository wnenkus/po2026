package agh.po.animals;

public class Parrot extends Animal {

    public Parrot(String name) {
        super(name, 2);
    }


    public String getDescription() {
        return "Papuga " + name + " ma " + legs + " nogi";
    }


    public void makeSound() {
        System.out.println(name + ": Kra kra!");
    }
}