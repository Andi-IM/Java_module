import java.util.Scanner;

public class hitunglembur{
    public static void main(String[] args){
        int jam, lembur=0, kerja, sum;
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan jumlah jam kerja Anda: ");
        jam = masuk.nextInt();
        if (jam > 50 && jam <= 70) {
            lembur = (jam - 50) *30000;
            kerja = 50 * 20000;
            sum = lembur + kerja;
            System.out.println(
                "Upah kerja  = Rp."+kerja+",-"+
                "\nUpah lembur = Rp."+lembur+",-"+
                "\nTotal       = Rp."+sum+",-");
        }
        else if (jam <= 50){
            kerja = jam * 20000;
            System.out.println(
                "Upah kerja  = Rp."+kerja+",-"+
                "\nUpah lembur = Rp."+lembur+",-"+
                "\nTotal       = Rp."+(kerja+lembur)+",-");
        }
        else{
            jam= 70
            lembur = (jam - 50) *30000;
            kerja = 50 * 20000;
            sum = lembur + kerja;
            System.out.println(
                "Upah kerja  = Rp."+kerja+",-"+
                "\nUpah lembur = Rp."+lembur+",-"+
                "\nTotal       = Rp."+sum+",-");
        
        }
    }
}