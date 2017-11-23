package empresa.models;

public class Funcionario {
    private String name;
    private String cpf;
    double salario;

    public Funcionario(String name, String cpf){
        this(name, cpf, 937);
    }

    public Funcionario(String name, String cpf, double salario){
        this.name = name;
        this.cpf = cpf;
        this.salario = salario;
    }


    public String toString(){
        return this.name +  " Salario = " + this.salario;
    }


}
