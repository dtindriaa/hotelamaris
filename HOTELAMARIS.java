package dita.program;
public class HOTELAMARIS {
    public static void main(String[] args) {
        String[][]Kamar = {
            {"1","2","3","X","5"},
            {"1","2","3","4","5"},
            {"1","2","3","4","5"},
            {"1","2","3","4","X"}, 
        };
        int KamarKosong = 0;
        for (int i = 0; i < Kamar.length; i++){
            for (int j = 0; j < Kamar[i].length; j++){
                if (Kamar[i][j] == "X") {
                
                System.out.println(" tamu berada dilantai " + (i+1) + " Kamar " + (j+1));
            }else{
                KamarKosong += 1;
            }
        }
    }
        System.out.println("");
        System.out.println(" jumlah kamar yang kosong ada " + KamarKosong);
    }   
}