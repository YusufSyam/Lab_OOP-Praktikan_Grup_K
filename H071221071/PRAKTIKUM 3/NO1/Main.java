public class Main {
  public static void main(String[] args) {
      // membuat objek laptop dengan constructor default
      Laptop laptop1 = new Laptop();
      laptop1.printSpecs();

      // membuat objek laptop dengan constructor parameter
      Processor processor2 = new Processor("AMD", "Ryzen 7");
      Laptop laptop2 = new Laptop("ASUS", 8, processor2);
      laptop2.printSpecs();

      // mengubah attribute brand dengan setter
      laptop1.setBrand("Lenovo");
      laptop1.printSpecs();

      // mengubah attribute processor dengan setter
      Processor processor3 = new Processor("Intel", "i7");
      laptop2.setProcessor(processor3);
      laptop2.printSpecs();

      // mengubah attribute ramSize dengan behaviour upgradeRam()
      laptop1.upgradeRam(4);
      laptop1.printSpecs();
  }
}
