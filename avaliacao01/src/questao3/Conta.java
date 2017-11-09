package questao3;

class Conta
{
    Pessoa titular;
    private double saldo = 0;

    public Conta(Pessoa p, int deposito){
        setPessoa(p);
        _deposita(deposito);
    }

    public void setPessoa(Pessoa tit){
        titular = tit;
    }

    void _deposita(double quantia)
    {
        this.saldo += quantia;

    }


    public double _saldo(){
        return this.saldo;
    }

    public boolean _saca(double quantia)
    {
        if (quantia <= this._saldo()) {
            this.saldo -= quantia;
            return true;
        } else {
            return false;
        }
    }



}

