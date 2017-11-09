package questao4;

public class Split {
    private boolean ligado = false;
    private int temperatura = 0;
    private int velocidade_ventilador = 0;


    public void liga() {
        if(esta_ligado()){
            ligado = true;
        }
    }

    public void desliga(){
        ligado = false;
    }

    public boolean esta_ligado(){
        return ligado;
    }

    public void modoTurbo(){
        while (getVelocidade() <= 100){
            setVelocidade(1);
            setTemperatura(16);
        }
    }

    public int getVelocidade(){
        return velocidade_ventilador;
    }

    public void setVelocidade(int i){
        velocidade_ventilador = i;
    }

    public void setTemperatura(int n){
        temperatura = n
    }

    public void modoVentilador(){
        setTemperatura(28);

    }

    public void escolheVelicidade(int velocidade){
        switch(velocidade){
            case 1:
                System.out.println("devagar"); //Devagar
            case 2:
                System.out.println("Rapido");
        }

    }

    public void Modo(int modo){
        switch(modo){
            case 1: modoTurbo();
            case 2: modoVentilador();
        }

    }

}
