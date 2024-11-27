import java.util.Scanner;

public class KuisOktober {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Masukkan pasangan angka");
        System.out.print("Angka 1 :");
        int bil1 = scanner.nextInt();
        System.out.print("Angka 2 :");
        int bil2 = scanner.nextInt();
        System.out.print("Angka 3 :");
        int bil3 = scanner.nextInt();
        
        if(bil1==bil2){
            System.out.println("Terdapat angka yang berpasangan yakni :"+bil2);
        } if (bil2==bil3){
            System.out.println("Terdapat angka yang berpasangan yakni :"+bil2);
        } if (bil1==bil3){
            System.out.println("Terdapat angka yang berpasangan yakni :"+bil1);
        } else {
            System.out.println("Tidak ada angka yang sama");
        }
        
    }
}
