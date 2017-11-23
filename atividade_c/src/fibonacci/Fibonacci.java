package fibonacci;

public class Fibonacci {
    private int n = 0;
    private int[] sequencia;
    private int pos = 0 ;

    public Fibonacci(int n){
        this.defineVetor(n);
    }

    public int fibonacci(int n){
                if (n < 2){
                    return n;
                }
                return this.fibonacci(n - 1) + this.fibonacci(n - 2);
    }

    public void defineVetor(int n){
        this.sequencia = new int[n];
        for (int i = 0; i < this.sequencia.length; i++){
            this.sequencia[i] = fibonacci(i);
        }
    }



    public String toString(){
        String output = "";
        for (int i = 0; i < this.sequencia.length; i++) {
            output += sequencia[i];
            if (i == this.sequencia.length -1 ){ output += ""; } else { output += ", ";}
        }
        return output;
    }
}
