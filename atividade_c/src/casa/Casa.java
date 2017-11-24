package casa;
import casa.Porta;

class Casa
{
  private String cor;
  private int totalDePortas;
  private Porta[] portas;
  private int porta_livre = 0;


    public Casa(){
        this.cor = "branca";
        this.totalDePortas = 2;
    }

    public Casa(int totalDePortas){
        this();
        this.totalDePortas = totalDePortas;
    }


    public Casa(String cor, int totalDePortas){
        this(totalDePortas);
        this.cor = cor;
    }

    public int quantidadePortas() { return this.totalDePortas; }

    public int portasUsadas(){
        return portas.length;
    }

    public boolean temEspacoParaPorta(){
        return quantidadePortas() < this.portasUsadas();
    }

    public void pintaCasa(String c) { this.cor = c; }

    public void adicionaPorta(Porta porta)
    {
      if (this.temEspacoParaPorta()) {
        this.portas[porta_livre] = porta;
        this.porta_livre += 1;
      }
  }


}
