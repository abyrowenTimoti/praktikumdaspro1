package jobsheet5;

import java.util.Scanner;

public class ifCetakKRS01 {
  public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);

    System.out.println("Cetak KRS SIAKAD");
    System.out.print("Apakah UKT sdah lunas? (true/false)");
    boolean uktLunas = sc.nextBoolean();

    System.out.println(uktLunas ? "Pembayaran ukt terverifikasi. Silakan cetak KRS dan minta tanda tanga DPA" : "Registrasi ditolak. Lunasi UKT terlebih dahulu");
    if (uktLunas) {
      System.out.println("Pembayaran UKT terverifikasi");
      System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
    } else {
      System.out.println("Registrasi ditolak");
      System.out.println("Lunasi UKT terlebih dahulu");
    }
  }
}
