package questao3;

public class Pessoa {
    private String nome;
    private int idade;
    private String CPF;
    private Conta[] contas;

    public Pessoa(String nome, String doc){
        setNome(nome);
        setCPF(cpf);
    }

    public void setNome(String N){
        nome = N;
    }

    public String getNome(){
        return nome;
    }

    public void setCPF(String cpf){
        CPF = cpf;
    }

    public String getCPF(){
        return CPF;
    }

}
