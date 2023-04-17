public class Laptop {

  // Attribute
  private String brand;
  private int ramSize;
  private Processor processor; // user defined variable sebagai objek

  // Constructors
  public Laptop() {
      this.brand = "MSI";
      this.ramSize = 4;
      this.processor = new Processor("Intel", "i5"); // inisialisasi processor
  }

  public Laptop(String brand, int ramSize, Processor processor) {
      this.brand = brand;
      this.ramSize = ramSize;
      this.processor = processor;
  }

  // Behaviours
  public void printSpecs() {
      System.out.println("==========================");
      System.out.println("Brand: " + this.brand);
      System.out.println("RAM size: " + this.ramSize + " GB");
      System.out.println("Processor: " + this.processor.getBrand() + " " + this.processor.getModel());
      System.out.println("==========================");
  }

  public void upgradeRam(int additionalSize) {
      this.ramSize += additionalSize;
      System.out.println("RAM size upgraded to " + this.ramSize + " GB");
  }

  // Getter dan setter untuk attribute brand
  public String getBrand() {
      return this.brand;
  }

  public void setBrand(String brand) {
      this.brand = brand;
  }

  // Getter dan setter untuk attribute ramSize
  public int getRamSize() {
      return this.ramSize;
  }

  public void setRamSize(int ramSize) {
      this.ramSize = ramSize;
  }

  // Getter dan setter untuk attribute processor
  public Processor getProcessor() {
      return this.processor;
  }

  public void setProcessor(Processor processor) {
      this.processor = processor;
  }
}

// Class Processor sebagai objek dalam class Laptop
class Processor {
  private String brand;
  private String model;

  public Processor(String brand, String model) {
      this.brand = brand;
      this.model = model;
  }

  public String getBrand() {
      return this.brand;
  }

  public String getModel() {
      return this.model;
  }
}
