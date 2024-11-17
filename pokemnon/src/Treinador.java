
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Treinador {
    private String nome;
    private int insignas;
    private Pokedex pokedex;
    private Calcular calcular;
    private Inicial inicial;
    private Lutar lutar;
    private Pokebola pokebola;
    private Pokemon pokemoninicial;
    private Evolucao evolucao;
    private Status status;
    private Dano dano;
    private Curar curar;
    private ArrayList<ArrayList<Natureza>> naturezas = new ArrayList<ArrayList<Natureza>>();
    private ArrayList<Natureza> nenhum =new ArrayList<>();
    private ArrayList<Natureza> ataque = new ArrayList<>();
    private ArrayList<Natureza> defesa = new ArrayList<>();
    private ArrayList<Natureza> speed = new ArrayList<>();
    private  ArrayList<Natureza> spataque = new ArrayList<>();
    private  ArrayList<Natureza> spdefese = new ArrayList<>();
    Evolucao evo = new Evolucao();
    Random rand = new Random();



    public Treinador(String nome, int insignas) {

        this.pokedex = new Pokedex();
        this.nome = nome;
        this.insignas = insignas;
        this.calcular = new Calcular();
        this.lutar = new Lutar();
        this.pokebola = new Pokebola();
        this.dano = new Dano();
        this.evolucao = new Evolucao();
        this.curar = new Curar();

    }


    Scanner sc = new Scanner(System.in);

    public void jogaPokemon(Treinador t ,Pokemon p){

        System.out.println("==============================================");
        System.out.println("1 Captura " +p.getNome()+"\n2 Run \n3 lutar");
        int op = sc.nextInt();
        System.out.println("==============================================");

        while(true){

        if(op == 1){
            pokebola.Cap(t,p,getCalcular());
            break;
        }
        if(op ==2){
            System.out.println("VC correu da batalha");
            break;
        }
        if(op ==3){
            lutar.lutarPokemon(p,t);
            int hp = pokemoninicial.getStatus().getHp();

            if (p.getStatus().getHp() <= 0 || hp <= 0) {
                break;
            }else{
                System.out.println();
                System.out.println("1 Captura " +p.getNome()+"\n2 Run \n3 lutar");
                op = sc.nextInt();
            }
        }else {
            System.out.println();
            System.out.println("1 Captura " +p.getNome()+"\n2 Run \n3 lutar");
            op = sc.nextInt();
        }}

    buscaPokemon(p);
        System.out.println();
    evo.evoluir(t,p);
    }

    public int xp(Pokemon p){
        int nivel = p.getNivel();
        int numero;
        Random ra = new Random();
        if(nivel <= 10){

            return numero = ra.nextInt(1,5);
        }else if(nivel <= 25){
            return numero = ra.nextInt(5,10);
        }else if(nivel <= 100){
            return numero = ra.nextInt(11,15);
        }
        return 0;
    }

    public void curaroureviver(){
        int reviver = pokemoninicial.getStatus().getHp();
        if(reviver < pokemoninicial.getStatus().getHpmax()){
            getCurar().heal(pokemoninicial);
        }
    }


    public void addNatureza(Natureza natureza){


        //case veja add  na lista q aumendo
        switch (natureza.getAumento()) {
            case "Nenhum" -> nenhum.add(natureza);
            case "attack" -> ataque.add(natureza);
            case "defense" -> defesa.add(natureza);
            case "speed" -> speed.add(natureza);
            case "spattack" -> spataque.add(natureza);
            case "spdefense" -> spdefese.add(natureza);
        }

    }

    public Natureza escolhernatu (){
        int aum = rand.nextInt(1,7);
        int intex = rand.nextInt(0,4);
        if (aum == 1){
            return nenhum.get(intex);
        }else if(aum == 2){
            return ataque.get(intex);
        }else if(aum == 3){
            return defesa.get(intex);
        }else if(aum == 4){
            return speed.get(intex);
        }else if(aum == 5){
            return spataque.get(intex);
        }else if(aum == 6){
            return spdefese.get(intex);
        }return null;


    }


    public void setnatu(){
        getPokemoninicial().setNatureza(escolhernatu());
    }


    public void escolherpokemon(){
        if(getPokedex().pokemons.size() >= 1){

            System.out.println("Dejesa outra de pokemon ?");
            for(Pokemon pokemon: getPokedex().pokemons){
                for(int i = 1; i <= getPokedex().pokemons.size(); i++){
                    System.out.println(i+"=="+pokemon.getNome());
                }
            }

        }
    }
    public Evolucao getEvo() {
        return evo;
    }

    public void setEvo(Evolucao evo) {
        this.evo = evo;
    }

    public Status getStatus() {
        return status;
    }

    public Dano getDano() {
        return dano;
    }

    public void setDano(Dano dano) {
        this.dano = dano;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void inicialPokemon(Pokemon p){
        pokedex.addinicial(p);
    }

    public Curar getCurar() {
        return curar;
    }

    public void setCurar(Curar curar) {
        this.curar = curar;
    }

    public void mostrarinicial(Pokemon p){
        pokedex.mostrarinici();
    }

    public void adicinarPokemonTreinador(Pokemon p){
        pokedex.adicinarPokemon(p);
    }

    public  void buscaPokemon(Pokemon p){
        pokedex.buscaPokemon(p);
    }

    public String getNome() {
        return nome;
    }


    public int getInsignas() {
        return this.insignas;
    }

    public void setInsignas(int insignas) {
        this.insignas = insignas;
    }
  
    public void setNome(String nome) {
        this.nome = nome;
    }


   
    public Pokedex getPokedex() {
        return pokedex;
    }

  
    public void setPokedex(Pokedex pokedex) {
        this.pokedex = pokedex;
    }

   
    public void exibirPokemon(){
        pokedex.exibirPokemon();
    }

    public String toString(){
        return "O Treinador "+ nome + " tem "+ insignas + " insignas";
    }


    /**
     * @return Calcular return the calcular
     */
    public Calcular getCalcular() {
        return calcular;
    }

    /**
     * @param calcular the calcular to set
     */
    public void setCalcular(Calcular calcular) {
        this.calcular = calcular;
    }

    /**
     * @return Inicial return the inicial
     */
    public Inicial getInicial() {
        return inicial;
    }

    /**
     * @param inicial the inicial to set
     */
    public void setInicial(Inicial inicial) {
        this.inicial = inicial;
    }

    /**
     * @return Lutar return the lutar
     */
    public Lutar getLutar() {
        return lutar;
    }

    /**
     * @param lutar the lutar to set
     */
    public void setLutar(Lutar lutar) {
        this.lutar = lutar;
    }



    public Pokemon getPokemoninicial() {

        return pokemoninicial;
    }


    public void setPokemoninicial(Pokemon pokemoninicial) {
        this.pokemoninicial = pokemoninicial;
    }

    


    public Pokebola getPokebola() {
        return pokebola;
    }

    public void setPokebola(Pokebola pokebola) {
        this.pokebola = pokebola;
    }



}
