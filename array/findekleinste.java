public class findekleinste{
        public int findeKleinste(int[] f)       
    {
        int erg = f[0];
            for(int i=1; i<f.length; i++)
            {
                if (f[i]< erg)
                {
                    erg = f[i];
                }
            }
            System.out.println(erg);
        
    return erg;
    }

    public static void main(String[] args) {
        int[] f = {1, 2, 3, 0, 5};
       int erg = f[0];
            for(int i=1; i<f.length; i++)
            {
                if (f[i]< erg)
                {
                    erg = f[i];
                }
            }
            System.out.println(erg);
       
    }
}
