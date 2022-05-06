import java.util.Scanner;
public class combi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int erg = 1;
        int erg1 = 1;
        for (int i = 1; i <= num; i++) {
            erg = erg * i;
            erg1 = erg1 * num;
        }
        int erg2 = erg1 + erg;
        System.out.println("The nunber is " + erg2);
        sc.close();
    }
}