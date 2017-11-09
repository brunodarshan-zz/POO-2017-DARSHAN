package questao3;

public class Montadora {
    private String nome;
    private String local;
    private int codigo;

    public Montadora(int codigo, String nome){
        setCodigo(codigo);
    }

    public void setNome(String n){
        nome = n;
    }

    public String getNome(){
        return nome;
    }

    public String setLocal(String l){
        local = l;
    }

    public void setCodigo(int c) {
        codigo = c;
    }

    public int getCodigo(){
        return  codigo;
    }

}
