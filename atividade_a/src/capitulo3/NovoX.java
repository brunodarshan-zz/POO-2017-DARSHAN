package capitulo3;

import java.util.Scanner;

public class NovoX {
    public static  void main(String[] args){
       Scanner input_data = new Scanner(System.in);
        System.out.print("Insira um valor para X: ");
        int x = input_data.nextInt();
        if (x % 2 == 0){
            x = x / 2;
        } else {
            x = 3 * x + 1;
        }
        System.out.println(x);
    }
}
