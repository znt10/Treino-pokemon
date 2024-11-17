import java.util.Random;

public class Status {

    private int hp;
    private int attack;
    private int defense;
    private int speed;
    private int spattack;
    private int spdefense;
    private int ive;
    private int hpmax;

    Random r = new Random();
    public Status(int spdefense, int spattack, int speed, int defense, int attack, int hp ) {
        this.spdefense = spdefense;
        this.spattack = spattack;
        this.speed = speed;
        this.defense = defense;
        this.attack = attack;
        this.hp = hp;
        this.hpmax = hp;
        this.ive = r.nextInt(0,31);


    }


    public int getHp() {
        return hp;
    }


    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHpmax() {


        return hpmax;
    }

    public void setHpmax(int hpmax) {
        this.hpmax = hpmax;
    }
    public int getAttack() {

        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }


    public int getDefense() {

        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpeed() {

        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpattack() {

        return spattack;
    }

    public void setSpattack(int spattack) {
        this.spattack = spattack;
    }

    public int getSpdefense() {

        return spdefense;
    }

    public void setSpdefense(int spdefense) {
        this.spdefense = spdefense;
    }

    public int ive(){
        return ive;
    }


}
/*
*calculando apenas uma vez e deixando private depois assim calcular uma vez, depois esta calculando dentro do get e toda
* vez q mostrava recalculava e assim bugava.
* */

/*
* estou setando o pokemon pra essa class pois nao arrumei outro jeito de nao deixar o p.getnivel null.
* */