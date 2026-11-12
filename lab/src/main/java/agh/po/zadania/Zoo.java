package agh.po.zadania;

import agh.po.animals.Animal;
import agh.po.animals.Dog;
import agh.po.animals.Parrot;
import agh.po.animals.Snake;

import java.util.Random;

public class Zoo {

    Animal[] animals = new Animal[100];

    public void fillAnimals() {
        Random random = new Random();
        for (int i = 0; i < animals.length; i++) {
            int type = random.nextInt(3);
            if (type == 0) {
                animals[i] = new Parrot("Parrot" + i);
            } else if (type == 1) {
                animals[i] = new Dog("Dog" + i);
            } else {
                animals[i] = new Snake("Snake" + i);
            }
        }
    }

    public int sumLegs() {
        int sum = 0;
        for (Animal animal : animals) {
            sum += animal.getLegs();
        }
        return sum;
    }

    public void describeAll() {
        for (Animal animal : animals) {
            System.out.println(animal.getDescription());
            int legs = animal.getLegs();
            animal.makeSound();
        }
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.fillAnimals();
        zoo.describeAll();
        System.out.println("Suma nóg: " + zoo.sumLegs());
    }
}