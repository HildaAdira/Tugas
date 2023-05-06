//Hilaria iwung
//227064516036

package hitungnilaimahasiswa;
import java.util.Scanner;

public class HitungNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        String[] namaMahasiswa = new String[jumlahMahasiswa];
        double[] nilaiMahasiswa = new double[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i+1) + ": ");
            namaMahasiswa[i] = input.next();

            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilaiMahasiswa[i] = input.nextDouble();
        }

        double totalNilai = 0;
        for (double nilai : nilaiMahasiswa) {
            totalNilai += nilai;
        }

        double rataRata = totalNilai / jumlahMahasiswa;

        System.out.println("Total nilai mahasiswa: " + totalNilai);
        System.out.println("Rata-rata nilai mahasiswa: " + rataRata);
    }
}
