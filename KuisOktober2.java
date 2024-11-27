import java.util.Scanner;

public class KuisOktober2 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Masukkan sebuah angka : ");
        int a = scanner.nextInt();
        
        for (int i=0; i<= 10; i++){
            int hitung = i*a;
            System.out.printf("%d\t%d\n",i,hitung);
        }
        
    }
}
