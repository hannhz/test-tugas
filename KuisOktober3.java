import java.util.Scanner;

public class KuisOktober3 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        
        ClassCar myCar=new ClassCar("Red", "Dodge", "Charger");
        ClassCar helensCar=new ClassCar ("Blue", "Nissan", "Ultima");
        
        myCar.printer();
        helensCar.printer();
        
        Mulai:
        while (true){            
            System.out.print("Apakah ada data yang ingin dimasukkan? (y/n)");
            String jawab = scanner.nextLine();
            if (jawab.equals("n")) {
                break Mulai;
            }
            
            System.out.print("Masukkan Brand Mobil : ");
            String brand = scanner.nextLine();
            System.out.print("Masukkan Warna Mobil : ");
            String color = scanner.nextLine();
            System.out.print("Masukkan Model Mobil : ");
            String model = scanner.nextLine();
            
            ClassCar userCar=new ClassCar(color, brand, model);
            System.out.println();
            userCar.printer();
            
            System.out.print("Apakah ada data lain? (y/n)");
            jawab = scanner.nextLine();
            if (jawab.equals("y")){
                continue Mulai;
            } else {
                break Mulai;
            }            
        }
        
        Edit:
        while(true){
            System.out.print("Apakah ada data yang ingin diubah? (y/n)");
            String jawab = scanner.nextLine();
            if (jawab.equals("n")) {
                break Edit;
            }
            
            
            
        }
        
    }
}
