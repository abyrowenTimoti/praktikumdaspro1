package jobsheet5;
import java.util.Scanner;
public class tugas3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String pesan;
    System.out.println("apakah membawa KTM? (ya/tidak)");
    String bawaKTM = sc.nextLine().trim();
    System.out.println("apakah sudah registrasi online? (ya/tidak)");
    String regisOL = sc.nextLine().trim();

    if(bawaKTM.equalsIgnoreCase("ya")){
      if(regisOL.equalsIgnoreCase("ya")){
        pesan="semua syarat terpenuhi, boleh masuk";
      }else {
        pesan="tidak boleh masuk";
      }
    }else{
      pesan="tidak boleh masuk";
    }
    System.out.println(pesan);
  }
}
