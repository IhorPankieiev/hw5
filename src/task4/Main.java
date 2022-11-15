package task4;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(23);
        numList.add(66);
        numList.add(17);

        ListIterator<Integer> listIterator = numList.listIterator();

        while (listIterator.hasNext()){
            Integer num = listIterator.next() + 1;
            System.out.println(num);
        }
    }
}
