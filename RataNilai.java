public class RataNilai {
    public static void main(String args[]) {
        
        String[] namaMhs = {"Ahmad", "Adang", "Dani", "Edi"};
        int nilai[][] = new int[4][3];
        
        
        nilai[0][0] = 81; nilai[0][1] = 90; nilai[0][2] = 62; 
        nilai[1][0] = 50; nilai[1][1] = 83; nilai[1][2] = 87; 
        nilai[2][0] = 89; nilai[2][1] = 55; nilai[2][2] = 65; 
        nilai[3][0] = 77; nilai[3][1] = 70; nilai[3][2] = 92; 
        
        
        System.out.println("NRP \t Rata-rata");
        System.out.println("--------------------------");

        
        for (int i = 0; i < nilai.length; i++) {
            double totalNilai = 0; 
            for (int j = 0; j < nilai[i].length; j++) {
                totalNilai += nilai[i][j]; 
            }
            double rataRata = totalNilai / nilai[i].length; 
            System.out.println((i + 1) + "\t " + String.format("%.2f", rataRata)); 
        }
        System.out.println("--------------------------");
    }
}
