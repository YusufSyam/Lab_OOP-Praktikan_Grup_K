class Employee {
    private String name, position;
    private int id, age, salery;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalery() {
        return salery;
    }

    public void setSalery(int salery) {
        this.salery = salery;
    }

    public Employee () {
    }

    public Employee (String name, String position, int id, int age, int salery) {
        this.name = name;
        this.position = position;
        this.id = id;
        this.age = age;
        this.salery = salery;
    }

    public void displayInfo () {
        System.out.println("Name : " + this.name);
        System.out.println("Position : " + this.position);
        System.out.println("Id : " + this.id);
        System.out.println("Umur : " + this.age);
        System.out.println("Salery : " + this.salery);
    }
}


public class Company {
    
    public static void main(String[] args) {
        Employee emp1 = new Employee ();
        emp1.setName("Fikry");
        emp1.setPosition("Staff");
        emp1.setId(1102);
        emp1.setAge(19);
        emp1.setSalery(3500000);
        emp1.displayInfo();
        System.out.println();
        
        Employee emp2 = new Employee ("Zul" , "Customer Service" , 1775, 19, 3000000);
        emp2.displayInfo();
        // System.out.println("Nama " + emp2.getName());
        // System.out.println("Position : " + emp2.getPosition());
        // System.out.println("Id : " + emp2.getId());
        // System.out.println("Age : " + emp2.getAge());
        // System.out.println("Salery : " + emp2.getSalery());
        System.out.println();

        SelfUtils.displaySelfData();   
    }
}
