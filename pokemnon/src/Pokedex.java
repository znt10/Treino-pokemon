

import java.util.ArrayList;
public class Pokedex {

    private String eloluçao;
    private Treinador treinador;
    ArrayList<Pokemon> pokemons = new ArrayList<>();
    ArrayList<Pokemon> inicial =  new ArrayList<>();


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



    public void exibirPokemon(){
        for(Pokemon p:pokemons){
            System.out.println(p);
        }


    }
    public String getEloluçao() {
        return eloluçao;
    }

    public void setEloluçao(String eloluçao) {
        this.eloluçao = eloluçao;
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

}
