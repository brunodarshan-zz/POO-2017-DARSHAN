package Circle;

class Circle {
    private double raio;
    private double comprimento;
    private double area;
    private int x = 0;
    private int y = 0;


    static double PI = 3.14159265359;

    public Circle(double raio){
        defineRaio(raio);
        CalculaArea(getRaio());
        CalculaComprimento(getRaio());
    }

    //SetArea
    public void CalculaArea(double r){
        area = PI * Math.pow(r, 2);
    }

    //SetComprimento
    public void CalculaComprimento(double r){
        comprimento = 2 * PI * r;
    }

    public double perimetro(){
        return comprimento;
    }

    public void defineRaio(double n){
        if (n <= 0){
            raio = 1;
        }
        raio = n;
    }

    public double getRaio(){
        return raio;
    }

    public double getArea(){
        return area;
    }


    // Metodos de Ponto
    public void movimenta_no_plano(int coordenada_x, int coordenada_y){
        setX(coordenada_x);
        setY(coordenada_y);
    }

    public void setX(int n){
        if (n != getX()){
            x -= n;
        } else {
            x += n;
        }
    }

    public void setY(int n){
        if (n != getY()){
            y -= n;
        } else {
            y += n;
        }
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public double distancia_entre_pontos(Circle p2){
        int x1 = this.getX();
        int x2 = p2.getX();

        int y1 = this.getY();
        int y2 = p2.getY();
        double d;
        d =  Math.sqrt(Math.pow((x2 - x1), 2 ) + Math.pow((y2 - y1), 2));
        return d;
    }
    // Fim Metodos de ponto




    public boolean coordenada_esta_no_circulo(Circle p) {
        double distancia = distancia_entre_pontos(p);
        if (distancia < getRaio()) {
            return true;
        }
        return false;
    }

    public String outro_circulo_eh(Circle c){
        double distancia = distancia_entre_pontos(c);
        double soma_raios = (this.getRaio() + c.getRaio());
        if (distancia > soma_raios){
            return "Externos";
        } else {
            if (distancia == soma_raios) {
                return "Tangente";
            } else {
                if (distancia < soma_raios) {
                    return "Secante";
                }
            }

        }
    }


}

