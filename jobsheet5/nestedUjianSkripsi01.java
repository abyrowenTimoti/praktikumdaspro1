package jobsheet5;
import java.util.Scanner;

public class nestedUjianSkripsi01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String pesan;
    System.out.print("Apakah mahasiswa sudah bebas kompen? (ya/tidak):");
    String bebasKompen = sc.nextLine().trim();

    System.out.println("Masukkan jumlah log bimbingan pembimbing 1");
    int bimbinganP1 = sc.nextInt();

    System.out.println("Masukkan jumlah log bimbingan pembimbing 2");
    int bimbinganP2 = sc.nextInt();
    
    if(bebasKompen.equalsIgnoreCase("ya")){
      if(bimbinganP1>=8 && bimbinganP2>=4){
          pesan="Semua syarat terpenuhi mahasiswa boleh mendaftar ujian skripsi";
      } else if (bimbinganP1<8 && bimbinganP1<4){
          pesan="GAGAL!! log bimbingan p1 kurang dari 8 dan log bimbingan p2 kurang dari 4";
      } else if (bimbinganP1<8){
        pesan="GAGAL!! log bimbingan p1 kurang dari 8";
      } else {
        pesan="GAGAL!! log bimbingan p2 kurang dari 4";
      }
    }else{
      pesan="GAGAL!! mahasiswa masih memiliki tanggungan kompen";
    }
    System.out.println(pesan);
  }
  
}
