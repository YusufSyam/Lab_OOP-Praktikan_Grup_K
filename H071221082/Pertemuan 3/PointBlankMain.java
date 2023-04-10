public class PointBlankMain {
    public static void main(String[] args) {
      PointBlank zul = new PointBlank("Zul", 50, 5000, 2500);
      PointBlank fikri = new PointBlank("Fikri", 40, 6000, 1300);
    
      zul.tampilkanAkun();
      fikri.tampilkanAkun();
  
      zul.beliSenjata(2000);
      zul.ambilTitle(4000);
  
      zul.tampilkanAkun();
  
      zul.war(fikri);
      fikri.war(zul);
  
      zul.tampilkanAkun();
    }
  }