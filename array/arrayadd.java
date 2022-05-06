import java.util.Scanner;
public class arrayadd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number from 0 to 4");
        int x = sc.nextInt();
        if (x<5){
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9, 10};
        int[] c = new int[a.length + b.length];
        for (int i= 0; i < a.length; i++) {
            c[i] = a[i] + b[i];
        }
        System.out.println(c[x]);
        }
        else{
            System.out.println("the array is not that large");
        }
        sc.close();
    }
    
    
    
}