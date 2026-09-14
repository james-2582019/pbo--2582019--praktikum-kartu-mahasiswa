import java.util.Scanner;

public class KartuMahasiswa {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("NIK (16 digit)             : ");
        long nik = scanner.nextLong();

        System.out.print("Umur                       : ");
        int umur = scanner.nextInt();

        System.out.print("Tinggi badan (cm)          : ");
        double tinggiBadan = scanner.nextDouble();

        System.out.print("Golongan darah             : ");
        char golonganDarah = scanner.next().charAt(0);

        System.out.print("Sudah menikah (true/false) : ");
        boolean sudahMenikah = scanner.nextBoolean();


        scanner.nextLine();

        System.out.print("Nama lengkap         : ");
        String namaLengkap = scanner.nextLine();




    }
}