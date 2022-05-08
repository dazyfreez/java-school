package math;
import java.util.Scanner;
public class hochrechnen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein:");
        int n= sc.nextInt();
        int erg = 0;
      
      for (int i =1; i <=n; i++) {
          erg = erg + i;
      } 
      System.out.println(erg);
      sc.close();
    }
}
