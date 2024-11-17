import java.util.Random;
import java.util.Scanner;


public class Lutar {


    Scanner sc = new Scanner(System.in);



        public void lutarPokemon(Pokemon pokemon, Treinador t1){

            Random random = new Random();
            Pokemon poke = t1.getPokemoninicial();

            int hpinicial = poke.getStatus().getHpmax();
            int hp = pokemon.getStatus().getHpmax();

            int errar = t1.getPokemoninicial().getAtaque().getAccuracy();
            int chancaerrar = random.nextInt(0,101);
            System.out.println("Usar 1 " + poke.getAtaque().getNome()+"\nCurar 2\nSair 3" );
            System.out.println("=================================================");
            int op = sc.nextInt();
            int loop = 0;

            while(hp >= 0 || hpinicial >= 0 || op !=2 ) {
                double cit = random.nextDouble();
                double chance = 0.7;
                int danoinicial = t1.getDano().CalculardanoInicial(poke, pokemon);
                int danoinimigo = t1.getDano().Calcularinimigo(poke, pokemon);


                if (loop >= 1) {
                    System.out.println("=================================================");
                    System.out.println("Usar 1 " + poke.getAtaque().getNome() + "\nCurar 2\nSair 3");

                    op = sc.nextInt();
                }


                if (op == 1) {
                    if(errar >= chancaerrar){
                    if (cit > chance) {
                        poke.getStatus().setHp(atualizarHpPokemon(poke, danoinimigo * 2));
                        pokemon.getStatus().setHp(atualizarHpPokemon(pokemon, danoinicial));
                        System.out.println("dano do meu inicial "+danoinicial * 2);
                        System.out.println("dano sofrido "+danoinimigo);
                        System.out.println();

                        if(pokemon.getStatus().getHp() < 0) {
                            System.out.println(pokemon.getNome() + " esta com 0 HP");
                        }else {
                        System.out.println(poke.getNome() + " acertou uma critico no " + pokemon.getNome() + " e esta com " + pokemon.getStatus().getHp());
                        }
                        System.out.println();
                        System.out.println(pokemon.getNome() + " usou " + pokemon.getAtaque().getNome());
                        System.out.println();
                        if (poke.getStatus().getHp() < 0) {
                            System.out.println(poke.getNome() + " esta com 0 HP");

                        } else {
                            System.out.println(poke.getNome() + " esta com " + poke.getStatus().getHp() + " HP");
                        }
                        System.out.println();

                        cit = random.nextDouble();

                    } else {

                        poke.getStatus().setHp(atualizarHpPokemon(poke, danoinimigo));
                        pokemon.getStatus().setHp(atualizarHpPokemon(pokemon, danoinicial));
                        System.out.println("dano do meu inicial "+danoinicial);
                        System.out.println("dano sofrido "+danoinimigo);
                        System.out.println();
                        if(pokemon.getStatus().getHp() < 0) {
                            System.out.println(pokemon.getNome() + " esta com 0 HP");
                        }else{
                            System.out.println("HP do " + pokemon.getNome() + " é " + pokemon.getStatus().getHp());}
                        System.out.println();
                        System.out.println(pokemon.getNome() + " usou " + pokemon.getAtaque().getNome());
                        System.out.println();


                        if (poke.getStatus().getHp() < 0) {
                            System.out.println(poke.getNome() + " esta com 0 HP");
                        } else {
                            System.out.println(poke.getNome() + " esta com " + poke.getStatus().getHp() + " HP");
                        }
                        System.out.println();
                    }
                    }else if (errar < chancaerrar){
                        System.out.println("Errou o Ataque");
                        poke.getStatus().setHp(atualizarHpPokemon(pokemon, danoinimigo));
                        System.out.println("dano do meu inicial "+0);
                        System.out.println("dano sofrido "+danoinimigo);
                        System.out.println();
                        System.out.println(pokemon.getNome() + " usou " + pokemon.getAtaque().getNome());
                        System.out.println();
                        if (poke.getStatus().getHp() < 0) {
                            System.out.println(poke.getNome() + " esta com 0 HP");
                        } else {
                            System.out.println(poke.getNome() + " esta com " + poke.getStatus().getHp() + " HP");
                        }
                        System.out.println();
                        chancaerrar = random.nextInt(0,101);
                    }




                    if (pokemon.getStatus().getHp() <= 0) {
                        System.out.println("O " + pokemon.getNome() + " foi derrotado");
                        t1.getPokedex().addDerrotado(pokemon);
                        break;
                    } else if (poke.getStatus().getHp() <= 0) {
                        System.out.println("Seu " + poke.getNome() + " esta nocauteado");
                        break;
                    }




                } else if (op == 3) {
                    break;


                } else if (op == 2) {
                    t1.getCurar().heal(poke);

                }
                loop++;
            }
        }
    public int atualizarHpPokemon(Pokemon pokemon, int dano) {
        return pokemon.getStatus().getHp() - dano;

    }

}
       /*
Ele simplifica o código, pois você não precisa escrever a lógica de atualização do HP em cada lugar onde você deseja aplicar dano ao Pokémon.
Ele torna o código mais legível, pois o nome do método atualizarHpPokemon é claro e fácil de entender.
Ele reduz a chance de erros, pois o método atualizarHpPokemon é responsável por atualizar o HP do Pokémon de forma correta.
                                       */




