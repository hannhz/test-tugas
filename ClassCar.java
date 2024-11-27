public class ClassCar{
    private String color;
    private String brand;
    private String model;
    
    public ClassCar(String c, String b, String m){
        color = c;
        brand = b;
        model = m;
    }
    
    public void printer(){
        System.out.println("Brand mobil : "+brand);
        System.out.println("Warna mobil : "+color);
        System.out.println("Model Mobil : "+model);
        System.out.println();
    }
    
}