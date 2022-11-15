package task2;

import java.util.ArrayList;

public class Zoo {
    public ArrayList<String> animals;
    public void zoo(){
        animals= new ArrayList<>();
        animals.add(0,"Tiger");
        animals.add(1, "Lion");
        animals.add(2,"Bison");
        animals.add(3, "Wolf");
        animals.add(4,"Fox");
        animals.add(5,"Elephant");
        animals.add(6,"Python");
        animals.add(7,"Monkey");
    }

    public Zoo() {
    }

    public static void main(String[] args) {
        Zoo myZoo = new Zoo();
        myZoo.zoo();
        System.out.println(myZoo.animals);
    }
}
