

import java.util.ArrayList;
public class Pokedex {

    private ArrayList<String> evolucoes = new ArrayList<>();
    private Treinador treinador;
    ArrayList<Pokemon> pokemons = new ArrayList<>();
    ArrayList<Pokemon> inicial =  new ArrayList<>();
    ArrayList<Pokemon> derrotados =  new ArrayList<>();

    public void adicinarPokemon(Pokemon pokemon){
        pokemons.add(pokemon);
    }

    public void removePokemon(Pokemon pokemon){
        pokemons.remove(pokemon);
    }
    
    public void buscaPokemon(Pokemon pokemon){
        if(pokemons.contains(pokemon)){
            System.out.println("Pokemon encontrado: "+ pokemon);
        }else{
            System.out.println("Esse pokemon nao foi encontrado");
        }}

    public void addinicial(Pokemon inicia){
        inicial.add(inicia);
    }
    
    public void mostrarinici(){
        for(Pokemon p:inicial){
            System.out.println(p);
        }
    }
    public void addDerrotado(Pokemon derrotado){
        derrotados.add(derrotado);
    }

    public ArrayList<Pokemon> getDerrotados() {
        return derrotados;
    }

    public void setDerrotados(ArrayList<Pokemon> derrotados) {
        this.derrotados = derrotados;
    }

    public void exibirPokemon(){
        for(Pokemon p:pokemons){
            System.out.println(p);
        }


    }
    public void addEvoluco(String evoluco) {
        evolucoes.add(evoluco);
    }
    public void mostrarEvoluco(){
        for(String evoluco:evolucoes){
            System.out.println(evoluco);
        }
    }
    public ArrayList<String> getEvolucoes() {
        return evolucoes;
    }

    public void setEvolucoes(ArrayList<String> evolucoes) {
        this.evolucoes = evolucoes;
    }

   
    public Treinador getTreinador() {
        return treinador;
    }

    public void setTreinador(Treinador treinador) {
        this.treinador = treinador;
    }

    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(ArrayList<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public ArrayList<Pokemon> getiInicials() {
        return inicial;
    }


}
