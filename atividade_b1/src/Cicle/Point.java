package Cicle;

public class Point {
    private int x = 0;
    private int y = 0;

    public void movimenta_no_plano(int coordenada_x, int coordenada_y){
        setX(coordenada_x);
        setY(coordenada_y);
    }

    public void setX(int n){
        if (n != getX()){

            if (x > n || n <= 0){
                x += n;
            } else {
                x -= (x - n);
            }
        }
    }

    public void setY(int n){
        if (n != getY()){
            y += n;
        }
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public double distancia_entre_pontos(Point p2){
        int x1 = this.getX();
        int x2 = p2.getX();

        int y1 = this.getY();
        int y2 = p2.getY();
        double d;
        d =  Math.sqrt(Math.pow((x2 - x1), 2 ) + Math.pow((y2 - y1), 2));
        return d;
    }

}
