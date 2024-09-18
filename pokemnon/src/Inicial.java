import java.util.Scanner;

public class Inicial{
    private Pokemon pokemonInicial;
    Scanner sc = new Scanner(System.in);
 
    Pokemon p1 = new Pokemon("Bulbasar", 5, "grama", "macho", 20, 20,"Vine Whip");
    Pokemon p2 = new Pokemon("Charmander", 5, "fogo", "macho", 20, 2,"Ember");
    Pokemon p3 = new Pokemon("Squirtle", 5, "agua", "macho", 20, 20, "Water Gun");

    
    public void pokemoninicial(Treinador treinador) {
        Frame f = new Frame();
        f.exibirjanela();
        System.out.println("Escolha seu Pokémon inicial:");
        System.out.println("1 - Bulbasar\n2 - Charmander\n3 - Squirtle");
        
        int op = sc.nextInt();
        
        switch (op) {
            case 1:
                System.out.println("Agora seu inicial é Bulbasar");
                treinador.inicialPokemon(p1); 
                break;
            case 2:
                System.out.println("Agora seu inicial é Charmander");
                treinador.inicialPokemon(p2); 
                break;
            case 3:
                System.out.println("Agora seu inicial é Squirtle");
                treinador.inicialPokemon(p3);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
    

    
    public Pokemon getPokemonInicial() {
        return pokemonInicial;
    }

    
    public void setPokemonInicial(Pokemon pokemonInicial) {
        this.pokemonInicial = pokemonInicial;
    }

}