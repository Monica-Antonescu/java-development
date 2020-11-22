package src.main.java.homework3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MainHashMap {
    public static void main(String[] args) {
        HashMap<Persoana, List<Hobby>> personsHobbyMap = new HashMap<>();
        Hobby hobby1 = new Hobby("fotbal", 3, Arrays.asList("Romania", "Irlanda, Mexic"));
        Hobby hobby2 = new Hobby("baschet", 5, Arrays.asList("Romania", "UK, SUA"));
        Hobby hobby3 = new Hobby("inot", 7, Arrays.asList("Argentina", "China", "SUA"));

        personsHobbyMap.put(new Persoana("Georgel", 25), Arrays.asList(hobby1, hobby3));
        personsHobbyMap.put(new Persoana("Monica", 32), Arrays.asList(hobby1, hobby2, hobby3));

        System.out.println(personsHobbyMap);
    }
}
