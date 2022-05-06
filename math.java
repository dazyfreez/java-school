import java.util.Scanner;
public class math {
    public static void main(String[] args) { // Das ist hochrechnen mit der mainmethode
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number: ");
         int num = sc.nextInt();
        int erg = 1;
        for ( int i = 1; i <= num; i++) {
            erg = erg * num;
        }
        System.out.println("The nunber is " + erg);
        sc.close();
    }

    public int hochrechnen(int num) { // So machen wir es in der Schule
        int erg = 1;
        for (int i = 1; i <= num; i++) {
            erg = erg * num;
        }
        return erg;
    }
}