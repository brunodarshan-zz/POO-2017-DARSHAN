package empresa;
import empresa.models.Funcionario;
import empresa.models.Empresa;

public class TestaEmpresa {

    public static void main(String[] args) {
        Empresa empresa = new Empresa("Ju corporation");
        System.out.println(empresa);

        empresa.definirRH(new Funcionario[10]);

        for (int i = 0; i < empresa.quantidadeVagas(); i++){
            Funcionario empregado = new Funcionario("Funcionario "+ i, "223" + i);
            empresa.adiciona(empregado);
        }

        System.out.println(empresa);

    }
}

