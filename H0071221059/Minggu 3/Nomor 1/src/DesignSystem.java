import java.awt.Color;

public class DesignSystem {
    //attribute
    private String name;
    private int version;
    private Color PrimaryColor;

    //Constructor
    public DesignSystem(String name, int version) {
        this.name = name;
        this.version = version;
        this.PrimaryColor = Color.RED;
    }
    public void updateVersion() {
        this.version++;
    }

    public void addName(String name) {
        this.name += " " + name;
    }

    public void setPrimaryColor(Color color) {
        this.PrimaryColor = color;
    }

    //getter
    public String getName() {
        return this.name;
    }

    public int getVersion() {
        return this.version;
    }

    public Color getPrimaryColor() {
        return this.PrimaryColor;
    }

    public static void main(String[] args) {
        //create a new design system with new = "MyDesignSystem", version 1, and primary color red
        DesignSystem mydesignSystem = new DesignSystem("MyDesignSystem", 1);

        //print the initial state of the design system
        System.out.println();
        System.out.println("Name " + mydesignSystem.getName());
        System.out.println("Version " + mydesignSystem.getVersion());
        System.out.println("Primary color " + mydesignSystem.getPrimaryColor());

        //update the version of the design system
        mydesignSystem.updateVersion();

        // set a new primary color dor the design system
        mydesignSystem.setPrimaryColor(Color.BLUE);

        //print the updated state od the design system
        System.out.println();
        System.out.println("Name " + mydesignSystem.getName());
        System.out.println("Version " + mydesignSystem.getVersion());
        System.out.println("Primary color " + mydesignSystem.getPrimaryColor());

        //Create another design system with name "OtherDesignSystem" and version 2
        DesignSystem otherdesignSystem = new DesignSystem("OtherDesignSystem", 2);

        //print the initial state of the other design  system
        System.out.println("name: " + otherdesignSystem.getName());
        System.out.println("Version: " + otherdesignSystem.getVersion());
        System.out.println("Primarly Color: " + otherdesignSystem.getPrimaryColor());

        //update the version of the other design system
        otherdesignSystem.updateVersion();

        // print the final state of the other design system
        System.out.println("Name " + otherdesignSystem);
        System.out.println("Version "+ otherdesignSystem.getVersion());
        System.out.println("Primary color: " + otherdesignSystem.getPrimaryColor());

        // update the version of the other design system
        otherdesignSystem.addName("NewName");

        // print the final state of the other design system
        System.out.println("Name " + otherdesignSystem.getName());
        System.out.println("Name " + otherdesignSystem.getVersion());
        System.out.println("Name " + otherdesignSystem.getPrimaryColor());

    }
}