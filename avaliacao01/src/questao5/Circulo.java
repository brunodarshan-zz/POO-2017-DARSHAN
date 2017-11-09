package questao5;

class Circulo extends PontoCarteziano {
    private double raio;
    private double comprimento;
    private double area;


    static double PI = 3.14159265359;

    public Circulo(double raio){
        defineRaio(raio);
        CalculaArea(getRaio());
        CalculaComprimento(getRaio());
    }

    //SetArea
    public void CalculaArea(double r){
        area = PI * (r ** 2);
    }

    //SetComprimento
    public void CalculaComprimento(double r){
        comprimento = 2 * PI * r;
    }

    public double perimetro(double lado1, lado2){
        if (lado1 != 0 && lado2 != 0) {
            return 2 * lado1 + 2 * lado2;
        }
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
    public double getPerimetro(){
        return perimetro;
    }



}

