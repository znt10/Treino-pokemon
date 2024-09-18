import java.util.Scanner;

public class Lutar {
    
    private Pokemon poke;
    private Inicial inicial;
    
    Scanner sc = new Scanner(System.in);

  
    public void lutarPokemon(Pokemon pokemon,Treinador t1){

        Pokemon poke = t1.getPokemoninicial();
        System.out.println(poke.getInicialhpAtual());
        int hp = pokemon.getHpmax();
        System.out.println("Usar 1 " + poke.getAtaque());
        int op = sc.nextInt();
    
        switch (op) {
            case 1:
            while(true){
                pokemon.setHpAtual(hp -= 10);
                poke.setHpAtual(hp -= 2);
                System.out.println();
                System.out.println("HP do "+pokemon.getNome() + " é "+ pokemon.getHpAtual());
                System.out.println();
                System.out.println(pokemon.getNome() + " usou " + pokemon.getAtaque());
                System.out.println();
                System.out.println(poke.getNome() +"esta com "+poke.getHpAtual() +" HP");
                System.out.println();

                if(pokemon.getHpAtual() <= 0){
                    System.out.println("O " + poke.getNome()+ " foi derrotado");
                    return; 
                }

                if (poke.getHpAtual() <= 0) {
                    System.out.println("Seu " + poke.getNome()+ "esta nocauteado");
                    break;
                }
                System.out.println("Sair do modo luta?");
                System.out.println("Nao 1 \nSim 2");
                int o = sc.nextInt();
                if(o == 2){
                    
                    break;
                }
            }break;
              
            default:

                System.out.println("Saiu da luta");
                    break;
        }
    }


   

   
    public void setPoke(Pokemon poke) {
        this.poke = poke;
    }

    
    public Inicial getInicial() {
        return inicial;
    }

   
    public void setInicial(Inicial inicial) {
        this.inicial = inicial;
    }

    public Pokemon getPoke() {
        return this.poke;
    }

}
