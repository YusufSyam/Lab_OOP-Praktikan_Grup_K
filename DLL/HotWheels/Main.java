package DLL.HotWheels;

public class Main {
  public static void main(String[] args) {
    HotWheels audi = new HotWheels("Audi", 4, 20000);
    HotWheels maverick = new HotWheels("Maverick", 4, 50000);
  
    audi.tampilkanSpek();
    maverick.tampilkanSpek();

    maverick.upgrade(50000);

    maverick.tampilkanSpek();

    maverick.balap(audi);
    audi.balap(maverick);

    maverick.tampilkanSpek();
  }
}
