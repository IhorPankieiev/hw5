package task5;

import java.util.ArrayList;
import java.util.Collections;

public class Friends {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Ross");
        friends.add("Monica");
        friends.add("Chandler");
        friends.add("Rachel");
        friends.add("Joey");
        friends.add("Pheobe");

        System.out.println(friends.toString());

        Collections.sort(friends);

        System.out.println(friends.toString());
    }
}
