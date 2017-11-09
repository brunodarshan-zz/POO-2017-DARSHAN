package questao5;

public class PontoCarteziano {
    private int x = 0;
    private int y = 0;

    public void movimentaPonto(int mov_x, int mov_y){

    }

    public void setX(int n){
        if (n != getX()){
            x += n
        }
    }

    public void setY(int n){
        if (n != getY()){
            y += n
        }
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

}
