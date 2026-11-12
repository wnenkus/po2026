package agh.po.animals;

public class Snake extends Animal {

    public Snake(String name) {
        super(name, 0);
    }


    public String getDescription() {
        return "Waz " + name + " nie ma nog";
    }


    public void makeSound() {
        System.out.println(name + ": Sssss!");
    }
}