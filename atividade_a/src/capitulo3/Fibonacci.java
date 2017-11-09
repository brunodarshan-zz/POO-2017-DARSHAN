package capitulo3;

public class Fibonacci {
    public static void main(String[] args){
        coreFibonacci(100);
    }

    public static void coreFibonacci(int n){
        int z = 0;
        int x = 1;
        while (x < n){
            if (n == 0 && x == 1){
                System.out.println(z);
            } else {
                System.out.println(x);

            }
            z = x;
            x += z;
        }
    }
}
