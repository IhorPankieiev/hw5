package task3;

import task2.Zoo;

import java.util.ArrayList;

public class ZooNew extends Zoo {

    public static void main(String[] args) {
        Zoo newZoo = new Zoo();
        newZoo.zoo();
        newZoo.animals.remove(6);
        newZoo.animals.remove(4);
        newZoo.animals.remove(2);

        System.out.println("Size: " + newZoo.animals.size());
        System.out.println(newZoo.animals.toString());
    }
}
