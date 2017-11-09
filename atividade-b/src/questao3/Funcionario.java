package questao3;

public class Funcionario extends Pessoa {
    private Cargo cargo;
    String data_adimissao;
    private boolean ativo = true;

    public Cargo getCargo(){ return cargo;}

    public void setCargo(Cargo c){
        cargo = c;
    }

    public boolean trabalhando?(){
        return ativo;
    }



}
