public class combiarray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 0, 5};
        int[] b = {6, 7, 8, 3, 10};
        int erg = b[0]; 
        int erg1 = a[0];
        for (int i = 1; i <a.length; i++) {
            if (a[i]<erg1) {
                erg1 = a[i];
            }
            if (b[i]<erg) {
                erg = b[i];
            }
        }
        int erg2 = erg + erg1;
        System.out.println(erg2);

}
}