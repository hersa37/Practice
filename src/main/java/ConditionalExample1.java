import java.util.Scanner;

public class ConditionalExample {

    public static void main(String[] args) {
        int nilai; //Deklarasi variabel "nilai"
        Scanner input = new Scanner(System.in); //Buat variabel "input"

        System.out.println("Tampilkan nilai huruf berdasarkan nilai angka");
        System.out.println("---------------------------------------------");
        System.out.print("Masukkan nilai: "); //.print untuk mencetak tanpa new line setelah dicetak
        nilai = input.nextInt(); //beri nilai variabel "nilai" dari hasil input jenis int dari variabel "input"

        if(nilai >= 40) {
            if(nilai >=80) {
                System.out.println("Nilai A");
            } else if(nilai >= 60) {
                System.out.println("Nilai B");
            } else if (nilai >= 40) {
                System.out.println("Nilai C");
            }

        }
    }
}
