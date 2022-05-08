public class arraydiv {
    public int [] div(int [] numbers, int [] numbers1){
        int [] f= new int [numbers.length];
        for (int i = 0; i<numbers.length; i++){
            if (numbers [i]!=0){
                f[i]= numbers[i]/numbers1[i];
            }
        }
        return f;
    }
}
