import java.util.ArrayList;
import java.util.Random;

public class Pokemon {
    private int nivel;
    private String tipo;
    private String genero;
    private String nome;
    private Treinador t;
    private Pokedex pokedex;
    private Inicial inicial;
    private Status status;
    private Ataques ataque;
    private Lutar lutar;
    private Natureza natureza;
    private int valor = 0;


    Natureza hardy = new Natureza("Hardy", "Nenhum", "Nenhum");
    Natureza lonely = new Natureza("Lonely", "attack", "defense");
    Natureza brave = new Natureza("Brave", "attack", "speed");
    Natureza adamant = new Natureza("Adamant", "attack", "spattack");
    Natureza naughty = new Natureza("Naughty", "attack", "spdefense");
    Natureza bold = new Natureza("Bold", "defense", "attack");
    Natureza docile = new Natureza("Docile", "Nenhum", "Nenhum");
    Natureza relaxed = new Natureza("Relaxed", "defense", "speed");
    Natureza impish = new Natureza("Impish", "defense", "spattack");
    Natureza lax = new Natureza("Lax", "defense", "spdefense");
    Natureza timid = new Natureza("Timid", "speed", "attack");
    Natureza hasty = new Natureza("Hasty", "speed", "defense");
    Natureza serious = new Natureza("Serious", "Nenhum", "Nenhum");
    Natureza jolly = new Natureza("Jolly", "speed", "spattack");
    Natureza naive = new Natureza("Naive", "speed", "spdefense");
    Natureza modest = new Natureza("Modest", "spattack", "attack");
    Natureza mild = new Natureza("Mild", "spattack", "defense");
    Natureza quiet = new Natureza("Quiet", "spattack", "speed");
    Natureza bashful = new Natureza("Bashful", "Nenhum", "Nenhum");
    Natureza rash = new Natureza("Rash", "spattack", "spdefense");
    Natureza calm = new Natureza("Calm", "spdefense", "attack");
    Natureza gentle = new Natureza("Gentle", "spdefense", "defense");
    Natureza sassy = new Natureza("Sassy", "spdefense", "speed");
    Natureza careful = new Natureza("Careful", "spdefense", "spattack");
    Natureza quirky = new Natureza("Quirky", "Nenhum", "Nenhum");
    Treinador t1 = new Treinador("jose", 5);

    public void puxar(){
    t1.addNatureza(lonely);
    t1.addNatureza(brave);
    t1.addNatureza(adamant);
    t1.addNatureza(naughty);
    t1.addNatureza(bold);
    t1.addNatureza(docile);
    t1.addNatureza(relaxed);
    t1.addNatureza(impish);
    t1.addNatureza(lax);
    t1.addNatureza(timid);
    t1.addNatureza(hardy);
    t1.addNatureza(hasty);
    t1.addNatureza(serious);
    t1.addNatureza(jolly);
    t1.addNatureza(naive);
    t1.addNatureza(modest);
    t1.addNatureza(mild);
    t1.addNatureza(quiet);
    t1.addNatureza(quirky);
    t1.addNatureza(bashful);
    t1.addNatureza(rash);
    t1.addNatureza(calm);
    t1.addNatureza(gentle);
    t1.addNatureza(sassy);
    t1.addNatureza(careful);
    Inicial i1 = new Inicial();
    Evolucao e1 = new Evolucao();
    Treinar treinar = new Treinar();
    i1.pokemoninicial(t1);
    t1.setnatu();

    Ataques a1 = new Ataques("Psychic",90,10,100,"Psychic","especial","dano");
    Ataques a2= new Ataques("Tackle", 40,35,100, "Normal","fisico","dano");
    Status status1 = new Status(20,20,45,35,30,45);
    Status status2 = new Status(100,100,100,100,100,100);
    Pokemon p1 = new Pokemon("caterpie", 2, "inseto", "femia",status1,a2);
    Pokemon p2 = new Pokemon("Mew", 100,"psiquico","macho",status2,a1);




    treinar.treinar(t1,e1);
    t1.escolherpokemon();
    t1.jogaPokemon(t1,p1);
    t1.escolherpokemon();
    t1.jogaPokemon(t1,p2);}


