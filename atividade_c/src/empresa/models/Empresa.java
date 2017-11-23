package empresa.models;
import empresa.models.Funcionario;

public class Empresa {
    private Funcionario[] empregados;
    private String nome;
    private String cnpj;
    private int funcionarios_ativos = 0;

    public Empresa(String nome) {
        this.nome = nome;
    }

    public boolean adiciona(Funcionario f) {
        if (haVagas()) {
            this.empregados[this.funcionariosAtivos()] = f;
            this.funcionarios_ativos++;
            return true;
        }
        return false;
    }

    public int funcionariosAtivos() {
        return this.funcionarios_ativos;
    }

    public int quantidadeVagas() {
        return this.empregados.length - this.funcionariosAtivos();
    }


    public boolean haVagas() {
        return this.funcionariosAtivos() < this.empregados.length;
    }

    public void definirRH(Funcionario[] f) {
        this.empregados = f;
    }

    public Funcionario[] retornaEmpregados() {
        return this.empregados;
    }

    public String toString() {
        String output =  "Nome: " + this.nome + "\n";
        output += "Recursos Humanos: \n";
        for (int i = 0 ; i < this.funcionariosAtivos(); i++ ){
            Funcionario f = this.empregados[i];
            output += f + "\n";
        }
        return output;
    }


}