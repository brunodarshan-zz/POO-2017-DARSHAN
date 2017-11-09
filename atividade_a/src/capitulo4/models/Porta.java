package capitulo4.models;

public class Porta {
     boolean aberta = true;
     String cor = "nude";
     double dimensaoX, dimensaoY, dimensaoZ;


    void abre(){
        if (!aberta){
            aberta = true
        }
    }

    void fecha(){
        if (aberta){
            aberta = false;
        }
    }

    void Pinta(String c) {
        cor = c;
    }

    boolean estaAberta(){
        return aberta;
    }

}
