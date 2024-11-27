public class NilaiMhs {
    public static void main (String args[]){
        
        String namaMhs[]={"Ahmad", "Adang", "Dani", "Edi"};
        int data[][]=new int[4][3];
        
        // RPL
        data[0][0] = 81; 
        data[1][0] = 50; 
        data[2][0] = 89; 
        data[3][0] = 77; 
        //BD
        data[0][1] = 90; 
        data[1][1] = 83;
        data[2][1] = 55;
        data[3][1] = 70;
        //PBO
        data[0][2] = 62;
        data[1][2] = 87;
        data[2][2] = 65;
        data[3][2] = 92;
        
        double total;
        
        System.out.println("NRP\tRata-Rata");
        System.out.println("=================");
        
        for (int x =0; x<data.length; x++){
            total=0;
            for (int y=0; y<data[x].length;y++){
                total += data[x][y];
            }
            double rata = total / data[x].length;
            System.out.printf("%d \t %.2f\n",(x+1), rata);
        }
        
        System.out.println("=================");
    }
}