    public Pokemon(){}



    public Pokemon(String nome, int nivel, String tipo, String genero,Status status, Ataques ataque) {

        this.nome = nome;
        this.nivel = nivel;
        this.tipo =  tipo;
        this.genero = genero;
        this.status = status;
        this.ataque = ataque;
        this.natureza = new Natureza();
        this.lutar = new Lutar();
        calcular();

    
    }
    
public String toString(){
return  nome+
"\nNivel: " +nivel;

}
    public void setNatureza(Natureza natureza) {

        this.natureza = natureza;
    }
    public Natureza getNatureza() {
        return natureza;
    }



    public Lutar getLutar() {
        return lutar;
    }

    public void setLutar(Lutar lutar) {
        this.lutar = lutar;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setAtaque(Ataques ataque) {
        this.ataque = ataque;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Ataques getAtaque() {
        return ataque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pokedex getPokedex() {
        return pokedex;
    }

    public Status getStatus() {
        return status;

    }

    public void calcularstatus(){
        calcular();

    }

    private void calcular(){

        int hp1 = getStatus().getHp();
        int hpmax1 = getStatus().getHp();
        int attack1 = getStatus().getAttack();
        int defense1 = getStatus().getDefense();
        int speed1 = getStatus().getSpeed();
        int spattack1 = getStatus().getSpattack();
        int spdefense1 = getStatus().getSpdefense();
        int ive = getStatus().ive();

        int hpmax =calcularHp(hp1,getNivel(),ive);
        int hp = calcularHp(hp1,getNivel(),ive);
        int speed = calcularstat(speed1,getNivel(),ive);
        int defense = calcularstat(defense1,getNivel(),ive);
        int attack = calcularstat(attack1,getNivel(),ive);
        int spattack = calcularstat(spattack1,getNivel(),ive);
        int spdefense = calcularstat(spdefense1,getNivel(),ive);


        if(0 == valor){
            getStatus().setHpmax(hpmax);
            getStatus().setHp(hp);
            getStatus().setAttack(attack);
            getStatus().setDefense(defense);
            getStatus().setSpeed(speed);
            getStatus().setSpattack(spattack);
            getStatus().setSpdefense(spdefense);

        }
        else{
            switch (getNatureza().getAumento()){
                case "attack" ->  getStatus().setAttack((int) (attack + (attack * 1.1)));
                case "defense" ->  getStatus().setDefense((int) (defense + (defense * 1.1)));
                case "speed" ->  getStatus().setSpeed((int) (speed + (speed * 1.1)));
                case "spattack" ->getStatus().setSpattack((int) (spattack + (spattack * 1.1)));
                case "spdefense" ->getStatus().setSpdefense((int) (spdefense + (spdefense * 1.1)));
            }
            switch (getNatureza().getReduzido()){
                case "attack" ->  getStatus().setAttack((int) (attack - (attack * 1.1)));
                case "defense" ->  getStatus().setDefense((int) (defense - (defense * 1.1)));
                case "speed" ->  getStatus().setSpeed((int) (speed - (speed * 1.1)));
                case "spattack" ->getStatus().setSpattack((int) (spattack - (spattack * 1.1)));
                case "spdefense" ->getStatus().setSpdefense((int) (spdefense - (spdefense * 1.1)));
        }
        valor++;



    }
    }

    private int calcularHp(int hp , int nivel, int ive){
        return ((ive + 2 * hp) * nivel / 100) + nivel + 10;
    }
    private int calcularstat(int stat , int nivel, int ive){
        return ( 2 * stat + ive)  * nivel / 100 + 5;
    }




    public void setPokedex(Pokedex pokedex) {
        this.pokedex = pokedex;
    }




    public void setStatus(Status status) {
        this.status = status;

    }



   
}
