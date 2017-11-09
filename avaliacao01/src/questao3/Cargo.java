package questao3;

public class Cargo {
    private String funcao;
    private boolean patrao = false;

    public Cargo(String f){
        setFuncao(f);

    }

    public void setFuncao(String f){
        funcao = f;
    }

    public String getFuncao(){
        return funcao;
    }

    public boolean eh_patrao(){
        return patrao;
    }

}
