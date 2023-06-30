package javabasics._fibonacci;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KingdomOfRom {
    public static void main(String[] args) {
        // Create a not-mutable List
        List<String> cityNames = Arrays.asList("Istanbul", "Ankara", "Adana");
        // cityNames.add("London"); it cannot be added because the list is NOT-MUTABLE.

        //Set is an allowed method on a NOT mutable List
        cityNames.set(1, "Tegucigalpa");
        System.out.println("City Name: " + cityNames);

        //Create an empty MUTABLE List
        List<String> kingdomOfRom = new ArrayList<>();

        //Let's add all 7 kings of ROME
        kingdomOfRom.add("Romulus");
        kingdomOfRom.add("Numa Pompilius");
        kingdomOfRom.add("Tullus Hostilius");
        kingdomOfRom.add("Ancus Marcius");
        kingdomOfRom.add("Lucius Tarquinius Pariscus");
        kingdomOfRom.add("Servius Tullius");
        kingdomOfRom.add("Lucius Taquinius Superbus");

        System.out.println(" Kings Of Rome :" + kingdomOfRom);

        // Do conversion and the type of array is defined using "new String[0]"
        String[] kingsOfRomeArray = kingdomOfRom.toArray(new String[0]);
        for (String s : kingsOfRomeArray) {
            System.out.println(s);
        }

        // edit the 7th king's value
        kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";
        System.out.println("Kings Of Rome Array = : " + Arrays.toString(kingsOfRomeArray));


        int n = 25;
        for (int i = 5; i <= n; i++) {
            System.out.println(i);
        }

    }
}
