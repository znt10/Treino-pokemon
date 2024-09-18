
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


    public Treinador(String nome, int insignas) {
        this.pokedex = new Pokedex();
        this.nome = nome;
        this.insignas = insignas;
        this.calcular = new Calcular(lutar);
        this.lutar = new Lutar();
        this.pokebola = new Pokebola();
       
    }


    Scanner sc = new Scanner(System.in);

    public void jogaPokemon(Treinador t ,Pokemon p, Calcular c){
        
        System.out.println("1 Captura " +p.getNome()+"\n2 Run \n3 lutar");
        int op = sc.nextInt();
      

        while(true){

        if(op == 1){
            pokebola.Cap(t,p,c);
            break;
        }
        if(op ==2){
            System.out.println("VC correu da batalha");
            break;
        }
        if(op ==3){
            lutar.lutarPokemon(p,t);
            
            if (p.getHpAtual() == 0 ) {
                break;
            }else{
                System.out.println();
                System.out.println("1 Captura " +p.getNome()+"\n2 Run \n3 lutar");
                 op = sc.nextInt();
            }
        }
        
        }}

    public void inicialPokemon(Pokemon p){
        this.pokemoninicial = p;
        pokedex.addinicial(p);
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


    /**
     * @return Pokemon return the pokemoninicial
     */
    public Pokemon getPokemoninicial() {
        return pokemoninicial;
    }

    /**
     * @param pokemoninicial the pokemoninicial to set
     */
    public void setPokemoninicial(Pokemon pokemoninicial) {
        this.pokemoninicial = pokemoninicial;
    }

}
