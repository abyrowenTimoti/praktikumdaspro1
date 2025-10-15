import java.util.Scanner;

public class casemethod01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a, b, c, d, e, f;
    double x, y, z;

    System.out.println("masukkan nilai UTS, UAS, TUGAS mata kuliah algoritma dan pemrograman");
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    System.out.println("masukkan nilai UTS, UAS, TUGAS mata kuliah struktur data");
    d = sc.nextInt();
    e = sc.nextInt();
    f = sc.nextInt();

    x = 0.3 * a + 0.4 * b + 0.3 * c;
    y = 0.3 * d + 0.4 * e + 0.3 * f;
    z = (x + y) / 2;

    System.out.printf("%-11s %22s %5s %7s %13s %13s %7s", "mata kuliah", "UTS", "UAS", "TUGAS", "Nilai Akhir", "Nilai Huruf", "Status");
    System.out.println("\n====================================================================================");

    if (x>=60) {
      if (x>=80 && x<=100) {
        System.out.printf("%21s %11d %5d %5d %14f %10s %12s", "algoritma pemrograman", a, b, c, x, "A", "LULUS");
      }if (x>=73 && x<80) {
        System.out.printf("%21s %11d %5d %5d %14f %10s %12s", "algoritma pemrograman", a, b, c, x, "B+", "LULUS");
      }if (x>=65 && x<73) {
        System.out.printf("%21s %11d %5d %5d %14f %10s %12s", "algoritma pemrograman", a, b, c, x, "B", "LULUS");
      }if (x>=60 && x<65) {
        System.out.printf("%21s %11d %5d %5d %14f %10s %12s", "algoritma pemrograman", a, b, c, x, "C+", "LULUS");
      }
    }else if (x>=50 && x<60) {
      System.out.printf("%21s %11d %5d %5d %14f %10s %12s", "algoritma pemrograman", a, b, c, x, "C", "GAGAL");
    }else if (x>=39 && x<50) {
      System.out.printf("%21s %11d %5d %5d %14f %10s %12s", "algoritma pemrograman", a, b, c, x, "D", "GAGAL");
    }else{
      System.out.printf("%21s %11d %5d %5d %14f %10s %12s", "algoritma pemrograman", a, b, c, x, "E", "GAGAL");
    }

    if (y>=60) {
      if (y>=80 && y<=100) {
        System.out.printf("%-14s %19d %5d %5d %14f %10s %12s", "\nstuktur data", d, e, f, y, "A", "LULUS");
      }if (y>=73 && y<80) {
        System.out.printf("%-14s %19d %5d %5d %14f %10s %12s", "\nstuktur data", d, e, f, y, "B+", "LULUS");
      }if (y>=65 && y<73) {
        System.out.printf("%-14s %19d %5d %5d %14f %10s %12s", "\nstuktur data", d, e, f, y, "B", "LULUS");
      }if (y>=60 && y<65) {
        System.out.printf("%-14s %19d %5d %5d %14f %10s %12s", "\nstuktur data", d, e, f, y, "C+", "LULUS");
      }
    }else if (y>=50 && y<60) {
      System.out.printf("%-14s %19d %5d %5d %14f %10s %12s", "\nstuktur data", d, e, f, y, "C", "GAGAL");
    }else if (y>=39 && y<50) {
      System.out.printf("%-14s %19d %5d %5d %14f %10s %12s", "\nstuktur data", d, e, f, y, "D", "GAGAL");
    }else{
      System.out.printf("%-14s %19d %5d %5d %14f %10s %12s", "\nstuktur data", d, e, f, y, "E", "GAGAL");
    }

    System.out.println("\nRata rata nilai akhir:"+ z);
    if (z>=70) {
      System.out.println("LULUS (rata rata>69)");
    }else{
      System.out.println("TIDAK LULUS (rata rata<70)");
    }
  }
}
