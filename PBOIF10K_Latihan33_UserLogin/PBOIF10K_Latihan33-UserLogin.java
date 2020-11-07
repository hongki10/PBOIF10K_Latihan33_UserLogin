import java.util.Scanner;

/**
 * Nama     : M.Hongki Alfikram
 * Kelas    : IF10K
 * NIM      : 10119915
 */

public class PBOIF10K10119915Latihan33 {
    public static void main(String[] args) {
        user login = new user();
       Scanner scanner = new Scanner(System.in);
       System.out.print("Masukan Username: ");
       String user = scanner.next();
       System.out.print("Masukan Password: ");
       String password = scanner.next();
       System.out.println("");
       
       login.pengecekanLogin(user, password);
   }
}