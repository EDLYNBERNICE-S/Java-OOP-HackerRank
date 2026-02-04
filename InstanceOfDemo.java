import java.util.ArrayList;
import java.util.Scanner;

// Descriptive class names for a Zoo theme
class Mammal { }
class Reptile { }
class Bird { }

public class ZooAnalytics {

    /**
     * Categorizes and counts animals based on their species type.
     * Demonstrates the use of the 'instanceof' operator in Java.
     */
    static String generateSpeciesReport(ArrayList<Object> animalRegistry) {
        int mammalCount = 0;
        int reptileCount = 0;
        int birdCount = 0;

        for (int i = 0; i < animalRegistry.size(); i++) {
            Object currentAnimal = animalRegistry.get(i);

            // Logic remains identical to the original but with new names
            if (currentAnimal instanceof Mammal) {
                mammalCount++;
            }
            if (currentAnimal instanceof Reptile) {
                reptileCount++;
            }
            if (currentAnimal instanceof Bird) {
                birdCount++;
            }
        }
        // Returns the formatted results
        return mammalCount + " " + reptileCount + " " + birdCount;
    }

    public static void main(String[] args) {
        ArrayList<Object> zooList = new ArrayList<Object>();
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int entryTotal = sc.nextInt();

            for (int j = 0; j < entryTotal; j++) {
                String species = sc.next();

                // Mapping the strings to our new classes
                if (species.equalsIgnoreCase("Student")) zooList.add(new Mammal());
                if (species.equalsIgnoreCase("Rockstar")) zooList.add(new Reptile());
                if (species.equalsIgnoreCase("Hacker")) zooList.add(new Bird());
            }
        }

        System.out.println(generateSpeciesReport(zooList));
        sc.close();
    }
}
