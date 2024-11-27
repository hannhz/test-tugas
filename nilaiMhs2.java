import java.util.Scanner;

public class nilaiMhs2 {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Mahasiswa: ");
        System.out.println();
        int mhs= input.nextInt();
        
        int[][] data= new int[2][mhs];
        
        String[] matkul=new String[2];
        matkul[0]="OOP";
        matkul[1]="MTK";
        
        //versi bapaknya lebih ringkas
        for (int i=0;i<matkul.length;i++){
            System.out.println("Data Nilai " + matkul[i]);
            System.out.println("===================");
            for (int f=0;f<mhs;f++){
                System.out.print("Nilai mahasiswa ke-"+f);
                data[i][f]=input.nextInt();
            }
        }
        
        System.out.println();
        System.out.printf("Hasil Data Input \n==============\n");
        for (int i=0;i<matkul.length;i++){
            System.out.println(matkul[i]);
            for (int f=0;f<i;f++){
                System.out.println(data[i][f]);
            }
            System.out.println("===================");
        }
        
        //versi bapaknya        
        /*System.out.println("Data Nilai OOP");
        System.out.println("===============");
        for (int i=0;i<mhs;i++){
            System.out.print("Nilai mahasiswa ke-"+(1+i)+":");
            data[i][0]=input.nextInt();
        }
        
        System.out.println();
        System.out.println("Data Nilai MTK");
        System.out.println("===============");
        for (int i=0;i<mhs;i++){
            System.out.print("Nilai mahasiswa ke-"+(1+i)+":");
            data[i][1]=input.nextInt();
        }
        
        System.out.println();
        System.out.println("Hasil isian data nilai");
        System.out.println("========================");
                     
        System.out.printf("OOP ");
        for (int i=0;i<mhs;i++){
            System.out.printf("%d ",data[i][0]);
        }        
        
        System.out.printf("\n===============\n");
        System.out.printf("MTK ");
        for (int i=0;i<mhs;i++){
            System.out.printf("%d ",data[i][1]);
        }*/
        
        //versi chatgpt
        /*for (int i=0; i<mhs; i++){
            System.out.println("Masukkan nilai mahasiswa ke-"+ (i+1));
            System.out.print("Nilai OOP: ");
            data[i][0] = input.nextInt();
            System.out.print("Nilai MTK: ");
            data[i][1] = input.nextInt();
        }
        
        System.out.printf("\nOOP\tMTK\n");
        for (int i=0; i<mhs; i++){
            System.out.printf("%d\t%d\n", data[i][0],data[i][1]);
        }*/
        
    }
}
