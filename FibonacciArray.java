import java.util.Scanner;

public class FibonacciArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah deretan Fibonacci? ");
        int jumlah = scanner.nextInt();
        
        int[] fibonacci = new int[jumlah];
        
        if (jumlah > 0) {
            fibonacci[0] = 0; 
        }
        if (jumlah > 1) {
            fibonacci[1] = 1; 
        }
        
        for (int i = 2; i < jumlah; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]; 
        }
        
        for (int i = 0; i < jumlah; i++) {
            System.out.print(fibonacci[i] + " "); 
        }
        
    }
}
