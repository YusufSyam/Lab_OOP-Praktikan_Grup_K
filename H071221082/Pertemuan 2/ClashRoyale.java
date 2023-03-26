public class ClashRoyale {
    private String name;
    private int elixir;
    private int arena;

    public ClashRoyale(String name, int elixir, int arena) {
        this.name = name;
        this.elixir = elixir;
        this.arena = arena;
    }
    // overload
    public ClashRoyale(String name){
        this.name = name;
    }
    
    // behaviors
    String getName() {
        return this.name;
    }

    public void pekka() {
        this.elixir = 7;
        this.arena = 6;
        System.out.println("Nama saya " + this.name);
        System.out.println("Saya membutuhkan " + this.elixir + " elixir untuk digunakan");
        System.out.println("Saya bisa didapatkan di arena " + this.arena);
    }
    
    public void hogRider() {
        this.elixir = 4;
        this.arena = 5;
        System.out.println("Nama saya " + this.name);
        System.out.println("Saya membutuhkan " + this.elixir + " untuk digunakan");
        System.out.println("Saya bisa didapatkan di arena " + this.arena);
    }

    public void knight() {
        this.elixir = 3;
        this.arena = 1;
        System.out.println("Nama saya " + this.name);
        System.out.println("Saya membutuhkan " + this.elixir + " untuk digunakan");
        System.out.println("Saya bisa didapatkan di arena " + this.arena);
    }
}