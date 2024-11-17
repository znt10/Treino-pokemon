import java.util.ArrayList;

public class Ataques {
    private String nome;
    private int power;
    private int accuracy;
    private int pp;
    private String tipo;
    private String tipoata;
    private String heal;



    public Ataques(String nome, int power,int pp, int accuracy,String tipo,String tipoata,String heal ) {
        this.nome = nome;
        this.power = power;
        this.pp = pp;
        this.accuracy = accuracy;
        this.tipo = tipo;
        this.tipoata = tipoata;
        this.heal = heal;
    }


    public String getHeal() {
        return heal;
    }

    public void setHeal(String heal) {
        this.heal = heal;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipoata() {
        return tipoata;
    }

    public void setTipoata(String tipoata) {
        this.tipoata = tipoata;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }
}
