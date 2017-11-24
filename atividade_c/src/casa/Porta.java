package casa;

class Porta
{
  private boolean aberta = false;

  public boolean estaAberta() {
    return this.aberta
  }

  public void abrePorta() {
    if (estaAberta()) {
      this.aberta = true;
    }
  }

}
