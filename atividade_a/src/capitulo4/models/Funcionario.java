package capitulo4.models;


public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    DataField data_entrada;
    private String RG;

    //Getters Padrão

    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalario() {
        return salario;
    }

    public DataField getData_entrada() {
        return data_entrada;
    }

    public String getRG() {
        return RG;
    }

    //    Setters Padrão


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setData_entrada(DataField data_entrada) {
        this.data_entrada = data_entrada;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    //Metodos a mais

    public void recebeAumento(double valor){
        salario += valor;
    }

    public double calculaGanhoAnual(){
        return getSalario() * 12;
    }

    public void mostra(){
        System.out.println("Nome: "+getNome());
        System.out.println("Salario: R$"+getSalario());
        System.out.println("Deparatamento: "+getDepartamento());
        System.out.println("Salario: "+getSalario());
        System.out.println("Ganho Anual: "+calculaGanhoAnual());
        System.out.println("Data de Entrada: "+ getData_entrada().printData());
    }

}
