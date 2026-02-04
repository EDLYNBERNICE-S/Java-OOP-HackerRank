// Demonstrates method overriding and inheritance in Java
// ProfessionalCricket extends SportActivity and overrides the player count

class SportActivity {
    String getTitle() {
        return "Generic Physical Activity";
    }

    void showRosterInfo() {
        System.out.println("The roster count varies for " + getTitle());
    }
}

class ProfessionalCricket extends SportActivity {
    // Specifically overriding the name of the activity
    @Override
    String getTitle() {
        return "Cricket Matches";
    }

    // Overriding the method to provide sport-specific data
    @Override
    void showRosterInfo() {
        System.out.println("There are 11 active players on the field for " + getTitle());
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        // Instantiate the base class
        SportActivity genericObj = new SportActivity();
        
        // Instantiate the specialized subclass
        ProfessionalCricket cricketObj = new ProfessionalCricket();

        // Print generic sport details
        System.out.println(genericObj.getTitle());
        genericObj.showRosterInfo();

        // Print specific cricket details via overridden methods
        System.out.println(cricketObj.getTitle());
        cricketObj.showRosterInfo();
    }
}
