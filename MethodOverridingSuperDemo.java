// Demonstrates the use of 'super' to access parent class methods
// MotorizedBike inherits from BasicBike and references its definition

class BasicBike {
    String getDefinition() {
        return "a human-powered transport with pedals.";
    }
}

class MotorizedBike extends BasicBike {
    @Override
    String getDefinition() {
        return "a high-speed cycle equipped with an engine.";
    }

    MotorizedBike() {
        // Display the current class definition
        System.out.println("Status: I am a motorcycle, defined as " + getDefinition());

        // Accessing the parent class (ancestor) logic using 'super'
        // This replaces the 'BiCycle b = new BiCycle()' approach with better OOP practice
        String ancestorDefinition = super.getDefinition();

        System.out.println("History: My predecessor was " + ancestorDefinition);
    }
}

public class VehicleInheritance {
    public static void main(String[] args) {
        // Initializing the subclass triggers the constructor logic
        MotorizedBike myBike = new MotorizedBike();
    }
}
