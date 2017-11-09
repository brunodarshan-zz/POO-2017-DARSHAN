package questao3;

public class Veiculo {
    private String cor;
    private String modelo;
    private int ano;
    private Montadora montadora;

    public Veiculo(String modelo, int ano, String cor){
        setModelo(modelo);
        setAno(ano);
        setCor(cor);
    }

    public void setCor(String c){
        cor = c;
    }

    public String getCor(){
        return cor;
    }

    public void setModelo(String m){
        modelo = m;
    }

    public string getModelo(){
        return modelo;
    }

    public void setAno(int y){
        ano = y;
    }

    public string getAno(){
        return ano;
    }



}
