package liveCoding;

public class Country { //1. buat kelas Country
    //2.attribute
    private String name;
    private String capital;
    private String headOfState;
    private int population;
    private String language;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getHeadOfState() {
        return headOfState;
    }

    public void setHeadOfState(String headOfState) {
        this.headOfState = headOfState;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Country(){}

    public Country(String name, String capital, String headOfState, int population, String language) {
        this.name = name;
        this.capital = capital;
        this.headOfState = headOfState;
        this.population = population;
        this.language = language;
    }


    // 6.behavior displayInfo()
    public void displayInfo(){
        System.out.println("-".repeat(45));
        System.out.println("Name\t\t\t: " + this.name);
        System.out.println("Capital\t\t\t: " + this.capital);
        System.out.println("Head Of State\t\t: " + this.headOfState);
        System.out.println("Population\t\t: " + this.population);
        System.out.println("Language\t\t: " + this.language);
        System.out.println("-".repeat(45));
    }
    
}