package task6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();
        teachers.add("Ніна Філіповна");
        teachers.add("Алла Іванівна");
        teachers.add("Тамара Михайлівна");

        //index of the best teacher
        System.out.println(teachers.indexOf("Ніна Філіповна"));
        //index of "not so good" teacher
        System.out.println(teachers.indexOf("Тамара Михайлівна"));

        System.out.println(teachers.get(0) + "," + teachers.get(2));
        System.out.println(teachers.toString());
    }
}
