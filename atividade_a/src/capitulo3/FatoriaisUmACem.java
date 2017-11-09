package capitulo3;

public class FatoriaisUmACem {
    public static void main (String[] args){
        for(int i = 1; i <= 10; ++i){
            System.out.println("Fatorial de "+i+" é :"+ fatorial(i));
        }
    }

    public static  int fatorial(int n){
        if (n == 0 || n == 1){
            return 1;
        } else {
            return n * fatorial(n - 1 );
        }
    }
}
