package capitulo4.models;

public class DataField {
    private int dia;
    private int mes;
    private int ano;

    public DataField(int dia, int mes, int ano){
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String printData(){
        String dia_str, mes_str, ano_str;

        dia_str =  String.valueOf(getDia());
        mes_str = String.valueOf(getMes());
        ano_str = String.valueOf(getAno());

        return dia_str + "/"+ mes_str + "/" + ano_str;

    }
}
