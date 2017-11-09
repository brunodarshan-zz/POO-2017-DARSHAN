package capitulo3;

public class ImprimeTabela {
    public static void main(String[] args) {

//        Define as linhas
        for (int i = 0; i <= 5; i++) {
            //Define colunas
            for (int n = 1; n <= i; n++) {
                System.out.print(n * i + " ");
            }
            System.out.println("\n");
        }
    }
}

