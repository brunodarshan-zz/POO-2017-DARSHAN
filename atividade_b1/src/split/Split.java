package split;

public class Split {
    private boolean ligado = false;
    private int temperatura = 0;
//    Velocidade pode ir de 1 a 3
    private int velocidade_ventilador = 0;
    private String modo = "frio";
//    Paleta possui 3 posições
    private int paleta = 1;

    public Split(int t){
        liga();
        setTemperatura(t);
    }


    public void liga() {
        if(esta_ligado()){
            ligado = true;
        }
    }

    public void desliga(){
        if(esta_ligado()==true){
            ligado = false;
        }
    }

    public boolean esta_ligado(){
        return ligado;
    }

    public int getVelocidade(){
        return velocidade_ventilador;
    }

    public void setVelocidade(int i){
        velocidade_ventilador = i;
    }

    public void setTemperatura(int n){
        temperatura = n;
    }
    public int getTemperatura(){
        return temperatura;
    }


    public void modoTurbo(){
        while (getVelocidade() <= 100){
            setVelocidade(1);
            diminuiTemperatura(16);
        }
        modo = "turbo";
    }

    public void modoVentilador(){
        setTemperatura(30);
        modo = "ventilador";
    }

    public void diminuiTemperatura(int valor){
        if (esta_ligado() && modo == "turbo" ){
            if (getTemperatura() > valor){
                setTemperatura(valor);
            }
        }
    }

    public void aumentaTemperatura(int valor){
        if (esta_ligado() && modo == "turbo"){
            if (getTemperatura() < valor && valor <= 23 ){
                setTemperatura(valor);
            }
        }
    }

    public void aumentarVentilador(){
        if (getVelocidade() < 3 && esta_ligado()==true){
            ++velocidade_ventilador;
        }
    }

    public void diminuiVentilador(){
        if (getVelocidade() >= 1 && esta_ligado()==true){
            --velocidade_ventilador;
        }
    }

    public void oscilar(boolean pode_oscilar){
        while (pode_oscilar){
            if (paleta >= 1 && paleta <= 3) {
                paleta += 1;
            } else {
                paleta -= 1;
            }
        }
    }

    public void direcionar(int direcao){
        oscilar(false);

        while (paleta != direcao){

            if (direcao > paleta){
                paleta -= 1;
            } else if (direcao < paleta) {
                paleta += 1;
            }
        }
    }

    public void estado_atual(){

    }

}
