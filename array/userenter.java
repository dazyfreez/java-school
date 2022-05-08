import java.util.Scanner;
public class userenter{
    public static void main(String[] args){
        System.out.println("nummer bitte eingeben");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int [] a = new int[i];
        for(int j = 0; j < i; j++){
            System.out.println("bitte eingeben");
            a [j] = sc.nextInt();
        }
        sc.close();
    }
}